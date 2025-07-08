import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;
import java.util.regex.*;

public class fileReader {
    private static final String PROJECT_ROOT = "/Users/siva-14973/eclipse-workspace/dev-automation/crm-spec-automation";
    private static final String OUTPUT_FILE = "/Users/siva-14973/APIAutomationDocs/api-automation-doc/docs/utils/utils_documentation.md";

    public static void main(String[] args) {
        try {
            System.out.println("Documentation generated started...");
            List<Path> utilFiles = findUtilFiles();
            if (utilFiles.isEmpty()) {
                System.out.println("No utility/helper files found.");
                return;
            }else {
                System.out.println("Found " + utilFiles.size() + " utility/helper files.");
            }
            String markdown = generateMarkdown(utilFiles);
            Files.write(Paths.get(OUTPUT_FILE), markdown.getBytes());
            System.out.println("Documentation generated at: " + OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Path> findUtilFiles() throws IOException {

        // Regex pattern to match utility/helper files
        Pattern pattern = Pattern.compile(".*/src/main/java/com/zoho/crm/spec/automation/custom/.*/.*Util\\.java$", Pattern.CASE_INSENSITIVE);

        List<Path> path =  Files.walk(Paths.get(PROJECT_ROOT))
                .filter(Files::isRegularFile)
                .filter(p -> p.toString().endsWith(".java"))
                .filter(p -> pattern.matcher(p.toString().replace("\\", "/")).matches()
                
                && !p.toString().contains("ClientScriptUtil.java"))
                .collect(Collectors.toList());

                System.out.println("Utility/Helper files found: " + path.size());
                System.out.println("Utility/Helper files: " + path.get(0));
                return path;

    }

    private static String generateMarkdown(List<Path> utilFiles) throws IOException {
        StringBuilder md = new StringBuilder();
        md.append("# Utility/Helper Classes Documentation\n\n");

        for (Path file : utilFiles) {
            System.out.println(file.getFileName().toString());
            String content = new String(Files.readAllBytes(file));
            String relativePath = PROJECT_ROOT.equals(file.getParent().toString()) ? 
                file.getFileName().toString() : 
                Paths.get(PROJECT_ROOT).relativize(file).toString();

            

            md.append("## ").append(file.getFileName().toString()).append("\n\n");
            md.append("    path : ").append(relativePath).append("\n\n");
            md.append("| Method | Parameters | Description |\n");
            md.append("|--------|------------|-------------|\n");

            extractMethods(content).forEach((method, params) -> {
                String description = extractJavadocDescription(content, method);
                md.append("| ").append(method).append(" | ")
                  .append(params).append(" | ")
                  .append(description).append(" |\n");
            });
            md.append("\n");

            System.out.println(file.getFileName().toString() + " completed.");
        }
        return md.toString();
    }

    private static Map<String, String> extractMethods(String content) {
        Map<String, String> methods = new LinkedHashMap<>();
        Pattern pattern = Pattern.compile(
            "(public|protected|private|static|final|abstract|synchronized)+\\s+[\\w<>\\[\\]]+\\s+(\\w+)\\s*\\(([^)]*)\\)"
        );
        Matcher matcher = pattern.matcher(content);
        
        while (matcher.find()) {
            String methodName = matcher.group(2);
            String params = matcher.group(3).replaceAll("\\s+", " ");
            methods.put(methodName, params.isEmpty() ? "None" : params);
        }
        return methods;
    }

    private static String extractJavadocDescription(String content, String methodName) {
        Pattern pattern = Pattern.compile(
            "/\\*\\*.*?\\*/(?:\\s*[^/])*?\\s+" + methodName + "\\s*\\("
        );
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            String javadoc = matcher.group(0).split("\\*/")[0];
            return javadoc.replaceAll("(?s)/\\*\\*|\\*/|\\*", "")
                          .trim()
                          .replaceAll("\\s+", " ")
                          .split("\\n")[0];
        }
        return "No description available";
    }
}