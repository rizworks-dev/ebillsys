package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.MFeePlan;
import net.newbiz.ebil.billing.dao.model.MFeePlanExample;
import org.apache.ibatis.annotations.Param;

public interface MFeePlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int countByExample(MFeePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int deleteByExample(MFeePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String feePlanCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int insert(MFeePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int insertSelective(MFeePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    List<MFeePlan> selectByExample(MFeePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    MFeePlan selectByPrimaryKey(String feePlanCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MFeePlan record, @Param("example") MFeePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MFeePlan record, @Param("example") MFeePlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MFeePlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_fee_plan
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MFeePlan record);
}