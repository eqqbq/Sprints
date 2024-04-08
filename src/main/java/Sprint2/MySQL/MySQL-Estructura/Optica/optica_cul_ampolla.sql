-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema optica_cull_ampolla
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema optica_cull_ampolla
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `optica_cull_ampolla` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema optica cul ampolla
-- -----------------------------------------------------
USE `optica_cull_ampolla` ;

-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Adress`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Adress` (
  `idAdress` INT NOT NULL AUTO_INCREMENT,
  `Street` VARCHAR(45) NOT NULL,
  `Number` INT NOT NULL,
  `Floor` INT NULL,
  `City` VARCHAR(45) NOT NULL,
  `Door` INT NULL,
  `Postal_Code` INT NOT NULL,
  `Country` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAdress`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Provider`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Provider` (
  `idProvider` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Phone` INT NOT NULL,
  `Fax` INT NULL,
  `NIF` VARCHAR(45) NOT NULL,
  `address_idAddress` INT NOT NULL,
  PRIMARY KEY (`idProvider`),
  INDEX `address_address_id_idx` (`address_idAddress` ASC) VISIBLE,
  CONSTRAINT `address_idAddress`
    FOREIGN KEY (`address_idAddress`)
    REFERENCES `optica_cull_ampolla`.`Adress` (`idAdress`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Glasses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Glasses` (
  `idGlasses` INT NOT NULL AUTO_INCREMENT,
  `Brand` VARCHAR(45) NOT NULL,
  `L Graduation` INT NOT NULL,
  `R Graduation` INT NOT NULL,
  `Frame` VARCHAR(45) NOT NULL,
  `Frame Color` VARCHAR(45) NOT NULL,
  `R Glass Color` VARCHAR(45) NOT NULL,
  `L Glass Color` VARCHAR(45) NOT NULL,
  `Price` INT NOT NULL,
  `Provider_idProvider` INT NOT NULL,
  PRIMARY KEY (`idGlasses`),
  INDEX `Provider_idProvider_idx` (`Provider_idProvider` ASC) VISIBLE,
  CONSTRAINT `Provider_idProvider`
    FOREIGN KEY (`Provider_idProvider`)
    REFERENCES `optica_cull_ampolla`.`Provider` (`idProvider`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Clients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Clients` (
  `idClient` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Postal_Code` INT NOT NULL,
  `Phone` INT NOT NULL,
  `E-mail` VARCHAR(45) NOT NULL,
  `Registration_Date` DATETIME NOT NULL,
  `recomendation_idClient` INT NULL,
  PRIMARY KEY (`idClient`),
  INDEX `recomendation_idClient_idx` (`recomendation_idClient` ASC) VISIBLE,
  CONSTRAINT `recomendation_idClient`
    FOREIGN KEY (`recomendation_idClient`)
    REFERENCES `optica_cull_ampolla`.`Clients` (`idClient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Sales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Sales` (
  `idSales` INT NOT NULL,
  `Seller` VARCHAR(45) NOT NULL,
  `Glasses_idGlasses` INT NOT NULL,
  `idClient` INT NOT NULL,
  PRIMARY KEY (`idSales`),
  INDEX `idClient_idx` (`idClient` ASC) VISIBLE,
  INDEX `Glasses_idGlasses_idx` (`Glasses_idGlasses` ASC) VISIBLE,
  CONSTRAINT `idClient`
    FOREIGN KEY (`idClient`)
    REFERENCES `optica_cull_ampolla`.`Clients` (`idClient`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `Glasses_idGlasses`
    FOREIGN KEY (`Glasses_idGlasses`)
    REFERENCES `optica_cull_ampolla`.`Glasses` (`idGlasses`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `optica_cull_ampolla`.`Brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `optica_cull_ampolla`.`Brand` (
  `idBrand` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `provider_idProvider` INT NOT NULL,
  PRIMARY KEY (`idBrand`),
  INDEX `provider_idProvider_idx` (`provider_idProvider` ASC) VISIBLE,
  CONSTRAINT `provider_idProvider`
    FOREIGN KEY (`provider_idProvider`)
    REFERENCES `optica_cull_ampolla`.`Provider` (`idProvider`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
