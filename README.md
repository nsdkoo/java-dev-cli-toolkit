# 开发者命令行工具集

Java CLI 工具包，支持项目脚手架与模板生成。

## 构建与运行

```bash
mvn package -DskipTests
java -jar target/dev-cli-toolkit-0.0.1-SNAPSHOT.jar --help
```

## 常用命令

| 命令 | 说明 |
|------|------|
| `project init` | 初始化新项目 |
| `git init` | 初始化 Git 仓库 |
| `scan secret` | 扫描密钥（自动跳过 node_modules、target 等） |
| `doctor` | 检查 java / git / mvn 环境 |

## 模板

脚手架模板见 `src/main/resources/templates`。
