package com.liuhaozzu.distributed.transactions.client;

import com.liuhaozzu.distributed.transactions.dao.IMsgRecordRepo;
import com.liuhaozzu.distributed.transactions.dto.MsgRecord;
import com.liuhaozzu.distributed.transactions.dto.MsgStatus;

import java.sql.SQLException;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 22:39
 */
public class TransactionClientImpl implements ITransactionClient{

    private IMsgRecordRepo msgRepo;
    public TransactionClientImpl(IMsgRecordRepo msgRepo) {
        this.msgRepo = msgRepo;
    }

    @Override
    public long preCommit(MsgRecord msgRecord) throws Exception {
        return msgRepo.insert(msgRecord);
    }

    @Override
    public void commit(long recordId) throws Exception {
        msgRepo.updateRecordStatus(recordId, MsgStatus.COMMITTED);
    }

    @Override
    public void cancel(long recordId) throws Exception {
        msgRepo.updateRecordStatus(recordId, MsgStatus.CANCELED);
    }
}
