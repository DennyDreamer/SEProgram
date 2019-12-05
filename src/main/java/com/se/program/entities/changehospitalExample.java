package com.se.program.entities;

import java.util.ArrayList;
import java.util.List;

public class changehospitalExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public changehospitalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
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
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table changehospital
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table changehospital
     *
     * @mbg.generated
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

        public Criteria andChangehospitalIdIsNull() {
            addCriterion("changehospital_id is null");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdIsNotNull() {
            addCriterion("changehospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdEqualTo(Integer value) {
            addCriterion("changehospital_id =", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdNotEqualTo(Integer value) {
            addCriterion("changehospital_id <>", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdGreaterThan(Integer value) {
            addCriterion("changehospital_id >", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("changehospital_id >=", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdLessThan(Integer value) {
            addCriterion("changehospital_id <", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("changehospital_id <=", value, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdIn(List<Integer> values) {
            addCriterion("changehospital_id in", values, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdNotIn(List<Integer> values) {
            addCriterion("changehospital_id not in", values, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("changehospital_id between", value1, value2, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("changehospital_id not between", value1, value2, "changehospitalId");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageIsNull() {
            addCriterion("changehospital_image is null");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageIsNotNull() {
            addCriterion("changehospital_image is not null");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageEqualTo(String value) {
            addCriterion("changehospital_image =", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageNotEqualTo(String value) {
            addCriterion("changehospital_image <>", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageGreaterThan(String value) {
            addCriterion("changehospital_image >", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageGreaterThanOrEqualTo(String value) {
            addCriterion("changehospital_image >=", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageLessThan(String value) {
            addCriterion("changehospital_image <", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageLessThanOrEqualTo(String value) {
            addCriterion("changehospital_image <=", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageLike(String value) {
            addCriterion("changehospital_image like", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageNotLike(String value) {
            addCriterion("changehospital_image not like", value, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageIn(List<String> values) {
            addCriterion("changehospital_image in", values, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageNotIn(List<String> values) {
            addCriterion("changehospital_image not in", values, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageBetween(String value1, String value2) {
            addCriterion("changehospital_image between", value1, value2, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andChangehospitalImageNotBetween(String value1, String value2) {
            addCriterion("changehospital_image not between", value1, value2, "changehospitalImage");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Integer value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Integer value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Integer value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Integer value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Integer> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Integer> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Integer value1, Integer value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table changehospital
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table changehospital
     *
     * @mbg.generated
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