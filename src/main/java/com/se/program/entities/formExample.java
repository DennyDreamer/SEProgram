package com.se.program.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class formExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table form
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table form
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table form
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public formExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
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
     * This method corresponds to the database table form
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
     * This method corresponds to the database table form
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table form
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
     * This class corresponds to the database table form
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

        public Criteria andFormTimeIsNull() {
            addCriterion("form_time is null");
            return (Criteria) this;
        }

        public Criteria andFormTimeIsNotNull() {
            addCriterion("form_time is not null");
            return (Criteria) this;
        }

        public Criteria andFormTimeEqualTo(Date value) {
            addCriterion("form_time =", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeNotEqualTo(Date value) {
            addCriterion("form_time <>", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeGreaterThan(Date value) {
            addCriterion("form_time >", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("form_time >=", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeLessThan(Date value) {
            addCriterion("form_time <", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeLessThanOrEqualTo(Date value) {
            addCriterion("form_time <=", value, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeIn(List<Date> values) {
            addCriterion("form_time in", values, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeNotIn(List<Date> values) {
            addCriterion("form_time not in", values, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeBetween(Date value1, Date value2) {
            addCriterion("form_time between", value1, value2, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormTimeNotBetween(Date value1, Date value2) {
            addCriterion("form_time not between", value1, value2, "formTime");
            return (Criteria) this;
        }

        public Criteria andFormKindIsNull() {
            addCriterion("form_kind is null");
            return (Criteria) this;
        }

        public Criteria andFormKindIsNotNull() {
            addCriterion("form_kind is not null");
            return (Criteria) this;
        }

        public Criteria andFormKindEqualTo(Integer value) {
            addCriterion("form_kind =", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindNotEqualTo(Integer value) {
            addCriterion("form_kind <>", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindGreaterThan(Integer value) {
            addCriterion("form_kind >", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("form_kind >=", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindLessThan(Integer value) {
            addCriterion("form_kind <", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindLessThanOrEqualTo(Integer value) {
            addCriterion("form_kind <=", value, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindIn(List<Integer> values) {
            addCriterion("form_kind in", values, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindNotIn(List<Integer> values) {
            addCriterion("form_kind not in", values, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindBetween(Integer value1, Integer value2) {
            addCriterion("form_kind between", value1, value2, "formKind");
            return (Criteria) this;
        }

        public Criteria andFormKindNotBetween(Integer value1, Integer value2) {
            addCriterion("form_kind not between", value1, value2, "formKind");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNull() {
            addCriterion("hospital is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIsNotNull() {
            addCriterion("hospital is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalEqualTo(String value) {
            addCriterion("hospital =", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotEqualTo(String value) {
            addCriterion("hospital <>", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThan(String value) {
            addCriterion("hospital >", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("hospital >=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThan(String value) {
            addCriterion("hospital <", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLessThanOrEqualTo(String value) {
            addCriterion("hospital <=", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalLike(String value) {
            addCriterion("hospital like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotLike(String value) {
            addCriterion("hospital not like", value, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalIn(List<String> values) {
            addCriterion("hospital in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotIn(List<String> values) {
            addCriterion("hospital not in", values, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalBetween(String value1, String value2) {
            addCriterion("hospital between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andHospitalNotBetween(String value1, String value2) {
            addCriterion("hospital not between", value1, value2, "hospital");
            return (Criteria) this;
        }

        public Criteria andFormTextIsNull() {
            addCriterion("form_text is null");
            return (Criteria) this;
        }

        public Criteria andFormTextIsNotNull() {
            addCriterion("form_text is not null");
            return (Criteria) this;
        }

        public Criteria andFormTextEqualTo(String value) {
            addCriterion("form_text =", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextNotEqualTo(String value) {
            addCriterion("form_text <>", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextGreaterThan(String value) {
            addCriterion("form_text >", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextGreaterThanOrEqualTo(String value) {
            addCriterion("form_text >=", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextLessThan(String value) {
            addCriterion("form_text <", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextLessThanOrEqualTo(String value) {
            addCriterion("form_text <=", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextLike(String value) {
            addCriterion("form_text like", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextNotLike(String value) {
            addCriterion("form_text not like", value, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextIn(List<String> values) {
            addCriterion("form_text in", values, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextNotIn(List<String> values) {
            addCriterion("form_text not in", values, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextBetween(String value1, String value2) {
            addCriterion("form_text between", value1, value2, "formText");
            return (Criteria) this;
        }

        public Criteria andFormTextNotBetween(String value1, String value2) {
            addCriterion("form_text not between", value1, value2, "formText");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIsNull() {
            addCriterion("hospital_department is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIsNotNull() {
            addCriterion("hospital_department is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentEqualTo(String value) {
            addCriterion("hospital_department =", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNotEqualTo(String value) {
            addCriterion("hospital_department <>", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentGreaterThan(String value) {
            addCriterion("hospital_department >", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department >=", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentLessThan(String value) {
            addCriterion("hospital_department <", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentLessThanOrEqualTo(String value) {
            addCriterion("hospital_department <=", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentLike(String value) {
            addCriterion("hospital_department like", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNotLike(String value) {
            addCriterion("hospital_department not like", value, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentIn(List<String> values) {
            addCriterion("hospital_department in", values, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNotIn(List<String> values) {
            addCriterion("hospital_department not in", values, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentBetween(String value1, String value2) {
            addCriterion("hospital_department between", value1, value2, "hospitalDepartment");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentNotBetween(String value1, String value2) {
            addCriterion("hospital_department not between", value1, value2, "hospitalDepartment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table form
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
     * This class corresponds to the database table form
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