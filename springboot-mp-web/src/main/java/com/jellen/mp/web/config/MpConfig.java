package com.jellen.mp.web.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MP相关配置
 *
 * @author afei@yscredit.com
 * @version 1.0
 * @date 2020-06-12 14:18
 */
@Configuration
@MapperScan("com.jellen.mp.dao.mapper")
public class MpConfig {

}
