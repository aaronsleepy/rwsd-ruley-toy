package com.socurites.ruley.domain.rule;

import com.socurites.ruley.domain.rule.part.Facts;

@FunctionalInterface
public interface Rule {
    void perform(Facts facts);
}
