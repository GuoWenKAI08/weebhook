package aaa.ccc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeebhookApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeebhookApplication.class, args);
        System.out.println("✅ Spring Boot 启动成功，监听端口 1010");
    }
}
