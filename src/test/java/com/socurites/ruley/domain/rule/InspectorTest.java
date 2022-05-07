package com.socurites.ruley.domain.rule;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class InspectorTest {
    @Test
    public void inspectOneConditionEvaluateTrue() {
        final Facts facts = new Facts();
        facts.addFact("jobTitle", "CEO");
        final ConditionalAction jobTitleConditionalAction = new JobTitleConditionalAction();
        final Inspector inspector = new Inspector(jobTitleConditionalAction);

        final List<Report> reports = inspector.inspect(facts);

        assertThat(reports.size()).isEqualTo(1);
        assertThat(reports.get(0).isPositive()).isTrue();
    }

    private static class JobTitleConditionalAction implements ConditionalAction {

        @Override
        public void perform(final Facts facts) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean evaluate(final Facts facts) {
            return "CEO".equals(facts.getFact("jobTitle"));
        }
    }
}
