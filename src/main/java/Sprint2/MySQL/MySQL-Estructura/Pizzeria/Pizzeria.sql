-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pizzeria` DEFAULT CHARACTER SET utf8 ;
USE `Pizzeria` ;

-- -----------------------------------------------------
-- Table `Pizzeria`.`Province`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Province` (
  `idProvince` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idProvince`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Locality`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Locality` (
  `idLocality` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `province_idProvince` INT NOT NULL,
  PRIMARY KEY (`idLocality`),
  INDEX `province_idProvince_idx` (`province_idProvince` ASC) VISIBLE,
  CONSTRAINT `province_idProvince`
    FOREIGN KEY (`province_idProvince`)
    REFERENCES `Pizzeria`.`Province` (`idProvince`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Client` (
  `idClient` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `Surnames` VARCHAR(45) NULL,
  `postal_code` VARCHAR(45) NOT NULL,
  `locality_idLocality` INT NOT NULL,
  `province_idProvince` INT NOT NULL,
  `phone` INT NULL,
  PRIMARY KEY (`idClient`),
  INDEX `province_idProvince_idx` (`province_idProvince` ASC) VISIBLE,
  INDEX `locality_idLocality_idx` (`locality_idLocality` ASC) VISIBLE,
  CONSTRAINT `province_idProvince`
    FOREIGN KEY (`province_idProvince`)
    REFERENCES `Pizzeria`.`Province` (`idProvince`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `locality_idLocality`
    FOREIGN KEY (`locality_idLocality`)
    REFERENCES `Pizzeria`.`Locality` (`idLocality`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Store`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Store` (
  `idStore` INT NOT NULL AUTO_INCREMENT,
  `postal_code` INT NOT NULL,
  `locality_idLocality` INT NOT NULL,
  `province_idProvince` INT NOT NULL,
  `order_idOrider` INT NOT NULL,
  PRIMARY KEY (`idStore`),
  INDEX `locality_idLocality_idx` (`locality_idLocality` ASC) VISIBLE,
  INDEX `province_idProvince_idx` (`province_idProvince` ASC) VISIBLE,
  CONSTRAINT `locality_idLocality`
    FOREIGN KEY (`locality_idLocality`)
    REFERENCES `Pizzeria`.`Locality` (`idLocality`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `province_idProvince`
    FOREIGN KEY (`province_idProvince`)
    REFERENCES `Pizzeria`.`Province` (`idProvince`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Employees` (
  `idEmployees` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surnames` VARCHAR(45) NULL,
  `NIF` VARCHAR(45) NOT NULL,
  `phone` INT NOT NULL,
  `type` ENUM("cuiner", "repartidor") NOT NULL,
  PRIMARY KEY (`idEmployees`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Delivery`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Delivery` (
  `idDelivery` INT NOT NULL AUTO_INCREMENT,
  `name_driver` VARCHAR(45) NULL,
  `delivery_time` DATETIME NULL,
  `employees_idEmployees` INT NOT NULL,
  PRIMARY KEY (`idDelivery`),
  INDEX `employees_idEmployees_idx` (`employees_idEmployees` ASC) VISIBLE,
  CONSTRAINT `employees_idEmployees`
    FOREIGN KEY (`employees_idEmployees`)
    REFERENCES `Pizzeria`.`Employees` (`idEmployees`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Order` (
  `idOrder` INT NOT NULL AUTO_INCREMENT,
  `client_idClient` INT NOT NULL,
  `order_datetime` DATETIME NOT NULL,
  `amount` INT NOT NULL,
  `price` DECIMAL NOT NULL,
  `store_idStore` INT NOT NULL,
  `delivery_type` INT NOT NULL,
  PRIMARY KEY (`idOrder`),
  INDEX `client_idClient_idx` (`client_idClient` ASC) VISIBLE,
  INDEX `store_idStore_idx` (`store_idStore` ASC) VISIBLE,
  INDEX `delivery_type_idx` (`delivery_type` ASC) VISIBLE,
  CONSTRAINT `client_idClient`
    FOREIGN KEY (`client_idClient`)
    REFERENCES `Pizzeria`.`Client` (`idClient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `store_idStore`
    FOREIGN KEY (`store_idStore`)
    REFERENCES `Pizzeria`.`Store` (`idStore`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `delivery_type`
    FOREIGN KEY (`delivery_type`)
    REFERENCES `Pizzeria`.`Delivery` (`idDelivery`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Category` (
  `idCategory` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategory`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Products` (
  `idProducts` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(250) NOT NULL,
  `price` INT NOT NULL,
  `product_type` ENUM("pizza", "Begudes", "Hamburgueses") NOT NULL,
  `category_idCategory` INT NOT NULL,
  `photo` VARCHAR(45) NULL,
  PRIMARY KEY (`idProducts`),
  INDEX `category_idCategory_idx` (`category_idCategory` ASC) VISIBLE,
  CONSTRAINT `category_idCategory`
    FOREIGN KEY (`category_idCategory`)
    REFERENCES `Pizzeria`.`Category` (`idCategory`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`Orders_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`Orders_product` (
  `idOrders_product` INT NOT NULL AUTO_INCREMENT,
  `products_idProduct` INT NOT NULL,
  `quantity` INT NOT NULL,
  `order_idOrder` INT NOT NULL,
  PRIMARY KEY (`idOrders_product`),
  INDEX `order_idOrder_idx` (`order_idOrder` ASC) VISIBLE,
  INDEX `products_idProduct_idx` (`products_idProduct` ASC) VISIBLE,
  CONSTRAINT `order_idOrder`
    FOREIGN KEY (`order_idOrder`)
    REFERENCES `Pizzeria`.`Order` (`idOrder`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `products_idProduct`
    FOREIGN KEY (`products_idProduct`)
    REFERENCES `Pizzeria`.`Products` (`idProducts`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
