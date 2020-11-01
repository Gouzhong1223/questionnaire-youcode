package com.youcode.questionnaire.questionnaireyoucode.mapper;
import org.apache.ibatis.annotations.Param;

import com.youcode.questionnaire.questionnaireyoucode.entity.AdminUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2020-11-01 12:55
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.youcode.questionnaire.questionnaireyoucode.mapper
 * @ProjectName : questionnaire-youcode
 * @Version : 1.0.0
 */
@Mapper
public interface AdminUserMapper {
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
    int insert(AdminUser record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(AdminUser record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    AdminUser selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(AdminUser record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(AdminUser record);

    AdminUser selectOneByUserName(@Param("userName")String userName);


}
