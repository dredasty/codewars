package org.fresh.codewars.kata.kyu4.breadcrumbgenerator;

import org.apache.commons.lang3.StringUtils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    private static String a = "<a href=\"/%s/\">%s</a>";
    private static String span = "<span class=\"active\">%s</span>";
    private static List<String> ignore = Arrays.asList("the", "of", "in", "from", "by", "with", "and", "or", "for", "to", "at", "a");

    public static String generate_bc(String url, String separator) {
        if (!url.startsWith("http")) {
            url = "http://" + url;
        }
        try {
            String path = new URL(url).getPath();
            List<String> elements = Arrays.stream(path.split("/"))
                    .filter(item1 -> !item1.contains("index."))
                    .filter(item2 -> !item2.isEmpty())
                    .collect(Collectors.toList());
            if (elements.isEmpty()) {
                return String.format(span, "HOME");
            }
            List<String> breadcrumbs = new ArrayList<>();
            breadcrumbs.add(String.format(a, "/", "HOME").replace("///", "/"));
            String parent = "";
            for (int i = 0; i < elements.size() - 1; i++) {
                String element = elements.get(i);
                parent = StringUtils.join(new String[]{parent, element}, "/");
                breadcrumbs.add(String.format(a, parent, createBreadcrumb(element)));
            }

            String lastElement = elements.get(elements.size() - 1).split("\\.")[0];
            breadcrumbs.add(String.format(span, createBreadcrumb(lastElement)));
            return StringUtils.join(breadcrumbs, separator).replace("//", "/");
        } catch (MalformedURLException e) {
            return "";
        }
    }

    private static String createBreadcrumb(String element) {
        if (element.length() >= 30) {
            return StringUtils.join(
                    Arrays.stream(element
                            .split("-"))
                            .filter(item -> !ignore.contains(item))
                            .map(item -> item.toUpperCase().charAt(0)
                            ).toArray());

        } else {
            return StringUtils.upperCase(element).replace("-", " ");
        }
    }
}
