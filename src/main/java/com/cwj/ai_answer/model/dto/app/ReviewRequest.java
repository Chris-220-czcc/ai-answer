package com.cwj.ai_answer.model.dto.app;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReviewRequest implements Serializable {
    /**
     * 应用id
     */
    private Long id;
    /**
     * 审核状态：0-待审核, 1-通过, 2-拒绝
     */
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    private String reviewMessage;

    private static final long serialVersionUID = 1L;
}
