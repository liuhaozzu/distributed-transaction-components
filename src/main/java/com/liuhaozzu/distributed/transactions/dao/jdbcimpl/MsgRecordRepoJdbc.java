package com.liuhaozzu.distributed.transactions.dao.jdbcimpl;

import com.liuhaozzu.distributed.transactions.dao.IDataSourceProvider;
import com.liuhaozzu.distributed.transactions.dao.IMsgRecordRepo;
import com.liuhaozzu.distributed.transactions.dto.MsgRecord;
import com.liuhaozzu.distributed.transactions.dto.MsgStatus;

import java.lang.reflect.Field;
import java.util.List;

/**
 * @author: liuhaozzu
 * @date: 2019-08-08 17:22
 */
public class MsgRecordRepoJdbc implements IMsgRecordRepo {

    IDataSourceProvider dataSourceProvider;
    private String tableName = "mq_message";
    private String filedSeparator = " ";
    private String left = "(";
    private String right = ")";
    private Field[] fields = MsgRecord.class.getFields();


    public MsgRecordRepoJdbc(IDataSourceProvider dataSourceProvider) {
        this.dataSourceProvider = dataSourceProvider;
    }

    @Override
    public int insert(MsgRecord msgRecord) throws Exception {
        StringBuilder sql = new StringBuilder(JdbcCmd.INSERT.getSqlCmd());
        sql.append(tableName)
                .append(filedSeparator);
        for (int i = 0; i < fields.length; i++) {

        }

        return 0;
    }

    @Override
    public int updateRecordStatus(long id, MsgStatus msgStatus) throws Exception {
        return 0;
    }

    @Override
    public int updateRecordStatus(List<MsgRecord> msgRecordList) throws Exception {
        return 0;
    }

    @Override
    public MsgRecord getById(long id) throws Exception {
        return null;
    }

    @Override
    public MsgRecord getByBizId(String bizId) throws Exception {
        return null;
    }

    @Override
    public List<MsgRecord> getByCreateTimeBetweenAndStatus(long startTime, long endTime, MsgStatus msgStatus) throws Exception {
        return null;
    }
}
