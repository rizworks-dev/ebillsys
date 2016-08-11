package net.newbiz.ebil.billing.dao.model;

import java.util.Date;

public class TChgRsv extends DtoBase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_rsv_no
     *
     * @mbggenerated
     */
    private Long chgRsvNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_schedule_date
     *
     * @mbggenerated
     */
    private String chgScheduleDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_apply_date
     *
     * @mbggenerated
     */
    private String chgApplyDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_apply_err_cont
     *
     * @mbggenerated
     */
    private String chgApplyErrCont;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_tgt_type
     *
     * @mbggenerated
     */
    private Short chgTgtType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_way_type
     *
     * @mbggenerated
     */
    private Short chgWayType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_str_pkey1
     *
     * @mbggenerated
     */
    private Long chgDataStrPkey1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_str_pkey2
     *
     * @mbggenerated
     */
    private Long chgDataStrPkey2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_str_pkey3
     *
     * @mbggenerated
     */
    private Long chgDataStrPkey3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_apply_pkey1
     *
     * @mbggenerated
     */
    private Long chgDataApplyPkey1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_apply_pkey2
     *
     * @mbggenerated
     */
    private Long chgDataApplyPkey2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.chg_data_apply_pkey3
     *
     * @mbggenerated
     */
    private Long chgDataApplyPkey3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.sys_state_cd
     *
     * @mbggenerated
     */
    private Short sysStateCd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.creater
     *
     * @mbggenerated
     */
    private String creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.create_timestamp
     *
     * @mbggenerated
     */
    private Date createTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.updater
     *
     * @mbggenerated
     */
    private String updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_chg_rsv.update_timestamp
     *
     * @mbggenerated
     */
    private Date updateTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_rsv_no
     *
     * @return the value of t_chg_rsv.chg_rsv_no
     *
     * @mbggenerated
     */
    public Long getChgRsvNo() {
        return chgRsvNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_rsv_no
     *
     * @param chgRsvNo the value for t_chg_rsv.chg_rsv_no
     *
     * @mbggenerated
     */
    public void setChgRsvNo(Long chgRsvNo) {
        this.chgRsvNo = chgRsvNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_schedule_date
     *
     * @return the value of t_chg_rsv.chg_schedule_date
     *
     * @mbggenerated
     */
    public String getChgScheduleDate() {
        return chgScheduleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_schedule_date
     *
     * @param chgScheduleDate the value for t_chg_rsv.chg_schedule_date
     *
     * @mbggenerated
     */
    public void setChgScheduleDate(String chgScheduleDate) {
        this.chgScheduleDate = chgScheduleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_apply_date
     *
     * @return the value of t_chg_rsv.chg_apply_date
     *
     * @mbggenerated
     */
    public String getChgApplyDate() {
        return chgApplyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_apply_date
     *
     * @param chgApplyDate the value for t_chg_rsv.chg_apply_date
     *
     * @mbggenerated
     */
    public void setChgApplyDate(String chgApplyDate) {
        this.chgApplyDate = chgApplyDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_apply_err_cont
     *
     * @return the value of t_chg_rsv.chg_apply_err_cont
     *
     * @mbggenerated
     */
    public String getChgApplyErrCont() {
        return chgApplyErrCont;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_apply_err_cont
     *
     * @param chgApplyErrCont the value for t_chg_rsv.chg_apply_err_cont
     *
     * @mbggenerated
     */
    public void setChgApplyErrCont(String chgApplyErrCont) {
        this.chgApplyErrCont = chgApplyErrCont;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_tgt_type
     *
     * @return the value of t_chg_rsv.chg_tgt_type
     *
     * @mbggenerated
     */
    public Short getChgTgtType() {
        return chgTgtType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_tgt_type
     *
     * @param chgTgtType the value for t_chg_rsv.chg_tgt_type
     *
     * @mbggenerated
     */
    public void setChgTgtType(Short chgTgtType) {
        this.chgTgtType = chgTgtType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_way_type
     *
     * @return the value of t_chg_rsv.chg_way_type
     *
     * @mbggenerated
     */
    public Short getChgWayType() {
        return chgWayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_way_type
     *
     * @param chgWayType the value for t_chg_rsv.chg_way_type
     *
     * @mbggenerated
     */
    public void setChgWayType(Short chgWayType) {
        this.chgWayType = chgWayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_str_pkey1
     *
     * @return the value of t_chg_rsv.chg_data_str_pkey1
     *
     * @mbggenerated
     */
    public Long getChgDataStrPkey1() {
        return chgDataStrPkey1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_str_pkey1
     *
     * @param chgDataStrPkey1 the value for t_chg_rsv.chg_data_str_pkey1
     *
     * @mbggenerated
     */
    public void setChgDataStrPkey1(Long chgDataStrPkey1) {
        this.chgDataStrPkey1 = chgDataStrPkey1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_str_pkey2
     *
     * @return the value of t_chg_rsv.chg_data_str_pkey2
     *
     * @mbggenerated
     */
    public Long getChgDataStrPkey2() {
        return chgDataStrPkey2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_str_pkey2
     *
     * @param chgDataStrPkey2 the value for t_chg_rsv.chg_data_str_pkey2
     *
     * @mbggenerated
     */
    public void setChgDataStrPkey2(Long chgDataStrPkey2) {
        this.chgDataStrPkey2 = chgDataStrPkey2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_str_pkey3
     *
     * @return the value of t_chg_rsv.chg_data_str_pkey3
     *
     * @mbggenerated
     */
    public Long getChgDataStrPkey3() {
        return chgDataStrPkey3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_str_pkey3
     *
     * @param chgDataStrPkey3 the value for t_chg_rsv.chg_data_str_pkey3
     *
     * @mbggenerated
     */
    public void setChgDataStrPkey3(Long chgDataStrPkey3) {
        this.chgDataStrPkey3 = chgDataStrPkey3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_apply_pkey1
     *
     * @return the value of t_chg_rsv.chg_data_apply_pkey1
     *
     * @mbggenerated
     */
    public Long getChgDataApplyPkey1() {
        return chgDataApplyPkey1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_apply_pkey1
     *
     * @param chgDataApplyPkey1 the value for t_chg_rsv.chg_data_apply_pkey1
     *
     * @mbggenerated
     */
    public void setChgDataApplyPkey1(Long chgDataApplyPkey1) {
        this.chgDataApplyPkey1 = chgDataApplyPkey1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_apply_pkey2
     *
     * @return the value of t_chg_rsv.chg_data_apply_pkey2
     *
     * @mbggenerated
     */
    public Long getChgDataApplyPkey2() {
        return chgDataApplyPkey2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_apply_pkey2
     *
     * @param chgDataApplyPkey2 the value for t_chg_rsv.chg_data_apply_pkey2
     *
     * @mbggenerated
     */
    public void setChgDataApplyPkey2(Long chgDataApplyPkey2) {
        this.chgDataApplyPkey2 = chgDataApplyPkey2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.chg_data_apply_pkey3
     *
     * @return the value of t_chg_rsv.chg_data_apply_pkey3
     *
     * @mbggenerated
     */
    public Long getChgDataApplyPkey3() {
        return chgDataApplyPkey3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.chg_data_apply_pkey3
     *
     * @param chgDataApplyPkey3 the value for t_chg_rsv.chg_data_apply_pkey3
     *
     * @mbggenerated
     */
    public void setChgDataApplyPkey3(Long chgDataApplyPkey3) {
        this.chgDataApplyPkey3 = chgDataApplyPkey3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.sys_state_cd
     *
     * @return the value of t_chg_rsv.sys_state_cd
     *
     * @mbggenerated
     */
    public Short getSysStateCd() {
        return sysStateCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.sys_state_cd
     *
     * @param sysStateCd the value for t_chg_rsv.sys_state_cd
     *
     * @mbggenerated
     */
    public void setSysStateCd(Short sysStateCd) {
        this.sysStateCd = sysStateCd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.creater
     *
     * @return the value of t_chg_rsv.creater
     *
     * @mbggenerated
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.creater
     *
     * @param creater the value for t_chg_rsv.creater
     *
     * @mbggenerated
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.create_timestamp
     *
     * @return the value of t_chg_rsv.create_timestamp
     *
     * @mbggenerated
     */
    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.create_timestamp
     *
     * @param createTimestamp the value for t_chg_rsv.create_timestamp
     *
     * @mbggenerated
     */
    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.updater
     *
     * @return the value of t_chg_rsv.updater
     *
     * @mbggenerated
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.updater
     *
     * @param updater the value for t_chg_rsv.updater
     *
     * @mbggenerated
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_chg_rsv.update_timestamp
     *
     * @return the value of t_chg_rsv.update_timestamp
     *
     * @mbggenerated
     */
    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_chg_rsv.update_timestamp
     *
     * @param updateTimestamp the value for t_chg_rsv.update_timestamp
     *
     * @mbggenerated
     */
    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}