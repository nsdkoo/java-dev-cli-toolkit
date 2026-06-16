
## DevCliToolkit CLI Commands
- `DevCliToolkit doctor`: Check environment, versions, environment variables, and system configuration.
- `DevCliToolkit upgrade`: Automatically update DevCliToolkit CLI to the latest version.
- `DevCliToolkit lint`: Run linter for the project (depending on language: rustfmt, flake8, eslint...).
- `DevCliToolkit format`: Automatically format the entire project code.
- `DevCliToolkit test`: Run all project tests.
- `DevCliToolkit deps`: Display, check, and update dependencies.
- `DevCliToolkit clean`: Remove build files, cache, logs, and temporary folders.
- `DevCliToolkit info`: Show project information (name, version, license, author...).
- `DevCliToolkit release`: Create a new release (tag, changelog, build, publish).
- `DevCliToolkit add <file>`: Add standard files (README, LICENSE, CONTRIBUTING, .gitignore...) to the project.
- `DevCliToolkit config`: Manage personal configuration (author, email, license...).
- `DevCliToolkit interactive`: Interactive project initialization mode (step-by-step Q&A).
- `DevCliToolkit scaffold <type>`: Quickly generate structure for microservice, REST API, CLI, webapp...
- `DevCliToolkit serve`: Run development server (for web, API, docs...).
- `DevCliToolkit doc`: Generate project documentation from code/comments.

Here are more ideas to make DevCliToolkit valuable for Java developers:

- Auto-generate Maven/Gradle project structure with best practices.
- Add support for Spring Boot, Quarkus, Micronaut, Jakarta EE templates.
- Generate REST API skeletons (controller, service, repository).
- Integrate code quality tools: Checkstyle, PMD, SpotBugs.
- Add linter/formatter commands for Java (Google Java Format).
- Auto-configure CI/CD (GitHub Actions, GitLab CI, Jenkinsfile).
- Generate Dockerfile and Kubernetes manifests for Java apps.
- Add command to inject common dependencies (Lombok, MapStruct, etc.).
- Scaffold unit test templates (JUnit, Mockito).
- Refactor legacy code: auto-convert anonymous classes to lambdas, extract constants, etc.
- Generate OpenAPI/Swagger docs from code.
- Add command to update dependency versions automatically.
- Integrate with SonarQube for static analysis.
- Generate README, LICENSE, CHANGELOG.md with Java-specific content.
- Add command to bootstrap multi-module Maven/Gradle projects.
- Support for JavaFX, Swing, or desktop app templates.
- Add command to migrate from Java 8 to newer versions (API usage hints, etc.).

Let me know if you want to implement any specific idea!

Hay 膽岷 馃憤. C谩c c么ng c峄?**CLI cho developer** th瓢峄漬g 膽瓢峄 瓢a chu峄檔g n岷縰:

* Gi煤p ti岷縯 ki峄噈 th峄漣 gian, thay th岷?thao t谩c ph峄ヽ t岷.
* T铆ch h峄 d峄?d脿ng v脿o workflow (Git, CI/CD, Docker, Cloud...).
* C贸 th峄?ch岷 膽峄檆 l岷璸, cross-platform, v脿 c贸 膽岷 ra r玫 r脿ng.

M矛nh g峄 媒 c谩c h瓢峄沶g 媒 t瓢峄焠g CLI tool cho developer:

---

## 馃敼 1. Qu岷 l媒 Git & Repository

* **git-helper**: T峄?膽峄檔g chu岷﹏ h贸a commit message theo *Conventional Commit*, t峄?膽峄檔g squash/rebase theo rules.
* **multi-repo-sync**: Qu岷 l媒 nhi峄乽 repo (microservices/monorepo) 鈫?pull/fetch/build/test t岷 c岷?repo c霉ng l煤c.
* **git-cleanup**: T峄?膽峄檔g d峄峮 nh谩nh 膽茫 merge, c岷h b谩o nh谩nh b峄?b峄?qu锚n.

---

## 馃敼 2. Debugging & Productivity

* **http-cli**: K岷縯 h峄 s峄?膽啤n gi岷 c峄 HTTPie + s峄ヽ m岷h c峄 curl (gi峄憂g nh瓢 curlie, nh瓢ng th锚m debug WebSocket, gRPC).
* **log-tail**: CLI 膽峄?tail log nhi峄乽 service (Docker, Kubernetes, local files) c霉ng l煤c, c贸 filter theo regex/json field.
* **db-tui**: M峄檛 TUI (text UI) nh岷?膽峄?xem/query d峄?li峄噓 SQL/CSV/Parquet tr峄眂 ti岷縫 trong terminal.

---

## 馃敼 3. Automation & DevOps

* **docker-pruner**: T峄?膽峄檔g d峄峮 container, volume, image kh么ng d霉ng.
* **aws-saver**: CLI qu岷 l媒 chi ph铆 AWS, b岷璽/t岷痶 EC2/RDS/Aurora theo schedule.
* **kube-wizard**: CLI h峄?tr峄?vi岷縯 v脿 validate manifest YAML, g峄 媒 t峄慽 瓢u resource limit.
* **ci-lint**: Linter cho file c岷 h矛nh CI/CD (GitHub Actions, GitLab CI, CircleCI).

---

## 馃敼 4. Testing & QA

* **api-smoke**: CLI t岷 nhanh smoke test cho REST/GraphQL API t峄?OpenAPI spec.
* **load-tester**: C么ng c峄?load test 膽啤n gi岷 nh瓢 wrk/k6, nh瓢ng d峄?t铆ch h峄 CI.
* **snapshot-cli**: T岷 v脿 so s谩nh snapshot cho API response (h峄痷 铆ch cho regression test).

---

## 馃敼 5. Code Quality & Refactor

* **dep-check**: Qu茅t dependencies (Python, Node.js, Java, Go) 鈫?c岷h b谩o unused, outdated, vulnerable packages.
* **code-metrics**: CLI 膽峄?膽o cyclomatic complexity, lines of code, test coverage.
* **i18n-check**: Ki峄僲 tra thi岷縰/b峄?s贸t key i18n trong project.

---

## 馃敼 6. Developer Utilities

* **secret-scan**: CLI scan code t矛m password/token/API key l峄?trong repo.
* **json-tool**: Pretty print, diff, query JSON (gi峄憂g jq nh瓢ng d峄?d霉ng h啤n).
* **env-switcher**: Qu岷 l媒 nhi峄乽 `.env` profile v脿 chuy峄僴 nhanh gi峄痑 c谩c m么i tr瓢峄漬g (dev, staging, prod).
* **mockgen**: T岷 mock API response nhanh t峄?JSON m岷玼.

---

馃憠 Xu h瓢峄沶g hi峄噉 t岷:

* **TUI apps (terminal UI)**: r岷 hot, v矛 dev kh么ng mu峄憂 m峄?web GUI.
* **CLI + Cloud/AI integration**: V铆 d峄?CLI g峄峣 OpenAI 膽峄?gi岷 th铆ch log, generate test, ho岷穋 refactor code.
* **Cross-platform binaries nh峄?g峄峮**: Vi岷縯 b岷眓g Go ho岷穋 Rust.

---

B岷 c贸 mu峄憂 m矛nh ch峄峮 ra **5 媒 t瓢峄焠g ti峄乵 n膬ng nh岷** (d峄?tri峄僴 khai, c贸 nhu c岷 cao, 铆t c岷h tranh) v脿 ph芒n t铆ch chi ti岷縯 **c谩ch build (tech stack, ng么n ng峄? UX)** kh么ng?

