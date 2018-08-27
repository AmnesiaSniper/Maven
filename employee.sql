/*
MySQL Data Transfer
Source Host: localhost
Source Database: employee
Target Host: localhost
Target Database: employee
Date: 2018/08/23 8:50:43
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `class_id` int(4) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `class_content` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` varchar(5) COLLATE utf8_bin NOT NULL,
  `course_name` varchar(30) COLLATE utf8_bin NOT NULL,
  `course_student` int(6) NOT NULL DEFAULT '0',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_id` varchar(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '0',
  `stu_name` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `stu_sex` char(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `stu_age` int(4) NOT NULL DEFAULT '0',
  `stu_birthday` date NOT NULL,
  `stu_class` int(4) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `ter_id` varchar(5) COLLATE utf8_bin NOT NULL DEFAULT '',
  `ter_name` varchar(20) COLLATE utf8_bin NOT NULL,
  `ter_sex` varchar(2) COLLATE utf8_bin NOT NULL,
  `ter_age` int(4) NOT NULL,
  `ter_level` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `ter_class` varchar(5) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`ter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `classes` VALUES ('1', 'S班', '神级');
INSERT INTO `classes` VALUES ('2', 'A班', '精英级');
INSERT INTO `classes` VALUES ('3', 'B班', '标准级');
INSERT INTO `classes` VALUES ('4', 'C班', '基本级');
INSERT INTO `classes` VALUES ('5', 'D班', '入门级');
INSERT INTO `course` VALUES ('00001', '语文', '1');
INSERT INTO `course` VALUES ('00002', '数学', '5');
INSERT INTO `course` VALUES ('00003', '英语', '3');
INSERT INTO `course` VALUES ('00004', '物理', '5');
INSERT INTO `course` VALUES ('00006', '化学', '5');
INSERT INTO `course` VALUES ('00007', '历史', '1');
INSERT INTO `student` VALUES ('001', '小黑', '男', '14', '2018-03-13', '2');
INSERT INTO `student` VALUES ('002', '小白', '女', '12', '2018-07-20', '3');
INSERT INTO `student` VALUES ('003', '小凛', '男', '3', '2018-08-15', '1');
INSERT INTO `student` VALUES ('004', '小沫', '女', '5', '2018-07-25', '3');
INSERT INTO `student` VALUES ('005', '小黄', '男', '4', '2018-07-03', '2');
INSERT INTO `student` VALUES ('007', '小鬼', '男', '2', '2018-07-31', '2');
INSERT INTO `student` VALUES ('008', '小哈', '男', '6', '2018-07-11', '4');
INSERT INTO `student` VALUES ('009', '小萌', '女', '1', '2018-08-31', '3');
INSERT INTO `student` VALUES ('012', '小晨', '男', '6', '2018-08-18', '3');
INSERT INTO `student` VALUES ('015', '小夕', '女', '3', '2018-08-26', '4');
INSERT INTO `teacher` VALUES ('001', '李', '男', '26', '特级', '1');
