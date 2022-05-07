package com.socurites.ruley.main;

import com.socurites.ruley.domain.action.Action;

import java.util.ArrayList;
import java.util.List;

public class BusinessRuleEngine {
    private final List<Action> actions;

    public BusinessRuleEngine() {
        this.actions = new ArrayList<>();
    }

    /**
     * 액션 추가
     * @param action
     */
    public void addAction(final Action action) {
        this.actions.add(action);
    }

    /**
     * 기본 리포트
     * @return
     */
    public int count() {
        return this.actions.size();
    }

    /**
     * 액션 실행
     */
    public void run() {
        throw new UnsupportedOperationException();
    }
}
