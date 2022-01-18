package com.cache;

import com.cache.config.RedisTestConfig;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = RedisTestConfig.class)
@AutoConfigureWebMvc
public abstract class AppConfigTest {


}
