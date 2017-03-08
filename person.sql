
-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `userid` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `userpwd` varchar(20) DEFAULT NULL,
  `address` varchar(128) DEFAULT NULL,
  `age` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'tom', '123', '软件园', '20');
INSERT INTO `person` VALUES ('2', 'jack', '123', '未来城', '21');
