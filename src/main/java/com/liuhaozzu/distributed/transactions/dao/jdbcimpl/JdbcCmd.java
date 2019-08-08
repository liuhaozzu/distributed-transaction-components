package com.liuhaozzu.distributed.transactions.dao.jdbcimpl;

/**
 * @author: liuhaozzu
 * @date: 2019-08-08 17:54
 */
public enum  JdbcCmd {
    /**
     * insert cmd
     */
    INSERT("INSERT INTO "),

    /**
     * update cmd
     */
    UPDATE("UPDATE ");

    private String sqlCmd;

    JdbcCmd(String sqlCmd) {
        this.sqlCmd = sqlCmd;
    }

    public String getSqlCmd() {
        return sqlCmd;
    }
}
