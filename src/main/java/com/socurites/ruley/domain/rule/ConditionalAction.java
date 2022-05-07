package com.socurites.ruley.domain.rule;

@Deprecated
public interface ConditionalAction {
    void perform(Facts facts);

    boolean evaluate(Facts facts);
}
