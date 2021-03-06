package com.sxkg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * Description: 在启动类上添加@EnableOAuth2Sso注解来启用单点登录功能
 * 
 * @author JourWon
 * @date 2019/12/24 14:42
 */
@EnableOAuth2Client
//@EnableOAuth2Sso
@SpringBootApplication
public class Oauth2ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Oauth2ClientApplication.class, args);
    }

}