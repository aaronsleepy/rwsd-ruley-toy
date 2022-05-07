package com.socurites.ruley.domain.rule;

import com.socurites.ruley.domain.rule.part.Action;
import com.socurites.ruley.domain.rule.part.Condition;
import com.socurites.ruley.domain.rule.part.Facts;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultRule implements Rule {
    private final Condition condition;
    private final Action action;

    @Override
    public void perform(final Facts facts) {
        if (condition.evaluate(facts)) {
            action.perform(facts);
        }
    }
}
