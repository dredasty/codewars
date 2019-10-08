package org.fresh.test;

import org.fresh.configuration.WebDriverTestExecutionListener;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebDriverTestCaseContext.class)
@TestExecutionListeners({WebDriverTestExecutionListener.class,
        DependencyInjectionTestExecutionListener.class})
@ComponentScan(basePackages = { "org.fresh" })
public abstract class WebDriverTestCase {
}
