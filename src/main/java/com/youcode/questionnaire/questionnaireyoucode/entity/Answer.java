package com.youcode.questionnaire.questionnaireyoucode.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 14:37
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.entity
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@ApiModel(value = "com-youcode-questionnaire-questionnaireyoucode-entity-Answer")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 答案主键
     */
    @ApiModelProperty(value = "答案主键")
    private Integer id;
    /**
     * 答案内容
     */
    @ApiModelProperty(value = "答案内容")
    private String answerValue;
    /**
     * 问卷 ID
     */
    @ApiModelProperty(value = "问卷 ID")
    private Integer questionnaireId;
    /**
     * 问题 ID
     */
    @ApiModelProperty(value = "问题 ID")
    private Integer topicId;
}
