package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.TPaySubBank;
import net.newbiz.ebil.billing.dao.model.TPaySubBankExample;
import org.apache.ibatis.annotations.Param;

public interface TPaySubBankMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int countByExample(TPaySubBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int deleteByExample(TPaySubBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long payNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int insert(TPaySubBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int insertSelective(TPaySubBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    List<TPaySubBank> selectByExample(TPaySubBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    TPaySubBank selectByPrimaryKey(Long payNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TPaySubBank record, @Param("example") TPaySubBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TPaySubBank record, @Param("example") TPaySubBankExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TPaySubBank record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pay_sub_bank
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TPaySubBank record);
}