package com.gexingw.shop.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 18:02
 */
@Configuration
@MapperScan("com.gexingw.shop.*.mapper")
public class MybatisConfig {
}
