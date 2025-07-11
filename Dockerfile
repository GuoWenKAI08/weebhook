# 使用 OpenJDK 作为基础镜像
FROM openjdk:11-jdk-slim

# 设置工作目录
WORKDIR /app

# 将项目的 JAR 文件复制到工作目录
COPY target/Weebhook-1.0-SNAPSHOT.jar app.jar

# 暴露应用运行的端口
EXPOSE 8080

# 启动应用
ENTRYPOINT ["java", "-jar", "app.jar"]