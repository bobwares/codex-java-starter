# Project Artifacts Overview

This document summarizes the key files, directories, and supporting assets included in the `codex-java-starter` template. Use it as a quick reference when navigating or customizing the project.

## Root-Level Files

| Path | Description |
| --- | --- |
| `pom.xml` | Maven project descriptor defining dependencies, plugins, Java version, and build configuration. |
| `mvnw` / `mvnw.cmd` | Maven Wrapper scripts for Unix-like and Windows environments, enabling reproducible builds without a system-wide Maven installation. |
| `README.md` | Top-level project overview with setup instructions and customization guidance. |
| `docs/PROJECT_ARTIFACTS.md` | (This document) Central index of project artifacts. |

## Source Code Layout (`src/`)

| Path | Description |
| --- | --- |
| `src/main/java/com/bobwares/Application.java` | Spring Boot entry point that launches the template service and anchors the default Java package. |
| `src/main/resources/application.yml` | Baseline Spring Boot configuration with actuator exposure, application metadata, and commented database settings. |
| `src/test/resources/application.properties` | Test-only configuration targeting an in-memory H2 database and disabling Liquibase for faster runs. |

Create additional packages under `src/main/java/` and `src/test/java/` as the application grows.

## AI Context Assets (`ai/`)

| Path | Description |
| --- | --- |
| `ai/context/project_context.md` | Narrative description and prompt-ready scaffolding for agents integrating with the project. |
| `ai/context/.env` | Sample environment variable file providing placeholders for database connectivity used by agent workflows. |

## End-to-End (E2E) Resources (`e2e/`)

| Path | Description |
| --- | --- |
| `e2e/actuator.http` | HTTP request collection targeting Spring Boot actuator endpoints for smoke testing or monitoring checks. |
| `e2e/health.http` | HTTP request collection validating the `/actuator/health` endpoint to ensure the application is up. |

## Continuous Integration and Automation

Add GitHub workflow files under `.github/workflows/` when enabling automated builds, tests, or deployments. The directory is absent by default to keep the template lightweight.

## Agentic Workflow Notes

* Store additional prompts, tool configurations, or vectorized knowledge under `ai/` to keep AI-related assets organized.
* Provide contextual metadata in `project_context.md` so agents understand project conventions and goals when orchestrating tasks.
* Mirror this documentation when new subsystems or directories are introduced so future contributors and agents can orient quickly.
