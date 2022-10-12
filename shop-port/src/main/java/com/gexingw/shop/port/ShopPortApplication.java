package com.gexingw.shop.port;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication(scanBasePackages = {"com.gexingw.shop"})
public class ShopPortApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopPortApplication.class, args);
    }

}
