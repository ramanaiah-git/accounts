DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS account;

CREATE TABLE `customer`(
    `customer_id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `customer_name` varchar(200) NOT NULL,
    `email_id` varchar(100) NOT NULL,
    `aadhar_number` BIGINT NOT NULL,
    `phone_number` BIGINT NOT NULL,
    `address` varchar(4000) NOT NULL,
    `created_date` date default NULL
);

CREATE TABLE `account`(
    `account_number` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `customer_id` BIGINT NOT NULL,
    `account_type` varchar(200) NOT NULL,
    `branch_address` varchar(4000) NOT NULL,
    `created_date` date DEFAULT  NULL
);

INSERT INTO `customer` (`customer_name`, `email_id`, `aadhar_number`, `phone_number`, `address`, `created_date`)
VALUES ( 'PADE RAMANAIAH', 'ramanaiah.pade1921@gmail.com', 277633594064, 7090000885, 'Regulacheluka(vi), C.S Puram(M), Prakasam(DT)- 523112', CURDATE());

INSERT INTO `account` (`customer_id`, `account_number`, `account_type`, `branch_address`, `created_date`)
VALUES ( 1, 2022101234, 'Savings', 'Marathahalli, Bengalore - 560037', CURDATE() );

