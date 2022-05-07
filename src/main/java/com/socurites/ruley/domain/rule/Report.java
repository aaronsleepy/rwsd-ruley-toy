package com.socurites.ruley.domain.rule;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Report {
    private final Facts facts;
    private final ConditionalAction conditionalAction;
    private final boolean isPositive;
}
