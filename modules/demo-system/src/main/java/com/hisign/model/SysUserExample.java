package com.hisign.model;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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
        protected List<Criterion> createDatetimeCriteria;

        protected List<Criterion> updateDatetimeCriteria;

        protected List<Criterion> allCriteria;

        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
            createDatetimeCriteria = new ArrayList<Criterion>();
            updateDatetimeCriteria = new ArrayList<Criterion>();
        }

        public List<Criterion> getCreateDatetimeCriteria() {
            return createDatetimeCriteria;
        }

        protected void addCreateDatetimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            createDatetimeCriteria.add(new Criterion(condition, value, "com.hisign.DateToStringTypeHandler"));
            allCriteria = null;
        }

        protected void addCreateDatetimeCriterion(String condition, String value1, String value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            createDatetimeCriteria.add(new Criterion(condition, value1, value2, "com.hisign.DateToStringTypeHandler"));
            allCriteria = null;
        }

        public List<Criterion> getUpdateDatetimeCriteria() {
            return updateDatetimeCriteria;
        }

        protected void addUpdateDatetimeCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            updateDatetimeCriteria.add(new Criterion(condition, value, "com.hisign.DateToStringTypeHandler"));
            allCriteria = null;
        }

        protected void addUpdateDatetimeCriterion(String condition, String value1, String value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            updateDatetimeCriteria.add(new Criterion(condition, value1, value2, "com.hisign.DateToStringTypeHandler"));
            allCriteria = null;
        }

        public boolean isValid() {
            return criteria.size() > 0
                || createDatetimeCriteria.size() > 0
                || updateDatetimeCriteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            if (allCriteria == null) {
                allCriteria = new ArrayList<Criterion>();
                allCriteria.addAll(criteria);
                allCriteria.addAll(createDatetimeCriteria);
                allCriteria.addAll(updateDatetimeCriteria);
            }
            return allCriteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
            allCriteria = null;
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
            allCriteria = null;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNull() {
            addCriterion("TRUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTrueNameIsNotNull() {
            addCriterion("TRUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrueNameEqualTo(String value) {
            addCriterion("TRUE_NAME =", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotEqualTo(String value) {
            addCriterion("TRUE_NAME <>", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThan(String value) {
            addCriterion("TRUE_NAME >", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUE_NAME >=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThan(String value) {
            addCriterion("TRUE_NAME <", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLessThanOrEqualTo(String value) {
            addCriterion("TRUE_NAME <=", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameLike(String value) {
            addCriterion("TRUE_NAME like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotLike(String value) {
            addCriterion("TRUE_NAME not like", value, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameIn(List<String> values) {
            addCriterion("TRUE_NAME in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotIn(List<String> values) {
            addCriterion("TRUE_NAME not in", values, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameBetween(String value1, String value2) {
            addCriterion("TRUE_NAME between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andTrueNameNotBetween(String value1, String value2) {
            addCriterion("TRUE_NAME not between", value1, value2, "trueName");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("USER_LEVEL =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("USER_LEVEL <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("USER_LEVEL >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("USER_LEVEL <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("USER_LEVEL like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("USER_LEVEL not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("USER_LEVEL in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("USER_LEVEL not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("USER_LEVEL between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNull() {
            addCriterion("OPEN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIsNotNull() {
            addCriterion("OPEN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpenFlagEqualTo(String value) {
            addCriterion("OPEN_FLAG =", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotEqualTo(String value) {
            addCriterion("OPEN_FLAG <>", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThan(String value) {
            addCriterion("OPEN_FLAG >", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG >=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThan(String value) {
            addCriterion("OPEN_FLAG <", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLessThanOrEqualTo(String value) {
            addCriterion("OPEN_FLAG <=", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagLike(String value) {
            addCriterion("OPEN_FLAG like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotLike(String value) {
            addCriterion("OPEN_FLAG not like", value, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagIn(List<String> values) {
            addCriterion("OPEN_FLAG in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotIn(List<String> values) {
            addCriterion("OPEN_FLAG not in", values, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andOpenFlagNotBetween(String value1, String value2) {
            addCriterion("OPEN_FLAG not between", value1, value2, "openFlag");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleIsNull() {
            addCriterion("DEFAULT_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleIsNotNull() {
            addCriterion("DEFAULT_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleEqualTo(String value) {
            addCriterion("DEFAULT_MODULE =", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleNotEqualTo(String value) {
            addCriterion("DEFAULT_MODULE <>", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleGreaterThan(String value) {
            addCriterion("DEFAULT_MODULE >", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_MODULE >=", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleLessThan(String value) {
            addCriterion("DEFAULT_MODULE <", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_MODULE <=", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleLike(String value) {
            addCriterion("DEFAULT_MODULE like", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleNotLike(String value) {
            addCriterion("DEFAULT_MODULE not like", value, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleIn(List<String> values) {
            addCriterion("DEFAULT_MODULE in", values, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleNotIn(List<String> values) {
            addCriterion("DEFAULT_MODULE not in", values, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleBetween(String value1, String value2) {
            addCriterion("DEFAULT_MODULE between", value1, value2, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andDefaultModuleNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_MODULE not between", value1, value2, "defaultModule");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(String value) {
            addCreateDatetimeCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<String> values) {
            addCreateDatetimeCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<String> values) {
            addCreateDatetimeCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(String value1, String value2) {
            addCreateDatetimeCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(String value1, String value2) {
            addCreateDatetimeCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(String value) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<String> values) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<String> values) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(String value1, String value2) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(String value1, String value2) {
            addUpdateDatetimeCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNull() {
            addCriterion("POLICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("POLICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(String value) {
            addCriterion("POLICE_ID =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(String value) {
            addCriterion("POLICE_ID <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(String value) {
            addCriterion("POLICE_ID >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_ID >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(String value) {
            addCriterion("POLICE_ID <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(String value) {
            addCriterion("POLICE_ID <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLike(String value) {
            addCriterion("POLICE_ID like", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotLike(String value) {
            addCriterion("POLICE_ID not like", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<String> values) {
            addCriterion("POLICE_ID in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<String> values) {
            addCriterion("POLICE_ID not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(String value1, String value2) {
            addCriterion("POLICE_ID between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(String value1, String value2) {
            addCriterion("POLICE_ID not between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("CARD_ID =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("CARD_ID <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("CARD_ID >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ID >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("CARD_ID <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ID <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("CARD_ID like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("CARD_ID not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("CARD_ID in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("CARD_ID not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("CARD_ID between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ID not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("USER_TEL is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("USER_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("USER_TEL =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("USER_TEL <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("USER_TEL >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TEL >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("USER_TEL <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("USER_TEL <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("USER_TEL like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("USER_TEL not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("USER_TEL in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("USER_TEL not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("USER_TEL between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("USER_TEL not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNull() {
            addCriterion("USER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUserUnitIsNotNull() {
            addCriterion("USER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUserUnitEqualTo(String value) {
            addCriterion("USER_UNIT =", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotEqualTo(String value) {
            addCriterion("USER_UNIT <>", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThan(String value) {
            addCriterion("USER_UNIT >", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitGreaterThanOrEqualTo(String value) {
            addCriterion("USER_UNIT >=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThan(String value) {
            addCriterion("USER_UNIT <", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLessThanOrEqualTo(String value) {
            addCriterion("USER_UNIT <=", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitLike(String value) {
            addCriterion("USER_UNIT like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotLike(String value) {
            addCriterion("USER_UNIT not like", value, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitIn(List<String> values) {
            addCriterion("USER_UNIT in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotIn(List<String> values) {
            addCriterion("USER_UNIT not in", values, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitBetween(String value1, String value2) {
            addCriterion("USER_UNIT between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andUserUnitNotBetween(String value1, String value2) {
            addCriterion("USER_UNIT not between", value1, value2, "userUnit");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIfipIsNull() {
            addCriterion("IFIP is null");
            return (Criteria) this;
        }

        public Criteria andIfipIsNotNull() {
            addCriterion("IFIP is not null");
            return (Criteria) this;
        }

        public Criteria andIfipEqualTo(String value) {
            addCriterion("IFIP =", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipNotEqualTo(String value) {
            addCriterion("IFIP <>", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipGreaterThan(String value) {
            addCriterion("IFIP >", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipGreaterThanOrEqualTo(String value) {
            addCriterion("IFIP >=", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipLessThan(String value) {
            addCriterion("IFIP <", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipLessThanOrEqualTo(String value) {
            addCriterion("IFIP <=", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipLike(String value) {
            addCriterion("IFIP like", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipNotLike(String value) {
            addCriterion("IFIP not like", value, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipIn(List<String> values) {
            addCriterion("IFIP in", values, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipNotIn(List<String> values) {
            addCriterion("IFIP not in", values, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipBetween(String value1, String value2) {
            addCriterion("IFIP between", value1, value2, "ifip");
            return (Criteria) this;
        }

        public Criteria andIfipNotBetween(String value1, String value2) {
            addCriterion("IFIP not between", value1, value2, "ifip");
            return (Criteria) this;
        }

        public Criteria andRev1IsNull() {
            addCriterion("REV1 is null");
            return (Criteria) this;
        }

        public Criteria andRev1IsNotNull() {
            addCriterion("REV1 is not null");
            return (Criteria) this;
        }

        public Criteria andRev1EqualTo(String value) {
            addCriterion("REV1 =", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1NotEqualTo(String value) {
            addCriterion("REV1 <>", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1GreaterThan(String value) {
            addCriterion("REV1 >", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1GreaterThanOrEqualTo(String value) {
            addCriterion("REV1 >=", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1LessThan(String value) {
            addCriterion("REV1 <", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1LessThanOrEqualTo(String value) {
            addCriterion("REV1 <=", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1Like(String value) {
            addCriterion("REV1 like", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1NotLike(String value) {
            addCriterion("REV1 not like", value, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1In(List<String> values) {
            addCriterion("REV1 in", values, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1NotIn(List<String> values) {
            addCriterion("REV1 not in", values, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1Between(String value1, String value2) {
            addCriterion("REV1 between", value1, value2, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev1NotBetween(String value1, String value2) {
            addCriterion("REV1 not between", value1, value2, "rev1");
            return (Criteria) this;
        }

        public Criteria andRev2IsNull() {
            addCriterion("REV2 is null");
            return (Criteria) this;
        }

        public Criteria andRev2IsNotNull() {
            addCriterion("REV2 is not null");
            return (Criteria) this;
        }

        public Criteria andRev2EqualTo(String value) {
            addCriterion("REV2 =", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2NotEqualTo(String value) {
            addCriterion("REV2 <>", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2GreaterThan(String value) {
            addCriterion("REV2 >", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2GreaterThanOrEqualTo(String value) {
            addCriterion("REV2 >=", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2LessThan(String value) {
            addCriterion("REV2 <", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2LessThanOrEqualTo(String value) {
            addCriterion("REV2 <=", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2Like(String value) {
            addCriterion("REV2 like", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2NotLike(String value) {
            addCriterion("REV2 not like", value, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2In(List<String> values) {
            addCriterion("REV2 in", values, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2NotIn(List<String> values) {
            addCriterion("REV2 not in", values, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2Between(String value1, String value2) {
            addCriterion("REV2 between", value1, value2, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev2NotBetween(String value1, String value2) {
            addCriterion("REV2 not between", value1, value2, "rev2");
            return (Criteria) this;
        }

        public Criteria andRev3IsNull() {
            addCriterion("REV3 is null");
            return (Criteria) this;
        }

        public Criteria andRev3IsNotNull() {
            addCriterion("REV3 is not null");
            return (Criteria) this;
        }

        public Criteria andRev3EqualTo(String value) {
            addCriterion("REV3 =", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3NotEqualTo(String value) {
            addCriterion("REV3 <>", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3GreaterThan(String value) {
            addCriterion("REV3 >", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3GreaterThanOrEqualTo(String value) {
            addCriterion("REV3 >=", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3LessThan(String value) {
            addCriterion("REV3 <", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3LessThanOrEqualTo(String value) {
            addCriterion("REV3 <=", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3Like(String value) {
            addCriterion("REV3 like", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3NotLike(String value) {
            addCriterion("REV3 not like", value, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3In(List<String> values) {
            addCriterion("REV3 in", values, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3NotIn(List<String> values) {
            addCriterion("REV3 not in", values, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3Between(String value1, String value2) {
            addCriterion("REV3 between", value1, value2, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev3NotBetween(String value1, String value2) {
            addCriterion("REV3 not between", value1, value2, "rev3");
            return (Criteria) this;
        }

        public Criteria andRev4IsNull() {
            addCriterion("REV4 is null");
            return (Criteria) this;
        }

        public Criteria andRev4IsNotNull() {
            addCriterion("REV4 is not null");
            return (Criteria) this;
        }

        public Criteria andRev4EqualTo(String value) {
            addCriterion("REV4 =", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4NotEqualTo(String value) {
            addCriterion("REV4 <>", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4GreaterThan(String value) {
            addCriterion("REV4 >", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4GreaterThanOrEqualTo(String value) {
            addCriterion("REV4 >=", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4LessThan(String value) {
            addCriterion("REV4 <", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4LessThanOrEqualTo(String value) {
            addCriterion("REV4 <=", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4Like(String value) {
            addCriterion("REV4 like", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4NotLike(String value) {
            addCriterion("REV4 not like", value, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4In(List<String> values) {
            addCriterion("REV4 in", values, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4NotIn(List<String> values) {
            addCriterion("REV4 not in", values, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4Between(String value1, String value2) {
            addCriterion("REV4 between", value1, value2, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev4NotBetween(String value1, String value2) {
            addCriterion("REV4 not between", value1, value2, "rev4");
            return (Criteria) this;
        }

        public Criteria andRev5IsNull() {
            addCriterion("REV5 is null");
            return (Criteria) this;
        }

        public Criteria andRev5IsNotNull() {
            addCriterion("REV5 is not null");
            return (Criteria) this;
        }

        public Criteria andRev5EqualTo(String value) {
            addCriterion("REV5 =", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5NotEqualTo(String value) {
            addCriterion("REV5 <>", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5GreaterThan(String value) {
            addCriterion("REV5 >", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5GreaterThanOrEqualTo(String value) {
            addCriterion("REV5 >=", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5LessThan(String value) {
            addCriterion("REV5 <", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5LessThanOrEqualTo(String value) {
            addCriterion("REV5 <=", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5Like(String value) {
            addCriterion("REV5 like", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5NotLike(String value) {
            addCriterion("REV5 not like", value, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5In(List<String> values) {
            addCriterion("REV5 in", values, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5NotIn(List<String> values) {
            addCriterion("REV5 not in", values, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5Between(String value1, String value2) {
            addCriterion("REV5 between", value1, value2, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev5NotBetween(String value1, String value2) {
            addCriterion("REV5 not between", value1, value2, "rev5");
            return (Criteria) this;
        }

        public Criteria andRev6IsNull() {
            addCriterion("REV6 is null");
            return (Criteria) this;
        }

        public Criteria andRev6IsNotNull() {
            addCriterion("REV6 is not null");
            return (Criteria) this;
        }

        public Criteria andRev6EqualTo(String value) {
            addCriterion("REV6 =", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6NotEqualTo(String value) {
            addCriterion("REV6 <>", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6GreaterThan(String value) {
            addCriterion("REV6 >", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6GreaterThanOrEqualTo(String value) {
            addCriterion("REV6 >=", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6LessThan(String value) {
            addCriterion("REV6 <", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6LessThanOrEqualTo(String value) {
            addCriterion("REV6 <=", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6Like(String value) {
            addCriterion("REV6 like", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6NotLike(String value) {
            addCriterion("REV6 not like", value, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6In(List<String> values) {
            addCriterion("REV6 in", values, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6NotIn(List<String> values) {
            addCriterion("REV6 not in", values, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6Between(String value1, String value2) {
            addCriterion("REV6 between", value1, value2, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev6NotBetween(String value1, String value2) {
            addCriterion("REV6 not between", value1, value2, "rev6");
            return (Criteria) this;
        }

        public Criteria andRev7IsNull() {
            addCriterion("REV7 is null");
            return (Criteria) this;
        }

        public Criteria andRev7IsNotNull() {
            addCriterion("REV7 is not null");
            return (Criteria) this;
        }

        public Criteria andRev7EqualTo(String value) {
            addCriterion("REV7 =", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7NotEqualTo(String value) {
            addCriterion("REV7 <>", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7GreaterThan(String value) {
            addCriterion("REV7 >", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7GreaterThanOrEqualTo(String value) {
            addCriterion("REV7 >=", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7LessThan(String value) {
            addCriterion("REV7 <", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7LessThanOrEqualTo(String value) {
            addCriterion("REV7 <=", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7Like(String value) {
            addCriterion("REV7 like", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7NotLike(String value) {
            addCriterion("REV7 not like", value, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7In(List<String> values) {
            addCriterion("REV7 in", values, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7NotIn(List<String> values) {
            addCriterion("REV7 not in", values, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7Between(String value1, String value2) {
            addCriterion("REV7 between", value1, value2, "rev7");
            return (Criteria) this;
        }

        public Criteria andRev7NotBetween(String value1, String value2) {
            addCriterion("REV7 not between", value1, value2, "rev7");
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