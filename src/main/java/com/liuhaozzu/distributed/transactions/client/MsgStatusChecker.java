package com.liuhaozzu.distributed.transactions.client;

import com.liuhaozzu.distributed.transactions.dto.MsgRecord;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 22:47
 */
public interface MsgStatusChecker {
    /**
     * decide the record's next status
     * @param msgRecord
     * @return true -> change status to committed; false -> change status to canceled
     * @throws Exception
     */
    boolean shouldCommit(MsgRecord msgRecord) throws Exception;
}
