package com.socurites.ruley.domain.rule.part;

@Deprecated
public interface ConditionalAction {
    void perform(Facts facts);

    boolean evaluate(Facts facts);
}
