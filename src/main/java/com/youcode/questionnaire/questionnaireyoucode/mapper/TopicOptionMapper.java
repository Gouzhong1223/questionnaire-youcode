package com.youcode.questionnaire.questionnaireyoucode.mapper;

import com.youcode.questionnaire.questionnaireyoucode.entity.TopicOption;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 14:36
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.mapper
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@Mapper
public interface TopicOptionMapper {
    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TopicOption record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TopicOption record);
}
