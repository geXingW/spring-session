package com.gexingw.shop.passport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication(scanBasePackages = {"com.gexingw.shop"})
public class ShopPassportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopPassportApplication.class, args);
    }

}
