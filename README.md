# BookCart_Testing

**list of Actions**
| Pipeline Name                              | Status | Recommendation to use |
|--------------------------------------------|--------|---------------|
| End-to-End Workflow (Build-Test-Deploy TestReport) | Done   | Highly, on scheduled to run complete project  |
| Manual Trigger with Inputs                 | Done   | Manual |
| Remote Browser Testing                     | Pending | on every Commit/pull request |
| Cross Browser Testing / Cross OS Testing   | Done   |  on pull request |
| Scheduled Events                            | Pending | day-wise |
| Smoke Group Testing                         | Pending | on pull request |
| Regression Testing                          | Pending | on pull request |
| Failure Testcase Testing                    | Pending | on commit/pull request |

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
