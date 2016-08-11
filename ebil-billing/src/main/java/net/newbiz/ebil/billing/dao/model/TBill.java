package net.newbiz.ebil.billing.dao.model;

import java.util.Date;

public class TBill extends DtoBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_no
     *
     * @mbggenerated
     */
    private Long billNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.cust_cd
     *
     * @mbggenerated
     */
    private Integer custCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.fee_calc_ym
     *
     * @mbggenerated
     */
    private String feeCalcYm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_ym
     *
     * @mbggenerated
     */
    private String billYm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_date
     *
     * @mbggenerated
     */
    private String billDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_gene_src
     *
     * @mbggenerated
     */
    private Short billGeneSrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_adj_stat
     *
     * @mbggenerated
     */
    private Short billAdjStat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.bill_amount
     *
     * @mbggenerated
     */
    private Long billAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.memo
     *
     * @mbggenerated
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.creater
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.create_timestamp
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.updater
     *
     * @mbggenerated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bill.update_timestamp
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_no
     *
     * @return the value of t_bill.bill_no
     *
     * @mbggenerated
     */
    public Long getBillNo() {
        return billNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_no
     *
     * @param billNo the value for t_bill.bill_no
     *
     * @mbggenerated
     */
    public void setBillNo(Long billNo) {
        this.billNo = billNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.cust_cd
     *
     * @return the value of t_bill.cust_cd
     *
     * @mbggenerated
     */
    public Integer getCustCd() {
        return custCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.cust_cd
     *
     * @param custCd the value for t_bill.cust_cd
     *
     * @mbggenerated
     */
    public void setCustCd(Integer custCd) {
        this.custCd = custCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.fee_calc_ym
     *
     * @return the value of t_bill.fee_calc_ym
     *
     * @mbggenerated
     */
    public String getFeeCalcYm() {
        return feeCalcYm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.fee_calc_ym
     *
     * @param feeCalcYm the value for t_bill.fee_calc_ym
     *
     * @mbggenerated
     */
    public void setFeeCalcYm(String feeCalcYm) {
        this.feeCalcYm = feeCalcYm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_ym
     *
     * @return the value of t_bill.bill_ym
     *
     * @mbggenerated
     */
    public String getBillYm() {
        return billYm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_ym
     *
     * @param billYm the value for t_bill.bill_ym
     *
     * @mbggenerated
     */
    public void setBillYm(String billYm) {
        this.billYm = billYm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_date
     *
     * @return the value of t_bill.bill_date
     *
     * @mbggenerated
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_date
     *
     * @param billDate the value for t_bill.bill_date
     *
     * @mbggenerated
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_gene_src
     *
     * @return the value of t_bill.bill_gene_src
     *
     * @mbggenerated
     */
    public Short getBillGeneSrc() {
        return billGeneSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_gene_src
     *
     * @param billGeneSrc the value for t_bill.bill_gene_src
     *
     * @mbggenerated
     */
    public void setBillGeneSrc(Short billGeneSrc) {
        this.billGeneSrc = billGeneSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_adj_stat
     *
     * @return the value of t_bill.bill_adj_stat
     *
     * @mbggenerated
     */
    public Short getBillAdjStat() {
        return billAdjStat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_adj_stat
     *
     * @param billAdjStat the value for t_bill.bill_adj_stat
     *
     * @mbggenerated
     */
    public void setBillAdjStat(Short billAdjStat) {
        this.billAdjStat = billAdjStat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.bill_amount
     *
     * @return the value of t_bill.bill_amount
     *
     * @mbggenerated
     */
    public Long getBillAmount() {
        return billAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.bill_amount
     *
     * @param billAmount the value for t_bill.bill_amount
     *
     * @mbggenerated
     */
    public void setBillAmount(Long billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.memo
     *
     * @return the value of t_bill.memo
     *
     * @mbggenerated
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.memo
     *
     * @param memo the value for t_bill.memo
     *
     * @mbggenerated
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.creater
     *
     * @return the value of t_bill.creater
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.creater
     *
     * @param creater the value for t_bill.creater
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.create_timestamp
     *
     * @return the value of t_bill.create_timestamp
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.create_timestamp
     *
     * @param createTimestamp the value for t_bill.create_timestamp
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.updater
     *
     * @return the value of t_bill.updater
     *
     * @mbggenerated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.updater
     *
     * @param updater the value for t_bill.updater
     *
     * @mbggenerated
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bill.update_timestamp
     *
     * @return the value of t_bill.update_timestamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bill.update_timestamp
     *
     * @param updateTimestamp the value for t_bill.update_timestamp
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}