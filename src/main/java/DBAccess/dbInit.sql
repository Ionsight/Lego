-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema lego
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `lego` DEFAULT CHARACTER SET utf8 ;
USE `lego` ;

-- -----------------------------------------------------
-- Table `lego`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lego`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(90) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` VARCHAR(20) NOT NULL DEFAULT 'customer',
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `lego`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `lego`.`orders` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `users_id` INT(11) NOT NULL,
  `height` INT(11) NOT NULL,
  `width` INT(11) NOT NULL,
  `length` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_table1_users_idx` (`users_id` ASC),
  CONSTRAINT `fk_table1_users`
    FOREIGN KEY (`users_id`)
    REFERENCES `lego`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 16
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;