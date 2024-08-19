CREATE TABLE IF NOT EXISTS `user_data` (
    `id` INT PRIMARY KEY AUTO_INCREMENT,
    `first_name` VARCHAR(255) NOT NULL,
    `last_name` VARCHAR(255) NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `mobile_number` VARCHAR(10) NOT NULL,
    `created_at` DATE NOT NULL,
    `updated_at` DATE DEFAULT NULL
);