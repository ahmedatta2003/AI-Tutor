[README.md](https://github.com/user-attachments/files/23685746/README.md)
# TeacherAI — QA Suite (Unified Repository)

This repository contains a full QA suite for the TeacherAI application, including:
- Web UI automation (Selenium Java, JUnit)
- Performance testing (JMeter plans)
- API testing (Postman collection + Newman)
- Documentation: test cases, scenarios and reports

**Local paths note:** Example screenshot uploaded by user (used in docs): `file:///mnt/data/3ec836d4-8792-4111-95f8-0f32b0c004a5.png`

## Structure

```
automation-web/            # Selenium Maven project (POM + src + tests)
automation-api/            # Postman collection & API tests
performance/               # JMeter plans and instructions
docs/                      # Test cases, scenarios and reports
```

## How to run Web tests locally

Requirements:
- Java 11+
- Maven
- Chrome browser

1. Open project `automation-web` in IntelliJ as a Maven project.
2. Run: `mvn clean test` (or run specific test class: `mvn -Dtest=UploadPDFTest test`)
3. WebDriverManager will auto-download the proper ChromeDriver.

## JMeter
See `performance/jmeter/README-jmeter.md` for instructions and sample `.jmx`.

## API tests (Postman + Newman)
See `automation-api/README-api.md` for collection and how to run with Newman.

---
Prepared automatically. Replace `https://example.com` placeholders with your staging URLs.
