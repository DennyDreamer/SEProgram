/*
 Navicat Premium Data Transfer

 Source Server         : SE
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 12/12/2019 15:33:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
                          `admin_id` int(30) NOT NULL AUTO_INCREMENT,
                          `admin_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                          `admin_permission` int(30) NOT NULL,
                          `admin_password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                          PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for bill
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill`  (
                         `bill_id` int(30) NOT NULL AUTO_INCREMENT,
                         `bill_cost` float(10, 2) NOT NULL,
                         `bill_selfcost` float(10, 2) NOT NULL,
                         `bill_prescription_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `bill_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `bill_hospital` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `bill_department` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                         `form_id` int(30) NOT NULL,
                         `register_id` int(30) NOT NULL,
                         PRIMARY KEY (`bill_id`) USING BTREE,
                         INDEX `form_id`(`form_id`) USING BTREE,
                         INDEX `register_id`(`register_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES (1, 20.00, 0.00, '234532', '325443', '人民医院', '骨科', 1, 1);
INSERT INTO `bill` VALUES (2, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 2, 1);
INSERT INTO `bill` VALUES (3, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 3, 1);
INSERT INTO `bill` VALUES (4, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 4, 1);
INSERT INTO `bill` VALUES (5, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 5, 1);
INSERT INTO `bill` VALUES (6, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 6, 1);
INSERT INTO `bill` VALUES (7, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 7, 1);
INSERT INTO `bill` VALUES (8, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 8, 1);
INSERT INTO `bill` VALUES (9, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 9, 1);
INSERT INTO `bill` VALUES (10, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 10, 1);
INSERT INTO `bill` VALUES (11, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 11, 1);
INSERT INTO `bill` VALUES (12, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 12, 1);
INSERT INTO `bill` VALUES (13, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 13, 1);
INSERT INTO `bill` VALUES (14, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 14, 1);
INSERT INTO `bill` VALUES (15, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 15, 1);
INSERT INTO `bill` VALUES (16, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 1, 1);
INSERT INTO `bill` VALUES (17, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 2, 1);
INSERT INTO `bill` VALUES (18, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 3, 1);
INSERT INTO `bill` VALUES (19, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 4, 1);
INSERT INTO `bill` VALUES (20, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 5, 1);
INSERT INTO `bill` VALUES (21, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 6, 1);
INSERT INTO `bill` VALUES (22, 30.00, 0.00, '3453', '4321', '人民医院', '骨科', 7, 1);

-- ----------------------------
-- Table structure for bill_check
-- ----------------------------
DROP TABLE IF EXISTS `bill_check`;
CREATE TABLE `bill_check`  (
                               `bill_check_id` int(30) NOT NULL,
                               `bill_selfcost` float(10, 2) DEFAULT NULL,
                               `operation_id` int(30) DEFAULT NULL,
                               `bill_id` int(30) DEFAULT NULL,
                               `bill_check_state` int(30) NOT NULL,
                               PRIMARY KEY (`bill_check_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for changehospital
-- ----------------------------
DROP TABLE IF EXISTS `changehospital`;
CREATE TABLE `changehospital`  (
                                   `changehospital_id` int(30) NOT NULL AUTO_INCREMENT,
                                   `changehospital_image` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                                   `changehospital_in` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                                   `changehospital_out` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                                   `form_id` int(30) NOT NULL,
                                   PRIMARY KEY (`changehospital_id`) USING BTREE,
                                   INDEX `form_id`(`form_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of changehospital
-- ----------------------------
INSERT INTO `changehospital` VALUES (1, '343213', '人民医院', '301医院', 1);
INSERT INTO `changehospital` VALUES (2, '343213', '人民医院', '301医院', 2);
INSERT INTO `changehospital` VALUES (3, '343213', '人民医院', '301医院', 3);
INSERT INTO `changehospital` VALUES (4, '343213', '人民医院', '301医院', 4);
INSERT INTO `changehospital` VALUES (5, '343213', '人民医院', '301医院', 5);
INSERT INTO `changehospital` VALUES (6, '343213', '人民医院', '301医院', 6);
INSERT INTO `changehospital` VALUES (7, '343213', '人民医院', '301医院', 7);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
                               `department_id` int(30) NOT NULL AUTO_INCREMENT,
                               `department_oldname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                               `department_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                               `department_state` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                               PRIMARY KEY (`department_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for form
-- ----------------------------
DROP TABLE IF EXISTS `form`;
CREATE TABLE `form`  (
                         `form_id` int(30) NOT NULL AUTO_INCREMENT,
                         `form_time` datetime(0) DEFAULT NULL,
                         `form_kind` int(30) DEFAULT NULL,
                         `gaizhang_img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `teshu_img` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `form_text` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         PRIMARY KEY (`form_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of form
-- ----------------------------
INSERT INTO `form` VALUES (1, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (2, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (3, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (4, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (5, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (6, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (7, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (8, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (9, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (10, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (11, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (12, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (13, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (14, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');
INSERT INTO `form` VALUES (15, '2019-12-12 14:29:23', 1, '12343', '3443234', '34543');

-- ----------------------------
-- Table structure for operation
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation`  (
                              `operation_id` int(30) NOT NULL AUTO_INCREMENT,
                              `form_id` int(30) NOT NULL,
                              `operation_time` datetime(0) NOT NULL,
                              `amount` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              `register_percentage` float(10,2) NOT NULL,
                              `medical_percentage` float(10,2) NOT NULL,
                              `admin_id` int(30) NOT NULL,
                              `operation_kind` int(30) NOT NULL,
                              `operation_text` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                              PRIMARY KEY (`operation_id`) USING BTREE,
                              INDEX `admin_id`(`admin_id`) USING BTREE,
                              INDEX `form_id`(`form_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record`  (
                           `record_id` int(11) NOT NULL AUTO_INCREMENT,
                           `user_id` int(11) NOT NULL,
                           `record_time` datetime(0) NOT NULL,
                           `form_id` int(11) NOT NULL,
                           `record_state` int(11) NOT NULL,
                           PRIMARY KEY (`record_id`) USING BTREE,
                           INDEX `user_id`(`user_id`) USING BTREE,
                           INDEX `form_id`(`form_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Fixed;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES (1, 1, '2019-12-12 14:11:27', 1, 1);
INSERT INTO `record` VALUES (2, 1, '2019-12-12 14:11:28', 2, 2);
INSERT INTO `record` VALUES (3, 1, '2019-12-12 14:11:28', 3, 3);
INSERT INTO `record` VALUES (4, 2, '2019-12-12 14:11:28', 4, 4);
INSERT INTO `record` VALUES (5, 3, '2019-12-12 14:11:28', 5, 5);
INSERT INTO `record` VALUES (6, 4, '2019-12-12 14:11:28', 6, 6);
INSERT INTO `record` VALUES (7, 5, '2019-12-12 14:11:28', 7, 1);
INSERT INTO `record` VALUES (8, 5, '2019-12-12 14:11:28', 8, 2);
INSERT INTO `record` VALUES (9, 6, '2019-12-12 14:11:28', 9, 3);
INSERT INTO `record` VALUES (10, 7, '2019-12-12 14:11:28', 10, 4);
INSERT INTO `record` VALUES (11, 8, '2019-12-12 14:11:28', 11, 5);
INSERT INTO `record` VALUES (12, 9, '2019-12-12 14:11:28', 12, 6);
INSERT INTO `record` VALUES (13, 1, '2019-12-12 14:11:28', 13, 4);
INSERT INTO `record` VALUES (14, 1, '2019-12-12 14:11:28', 14, 5);
INSERT INTO `record` VALUES (15, 1, '2019-12-12 14:11:28', 15, 6);

-- ----------------------------
-- Table structure for register
-- ----------------------------
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register`  (
                             `register_id` int(30) NOT NULL AUTO_INCREMENT,
                             `register_hospital` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                             `register_department` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                             `register_cost` float(10, 2) NOT NULL,
                             `register_selfcost` float(10, 2) NOT NULL,
                             `register_image` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                             `register_explaination` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                             `form_id` int(30) NOT NULL,
                             `changehospital_id` int(30) NOT NULL,
                             PRIMARY KEY (`register_id`) USING BTREE,
                             INDEX `form_id`(`form_id`) USING BTREE,
                             INDEX `changehospital_id`(`changehospital_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of register
-- ----------------------------
INSERT INTO `register` VALUES (1, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 1, 1);
INSERT INTO `register` VALUES (2, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 2, 1);
INSERT INTO `register` VALUES (3, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 3, 1);
INSERT INTO `register` VALUES (4, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 4, 1);
INSERT INTO `register` VALUES (5, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 5, 1);
INSERT INTO `register` VALUES (6, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 6, 1);
INSERT INTO `register` VALUES (7, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 7, 1);
INSERT INTO `register` VALUES (8, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 8, 1);
INSERT INTO `register` VALUES (9, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 9, 1);
INSERT INTO `register` VALUES (10, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 10, 1);
INSERT INTO `register` VALUES (11, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 11, 1);
INSERT INTO `register` VALUES (12, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 12, 1);
INSERT INTO `register` VALUES (13, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 13, 1);
INSERT INTO `register` VALUES (14, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 14, 1);
INSERT INTO `register` VALUES (15, '人民医院', '骨科', 20.00, 0.00, '234132', '12334321', 15, 1);

-- ----------------------------
-- Table structure for register_check
-- ----------------------------
DROP TABLE IF EXISTS `register_check`;
CREATE TABLE `register_check`  (
                                   `register_check_id` int(30) NOT NULL,
                                   `register_selfcost` float(10, 2) DEFAULT NULL,
                                   `operation_id` int(30) DEFAULT NULL,
                                   `register_id` int(30) DEFAULT NULL,
                                   `register_check_state` int(30) DEFAULT NULL,
                                   PRIMARY KEY (`register_check_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `user_id` int(30) NOT NULL AUTO_INCREMENT,
                         `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_sex` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_idcard` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_nation` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_phone` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_number` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                         `user_type` int(30) DEFAULT NULL,
                         `user_state` int(30) DEFAULT NULL,
                         `department_id` int(30) DEFAULT NULL,
                         PRIMARY KEY (`user_id`) USING BTREE,
                         INDEX `department_id`(`department_id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '王瑞', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (2, '陈宇轩', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (3, '申兆媛', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (4, '汪美琴', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (5, '程耀开', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (6, '李平原', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (7, '刘诗宇', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 1, 1);
INSERT INTO `user` VALUES (8, '安鹏飞', '1', '12432', '汉', '2134322', '1232314', '23424', 2, 1, 1);
INSERT INTO `user` VALUES (9, '刘一凡', '1', '12432', '汉', '2134322', '1232314', '23424', 3, 1, 1);
INSERT INTO `user` VALUES (10, '黄楚思', '1', '12432', '汉', '2134322', '1232314', '23424', 4, 1, 1);
INSERT INTO `user` VALUES (11, '孙雪琪', '1', '12432', '汉', '2134322', '1232314', '23424', 2, 1, 1);
INSERT INTO `user` VALUES (12, '詹紫忆', '1', '12432', '汉', '2134322', '1232314', '23424', 3, 1, 1);
INSERT INTO `user` VALUES (13, '王珂林', '1', '12432', '汉', '2134322', '1232314', '23424', 4, 1, 1);
INSERT INTO `user` VALUES (14, '郭威', '1', '12432', '汉', '2134322', '1232314', '23424', 1, 2, 1);

-- ----------------------------
-- View structure for sendrecord
-- ----------------------------
DROP VIEW IF EXISTS `sendrecord`;
CREATE ALGORITHM = UNDEFINED DEFINER = `skip-grants user`@`skip-grants host` SQL SECURITY DEFINER VIEW `sendrecord` AS select `record`.`record_id` AS `record_id`,`user`.`user_name` AS `user_name`,`user`.`user_number` AS `user_number`,`user`.`user_id` AS `user_id`,`record`.`record_time` AS `record_time`,`user`.`user_type` AS `user_type`,`record`.`record_state` AS `record_state` from (`user` join `record`);

SET FOREIGN_KEY_CHECKS = 1;


