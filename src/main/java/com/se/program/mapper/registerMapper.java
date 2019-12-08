package com.se.program.mapper;

import com.se.program.entities.register;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;
import com.se.program.entities.registerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@ResponseBody
@Repository
public interface registerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    long countByExample(registerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int deleteByExample(registerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer registerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int insert(register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int insertSelective(register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    List<register> selectByExample(registerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    register selectByPrimaryKey(Integer registerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") register record, @Param("example") registerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") register record, @Param("example") registerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(register record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(register record);
}