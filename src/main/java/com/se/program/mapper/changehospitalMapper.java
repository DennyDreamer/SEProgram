package com.se.program.mapper;

import com.se.program.entities.changehospital;
import com.se.program.entities.changehospitalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface changehospitalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    long countByExample(changehospitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int deleteByExample(changehospitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer changehospitalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int insert(changehospital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int insertSelective(changehospital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    List<changehospital> selectByExample(changehospitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    changehospital selectByPrimaryKey(Integer changehospitalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") changehospital record, @Param("example") changehospitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") changehospital record, @Param("example") changehospitalExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(changehospital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(changehospital record);
}