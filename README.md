# BookCart_Testing

**list of Actions**
1. End-to-End Workflow (Build-Test-Deploy TestReport) - Done
2. Manual Trigger with inputs - DOne
3. Remote Browser Testing
4. Cross Browser Testing/Cross OS Testing - Done
5. Scheduled events
6. Smoke Group Testing
7. Regression Testing
8. Failure Testcase Testing

9. Code Quality/Analysis (CodeQL)
10. Code Formatting
---
| Workflow | Status |
|----------|--------|
| Manual Trigger Workflow | [![Manual Trigger Workflow](https://github.com/saurabhgunturkar/BookCart_Testing/actions/workflows/manual-trigger-workflow.yml/badge.svg)](https://github.com/saurabhgunturkar/BookCart_Testing/actions/workflows/manual-trigger-workflow.yml) |

---
**Additional Commands and Points**
1. For run only failed testcases,
    use-> **mvn test -Dsurefire.rerunFailingTestsCount=1, mvn test -DxmlFilePath=target/surefire-reports/testng-failed.xml**
