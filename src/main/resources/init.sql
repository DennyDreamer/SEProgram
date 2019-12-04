/*
Navicat MySQL Data Transfer

Source Server         : local3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : baoxiao

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-11-21 19:57:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(30) NOT NULL,
  `admin_name` varchar(30) NOT NULL,
  `admin_permission` int(30) NOT NULL,
  `admin_password` varchar(30) NOT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `bill`
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `bill_id` int(30) NOT NULL,
  `bill_image` varchar(30) NOT NULL,
  `form_id` int(5) NOT NULL,
  PRIMARY KEY (`bill_id`),
  KEY `form_id` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------

-- ----------------------------
-- Table structure for `changehospital`
-- ----------------------------
DROP TABLE IF EXISTS `changehospital`;
CREATE TABLE `changehospital` (
  `changehospital_id` int(30) NOT NULL,
  `changehospital_image` varchar(30) NOT NULL,
  `form_id` int(30) NOT NULL,
  PRIMARY KEY (`changehospital_id`),
  KEY `form_id` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of changehospital
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(30) NOT NULL DEFAULT '0',
  `department_oldname` varchar(30) NOT NULL,
  `department_name` varchar(30) DEFAULT NULL,
  `department_state` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `form`
-- ----------------------------
DROP TABLE IF EXISTS `form`;
CREATE TABLE `form` (
  `form_id` int(30) NOT NULL DEFAULT '0',
  `form_time` datetime NOT NULL,
  `form_kind` int(30) NOT NULL,
  `hospital` varchar(30) NOT NULL,
  `form_text` varchar(100) DEFAULT NULL,
  `hospital_department` varchar(30) NOT NULL,
  PRIMARY KEY (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of form
-- ----------------------------

-- ----------------------------
-- Table structure for `operation`
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation` (
  `operation_id` int(30) NOT NULL,
  `form_id` int(30) NOT NULL,
  `operation_time` datetime NOT NULL,
  `amount` varchar(30) NOT NULL,
  `admin_id` int(30) NOT NULL,
  `operation_kind` int(30) NOT NULL,
  `operation_text` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`operation_id`),
  KEY `admin_id` (`admin_id`),
  KEY `form_id` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of operation
-- ----------------------------

-- ----------------------------
-- Table structure for `prescription`
-- ----------------------------
DROP TABLE IF EXISTS `prescription`;
CREATE TABLE `prescription` (
  `prescription_id` int(30) NOT NULL,
  `prescription_image` varchar(30) NOT NULL,
  `form_id` int(30) NOT NULL,
  PRIMARY KEY (`prescription_id`),
  KEY `form` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of prescription
-- ----------------------------

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `record_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `record_time` datetime NOT NULL,
  `form_id` int(11) NOT NULL,
  `record_state` int(11) NOT NULL,
  PRIMARY KEY (`record_id`),
  KEY `user_id` (`user_id`),
  KEY `form_id` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for `register`
-- ----------------------------
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `register_id` int(30) NOT NULL,
  `register_image` varchar(30) NOT NULL,
  `form_id` int(30) NOT NULL,
  PRIMARY KEY (`register_id`),
  KEY `form_id` (`form_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of register
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(30) NOT NULL DEFAULT '0',
  `user_name` varchar(30) DEFAULT NULL,
  `user_sex` varchar(30) DEFAULT NULL,
  `user_idcard` varchar(30) DEFAULT NULL,
  `user_nation` varchar(30) DEFAULT NULL,
  `user_phone` varchar(30) DEFAULT NULL,
  `user_number` varchar(30) DEFAULT NULL,
  `user_password` varchar(30) DEFAULT NULL,
  `user_state` int(30) DEFAULT NULL,
  `department_id` int(30) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `department_id` (`department_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
