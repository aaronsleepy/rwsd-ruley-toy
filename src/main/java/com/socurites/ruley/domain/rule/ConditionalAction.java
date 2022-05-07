package com.socurites.ruley.domain.rule;

public interface ConditionalAction {
    void perform(Facts facts);

    boolean evaluate(Facts facts);
}
