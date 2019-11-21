package com.se.program.mapper;

import com.se.program.entities.prescription;

public interface prescriptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer prescriptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    int insert(prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    int insertSelective(prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    prescription selectByPrimaryKey(Integer prescriptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(prescription record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(prescription record);
}