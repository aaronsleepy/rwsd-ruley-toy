package com.socurites.ruley.main;

import com.socurites.ruley.domain.rule.Rule;
import com.socurites.ruley.domain.rule.part.Action;
import com.socurites.ruley.domain.rule.part.Facts;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Rule> rules;
    private final Facts facts;

    public BusinessRuleEngine(final Facts facts) {
        this.facts = facts;
        this.rules = new ArrayList<>();
    }

    /**
     * 액션 추가
     * @param action 추가할 액션
     */
    @Deprecated
    public void addAction(final Action action) {
        throw new UnsupportedOperationException();
    }

    public void addRule(final Rule rule) {
        this.rules.add(rule);
    }

    /**
     * 기본 리포트
     * @return 등록한 액션 수
     */
    public int count() {
        return this.rules.size();
    }

    /**
     * 액션 실행
     */
    public void run() {
        this.rules.forEach(rule -> rule.perform(facts));
    }
}
