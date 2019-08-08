package com.liuhaozzu.distributed.transactions.dao;

import javax.sql.DataSource;

/**
 * @author: liuhaozzu
 * @date: 2019-08-08 17:32
 */
public interface IDataSourceProvider {
    /**
     * 获取数据源
     *
     * @return
     */
    DataSource get();
}
