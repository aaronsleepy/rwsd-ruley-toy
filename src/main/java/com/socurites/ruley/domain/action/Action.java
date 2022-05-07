package com.socurites.ruley.domain.action;

@FunctionalInterface
public interface Action {
    void perform(final Facts mockFacts);
}
