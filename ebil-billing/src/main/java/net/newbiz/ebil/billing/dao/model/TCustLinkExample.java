package net.newbiz.ebil.billing.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCustLinkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public TCustLinkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSrcCustCdIsNull() {
            addCriterion("src_cust_cd is null");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdIsNotNull() {
            addCriterion("src_cust_cd is not null");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdEqualTo(Integer value) {
            addCriterion("src_cust_cd =", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdNotEqualTo(Integer value) {
            addCriterion("src_cust_cd <>", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdGreaterThan(Integer value) {
            addCriterion("src_cust_cd >", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdGreaterThanOrEqualTo(Integer value) {
            addCriterion("src_cust_cd >=", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdLessThan(Integer value) {
            addCriterion("src_cust_cd <", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdLessThanOrEqualTo(Integer value) {
            addCriterion("src_cust_cd <=", value, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdIn(List<Integer> values) {
            addCriterion("src_cust_cd in", values, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdNotIn(List<Integer> values) {
            addCriterion("src_cust_cd not in", values, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdBetween(Integer value1, Integer value2) {
            addCriterion("src_cust_cd between", value1, value2, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andSrcCustCdNotBetween(Integer value1, Integer value2) {
            addCriterion("src_cust_cd not between", value1, value2, "srcCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdIsNull() {
            addCriterion("tgt_cust_cd is null");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdIsNotNull() {
            addCriterion("tgt_cust_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdEqualTo(Integer value) {
            addCriterion("tgt_cust_cd =", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdNotEqualTo(Integer value) {
            addCriterion("tgt_cust_cd <>", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdGreaterThan(Integer value) {
            addCriterion("tgt_cust_cd >", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tgt_cust_cd >=", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdLessThan(Integer value) {
            addCriterion("tgt_cust_cd <", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdLessThanOrEqualTo(Integer value) {
            addCriterion("tgt_cust_cd <=", value, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdIn(List<Integer> values) {
            addCriterion("tgt_cust_cd in", values, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdNotIn(List<Integer> values) {
            addCriterion("tgt_cust_cd not in", values, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdBetween(Integer value1, Integer value2) {
            addCriterion("tgt_cust_cd between", value1, value2, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andTgtCustCdNotBetween(Integer value1, Integer value2) {
            addCriterion("tgt_cust_cd not between", value1, value2, "tgtCustCd");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeIsNull() {
            addCriterion("cust_link_type is null");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeIsNotNull() {
            addCriterion("cust_link_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeEqualTo(Short value) {
            addCriterion("cust_link_type =", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeNotEqualTo(Short value) {
            addCriterion("cust_link_type <>", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeGreaterThan(Short value) {
            addCriterion("cust_link_type >", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("cust_link_type >=", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeLessThan(Short value) {
            addCriterion("cust_link_type <", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeLessThanOrEqualTo(Short value) {
            addCriterion("cust_link_type <=", value, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeIn(List<Short> values) {
            addCriterion("cust_link_type in", values, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeNotIn(List<Short> values) {
            addCriterion("cust_link_type not in", values, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeBetween(Short value1, Short value2) {
            addCriterion("cust_link_type between", value1, value2, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCustLinkTypeNotBetween(Short value1, Short value2) {
            addCriterion("cust_link_type not between", value1, value2, "custLinkType");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNull() {
            addCriterion("create_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIsNotNull() {
            addCriterion("create_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampEqualTo(Date value) {
            addCriterion("create_timestamp =", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotEqualTo(Date value) {
            addCriterion("create_timestamp <>", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThan(Date value) {
            addCriterion("create_timestamp >", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("create_timestamp >=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThan(Date value) {
            addCriterion("create_timestamp <", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("create_timestamp <=", value, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampIn(List<Date> values) {
            addCriterion("create_timestamp in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotIn(List<Date> values) {
            addCriterion("create_timestamp not in", values, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampBetween(Date value1, Date value2) {
            addCriterion("create_timestamp between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andCreateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("create_timestamp not between", value1, value2, "createTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNull() {
            addCriterion("update_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIsNotNull() {
            addCriterion("update_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampEqualTo(Date value) {
            addCriterion("update_timestamp =", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotEqualTo(Date value) {
            addCriterion("update_timestamp <>", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThan(Date value) {
            addCriterion("update_timestamp >", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("update_timestamp >=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThan(Date value) {
            addCriterion("update_timestamp <", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampLessThanOrEqualTo(Date value) {
            addCriterion("update_timestamp <=", value, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampIn(List<Date> values) {
            addCriterion("update_timestamp in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotIn(List<Date> values) {
            addCriterion("update_timestamp not in", values, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampBetween(Date value1, Date value2) {
            addCriterion("update_timestamp between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdateTimestampNotBetween(Date value1, Date value2) {
            addCriterion("update_timestamp not between", value1, value2, "updateTimestamp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cust_link
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_cust_link
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}