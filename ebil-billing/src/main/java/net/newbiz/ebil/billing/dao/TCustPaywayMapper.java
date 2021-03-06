package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.TCustPayway;
import net.newbiz.ebil.billing.dao.model.TCustPaywayExample;
import net.newbiz.ebil.billing.dao.model.TCustPaywayKey;
import org.apache.ibatis.annotations.Param;

public interface TCustPaywayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int countByExample(TCustPaywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int deleteByExample(TCustPaywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(TCustPaywayKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int insert(TCustPayway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int insertSelective(TCustPayway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    List<TCustPayway> selectByExample(TCustPaywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    TCustPayway selectByPrimaryKey(TCustPaywayKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TCustPayway record, @Param("example") TCustPaywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TCustPayway record, @Param("example") TCustPaywayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TCustPayway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_payway
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TCustPayway record);
}