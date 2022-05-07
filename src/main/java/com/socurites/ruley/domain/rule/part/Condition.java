package com.socurites.ruley.domain.rule.part;

@FunctionalInterface
public interface Condition {
    boolean evaluate(Facts facts);
}
