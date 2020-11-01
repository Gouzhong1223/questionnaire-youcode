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
 * @Date : create by QingSong in 2020-11-01 14:36
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.entity
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@ApiModel(value = "com-youcode-questionnaire-questionnaireyoucode-entity-Topic")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Topic implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 题目 ID
     */
    @ApiModelProperty(value = "题目 ID")
    private Integer id;
    /**
     * 题目名字
     */
    @ApiModelProperty(value = "题目名字")
    private String topicName;
    /**
     * 题目类型 0-单选题 1-填空题 2-表格填空
     */
    @ApiModelProperty(value = "题目类型 0-单选题 1-填空题 2-表格填空")
    private Integer topicType;
    /**
     * 问题序号
     */
    @ApiModelProperty(value = "问题序号")
    private Integer topicSerial;
}
