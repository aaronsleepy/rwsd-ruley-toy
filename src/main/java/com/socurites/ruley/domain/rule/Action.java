package com.socurites.ruley.domain.rule;

@FunctionalInterface
public interface Action {
    void perform(final Facts mockFacts);
}
