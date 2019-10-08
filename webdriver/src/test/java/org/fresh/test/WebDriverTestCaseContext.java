package org.fresh.test;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.fresh.configuration.TestScope;
import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class WebDriverTestCaseContext {
    @Bean
    public TestScope testScope() {
        return new TestScope();
    }

    @Bean
    @Scope("test")
    public WebDriver webDriver() {
        WebDriverManager.chromedriver().setup();
        Selenide.open();
        return WebDriverRunner.getWebDriver();
    }
}