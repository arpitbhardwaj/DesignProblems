package com.ab.design.structuralpatterns.bridge;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();

        builder.append("<table>");
        builder.append("<th>Classification</th><th>");
        builder.append(header);
        builder.append("</th>");

        for (Detail detail:details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr></table>");
        }
        return builder.toString();
    }
}
