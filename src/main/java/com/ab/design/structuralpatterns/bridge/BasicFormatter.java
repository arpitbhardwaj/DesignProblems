package com.ab.design.structuralpatterns.bridge;

import java.util.List;

public class BasicFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header);
        builder.append("\n");

        for (Detail detail:details) {
            builder.append(detail.getLabel());
            builder.append(":");
            builder.append(detail.getValue());
            builder.append("\n");
        }
        return builder.toString();
    }
}
