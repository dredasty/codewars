package org.fresh.interview.booking;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebSiteVisitTest {
    @Test
    public void testWebSiteVisit() {
        WebSiteVisit solution = new WebSiteVisit();

        String pattern = "[\n" +
                "{ \"user\": \"1\", \"page\": \"A\"},\n" +
                "{ \"user\": \"2\", \"page\": \"B\"},\n" +
                "{ \"user\": \"1\", \"page\": \"B\"},\n" +
                "{ \"user\": \"1\", \"page\": \"D\"},\n" +
                "{ \"user\": \"2\", \"page\": \"A\"},\n" +
                "{ \"user\": \"3\", \"page\": \"B\"},\n" +
                "{ \"user\": \"3\", \"page\": \"D\"},\n" +
                "{ \"user\": \"1\", \"page\": \"C\"},\n" +
                "{ \"user\": \"3\", \"page\": \"C\"},\n" +
                "{ \"user\": \"1\", \"page\": \"C\"},\n" +
                "{ \"user\": \"2\", \"page\": \"C\"},\n" +
                "{ \"user\": \"3\", \"page\": \"B\"},\n" +
                "{ \"user\": \"1\", \"page\": \"A\"},\n" +
                "{ \"user\": \"3\", \"page\": \"C\"}\n" +
                "]";

        Assertions.assertThat(solution.analyze(pattern)).isEqualTo("BDC");
    }
}
