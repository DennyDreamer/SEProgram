/*
Navicat MySQL Data Transfer

Source Server         : local3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : baoxiao

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2019-11-11 19:50:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `deparment_id` int(30) NOT NULL DEFAULT '0',
  `depatrment_oldname` varchar(255) NOT NULL,
  `department_name` varchar(255) NOT NULL,
  `department_state` int(4) NOT NULL,
  PRIMARY KEY (`deparment_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
                          `record_id` int(30) NOT NULL,
                          `department_id` int(30) NOT NULL,
                          `user_id` int(5) NOT NULL,
                          `record_time1` datetime NOT NULL,
                          `record_time2` datetime NOT NULL,
                          `record_hospital` varchar(30) NOT NULL,
                          `record_state` int(255) NOT NULL,
                          `record_ratio` varchar(5) NOT NULL,
                          `record_referral_address` varchar(255) NOT NULL,
                          `record_register_address` varchar(255) NOT NULL,
                          `record_cost` varchar(255) NOT NULL,
                          `record_prescribe_address` varchar(5) NOT NULL,
                          `record_note` varchar(5) DEFAULT NULL,
                          PRIMARY KEY (`record_id`),
                          KEY `user_id` (`user_id`),
                          KEY `department_id` (`department_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;



-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(30) NOT NULL,
  `user_name` varchar(30) not NULL,
  `user_sex`  int(2) not NULL,
  `user_idcard` varchar(30) not NULL,
  `user_nation` varchar(30) not NULL,
  `user_phone` varchar(30)  not NULL,
  `user_kind`   int(5)     not NULL,
  `user_password` varchar(100) not NULL,
  `department_id` int(5) NOT NULL,
  `user_state` int(5) not NULL,
  PRIMARY KEY (`user_id`),
  KEY `depatrment_id` (`department_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
