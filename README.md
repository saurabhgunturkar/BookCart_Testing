# BookCart_Testing

**list of Actions**
| Pipeline Name                              | Status | Recommendation |
|--------------------------------------------|--------|---------------|
| End-to-End Workflow (Build-Test-Deploy TestReport) | Done   | Recommended  |
| Manual Trigger with Inputs                 | Done   | Recommended  |
| Remote Browser Testing                     | Pending | Consider Using |
| Cross Browser Testing / Cross OS Testing   | Done   | Recommended  |
| Scheduled Events                            | Pending | Consider Using |
| Smoke Group Testing                         | Pending | Consider Using |
| Regression Testing                          | Pending | Consider Using |
| Failure Testcase Testing                    | Pending | Consider Using |

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
