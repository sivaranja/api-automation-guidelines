# API Automation – Custom Cases FAQ

This document provides clear guidance on:

- ✅ When to write **Spec Cases**
- ✅ When to write **Custom Cases**
- ✅ How and where to write them

---
### <h2 style="color: red;font-weight=bold">Q1: What is the ZEST Framework?</h2>

ZEST is our in-house automation framework that acts as an intelligent validation layer for your API development.

    🔍 Why Do You Need ZEST?

        Once you develop an API, the following validations are essential:

            - Are mandatory fields being validated correctly?
            - Are invalid inputs being rejected?
            - Is the response structure accurate?

ZEST helps you answer all these questions — automatically.

✅ What ZEST Does for You

ZEST automatically performs the following checks:

- Verifies presence and enforcement of **mandatory fields**
- Validates **null, empty, or incorrect** values
- Ensures **unique fields** are properly handled
- Confirms **range validations**
- Checks **request and response** structures
- Supports standard **CRUD operations** (Create, Read, Update, Delete)

💡 Think of ZEST As...

A reliable **auto-tester** that reads your **spec file** and validates your API implementation without requiring you to write basic validation logic.

> **Read More:** <a href="https://zest-704066935.development.catalystserverless.com/app/specification/index.html" target="_blank">ZEST Specification Tool</a>

---
### <h2 style="color: red; font-weight=bold">Q2: What are Spec Cases?</h2>

✅ description: 
    If the functionality is defined in the API specification, it is considered a Spec Case.
    These cases are automatically handled by the ZEST framework.

Zest Handles:

- Request parameter validations
- Error response structure validation
- Enum field validations
- Data type validations
- Basic CRUD validations (Create, Read, Update, Delete)

---
### <h3 style="color: red; font-weight=bold">Q3: What is a Custom Case?</h3>

A **Custom Case** is used to test specific business logic that is not covered by the API specification or the ZEST framework.

These cases are useful when the test involves more than basic field-level validations and requires checking complex workflows, multiple steps, or feature dependencies.

Examples : 

A field **cannot be deleted** if it is already used in:

  - Workflow
  - Blueprint
  - CommandCenter

**Business Hours configuration**:

  - Correctly handles holidays and working days

**Email notifications**:

  - Must work correctly in **Sandbox** mode

✅ Guideline

> **If your test includes multiple steps, depends on specific configurations, or represents a real business process — it should be written as a Custom Case.**

Custom Cases give you more control to test scenarios that are specific to how a feature works in real use cases. These tests cannot be fully automated through ZEST alone.

---
### <h3 style="color: red; font-weight=bold;">Q4: How to Write Custom Cases? Is There a Format?</h3>

Yes — writing a Custom Case follows a simple and consistent format.

📝 Steps to Follow

✅ Step 1: Read the Guide 
- Before you start, refer to this guide: <a href="https://writer.zoho.com/writer/open/6r39c736fd41bdb3645f184660581f36bac13" target="_blank">Writing Custom Cases – Documentation Link</a>

✅ Step 2: Think of the Test Flow as a Simple Program
- Break your test case into three logical parts: **PreHook**, **Case**, and **PostHook**.

Example Use Case

You are testing whether the **Field Association API** reflects the correct configuration after a workflow is created.

Explanation of the Flow :

**PreHook**  

   - Create the workflow and associate the field.
   - This step sets up the environment before the main test runs.

**Case**  

  - Execute the main API call (which may internally trigger the Field Association API).

**PostHook** 

  - Verify the response from the Field Association API:
  - Is the workflow configuration included?
  - Are the correct response keys returned?
  - Based on the verification, mark the test case as **pass** or **fail**.

This structure helps make your Custom Case clear, maintainable, and aligned with business logic.

---
### <h3 style="color: red; font-weight=bold;">Q5: At What Stage Should I Write Custom Cases?</h3>

Custom Cases are typically written **after Spec Cases are completed** using the ZEST framework.

Overview :

1. The **Automation Developer** first implements all applicable **Spec Cases** using ZEST.
2. After the **feature demo**, the **API Developer** and **Automation Developer** collaborate to identify and finalize the required **Custom Cases**.
3. Once Custom Cases are confirmed, development can proceed accordingly.

✅ Quick Guideline

- **Spec Cases** → Handled by the **Automation Team** using ZEST.
- **Custom Cases** → Should be written by the **API Developer**, since you understand the business logic and feature-specific behavior best.

This approach ensures proper test coverage for both standard validations and complex business scenarios.

---

### <h3 style="color: red; font-weight=bold;">Q6: What If I (API Developer) Already Know Which Cases Need to Be Covered?</h3>

That’s perfect — as the API Developer, you are in the best position to identify relevant test scenarios.

**During the Demo**

- Share your understanding of the feature with the **Automation Developer**.
- Work together to **finalize the list of Custom Cases**.
  
If you’re uncertain, you can request a **Dummy Code Coverage Report** from the Automation Team.

✅ What the Dummy Report Helps You Understand

- Which **Spec Cases** are already covered by ZEST.
- Which **Custom Cases** are still missing.
- How to **avoid duplicate** test cases.

✅ When This Is Especially Helpful

- The feature changes **a property or value** used in multiple locations.
- The feature was developed by **multiple developers**.
- The feature has **complex workflows** with conditional behaviors.

By reviewing the dummy report, you can make sure all required test cases are properly identified and covered — without overlap.

---
### <h3 style="color: red; font-weight=bold;">Q7: Where Do I Write and Commit Custom Cases?</h3>

The **Automation Developer** will provide you with a dedicated **feature branch** where all relevant **Spec Cases** are already committed.

You should add your **Custom Cases** on top of this branch.

🔐 Branch Access

- If you **do not have access** to the branch, please contact the **Automation Developer** for permissions.

---








