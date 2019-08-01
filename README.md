# distributed-transaction-components
a distributed transaction component based on two-phase commit protocol
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