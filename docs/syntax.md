
## Package Structure

```
com..DevCliToolkit
鈹?
鈹溾攢鈹€ command/
鈹?  鈹溾攢鈹€ common/         # Shared commands: 
鈹?  鈹溾攢鈹€ rust/           # Rust-specific commands: InitRustCommand, RefactorRustCommand, ...
鈹?  鈹溾攢鈹€ python/         # Python-specific commands: InitPythonCommand, ...
鈹?  鈹溾攢鈹€ go/             # Go-specific commands: InitGoCommand, ...
鈹?  鈹溾攢鈹€ typescript/     # TypeScript-specific commands: InitTypescriptCommand, ...
鈹?  鈹斺攢鈹€ ...             # Extendable for other languages
鈹?
鈹溾攢鈹€ service/            # Interfaces and logic for services (ConfigService, TemplateRenderService, TomlService, ...)
鈹?  鈹溾攢鈹€ impl/           # Service implementations
鈹?
鈹溾攢鈹€ model/              # Shared model, DTO, entity classes
鈹?
鈹溾攢鈹€ util/               # Shared utilities and helpers
鈹?
鈹溾攢鈹€ config/             # Application configuration, constants, enums
鈹?
鈹溾攢鈹€ templates/          # Template files for each language and standard files
鈹?
鈹溾攢鈹€ resources/          # Configuration files, external resources (application.yml, logback.xml, ...)
鈹?
鈹斺攢鈹€ DevCliToolkitApplication.java # Spring Boot entry point
```

common: Shared commands such as `info`, `config`, `clean`, `doctor`, `upgrade`, `release`, `interactive`, `scaffold`, `serve`, `doc`, `add`, `deps`, `format`, `lint`, `test` are placed in this package. These commands are language-agnostic and can be applied to any project.


## Proposed CLI Syntax

```
DevCliToolkit <group> <action> [options]
```

Examples:
- `DevCliToolkit project init --lang rust --name myproj`
- `DevCliToolkit project info --dir .`
- `DevCliToolkit project clean`
- `DevCliToolkit project release`
- `DevCliToolkit config set author.name="Your Name"`
- `DevCliToolkit config show`
- `DevCliToolkit test run`
- `DevCliToolkit lint run`
- `DevCliToolkit format run`
- `DevCliToolkit deps list`
- `DevCliToolkit deps update`
- `DevCliToolkit add readme`
- `DevCliToolkit add license`
- `DevCliToolkit scaffold microservice`
- `DevCliToolkit serve web`
- `DevCliToolkit doc generate`
- `DevCliToolkit upgrade`
- `DevCliToolkit doctor`

This approach helps you:
- Group commands by topic (`project`, `config`, `test`, `add`, ...)
- Easily add new subcommands without name conflicts
- Integrate Picocli easily with the `@Command(subcommands = {...})` annotation

Would you like me to create a command skeleton following this structure for the command groups?
