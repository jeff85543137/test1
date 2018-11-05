package cn.bj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMsexIsNull() {
            addCriterion("msex is null");
            return (Criteria) this;
        }

        public Criteria andMsexIsNotNull() {
            addCriterion("msex is not null");
            return (Criteria) this;
        }

        public Criteria andMsexEqualTo(Integer value) {
            addCriterion("msex =", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotEqualTo(Integer value) {
            addCriterion("msex <>", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexGreaterThan(Integer value) {
            addCriterion("msex >", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("msex >=", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexLessThan(Integer value) {
            addCriterion("msex <", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexLessThanOrEqualTo(Integer value) {
            addCriterion("msex <=", value, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexIn(List<Integer> values) {
            addCriterion("msex in", values, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotIn(List<Integer> values) {
            addCriterion("msex not in", values, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexBetween(Integer value1, Integer value2) {
            addCriterion("msex between", value1, value2, "msex");
            return (Criteria) this;
        }

        public Criteria andMsexNotBetween(Integer value1, Integer value2) {
            addCriterion("msex not between", value1, value2, "msex");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNull() {
            addCriterion("mphone is null");
            return (Criteria) this;
        }

        public Criteria andMphoneIsNotNull() {
            addCriterion("mphone is not null");
            return (Criteria) this;
        }

        public Criteria andMphoneEqualTo(Long value) {
            addCriterion("mphone =", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotEqualTo(Long value) {
            addCriterion("mphone <>", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThan(Long value) {
            addCriterion("mphone >", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("mphone >=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThan(Long value) {
            addCriterion("mphone <", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneLessThanOrEqualTo(Long value) {
            addCriterion("mphone <=", value, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneIn(List<Long> values) {
            addCriterion("mphone in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotIn(List<Long> values) {
            addCriterion("mphone not in", values, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneBetween(Long value1, Long value2) {
            addCriterion("mphone between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMphoneNotBetween(Long value1, Long value2) {
            addCriterion("mphone not between", value1, value2, "mphone");
            return (Criteria) this;
        }

        public Criteria andMcardIsNull() {
            addCriterion("mcard is null");
            return (Criteria) this;
        }

        public Criteria andMcardIsNotNull() {
            addCriterion("mcard is not null");
            return (Criteria) this;
        }

        public Criteria andMcardEqualTo(Long value) {
            addCriterion("mcard =", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardNotEqualTo(Long value) {
            addCriterion("mcard <>", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardGreaterThan(Long value) {
            addCriterion("mcard >", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardGreaterThanOrEqualTo(Long value) {
            addCriterion("mcard >=", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardLessThan(Long value) {
            addCriterion("mcard <", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardLessThanOrEqualTo(Long value) {
            addCriterion("mcard <=", value, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardIn(List<Long> values) {
            addCriterion("mcard in", values, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardNotIn(List<Long> values) {
            addCriterion("mcard not in", values, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardBetween(Long value1, Long value2) {
            addCriterion("mcard between", value1, value2, "mcard");
            return (Criteria) this;
        }

        public Criteria andMcardNotBetween(Long value1, Long value2) {
            addCriterion("mcard not between", value1, value2, "mcard");
            return (Criteria) this;
        }

        public Criteria andMqqIsNull() {
            addCriterion("mqq is null");
            return (Criteria) this;
        }

        public Criteria andMqqIsNotNull() {
            addCriterion("mqq is not null");
            return (Criteria) this;
        }

        public Criteria andMqqEqualTo(Long value) {
            addCriterion("mqq =", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotEqualTo(Long value) {
            addCriterion("mqq <>", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqGreaterThan(Long value) {
            addCriterion("mqq >", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqGreaterThanOrEqualTo(Long value) {
            addCriterion("mqq >=", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqLessThan(Long value) {
            addCriterion("mqq <", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqLessThanOrEqualTo(Long value) {
            addCriterion("mqq <=", value, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqIn(List<Long> values) {
            addCriterion("mqq in", values, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotIn(List<Long> values) {
            addCriterion("mqq not in", values, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqBetween(Long value1, Long value2) {
            addCriterion("mqq between", value1, value2, "mqq");
            return (Criteria) this;
        }

        public Criteria andMqqNotBetween(Long value1, Long value2) {
            addCriterion("mqq not between", value1, value2, "mqq");
            return (Criteria) this;
        }

        public Criteria andMweixinIsNull() {
            addCriterion("mweixin is null");
            return (Criteria) this;
        }

        public Criteria andMweixinIsNotNull() {
            addCriterion("mweixin is not null");
            return (Criteria) this;
        }

        public Criteria andMweixinEqualTo(String value) {
            addCriterion("mweixin =", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinNotEqualTo(String value) {
            addCriterion("mweixin <>", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinGreaterThan(String value) {
            addCriterion("mweixin >", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinGreaterThanOrEqualTo(String value) {
            addCriterion("mweixin >=", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinLessThan(String value) {
            addCriterion("mweixin <", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinLessThanOrEqualTo(String value) {
            addCriterion("mweixin <=", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinLike(String value) {
            addCriterion("mweixin like", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinNotLike(String value) {
            addCriterion("mweixin not like", value, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinIn(List<String> values) {
            addCriterion("mweixin in", values, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinNotIn(List<String> values) {
            addCriterion("mweixin not in", values, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinBetween(String value1, String value2) {
            addCriterion("mweixin between", value1, value2, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMweixinNotBetween(String value1, String value2) {
            addCriterion("mweixin not between", value1, value2, "mweixin");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNull() {
            addCriterion("maddress is null");
            return (Criteria) this;
        }

        public Criteria andMaddressIsNotNull() {
            addCriterion("maddress is not null");
            return (Criteria) this;
        }

        public Criteria andMaddressEqualTo(String value) {
            addCriterion("maddress =", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotEqualTo(String value) {
            addCriterion("maddress <>", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThan(String value) {
            addCriterion("maddress >", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressGreaterThanOrEqualTo(String value) {
            addCriterion("maddress >=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThan(String value) {
            addCriterion("maddress <", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLessThanOrEqualTo(String value) {
            addCriterion("maddress <=", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressLike(String value) {
            addCriterion("maddress like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotLike(String value) {
            addCriterion("maddress not like", value, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressIn(List<String> values) {
            addCriterion("maddress in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotIn(List<String> values) {
            addCriterion("maddress not in", values, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressBetween(String value1, String value2) {
            addCriterion("maddress between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMaddressNotBetween(String value1, String value2) {
            addCriterion("maddress not between", value1, value2, "maddress");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIsNull() {
            addCriterion("mcreatetime is null");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIsNotNull() {
            addCriterion("mcreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeEqualTo(Date value) {
            addCriterion("mcreatetime =", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotEqualTo(Date value) {
            addCriterion("mcreatetime <>", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeGreaterThan(Date value) {
            addCriterion("mcreatetime >", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mcreatetime >=", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeLessThan(Date value) {
            addCriterion("mcreatetime <", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("mcreatetime <=", value, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeIn(List<Date> values) {
            addCriterion("mcreatetime in", values, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotIn(List<Date> values) {
            addCriterion("mcreatetime not in", values, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeBetween(Date value1, Date value2) {
            addCriterion("mcreatetime between", value1, value2, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andMcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("mcreatetime not between", value1, value2, "mcreatetime");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
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