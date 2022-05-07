package com.socurites.ruley.main;

import com.socurites.ruley.domain.Action;
import com.socurites.ruley.domain.Facts;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Action> actions;
    private final Facts facts;

    public BusinessRuleEngine(final Facts facts) {
        this.facts = facts;
        this.actions = new ArrayList<>();
    }

    /**
     * 액션 추가
     * @param action 추가할 액션
     */
    public void addAction(final Action action) {
        this.actions.add(action);
    }

    /**
     * 기본 리포트
     * @return 등록한 액션 수
     */
    public int count() {
        return this.actions.size();
    }

    /**
     * 액션 실행
     */
    public void run() {
        this.actions.forEach(action -> action.perform(facts));
    }
}
