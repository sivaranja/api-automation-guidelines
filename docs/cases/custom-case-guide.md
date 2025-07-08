# Writing a Case using Java

This guide explains how to write and execute **API Automation Cases** using Java. It covers what a Case is, how Cases are executed, and how to use builder-pattern classes like `URLWrap.java` to construct them. For more detail, refer to the <a href="https://writer.zoho.com/writer/open/uj6mi18c42f2fe66c48438ee8b33b6a383dfa" target="_blank">custom case documentation</a>.

---

## 📌 What is a Case?

In the context of API Automation, a **Case** refers to a structured unit of test logic designed to validate a specific functionality of an API automatically.

Each Case typically targets a specific **resource** and **operation** (e.g., GET, POST, PUT), ensuring expected API behavior through dynamic request construction and response validation.

---

## ⚙️ How Are Cases Executed?

- Each Case is constructed for a specific resource and operation.
- All defined Cases are collected into a list.
- The test runner executes each Case in the list sequentially or as per the test plan.

---

## 🧱 How to Write a Case

Cases should be written in a Java method named `build` with the following signature:

     public List<Case> build(Url url, URLBuilder urlBuilder, Key key)

This method should return a list of Case objects, each built using helper classes that follow the Builder Pattern.

## 🔨 Key Class: URLWrap.java

The URLWrap class is used to construct and modify API request URLs, headers, and body content dynamically.

        new URLWrap(URLBuilder urlBuilder)

Initializes a new URLWrap object using a URLBuilder instance.

| Method                                      | Description                                                 | Return Type |
|---------------------------------------------|-------------------------------------------------------------|-------------|
| param(String name, String value)          | Adds a query parameter to the URL.                          | URLWrap   |
| setHeader(String name, String value)      | Adds a header to the request.                               | URLWrap   |
| setBody(JSONObject jsonObject)            | Sets the request body using a `JSONObject`.                 | URLWrap   |
| setBody(LinkedHashMap<String, Object>)    | Sets the request body using a `LinkedHashMap`.              | URLWrap   |
| updatePath(String pathKey, String value)  | Replaces placeholders in the path with actual values.       | URLWrap   |
| setContent(ContentType type)              | Sets the content type (e.g., `application/json`, `form-data`). | URLWrap |
