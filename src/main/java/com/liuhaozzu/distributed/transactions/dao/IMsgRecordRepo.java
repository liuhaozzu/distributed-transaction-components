package com.liuhaozzu.distributed.transactions.dao;

import com.liuhaozzu.distributed.transactions.dto.MsgRecord;
import com.liuhaozzu.distributed.transactions.dto.MsgStatus;

import java.util.List;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 22:31
 */
public interface IMsgRecordRepo {
    /**
     * insert a record
     * @param msgRecord
     * @return
     * @throws Exception
     */
    int insert(MsgRecord msgRecord) throws Exception;

    /**
     * update record status
     * @param id
     * @param msgStatus
     * @return
     * @throws Exception
     */
    int updateRecordStatus(long id, MsgStatus msgStatus) throws Exception;

    /**
     * update record status in batch
     * @param msgRecordList
     * @return
     * @throws Exception
     */
    int updateRecordStatus(List<MsgRecord> msgRecordList) throws Exception;

    /**
     * get a record by id
     * @param id
     * @return
     * @throws Exception
     */
    MsgRecord getById(long id) throws Exception;

    /**
     * get a record by bizId
     * @param bizId
     * @return
     * @throws Exception
     */
    MsgRecord getByBizId(String bizId) throws Exception;

    /**
     * get a set of records
     * @param startTime
     * @param endTime
     * @param msgStatus
     * @return
     * @throws Exception
     */
    List<MsgRecord> getByCreateTimeBetweenAndStatus(long startTime, long endTime, MsgStatus msgStatus) throws Exception;
}
