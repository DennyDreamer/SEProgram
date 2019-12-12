package com.se.program.entities;

import java.util.ArrayList;
import java.util.List;

public class registerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table register
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public registerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
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
     * This method corresponds to the database table register
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
     * This method corresponds to the database table register
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table register
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
     * This class corresponds to the database table register
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

        public Criteria andRegisterIdIsNull() {
            addCriterion("register_id is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIsNotNull() {
            addCriterion("register_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterIdEqualTo(Integer value) {
            addCriterion("register_id =", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotEqualTo(Integer value) {
            addCriterion("register_id <>", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThan(Integer value) {
            addCriterion("register_id >", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_id >=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThan(Integer value) {
            addCriterion("register_id <", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdLessThanOrEqualTo(Integer value) {
            addCriterion("register_id <=", value, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdIn(List<Integer> values) {
            addCriterion("register_id in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotIn(List<Integer> values) {
            addCriterion("register_id not in", values, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdBetween(Integer value1, Integer value2) {
            addCriterion("register_id between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("register_id not between", value1, value2, "registerId");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalIsNull() {
            addCriterion("register_hospital is null");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalIsNotNull() {
            addCriterion("register_hospital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalEqualTo(String value) {
            addCriterion("register_hospital =", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalNotEqualTo(String value) {
            addCriterion("register_hospital <>", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalGreaterThan(String value) {
            addCriterion("register_hospital >", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("register_hospital >=", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalLessThan(String value) {
            addCriterion("register_hospital <", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalLessThanOrEqualTo(String value) {
            addCriterion("register_hospital <=", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalLike(String value) {
            addCriterion("register_hospital like", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalNotLike(String value) {
            addCriterion("register_hospital not like", value, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalIn(List<String> values) {
            addCriterion("register_hospital in", values, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalNotIn(List<String> values) {
            addCriterion("register_hospital not in", values, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalBetween(String value1, String value2) {
            addCriterion("register_hospital between", value1, value2, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterHospitalNotBetween(String value1, String value2) {
            addCriterion("register_hospital not between", value1, value2, "registerHospital");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentIsNull() {
            addCriterion("register_department is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentIsNotNull() {
            addCriterion("register_department is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentEqualTo(String value) {
            addCriterion("register_department =", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentNotEqualTo(String value) {
            addCriterion("register_department <>", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentGreaterThan(String value) {
            addCriterion("register_department >", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("register_department >=", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentLessThan(String value) {
            addCriterion("register_department <", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentLessThanOrEqualTo(String value) {
            addCriterion("register_department <=", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentLike(String value) {
            addCriterion("register_department like", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentNotLike(String value) {
            addCriterion("register_department not like", value, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentIn(List<String> values) {
            addCriterion("register_department in", values, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentNotIn(List<String> values) {
            addCriterion("register_department not in", values, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentBetween(String value1, String value2) {
            addCriterion("register_department between", value1, value2, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterDepartmentNotBetween(String value1, String value2) {
            addCriterion("register_department not between", value1, value2, "registerDepartment");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIsNull() {
            addCriterion("register_cost is null");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIsNotNull() {
            addCriterion("register_cost is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterCostEqualTo(Integer value) {
            addCriterion("register_cost =", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotEqualTo(Integer value) {
            addCriterion("register_cost <>", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostGreaterThan(Integer value) {
            addCriterion("register_cost >", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_cost >=", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostLessThan(Integer value) {
            addCriterion("register_cost <", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostLessThanOrEqualTo(Integer value) {
            addCriterion("register_cost <=", value, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostIn(List<Integer> values) {
            addCriterion("register_cost in", values, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotIn(List<Integer> values) {
            addCriterion("register_cost not in", values, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostBetween(Integer value1, Integer value2) {
            addCriterion("register_cost between", value1, value2, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterCostNotBetween(Integer value1, Integer value2) {
            addCriterion("register_cost not between", value1, value2, "registerCost");
            return (Criteria) this;
        }

        public Criteria andRegisterImageIsNull() {
            addCriterion("register_image is null");
            return (Criteria) this;
        }

        public Criteria andRegisterImageIsNotNull() {
            addCriterion("register_image is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterImageEqualTo(String value) {
            addCriterion("register_image =", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageNotEqualTo(String value) {
            addCriterion("register_image <>", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageGreaterThan(String value) {
            addCriterion("register_image >", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageGreaterThanOrEqualTo(String value) {
            addCriterion("register_image >=", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageLessThan(String value) {
            addCriterion("register_image <", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageLessThanOrEqualTo(String value) {
            addCriterion("register_image <=", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageLike(String value) {
            addCriterion("register_image like", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageNotLike(String value) {
            addCriterion("register_image not like", value, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageIn(List<String> values) {
            addCriterion("register_image in", values, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageNotIn(List<String> values) {
            addCriterion("register_image not in", values, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageBetween(String value1, String value2) {
            addCriterion("register_image between", value1, value2, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterImageNotBetween(String value1, String value2) {
            addCriterion("register_image not between", value1, value2, "registerImage");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationIsNull() {
            addCriterion("register_explaination is null");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationIsNotNull() {
            addCriterion("register_explaination is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationEqualTo(String value) {
            addCriterion("register_explaination =", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationNotEqualTo(String value) {
            addCriterion("register_explaination <>", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationGreaterThan(String value) {
            addCriterion("register_explaination >", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationGreaterThanOrEqualTo(String value) {
            addCriterion("register_explaination >=", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationLessThan(String value) {
            addCriterion("register_explaination <", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationLessThanOrEqualTo(String value) {
            addCriterion("register_explaination <=", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationLike(String value) {
            addCriterion("register_explaination like", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationNotLike(String value) {
            addCriterion("register_explaination not like", value, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationIn(List<String> values) {
            addCriterion("register_explaination in", values, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationNotIn(List<String> values) {
            addCriterion("register_explaination not in", values, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationBetween(String value1, String value2) {
            addCriterion("register_explaination between", value1, value2, "registerExplaination");
            return (Criteria) this;
        }

        public Criteria andRegisterExplainationNotBetween(String value1, String value2) {
            addCriterion("register_explaination not between", value1, value2, "registerExplaination");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table register
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
     * This class corresponds to the database table register
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