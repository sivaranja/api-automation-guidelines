# Local Setup Guide

This guide explains how developers can set up and run the API automation framework locally to create and validate custom test cases effectively.For detailed steps, refer to the <a href="https://writer.zoho.com/writer/open/6r39c736fd41bdb3645f184660581f36bac13" target="_blank">Setup Guide</a>.

---
🔁 Flow Overview

The setup process is divided into three simple steps:

1. [Project Creation](#1-project-creation)
2. [Configure Properties](#2-configure-properties)
3. [Running the Automation](#3-running-the-automation)
---

🏗️ 1. Project Creation

This is a one-time setup process. If you already have the `crm-spec-automation` repository locally, you can skip this step.

### Steps:

- Once the API Automation developer completes the required specification file changes, the corresponding feature branch will be available in the `crm-spec-automation` repository.
- If you do not have access to the repository, please contact the API Automation developer to grant permission.
- Clone the <a href="https://git.csez.zohocorpin.com/CRM/rest-api-life-cycle/automation/crm-spec-automation" target="_blank">repository</a> to any directory on your local machine:

        command : git clone https://git.csez.zohocorpin.com/CRM/rest-api-life-cycle/automation/crm-spec-automation

- Navigate into the project and switch to the appropriate feature branch.
- Open the project in your preferred IDE.

For detailed steps, refer to the .

⚙️ 2. Configure Properties

To run test cases, update the required fields in the config.properties file.

### Mandatory Configurations

| Property               | Description                                      | Local Zoho Value                    | IDC Value                          |
|------------------------|--------------------------------------------------|-------------------------------------|------------------------------------|
| account-domain       | Domain to get the access token                   | https://accounts.localzoho.com    | https://accounts.zoho.com       |
| domain               | Instance URL to make API calls                   | https://{crmdomain}.localzoho.com | https://www.zohoapis.com/crm     |
| version              | API version to be tested (semantic versioning)   | 2.0                               | 2.0                              |
| zest-zgid            | ZEST account ID for authentication               | —                                   | —                                  |
| zest-ticket          | ZEST ticket for authentication                   | —                                   | —                                  |
| open-report-in-browser | Automatically open test report in browser     | true                              | true                             |

> **Note:** If you do not have a ZEST account, please contact the API Automation team to request access.

🚀 3. Running the Automation

Once the project is set up and properties are configured, follow these steps to run the test cases:

 - Open the CrmCSEZAutomation.java class. 
 - Right-click the file and select: Run As -> Java Application.

### After execution:
1. A test report will be generated and opened in your browser (if open-report-in-browser=true).
2. The CSV report will be saved locally on your machine.
3. The file path will be displayed in the IDE console after execution.



