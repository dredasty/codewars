package org.fresh.page;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

@PageObject
public class Site {

    @Autowired
    private WebDriver driver;

    @Autowired
    private HomePage homePage;

    public HomePage openHomePage() {
        Selenide.open("https://google.com");
        return homePage;
    }
}
