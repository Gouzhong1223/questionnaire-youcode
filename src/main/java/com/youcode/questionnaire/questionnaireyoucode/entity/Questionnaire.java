package com.youcode.questionnaire.questionnaireyoucode.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 14:35
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.entity
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@ApiModel(value = "com-youcode-questionnaire-questionnaireyoucode-entity-Questionnaire")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Questionnaire implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 问卷 ID
     */
    @ApiModelProperty(value = "问卷 ID")
    private Integer id;
    /**
     * 问卷名字
     */
    @ApiModelProperty(value = "问卷名字")
    private String name;
    /**
     * 问卷说明
     */
    @ApiModelProperty(value = "问卷说明")
    private String detail;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createUser;
    /**
     * 是否已经收回 0-未收回 1-已收回
     */
    @ApiModelProperty(value = "是否已经收回 0-未收回 1-已收回")
    private Integer retract;
    /**
     * 问题数量
     */
    @ApiModelProperty(value = "问题数量")
    private Integer questionsCount;
    /**
     * 结束时间
     */
    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;
}
