package com.cwj.yudada.scoring;

import com.cwj.yudada.model.entity.App;
import com.cwj.yudada.model.entity.UserAnswer;

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
