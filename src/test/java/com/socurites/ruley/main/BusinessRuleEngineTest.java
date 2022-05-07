package com.socurites.ruley.main;

import com.socurites.ruley.domain.action.Facts;
import com.socurites.ruley.domain.action.Action;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BusinessRuleEngineTest {
    @Test
    public void shouldPerformActionWithFacts() {
        final Action mockAction = mock(Action.class);
        final Facts mockFacts = mock(Facts.class);
        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

        businessRuleEngine.addAction(mockAction);
        businessRuleEngine.run();

        verify(mockAction).perform(mockFacts);
    }
}
