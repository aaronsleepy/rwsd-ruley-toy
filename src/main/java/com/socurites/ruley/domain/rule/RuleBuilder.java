package com.socurites.ruley.domain.rule;

import com.socurites.ruley.domain.rule.part.Action;
import com.socurites.ruley.domain.rule.part.Condition;

public class RuleBuilder {
    private Condition condition;
    private Action action;

    public RuleBuilder when(final Condition condition) {
        this.condition = condition;
        return this;
    }

    public RuleBuilder then(final Action action) {
        this.action = action;
        return this;
    }

    public Rule build() {
        return new DefaultRule(this.condition, this.action);
    }
}
