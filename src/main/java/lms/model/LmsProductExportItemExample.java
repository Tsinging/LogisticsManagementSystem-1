package lms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LmsProductExportItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LmsProductExportItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(BigDecimal value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(BigDecimal value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(BigDecimal value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(BigDecimal value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<BigDecimal> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<BigDecimal> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSubpriceIsNull() {
            addCriterion("subprice is null");
            return (Criteria) this;
        }

        public Criteria andSubpriceIsNotNull() {
            addCriterion("subprice is not null");
            return (Criteria) this;
        }

        public Criteria andSubpriceEqualTo(BigDecimal value) {
            addCriterion("subprice =", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotEqualTo(BigDecimal value) {
            addCriterion("subprice <>", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceGreaterThan(BigDecimal value) {
            addCriterion("subprice >", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("subprice >=", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceLessThan(BigDecimal value) {
            addCriterion("subprice <", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("subprice <=", value, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceIn(List<BigDecimal> values) {
            addCriterion("subprice in", values, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotIn(List<BigDecimal> values) {
            addCriterion("subprice not in", values, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subprice between", value1, value2, "subprice");
            return (Criteria) this;
        }

        public Criteria andSubpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("subprice not between", value1, value2, "subprice");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIsNull() {
            addCriterion("LMS_Product_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIsNotNull() {
            addCriterion("LMS_Product_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id =", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id <>", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Product_id >", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id >=", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdLessThan(BigDecimal value) {
            addCriterion("LMS_Product_id <", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_id <=", value, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_id in", values, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_id not in", values, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_id between", value1, value2, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_id not between", value1, value2, "lmsProductId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdIsNull() {
            addCriterion("LMS_Product_Export_id is null");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdIsNotNull() {
            addCriterion("LMS_Product_Export_id is not null");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Export_id =", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdNotEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Export_id <>", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdGreaterThan(BigDecimal value) {
            addCriterion("LMS_Product_Export_id >", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Export_id >=", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdLessThan(BigDecimal value) {
            addCriterion("LMS_Product_Export_id <", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMS_Product_Export_id <=", value, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_Export_id in", values, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdNotIn(List<BigDecimal> values) {
            addCriterion("LMS_Product_Export_id not in", values, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_Export_id between", value1, value2, "lmsProductExportId");
            return (Criteria) this;
        }

        public Criteria andLmsProductExportIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMS_Product_Export_id not between", value1, value2, "lmsProductExportId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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