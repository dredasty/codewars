package org.fresh.configuration;

import org.openqa.selenium.WebDriver;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class WebDriverTestExecutionListener extends AbstractTestExecutionListener {

    @Override
    public void beforeTestMethod(TestContext testContext) {
        testContext.getApplicationContext().getBean(TestScope.class).reset();
    }

    @Override
    public void afterTestMethod(TestContext testContext) {
        testContext.getApplicationContext().getBean(WebDriver.class).quit();
    }
}