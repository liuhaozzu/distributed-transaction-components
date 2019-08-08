package com.liuhaozzu.distributed.transactions.dto;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 21:43
 */
public class MsgRecord {

    private long id;

    /**
     * business id to identify one unique transaction
     */
    private String bizId;

    /**
     * some extra data to use in the transaction
     */
    private String data;

    private int status;
    private String topic;
    private String tags;
    private long updateTime;
    private long createTime;

    public long getId() {
        return id;
    }

    public MsgRecord setId(long id) {
        this.id = id;
        return this;
    }

    public String getBizId() {
        return bizId;
    }

    public MsgRecord setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }

    public String getData() {
        return data;
    }

    public MsgRecord setData(String data) {
        this.data = data;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public MsgRecord setStatus(int status) {
        this.status = status;
        return this;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public MsgRecord setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public long getCreateTime() {
        return createTime;
    }

    public MsgRecord setCreateTime(long createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getTopic() {
        return topic;
    }

    public MsgRecord setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public String getTags() {
        return tags;
    }

    public MsgRecord setTags(String tags) {
        this.tags = tags;
        return this;
    }
}
