package com.liuhaozzu.distributed.transactions.client;

import com.liuhaozzu.distributed.transactions.dto.MsgRecord;

import java.sql.SQLException;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 21:39
 */
public interface ITransactionClient {

    /**
     * create a record associated to the transaction
     * @param msgRecord
     * @return the id of the record
     * @throws Exception
     */
    long preCommit(MsgRecord msgRecord) throws Exception;

    /**
     * change the status of the message record to committed
     * @param recordId
     * @throws SQLException
     */
    void commit(long recordId) throws Exception;

    /**
     * change the status of the message record to canceled
     * @param recordId
     * @throws Exception
     */
    void cancel(long recordId) throws Exception;
}
