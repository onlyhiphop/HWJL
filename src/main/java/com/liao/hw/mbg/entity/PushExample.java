package com.liao.hw.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PushExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PushExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPushNameIsNull() {
            addCriterion("push_name is null");
            return (Criteria) this;
        }

        public Criteria andPushNameIsNotNull() {
            addCriterion("push_name is not null");
            return (Criteria) this;
        }

        public Criteria andPushNameEqualTo(String value) {
            addCriterion("push_name =", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotEqualTo(String value) {
            addCriterion("push_name <>", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThan(String value) {
            addCriterion("push_name >", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameGreaterThanOrEqualTo(String value) {
            addCriterion("push_name >=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThan(String value) {
            addCriterion("push_name <", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLessThanOrEqualTo(String value) {
            addCriterion("push_name <=", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameLike(String value) {
            addCriterion("push_name like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotLike(String value) {
            addCriterion("push_name not like", value, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameIn(List<String> values) {
            addCriterion("push_name in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotIn(List<String> values) {
            addCriterion("push_name not in", values, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameBetween(String value1, String value2) {
            addCriterion("push_name between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushNameNotBetween(String value1, String value2) {
            addCriterion("push_name not between", value1, value2, "pushName");
            return (Criteria) this;
        }

        public Criteria andPushAvatorIsNull() {
            addCriterion("push_avator is null");
            return (Criteria) this;
        }

        public Criteria andPushAvatorIsNotNull() {
            addCriterion("push_avator is not null");
            return (Criteria) this;
        }

        public Criteria andPushAvatorEqualTo(String value) {
            addCriterion("push_avator =", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorNotEqualTo(String value) {
            addCriterion("push_avator <>", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorGreaterThan(String value) {
            addCriterion("push_avator >", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorGreaterThanOrEqualTo(String value) {
            addCriterion("push_avator >=", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorLessThan(String value) {
            addCriterion("push_avator <", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorLessThanOrEqualTo(String value) {
            addCriterion("push_avator <=", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorLike(String value) {
            addCriterion("push_avator like", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorNotLike(String value) {
            addCriterion("push_avator not like", value, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorIn(List<String> values) {
            addCriterion("push_avator in", values, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorNotIn(List<String> values) {
            addCriterion("push_avator not in", values, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorBetween(String value1, String value2) {
            addCriterion("push_avator between", value1, value2, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushAvatorNotBetween(String value1, String value2) {
            addCriterion("push_avator not between", value1, value2, "pushAvator");
            return (Criteria) this;
        }

        public Criteria andPushImgIsNull() {
            addCriterion("push_img is null");
            return (Criteria) this;
        }

        public Criteria andPushImgIsNotNull() {
            addCriterion("push_img is not null");
            return (Criteria) this;
        }

        public Criteria andPushImgEqualTo(String value) {
            addCriterion("push_img =", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgNotEqualTo(String value) {
            addCriterion("push_img <>", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgGreaterThan(String value) {
            addCriterion("push_img >", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgGreaterThanOrEqualTo(String value) {
            addCriterion("push_img >=", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgLessThan(String value) {
            addCriterion("push_img <", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgLessThanOrEqualTo(String value) {
            addCriterion("push_img <=", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgLike(String value) {
            addCriterion("push_img like", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgNotLike(String value) {
            addCriterion("push_img not like", value, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgIn(List<String> values) {
            addCriterion("push_img in", values, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgNotIn(List<String> values) {
            addCriterion("push_img not in", values, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgBetween(String value1, String value2) {
            addCriterion("push_img between", value1, value2, "pushImg");
            return (Criteria) this;
        }

        public Criteria andPushImgNotBetween(String value1, String value2) {
            addCriterion("push_img not between", value1, value2, "pushImg");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNull() {
            addCriterion("is_push is null");
            return (Criteria) this;
        }

        public Criteria andIsPushIsNotNull() {
            addCriterion("is_push is not null");
            return (Criteria) this;
        }

        public Criteria andIsPushEqualTo(String value) {
            addCriterion("is_push =", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotEqualTo(String value) {
            addCriterion("is_push <>", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThan(String value) {
            addCriterion("is_push >", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushGreaterThanOrEqualTo(String value) {
            addCriterion("is_push >=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThan(String value) {
            addCriterion("is_push <", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLessThanOrEqualTo(String value) {
            addCriterion("is_push <=", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushLike(String value) {
            addCriterion("is_push like", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotLike(String value) {
            addCriterion("is_push not like", value, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushIn(List<String> values) {
            addCriterion("is_push in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotIn(List<String> values) {
            addCriterion("is_push not in", values, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushBetween(String value1, String value2) {
            addCriterion("is_push between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andIsPushNotBetween(String value1, String value2) {
            addCriterion("is_push not between", value1, value2, "isPush");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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