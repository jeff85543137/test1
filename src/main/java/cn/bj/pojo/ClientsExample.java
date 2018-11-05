package cn.bj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientsExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(Integer value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(Integer value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(Integer value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(Integer value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(Integer value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(Integer value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<Integer> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<Integer> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(Integer value1, Integer value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(Integer value1, Integer value2) {
            addCriterion("csex not between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNull() {
            addCriterion("cphone is null");
            return (Criteria) this;
        }

        public Criteria andCphoneIsNotNull() {
            addCriterion("cphone is not null");
            return (Criteria) this;
        }

        public Criteria andCphoneEqualTo(Long value) {
            addCriterion("cphone =", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotEqualTo(Long value) {
            addCriterion("cphone <>", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThan(Long value) {
            addCriterion("cphone >", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("cphone >=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThan(Long value) {
            addCriterion("cphone <", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneLessThanOrEqualTo(Long value) {
            addCriterion("cphone <=", value, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneIn(List<Long> values) {
            addCriterion("cphone in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotIn(List<Long> values) {
            addCriterion("cphone not in", values, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneBetween(Long value1, Long value2) {
            addCriterion("cphone between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCphoneNotBetween(Long value1, Long value2) {
            addCriterion("cphone not between", value1, value2, "cphone");
            return (Criteria) this;
        }

        public Criteria andCcardIsNull() {
            addCriterion("ccard is null");
            return (Criteria) this;
        }

        public Criteria andCcardIsNotNull() {
            addCriterion("ccard is not null");
            return (Criteria) this;
        }

        public Criteria andCcardEqualTo(Long value) {
            addCriterion("ccard =", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotEqualTo(Long value) {
            addCriterion("ccard <>", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardGreaterThan(Long value) {
            addCriterion("ccard >", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardGreaterThanOrEqualTo(Long value) {
            addCriterion("ccard >=", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardLessThan(Long value) {
            addCriterion("ccard <", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardLessThanOrEqualTo(Long value) {
            addCriterion("ccard <=", value, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardIn(List<Long> values) {
            addCriterion("ccard in", values, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotIn(List<Long> values) {
            addCriterion("ccard not in", values, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardBetween(Long value1, Long value2) {
            addCriterion("ccard between", value1, value2, "ccard");
            return (Criteria) this;
        }

        public Criteria andCcardNotBetween(Long value1, Long value2) {
            addCriterion("ccard not between", value1, value2, "ccard");
            return (Criteria) this;
        }

        public Criteria andCqqIsNull() {
            addCriterion("cqq is null");
            return (Criteria) this;
        }

        public Criteria andCqqIsNotNull() {
            addCriterion("cqq is not null");
            return (Criteria) this;
        }

        public Criteria andCqqEqualTo(Long value) {
            addCriterion("cqq =", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqNotEqualTo(Long value) {
            addCriterion("cqq <>", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqGreaterThan(Long value) {
            addCriterion("cqq >", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqGreaterThanOrEqualTo(Long value) {
            addCriterion("cqq >=", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqLessThan(Long value) {
            addCriterion("cqq <", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqLessThanOrEqualTo(Long value) {
            addCriterion("cqq <=", value, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqIn(List<Long> values) {
            addCriterion("cqq in", values, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqNotIn(List<Long> values) {
            addCriterion("cqq not in", values, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqBetween(Long value1, Long value2) {
            addCriterion("cqq between", value1, value2, "cqq");
            return (Criteria) this;
        }

        public Criteria andCqqNotBetween(Long value1, Long value2) {
            addCriterion("cqq not between", value1, value2, "cqq");
            return (Criteria) this;
        }

        public Criteria andCweixinIsNull() {
            addCriterion("cweixin is null");
            return (Criteria) this;
        }

        public Criteria andCweixinIsNotNull() {
            addCriterion("cweixin is not null");
            return (Criteria) this;
        }

        public Criteria andCweixinEqualTo(String value) {
            addCriterion("cweixin =", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinNotEqualTo(String value) {
            addCriterion("cweixin <>", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinGreaterThan(String value) {
            addCriterion("cweixin >", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinGreaterThanOrEqualTo(String value) {
            addCriterion("cweixin >=", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinLessThan(String value) {
            addCriterion("cweixin <", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinLessThanOrEqualTo(String value) {
            addCriterion("cweixin <=", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinLike(String value) {
            addCriterion("cweixin like", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinNotLike(String value) {
            addCriterion("cweixin not like", value, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinIn(List<String> values) {
            addCriterion("cweixin in", values, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinNotIn(List<String> values) {
            addCriterion("cweixin not in", values, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinBetween(String value1, String value2) {
            addCriterion("cweixin between", value1, value2, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCweixinNotBetween(String value1, String value2) {
            addCriterion("cweixin not between", value1, value2, "cweixin");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNull() {
            addCriterion("caddress is null");
            return (Criteria) this;
        }

        public Criteria andCaddressIsNotNull() {
            addCriterion("caddress is not null");
            return (Criteria) this;
        }

        public Criteria andCaddressEqualTo(String value) {
            addCriterion("caddress =", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotEqualTo(String value) {
            addCriterion("caddress <>", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThan(String value) {
            addCriterion("caddress >", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressGreaterThanOrEqualTo(String value) {
            addCriterion("caddress >=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThan(String value) {
            addCriterion("caddress <", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLessThanOrEqualTo(String value) {
            addCriterion("caddress <=", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressLike(String value) {
            addCriterion("caddress like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotLike(String value) {
            addCriterion("caddress not like", value, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressIn(List<String> values) {
            addCriterion("caddress in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotIn(List<String> values) {
            addCriterion("caddress not in", values, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressBetween(String value1, String value2) {
            addCriterion("caddress between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCaddressNotBetween(String value1, String value2) {
            addCriterion("caddress not between", value1, value2, "caddress");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNull() {
            addCriterion("ccreatetime is null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIsNotNull() {
            addCriterion("ccreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeEqualTo(Date value) {
            addCriterion("ccreatetime =", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotEqualTo(Date value) {
            addCriterion("ccreatetime <>", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThan(Date value) {
            addCriterion("ccreatetime >", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ccreatetime >=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThan(Date value) {
            addCriterion("ccreatetime <", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ccreatetime <=", value, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeIn(List<Date> values) {
            addCriterion("ccreatetime in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotIn(List<Date> values) {
            addCriterion("ccreatetime not in", values, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeBetween(Date value1, Date value2) {
            addCriterion("ccreatetime between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andCcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ccreatetime not between", value1, value2, "ccreatetime");
            return (Criteria) this;
        }

        public Criteria andStautsIsNull() {
            addCriterion("stauts is null");
            return (Criteria) this;
        }

        public Criteria andStautsIsNotNull() {
            addCriterion("stauts is not null");
            return (Criteria) this;
        }

        public Criteria andStautsEqualTo(Integer value) {
            addCriterion("stauts =", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotEqualTo(Integer value) {
            addCriterion("stauts <>", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThan(Integer value) {
            addCriterion("stauts >", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stauts >=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThan(Integer value) {
            addCriterion("stauts <", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThanOrEqualTo(Integer value) {
            addCriterion("stauts <=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsIn(List<Integer> values) {
            addCriterion("stauts in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotIn(List<Integer> values) {
            addCriterion("stauts not in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsBetween(Integer value1, Integer value2) {
            addCriterion("stauts between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotBetween(Integer value1, Integer value2) {
            addCriterion("stauts not between", value1, value2, "stauts");
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