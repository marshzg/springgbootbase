/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50616
Source Host           : 127.0.0.1:3306
Source Database       : ndlp

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2018-10-07 23:29:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_demo
-- ----------------------------
DROP TABLE IF EXISTS `t_demo`;
CREATE TABLE `t_demo` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(50) DEFAULT NULL,
  `c_age` int(255) DEFAULT NULL,
  `c_create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_demo
-- ----------------------------
INSERT INTO `t_demo` VALUES ('1', '杨过', '18', '2018-10-07 22:48:37');
INSERT INTO `t_demo` VALUES ('2', '小龙女', '20', '2018-10-07 22:48:59');
INSERT INTO `t_demo` VALUES ('3', '郭靖', '50', '2018-10-07 22:49:17');
INSERT INTO `t_demo` VALUES ('4', '黄蓉', '35', '2018-10-07 22:49:35');
INSERT INTO `t_demo` VALUES ('5', '欧阳锋', '60', '2018-10-07 22:49:54');
INSERT INTO `t_demo` VALUES ('6', '洪七公', '58', '2018-10-07 22:50:13');
INSERT INTO `t_demo` VALUES ('7', 'ace', '20', '2018-10-07 22:50:29');
