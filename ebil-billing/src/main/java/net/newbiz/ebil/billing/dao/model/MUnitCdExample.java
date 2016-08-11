package net.newbiz.ebil.billing.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MUnitCdExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public MUnitCdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
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
     * This method corresponds to the database table m_unit_cd
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
     * This method corresponds to the database table m_unit_cd
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_unit_cd
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
     * This class corresponds to the database table m_unit_cd
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

        public Criteria andUnitCdIsNull() {
            addCriterion("unit_cd is null");
            return (Criteria) this;
        }

        public Criteria andUnitCdIsNotNull() {
            addCriterion("unit_cd is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCdEqualTo(String value) {
            addCriterion("unit_cd =", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotEqualTo(String value) {
            addCriterion("unit_cd <>", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdGreaterThan(String value) {
            addCriterion("unit_cd >", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdGreaterThanOrEqualTo(String value) {
            addCriterion("unit_cd >=", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLessThan(String value) {
            addCriterion("unit_cd <", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLessThanOrEqualTo(String value) {
            addCriterion("unit_cd <=", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdLike(String value) {
            addCriterion("unit_cd like", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotLike(String value) {
            addCriterion("unit_cd not like", value, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdIn(List<String> values) {
            addCriterion("unit_cd in", values, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotIn(List<String> values) {
            addCriterion("unit_cd not in", values, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdBetween(String value1, String value2) {
            addCriterion("unit_cd between", value1, value2, "unitCd");
            return (Criteria) this;
        }

        public Criteria andUnitCdNotBetween(String value1, String value2) {
            addCriterion("unit_cd not between", value1, value2, "unitCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdIsNull() {
            addCriterion("fee_plan_cd is null");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdIsNotNull() {
            addCriterion("fee_plan_cd is not null");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdEqualTo(String value) {
            addCriterion("fee_plan_cd =", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdNotEqualTo(String value) {
            addCriterion("fee_plan_cd <>", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdGreaterThan(String value) {
            addCriterion("fee_plan_cd >", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdGreaterThanOrEqualTo(String value) {
            addCriterion("fee_plan_cd >=", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdLessThan(String value) {
            addCriterion("fee_plan_cd <", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdLessThanOrEqualTo(String value) {
            addCriterion("fee_plan_cd <=", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdLike(String value) {
            addCriterion("fee_plan_cd like", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdNotLike(String value) {
            addCriterion("fee_plan_cd not like", value, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdIn(List<String> values) {
            addCriterion("fee_plan_cd in", values, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdNotIn(List<String> values) {
            addCriterion("fee_plan_cd not in", values, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdBetween(String value1, String value2) {
            addCriterion("fee_plan_cd between", value1, value2, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andFeePlanCdNotBetween(String value1, String value2) {
            addCriterion("fee_plan_cd not between", value1, value2, "feePlanCd");
            return (Criteria) this;
        }

        public Criteria andUnitNmIsNull() {
            addCriterion("unit_nm is null");
            return (Criteria) this;
        }

        public Criteria andUnitNmIsNotNull() {
            addCriterion("unit_nm is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNmEqualTo(String value) {
            addCriterion("unit_nm =", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmNotEqualTo(String value) {
            addCriterion("unit_nm <>", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmGreaterThan(String value) {
            addCriterion("unit_nm >", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmGreaterThanOrEqualTo(String value) {
            addCriterion("unit_nm >=", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmLessThan(String value) {
            addCriterion("unit_nm <", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmLessThanOrEqualTo(String value) {
            addCriterion("unit_nm <=", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmLike(String value) {
            addCriterion("unit_nm like", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmNotLike(String value) {
            addCriterion("unit_nm not like", value, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmIn(List<String> values) {
            addCriterion("unit_nm in", values, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmNotIn(List<String> values) {
            addCriterion("unit_nm not in", values, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmBetween(String value1, String value2) {
            addCriterion("unit_nm between", value1, value2, "unitNm");
            return (Criteria) this;
        }

        public Criteria andUnitNmNotBetween(String value1, String value2) {
            addCriterion("unit_nm not between", value1, value2, "unitNm");
            return (Criteria) this;
        }

        public Criteria andCalcWayIsNull() {
            addCriterion("calc_way is null");
            return (Criteria) this;
        }

        public Criteria andCalcWayIsNotNull() {
            addCriterion("calc_way is not null");
            return (Criteria) this;
        }

        public Criteria andCalcWayEqualTo(Short value) {
            addCriterion("calc_way =", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayNotEqualTo(Short value) {
            addCriterion("calc_way <>", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayGreaterThan(Short value) {
            addCriterion("calc_way >", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayGreaterThanOrEqualTo(Short value) {
            addCriterion("calc_way >=", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayLessThan(Short value) {
            addCriterion("calc_way <", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayLessThanOrEqualTo(Short value) {
            addCriterion("calc_way <=", value, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayIn(List<Short> values) {
            addCriterion("calc_way in", values, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayNotIn(List<Short> values) {
            addCriterion("calc_way not in", values, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayBetween(Short value1, Short value2) {
            addCriterion("calc_way between", value1, value2, "calcWay");
            return (Criteria) this;
        }

        public Criteria andCalcWayNotBetween(Short value1, Short value2) {
            addCriterion("calc_way not between", value1, value2, "calcWay");
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
     * This class corresponds to the database table m_unit_cd
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
     * This class corresponds to the database table m_unit_cd
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