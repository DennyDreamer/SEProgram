package com.se.program.entities;

import java.util.ArrayList;
import java.util.List;

public class billExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bill
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bill
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bill
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public billExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
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
     * This method corresponds to the database table bill
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
     * This method corresponds to the database table bill
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bill
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
     * This class corresponds to the database table bill
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

        public Criteria andBillIdIsNull() {
            addCriterion("bill_id is null");
            return (Criteria) this;
        }

        public Criteria andBillIdIsNotNull() {
            addCriterion("bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andBillIdEqualTo(Integer value) {
            addCriterion("bill_id =", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotEqualTo(Integer value) {
            addCriterion("bill_id <>", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThan(Integer value) {
            addCriterion("bill_id >", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_id >=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThan(Integer value) {
            addCriterion("bill_id <", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_id <=", value, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdIn(List<Integer> values) {
            addCriterion("bill_id in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotIn(List<Integer> values) {
            addCriterion("bill_id not in", values, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_id between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_id not between", value1, value2, "billId");
            return (Criteria) this;
        }

        public Criteria andBillCostIsNull() {
            addCriterion("bill_cost is null");
            return (Criteria) this;
        }

        public Criteria andBillCostIsNotNull() {
            addCriterion("bill_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBillCostEqualTo(Integer value) {
            addCriterion("bill_cost =", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostNotEqualTo(Integer value) {
            addCriterion("bill_cost <>", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostGreaterThan(Integer value) {
            addCriterion("bill_cost >", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_cost >=", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostLessThan(Integer value) {
            addCriterion("bill_cost <", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostLessThanOrEqualTo(Integer value) {
            addCriterion("bill_cost <=", value, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostIn(List<Integer> values) {
            addCriterion("bill_cost in", values, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostNotIn(List<Integer> values) {
            addCriterion("bill_cost not in", values, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostBetween(Integer value1, Integer value2) {
            addCriterion("bill_cost between", value1, value2, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillCostNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_cost not between", value1, value2, "billCost");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageIsNull() {
            addCriterion("bill_prescription_image is null");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageIsNotNull() {
            addCriterion("bill_prescription_image is not null");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageEqualTo(String value) {
            addCriterion("bill_prescription_image =", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageNotEqualTo(String value) {
            addCriterion("bill_prescription_image <>", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageGreaterThan(String value) {
            addCriterion("bill_prescription_image >", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageGreaterThanOrEqualTo(String value) {
            addCriterion("bill_prescription_image >=", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageLessThan(String value) {
            addCriterion("bill_prescription_image <", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageLessThanOrEqualTo(String value) {
            addCriterion("bill_prescription_image <=", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageLike(String value) {
            addCriterion("bill_prescription_image like", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageNotLike(String value) {
            addCriterion("bill_prescription_image not like", value, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageIn(List<String> values) {
            addCriterion("bill_prescription_image in", values, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageNotIn(List<String> values) {
            addCriterion("bill_prescription_image not in", values, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageBetween(String value1, String value2) {
            addCriterion("bill_prescription_image between", value1, value2, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillPrescriptionImageNotBetween(String value1, String value2) {
            addCriterion("bill_prescription_image not between", value1, value2, "billPrescriptionImage");
            return (Criteria) this;
        }

        public Criteria andBillImageIsNull() {
            addCriterion("bill_image is null");
            return (Criteria) this;
        }

        public Criteria andBillImageIsNotNull() {
            addCriterion("bill_image is not null");
            return (Criteria) this;
        }

        public Criteria andBillImageEqualTo(String value) {
            addCriterion("bill_image =", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotEqualTo(String value) {
            addCriterion("bill_image <>", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageGreaterThan(String value) {
            addCriterion("bill_image >", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageGreaterThanOrEqualTo(String value) {
            addCriterion("bill_image >=", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLessThan(String value) {
            addCriterion("bill_image <", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLessThanOrEqualTo(String value) {
            addCriterion("bill_image <=", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageLike(String value) {
            addCriterion("bill_image like", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotLike(String value) {
            addCriterion("bill_image not like", value, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageIn(List<String> values) {
            addCriterion("bill_image in", values, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotIn(List<String> values) {
            addCriterion("bill_image not in", values, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageBetween(String value1, String value2) {
            addCriterion("bill_image between", value1, value2, "billImage");
            return (Criteria) this;
        }

        public Criteria andBillImageNotBetween(String value1, String value2) {
            addCriterion("bill_image not between", value1, value2, "billImage");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bill
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
     * This class corresponds to the database table bill
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