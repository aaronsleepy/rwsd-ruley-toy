package com.socurites.ruley.domain.inspector;

import com.socurites.ruley.domain.rule.part.ConditionalAction;
import com.socurites.ruley.domain.rule.part.Facts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Inspector {
    private final List<ConditionalAction> conditionalActions;

    public Inspector(ConditionalAction conditionalActions) {
        this.conditionalActions = Arrays.asList(conditionalActions);
    }

    public List<Report> inspect(final Facts facts) {
        final List<Report> reports = new ArrayList<>();

        return this.conditionalActions.stream()
                .map(action -> new Report(facts, action, action.evaluate(facts)))
                .collect(Collectors.toUnmodifiableList());
    }
}
