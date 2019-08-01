package com.liuhaozzu.distributed.transactions.dto;

/**
 * @Author liuhao
 * @create 2019/8/1 0001 21:55
 */
public enum MsgStatus {
    /**
     * message is waiting to commit
     */
    WAITING(0, "message is waiting to commit"),

    /**
     * message has been committed
     */
    COMMITTED(1, "message has been committed"),
    /**
     * message has been canceled
     */
    CANCELED(2, "message has been canceled");

    int status;
    String description;

    MsgStatus(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
