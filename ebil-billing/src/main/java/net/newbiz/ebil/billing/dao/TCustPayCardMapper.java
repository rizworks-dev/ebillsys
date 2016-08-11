package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.TCustPayCard;
import net.newbiz.ebil.billing.dao.model.TCustPayCardExample;
import org.apache.ibatis.annotations.Param;

public interface TCustPayCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int countByExample(TCustPayCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int deleteByExample(TCustPayCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer custCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int insert(TCustPayCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int insertSelective(TCustPayCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    List<TCustPayCard> selectByExample(TCustPayCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    TCustPayCard selectByPrimaryKey(Integer custCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TCustPayCard record, @Param("example") TCustPayCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TCustPayCard record, @Param("example") TCustPayCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TCustPayCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_pay_card
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TCustPayCard record);
}