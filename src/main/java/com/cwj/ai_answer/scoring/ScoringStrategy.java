package com.cwj.ai_answer.scoring;

import com.cwj.ai_answer.model.entity.App;
import com.cwj.ai_answer.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 */
public interface ScoringStrategy {
    /*
     * 执行评分
     */
    UserAnswer doScore(List<String> choices, App app);
}
