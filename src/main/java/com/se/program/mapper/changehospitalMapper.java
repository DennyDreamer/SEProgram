package com.se.program.mapper;

import com.se.program.entities.changehospital;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface changehospitalMapper {
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
    changehospital selectByPrimaryKey(Integer changehospitalId);

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

    int selectMaxCount();

    String selectChangeImgByFormId(Integer formId);
}