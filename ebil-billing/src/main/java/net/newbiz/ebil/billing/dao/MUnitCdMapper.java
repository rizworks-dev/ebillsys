package net.newbiz.ebil.billing.dao;

import java.util.List;
import net.newbiz.ebil.billing.dao.model.MUnitCd;
import net.newbiz.ebil.billing.dao.model.MUnitCdExample;
import org.apache.ibatis.annotations.Param;

public interface MUnitCdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int countByExample(MUnitCdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int deleteByExample(MUnitCdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String unitCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int insert(MUnitCd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int insertSelective(MUnitCd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    List<MUnitCd> selectByExample(MUnitCdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    MUnitCd selectByPrimaryKey(String unitCd);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MUnitCd record, @Param("example") MUnitCdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MUnitCd record, @Param("example") MUnitCdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MUnitCd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MUnitCd record);
}