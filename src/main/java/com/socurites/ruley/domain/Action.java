package com.socurites.ruley.domain;

@FunctionalInterface
public interface Action {
    void perform(final Facts mockFacts);
}
