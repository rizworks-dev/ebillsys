package net.newbiz.ebil.billing.dao.model;

import java.util.Date;

public class MPayway extends DtoBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.pay_type_cd
     *
     * @mbggenerated
     */
    private String payTypeCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.pay_type_nm
     *
     * @mbggenerated
     */
    private String payTypeNm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.creater
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.create_timestamp
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.updater
     *
     * @mbggenerated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_payway.update_timestamp
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.pay_type_cd
     *
     * @return the value of m_payway.pay_type_cd
     *
     * @mbggenerated
     */
    public String getPayTypeCd() {
        return payTypeCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.pay_type_cd
     *
     * @param payTypeCd the value for m_payway.pay_type_cd
     *
     * @mbggenerated
     */
    public void setPayTypeCd(String payTypeCd) {
        this.payTypeCd = payTypeCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.pay_type_nm
     *
     * @return the value of m_payway.pay_type_nm
     *
     * @mbggenerated
     */
    public String getPayTypeNm() {
        return payTypeNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.pay_type_nm
     *
     * @param payTypeNm the value for m_payway.pay_type_nm
     *
     * @mbggenerated
     */
    public void setPayTypeNm(String payTypeNm) {
        this.payTypeNm = payTypeNm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.creater
     *
     * @return the value of m_payway.creater
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.creater
     *
     * @param creater the value for m_payway.creater
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.create_timestamp
     *
     * @return the value of m_payway.create_timestamp
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.create_timestamp
     *
     * @param createTimestamp the value for m_payway.create_timestamp
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.updater
     *
     * @return the value of m_payway.updater
     *
     * @mbggenerated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.updater
     *
     * @param updater the value for m_payway.updater
     *
     * @mbggenerated
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_payway.update_timestamp
     *
     * @return the value of m_payway.update_timestamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_payway.update_timestamp
     *
     * @param updateTimestamp the value for m_payway.update_timestamp
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}