package com.se.program.mapper;

import com.se.program.entities.bill;

public interface billMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer billId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    int insert(bill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    int insertSelective(bill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    bill selectByPrimaryKey(Integer billId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(bill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(bill record);
}