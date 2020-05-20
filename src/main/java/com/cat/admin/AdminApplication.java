package com.cat.admin;


import lombok.SneakyThrows;
import org.mybatis.spring.annotation.MapperScan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.boot.web.server.WebServer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;

import java.net.InetAddress;


@SpringBootApplication
@ComponentScan("com.cat.admin.*")//@ComponentScan默认会装配标识了@Controller，@Service，@Repository，@Component注解的类到spring容器中
@EnableAspectJAutoProxy(proxyTargetClass = true)//springboot默认开启的EnableAspectJAutoProxy为true
//@MapperScan(basePackages = {"com.cat.admin.modules.mapper"})
public class AdminApplication implements ApplicationListener<WebServerInitializedEvent> {
    private static final Logger logger = LoggerFactory.getLogger(AdminApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        logger.info("========================启动完毕========================");
    }

    @SneakyThrows
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        WebServer server = event.getWebServer();
        WebServerApplicationContext context = event.getApplicationContext();
        Environment env = context.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        int port = server.getPort();
        String contextPath = env.getProperty("server.servlet.context-path");
        if (contextPath == null) {
            contextPath = "";
        }
        logger.info("\n---------------------------------------------------------\n" +
                "\tApplication is running! Access address:\n" +
                "\tLocal:\t\thttp://localhost:{}" +
                "\n\tExternal:\thttp://{}:{}{}" +
                "\n---------------------------------------------------------\n", port, ip, port, contextPath);
    }
}
