package com.caocao.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "caocao", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
