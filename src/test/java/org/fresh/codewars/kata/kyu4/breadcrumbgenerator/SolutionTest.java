package org.fresh.codewars.kata.kyu4.breadcrumbgenerator;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void examplesTests() {
        // assertEquals("expected", "actual");

        String[] urls = new String[]{"mysite.com/pictures/holidays.html",
                "www.codewars.com/users/GiacomoSorbi?ref=CodeWars",
                "www.microsoft.com/docs/index.htm#top",
                "mysite.com/very-long-url-to-make-a-silly-yet-meaningful-example/example.asp",
                "www.very-long-site_name-to-make-a-silly-yet-meaningful-example.com/users/giacomo-sorbi",
                "www.agcpartners.co.uk/",
                "https://www.agcpartners.co.uk/index.html",
                "https://www.agcpartners.co.uk",
                "www.google.com/pictures/kamehameha-kamehameha-surfer/funny"};

        String[] seps = new String[]{" : ", " / ", " * ", " > ", " + ", " - ", " ; ", " >>> ", " ; " };

        String[] anss = new String[]{"<a href=\"/\">HOME</a> : <a href=\"/pictures/\">PICTURES</a> : <span class=\"active\">HOLIDAYS</span>",
                "<a href=\"/\">HOME</a> / <a href=\"/users/\">USERS</a> / <span class=\"active\">GIACOMOSORBI</span>",
                "<a href=\"/\">HOME</a> * <span class=\"active\">DOCS</span>",
                "<a href=\"/\">HOME</a> > <a href=\"/very-long-url-to-make-a-silly-yet-meaningful-example/\">VLUMSYME</a> > <span class=\"active\">EXAMPLE</span>",
                "<a href=\"/\">HOME</a> + <a href=\"/users/\">USERS</a> + <span class=\"active\">GIACOMO SORBI</span>",
                "<span class=\"active\">HOME</span>",
                "<span class=\"active\">HOME</span>",
                "<span class=\"active\">HOME</span>",
                "<a href=\"/\">HOME</a> ; <a href=\"/pictures/\">PICTURES</a> ; <a href=\"/pictures/kamehameha-kamehameha-surfer/\">KAMEHAMEHA KAMEHAMEHA SURFER</a> ; <span class=\"active\">FUNNY</span>"};

        for (int i = 0; i < urls.length; i++) {
            System.out.println(" \nTest with : " + urls[i]);
            String actual = Solution.generate_bc(urls[i], seps[i]);
            if (!actual.equals(anss[i])) {
                System.out.println(String.format("Expected : %s", reformat(anss[i])));
                System.out.println(String.format("Actual :   %s", reformat(actual)));
            }
            assertEquals(anss[i], actual);
        }
    }

    String reformat(String s) {
        return s.replace("<", "<");
    }
}

