package com.se.program.mapper;

import com.se.program.entities.form;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface formMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer formId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    int insert(form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    int insertSelective(form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    form selectByPrimaryKey(Integer formId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(form record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(form record);

    int selectMaxCount();


}