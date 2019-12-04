package com.se.program.mapper;

import com.se.program.entities.record;

import java.util.List;

public interface recordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    int insert(record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    int insertSelective(record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    record selectByPrimaryKey(Integer recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(record record);

    List<record> selectByUserId(Integer userId);

    int selectUserIdByFormId(Integer formId);

   // int selectMaxCount();

}