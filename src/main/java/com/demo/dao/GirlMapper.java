package com.demo.dao;

import com.demo.entity.Girl;

public interface GirlMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    int insert(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    int insertSelective(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    Girl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Girl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table girl
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Girl record);
}