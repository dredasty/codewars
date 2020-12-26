package org.fresh.test.home;

import org.fresh.page.Site;
import org.fresh.test.WebDriverTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class HomePageTest extends WebDriverTestCase {

    @Autowired
    private Site site;

    @Test
    public void test() {
//        HomePage accountPage = site.openHomePage();
    }
}