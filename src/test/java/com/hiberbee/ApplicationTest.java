package com.hiberbee;

import com.hiberbee.configurations.ApplicationConfiguration;
import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;

@CucumberContextConfiguration
@EnableCaching
@Cucumber
@SpringBootTest(classes = ApplicationConfiguration.class)
public class ApplicationTest {

  @Test
  void testMain() {}
}