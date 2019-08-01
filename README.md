# distributed-transaction-components
This is a distributed transaction component based on two-phase commit protocol and MQ.  
There are a lot of MQ which are available. I choose RocketMQ in the implementation just because I have it in my test environment.  
If intersted in the components, you are welcome to add some other MQ implementations. It's very simple. What you need to do is just implementing one interface.
## create sql
```
CREATE TABLE `test`.`mq_message` (
  `id` BIGINT(20) NOT NULL,
  `biz_id` VARCHAR(100) NOT NULL DEFAULT '',
  `status` INT NOT NULL DEFAULT 0,
  `data` VARCHAR(500) NULL DEFAULT '',
  `update_time` BIGINT(20) NOT NULL DEFAULT -1,
  `create_time` BIGINT(20) NOT NULL DEFAULT -1,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `idx_biz_id` (`biz_id` ASC),
  INDEX `idx_create_time` (`create_time` DESC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COMMENT = 'message record table';
```
