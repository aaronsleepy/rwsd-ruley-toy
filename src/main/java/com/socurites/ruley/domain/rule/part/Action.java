package com.socurites.ruley.domain.rule.part;

@FunctionalInterface
public interface Action {
    void perform(final Facts mockFacts);
}
