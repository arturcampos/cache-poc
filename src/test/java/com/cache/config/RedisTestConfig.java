package com.cache.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@TestConfiguration
public class RedisTestConfig {

    private RedisServer redisServer;

    public RedisTestConfig(@Value("${spring.redis.port}") final int redisPort) throws IOException {
        this.redisServer = new redis.embedded.RedisServer(redisPort);
    }
    @PostConstruct
    public void setup() {
        redisServer.start();
    }

    @PreDestroy
    public void tearDown() {
        redisServer.stop();
    }
}
