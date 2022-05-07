package com.socurites.ruley.main;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BusinessRuleEngineTest {
    @Test
    public void shouldHaveNoRulesInitially() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
        assertThat(businessRuleEngine.count()).isEqualTo(0);
    }

    @Test
    public void shouldAddTwoActions() {
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();

        businessRuleEngine.addAction(() -> {});
        businessRuleEngine.addAction(() -> {});

        assertThat(businessRuleEngine.count()).isEqualTo(2);
    }
}
