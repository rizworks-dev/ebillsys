package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.TBill;
import net.newbiz.ebil.billing.dao.model.TBillExample;
import org.apache.ibatis.annotations.Param;

public interface TBillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int countByExample(TBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int deleteByExample(TBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long billNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int insert(TBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int insertSelective(TBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    List<TBill> selectByExample(TBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    TBill selectByPrimaryKey(Long billNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TBill record, @Param("example") TBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TBill record, @Param("example") TBillExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bill
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TBill record);
}