package com.youcode.questionnaire.questionnaireyoucode.mapper;

import com.youcode.questionnaire.questionnaireyoucode.entity.Topic;
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
public interface TopicMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Topic record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Topic record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Topic selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Topic record);
}
