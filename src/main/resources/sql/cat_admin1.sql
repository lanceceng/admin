/*
Navicat MySQL Data Transfer

Source Server         : cat
Source Server Version : 80018
Source Host           : localhost:3306
Source Database       : cat_admin1

Target Server Type    : MYSQL
Target Server Version : 80018
File Encoding         : 65001

Date: 2020-06-07 02:24:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '接口名称',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '接口地址',
  `ip` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '访问人IP',
  `user_id` int(11) DEFAULT '0' COMMENT '访问人ID 0:未登录用户操作',
  `status` int(2) DEFAULT '1' COMMENT '访问状态',
  `execute_time` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '接口执行时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1297 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='系统管理 - 日志表';

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1121', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '72 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1122', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '21 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1123', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '18 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1124', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1125', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1126', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '9 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1127', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1128', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '12 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1129', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1130', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1131', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '28 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1132', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '203 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1133', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '84 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1134', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1135', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '24 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1136', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '23 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1137', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '32 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1138', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1139', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '15 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1140', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1141', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1142', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1143', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1144', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1145', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1146', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '19621 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1147', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '3483 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1148', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '11 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1149', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '72 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1150', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '66 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1151', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '8 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1152', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '73 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1153', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '69 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1154', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '23 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1155', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '17 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1156', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '11 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1157', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1158', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '8 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1159', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '68 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1160', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1161', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1162', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1163', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1164', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '13 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1165', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1166', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1167', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1168', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1169', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1170', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1171', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1172', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '57 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1173', '保存菜单 ', 'http://127.0.0.1:8081/api/system/menu/save', '127.0.0.1', '1', '200', '8 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1174', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1175', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '26 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1176', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1177', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1178', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1179', '保存菜单 ', 'http://127.0.0.1:8081/api/system/menu/save', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1180', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1181', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1182', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1183', '获取系统管理 - 日志表列表分页', 'http://127.0.0.1:8081/api/system/log/listPage', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1184', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1185', '保存菜单 ', 'http://127.0.0.1:8081/api/system/menu/save', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1186', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1187', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1188', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1189', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '19 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1190', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '19 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1191', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1192', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '26655 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1193', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '7296 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1194', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '8 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1195', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1196', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '25900 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1197', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '2360 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1198', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1199', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '13672 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1200', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1201', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1202', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1203', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1204', '登录系统', 'http://127.0.0.1:8081/login', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1205', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '72 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1206', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '39 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1207', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1208', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1209', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1210', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1211', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1212', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1213', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1214', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1215', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1216', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '24 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1217', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1218', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1219', '删除角色 ', 'http://127.0.0.1:8081/api/system/role/delete', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1220', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1221', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '3 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1222', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1223', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1224', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1225', '获取菜单树', 'http://127.0.0.1:8081/api/system/menu/treeMenu', '127.0.0.1', '1', '200', '17 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1226', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1227', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '34 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1228', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '38 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1229', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '23 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1230', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '2 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1231', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '11 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1232', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '1 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1233', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1234', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '23 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1235', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '42 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1236', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '1 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1237', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '12 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1238', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '64 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1239', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '4 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1240', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '10 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1241', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '66 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1242', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '3288 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1243', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '10 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1244', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '66 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1245', '删除角色 ', 'http://127.0.0.1:8081/api/system/role/delete', '127.0.0.1', '1', '200', '5 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1246', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '11 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1247', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '8 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1248', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1249', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '16 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1250', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1251', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '66 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1252', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '19 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1253', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '20 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1254', '删除角色 ', 'http://127.0.0.1:8081/api/system/role/delete', '127.0.0.1', '1', '200', '19 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1255', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '9 ms', null, null, null, null);
INSERT INTO `sys_log` VALUES ('1256', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '65 ms', '2020-06-06 17:32:04', '2020-06-06 17:32:04', null, null);
INSERT INTO `sys_log` VALUES ('1257', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '7 ms', '2020-06-06 17:32:08', '2020-06-06 17:32:08', null, null);
INSERT INTO `sys_log` VALUES ('1258', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '11 ms', '2020-06-06 17:32:08', '2020-06-06 17:32:08', null, null);
INSERT INTO `sys_log` VALUES ('1259', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '11 ms', '2020-06-06 17:32:10', '2020-06-06 17:32:10', null, null);
INSERT INTO `sys_log` VALUES ('1260', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', '2020-06-06 17:32:10', '2020-06-06 17:32:10', null, null);
INSERT INTO `sys_log` VALUES ('1261', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '17 ms', '2020-06-06 17:34:43', '2020-06-06 17:34:43', null, null);
INSERT INTO `sys_log` VALUES ('1262', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '11 ms', '2020-06-06 17:34:43', '2020-06-06 17:34:43', null, null);
INSERT INTO `sys_log` VALUES ('1263', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '10081 ms', '2020-06-06 17:35:08', '2020-06-06 17:35:08', null, null);
INSERT INTO `sys_log` VALUES ('1264', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '46488 ms', '2020-06-06 17:39:28', '2020-06-06 17:39:28', null, null);
INSERT INTO `sys_log` VALUES ('1265', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '7 ms', '2020-06-06 17:39:34', '2020-06-06 17:39:34', null, null);
INSERT INTO `sys_log` VALUES ('1266', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '9 ms', '2020-06-06 17:39:34', '2020-06-06 17:39:34', null, null);
INSERT INTO `sys_log` VALUES ('1267', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '8 ms', '2020-06-06 17:39:34', '2020-06-06 17:39:34', null, null);
INSERT INTO `sys_log` VALUES ('1268', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '9257 ms', '2020-06-06 17:39:47', '2020-06-06 17:39:47', null, null);
INSERT INTO `sys_log` VALUES ('1269', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '8 ms', '2020-06-06 17:39:47', '2020-06-06 17:39:47', null, null);
INSERT INTO `sys_log` VALUES ('1270', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '13024 ms', '2020-06-06 17:40:20', '2020-06-06 17:40:20', null, null);
INSERT INTO `sys_log` VALUES ('1271', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '176539 ms', '2020-06-06 17:44:11', '2020-06-06 17:44:11', null, null);
INSERT INTO `sys_log` VALUES ('1272', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '103899 ms', '2020-06-06 17:47:11', '2020-06-06 17:47:11', null, null);
INSERT INTO `sys_log` VALUES ('1273', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '49967 ms', '2020-06-06 17:48:14', '2020-06-06 17:48:14', null, null);
INSERT INTO `sys_log` VALUES ('1274', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '65 ms', '2020-06-06 18:00:18', '2020-06-06 18:00:18', '1', '1');
INSERT INTO `sys_log` VALUES ('1275', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '7 ms', '2020-06-06 18:00:29', '2020-06-06 18:00:29', '1', '1');
INSERT INTO `sys_log` VALUES ('1276', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '12 ms', '2020-06-06 18:00:29', '2020-06-06 18:00:29', '1', '1');
INSERT INTO `sys_log` VALUES ('1277', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '68 ms', '2020-06-06 18:04:04', '2020-06-06 18:04:04', '1', '1');
INSERT INTO `sys_log` VALUES ('1278', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '19 ms', '2020-06-06 18:04:06', '2020-06-06 18:04:06', '1', '1');
INSERT INTO `sys_log` VALUES ('1279', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '12 ms', '2020-06-06 18:04:07', '2020-06-06 18:04:07', '1', '1');
INSERT INTO `sys_log` VALUES ('1280', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '6 ms', '2020-06-06 18:04:07', '2020-06-06 18:04:07', '1', '1');
INSERT INTO `sys_log` VALUES ('1281', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '6 ms', '2020-06-06 18:04:14', '2020-06-06 18:04:14', '1', '1');
INSERT INTO `sys_log` VALUES ('1282', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '8 ms', '2020-06-06 18:04:14', '2020-06-06 18:04:14', '1', '1');
INSERT INTO `sys_log` VALUES ('1283', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '19 ms', '2020-06-06 18:04:20', '2020-06-06 18:04:20', '1', '1');
INSERT INTO `sys_log` VALUES ('1284', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '12 ms', '2020-06-06 18:04:20', '2020-06-06 18:04:20', '1', '1');
INSERT INTO `sys_log` VALUES ('1285', '保存系统管理-用户基础信息表', 'http://127.0.0.1:8081/api/system/user/save', '127.0.0.1', '1', '200', '19 ms', '2020-06-06 18:04:25', '2020-06-06 18:04:25', '1', '1');
INSERT INTO `sys_log` VALUES ('1286', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '5 ms', '2020-06-06 18:04:25', '2020-06-06 18:04:25', '1', '1');
INSERT INTO `sys_log` VALUES ('1287', '登录系统', 'http://127.0.0.1:8081/login', '127.0.0.1', '1', '200', '6 ms', '2020-06-06 18:12:55', '2020-06-06 18:12:55', '1', '1');
INSERT INTO `sys_log` VALUES ('1288', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '73 ms', '2020-06-06 18:17:04', '2020-06-06 18:17:04', '1', '1');
INSERT INTO `sys_log` VALUES ('1289', '获取系统管理-用户基础信息表列表分页', 'http://127.0.0.1:8081/api/system/user/listPage', '127.0.0.1', '1', '200', '36 ms', '2020-06-06 18:17:04', '2020-06-06 18:17:04', '1', '1');
INSERT INTO `sys_log` VALUES ('1290', '登录系统', 'http://127.0.0.1:8081/login', '127.0.0.1', '1', '200', '5 ms', '2020-06-06 18:18:34', '2020-06-06 18:18:34', '1', '1');
INSERT INTO `sys_log` VALUES ('1291', '获取当前登录用户信息', 'http://127.0.0.1:8081/api/system/user/getCurrentUserInfo', '127.0.0.1', '1', '200', '75 ms', '2020-06-06 18:23:43', '2020-06-06 18:23:43', '1', '1');
INSERT INTO `sys_log` VALUES ('1292', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '49 ms', '2020-06-06 18:23:45', '2020-06-06 18:23:45', '1', '1');
INSERT INTO `sys_log` VALUES ('1293', '保存或更新角色', 'http://127.0.0.1:8081/api/system/role/saveOrUpdate', '127.0.0.1', '1', '200', '6 ms', '2020-06-06 18:23:49', '2020-06-06 18:23:49', '1', '1');
INSERT INTO `sys_log` VALUES ('1294', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '11 ms', '2020-06-06 18:23:49', '2020-06-06 18:23:49', '1', '1');
INSERT INTO `sys_log` VALUES ('1295', '删除角色 ', 'http://127.0.0.1:8081/api/system/role/delete', '127.0.0.1', '1', '200', '4 ms', '2020-06-06 18:23:51', '2020-06-06 18:23:51', '1', '1');
INSERT INTO `sys_log` VALUES ('1296', '获取系统管理-角色表 列表分页', 'http://127.0.0.1:8081/api/system/role/listPage', '127.0.0.1', '1', '200', '8 ms', '2020-06-06 18:23:51', '2020-06-06 18:23:51', '1', '1');

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '上级资源ID',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'url',
  `resources` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源编码',
  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源名称',
  `level` int(11) DEFAULT NULL COMMENT '资源级别',
  `sort_no` int(11) DEFAULT NULL COMMENT '排序',
  `icon` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源图标',
  `type` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '类型 menu、button',
  `remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统管理-权限资源表 ';

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '0', null, 'systemManage', '系统管理', '1', '3', 'component', 'menu', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('2', '1', '/system/user/listPage', 'user', '用户管理', '2', '1', 'my-user', 'menu', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('3', '2', '/system/user/save', 'sys:user:add', '添加', '3', '1', 'el-icon-edit', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('4', '2', '/system/user/save', 'sys:user:edit', '编辑', '3', '2', null, 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('5', '2', '/system/user/delete', 'sys:user:delete', '删除', '3', '3', null, 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('16', '1', '/system/role/listPage', 'role', '角色管理', '2', '2', 'my-role', 'menu', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('17', '1', '/system/menu/treeMenu', 'menu', '菜单管理', '2', '3', 'my-sysmenu', 'menu', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('43', '16', '/system/role/saveOrUpdate', 'sys:role:add', '添加', '3', '1', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('44', '16', '/system/role/saveOrUpdate', 'sys:role:edit', '编辑', '3', '2', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('45', '16', null, 'roleSetting', '权限设置', '3', '3', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('46', '16', '/system/role/delete', 'sys:role:delete', '删除', '3', '4', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('47', '17', '/system/menu/save', 'sys:menu:add', '添加', '3', '1', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('48', '17', '/system/menu/save', 'sys:menu:addsub', '添加下级', '3', '2', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('49', '17', '/system/menu/save', 'sys:menu:edit', '编辑', '3', '3', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('50', '17', '/system/menu/delete', 'sys:menu:delete', '删除', '3', '4', '', 'button', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('79', '1', '/system/log/listPage', 'log', '系统日志', '2', '4', 'star', 'menu', '', null, null, null, null);
INSERT INTO `sys_menu` VALUES ('80', '16', '/system/user/treeUser', 'sys:user:treeUser', '获取用户树', '3', '5', null, 'menu', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('81', '16', '/system/role/detail', 'sys:role:detail', '获取角色详情', '3', '6', null, 'menu', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('82', '16', '/system/userRole/list', 'sys:userRole:list', '获取系统管理 - 用户角色关联表 列表', '3', '7', null, 'menu', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('83', '17', '/system/menu/treeMenu', 'sys:menu:treeMenu', '获取菜单树', '3', '5', null, 'menu', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('84', '2', '/system/roleMenu/list', 'sys:roleMenu:list', '获取系统管理 - 角色-菜单关联表 列表', '3', '4', null, 'menu', null, null, null, null, null);
INSERT INTO `sys_menu` VALUES ('85', '17', '/system/roleMenu/saveRoleMenu', 'sys:roleMenu:saveRoleMenu', '保存角色相关联菜单', '3', '6', null, 'button', null, null, null, null, null);

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色编码',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色名称',
  `remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统管理-角色表 ';

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'admin', '系统管理员', '系统管理员', null, '2020-06-06 17:32:08', null, null);
INSERT INTO `sys_role` VALUES ('2', 'visitor', '访客', '访客', null, '2020-06-06 17:48:14', null, null);

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(10) DEFAULT NULL COMMENT '角色ID',
  `menu_id` int(10) DEFAULT NULL COMMENT '菜单ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1651 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统管理 - 角色-权限资源关联表 ';

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES ('1571', '1', '1', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1572', '1', '2', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1573', '1', '3', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1574', '1', '4', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1575', '1', '5', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1576', '1', '84', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1577', '1', '16', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1578', '1', '43', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1579', '1', '44', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1580', '1', '45', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1581', '1', '46', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1582', '1', '80', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1583', '1', '81', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1584', '1', '82', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1585', '1', '17', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1586', '1', '47', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1587', '1', '48', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1588', '1', '49', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1589', '1', '50', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1590', '1', '83', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1591', '1', '85', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1592', '1', '79', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1636', '2', '1', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1637', '2', '2', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1638', '2', '3', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1639', '2', '4', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1640', '2', '5', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1641', '2', '84', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1642', '2', '43', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1643', '2', '44', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1644', '2', '45', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1645', '2', '46', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1646', '2', '80', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1647', '2', '81', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1648', '2', '82', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1649', '2', '17', null, null, null, null);
INSERT INTO `sys_role_menu` VALUES ('1650', '2', '83', null, null, null, null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '账号',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录密码',
  `nick_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `sex` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '性别 0:男 1:女',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '邮箱',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `flag` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '状态',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'token',
  `qq_oppen_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'QQ 第三方登录Oppen_ID唯一标识',
  `pwd` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '明文密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统管理-用户基础信息表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'dc4efd20f7e10ff5e90ec54ba61eb6fecc419d60', 'admin', '0', '15183301231', 'qweqwe@qq.com', '', '1', '56f6288e359db8f3adaa6465d523cf9a19001ffd', '', '123456', null, '2020-06-06 18:17:04', null, '1');
INSERT INTO `sys_user` VALUES ('2', 'test', 'dc4efd20f7e10ff5e90ec54ba61eb6fecc419d60', '测试号', '0', '13723452811', '123123@qq.com', '', '1', '21d44515a788129bd31e65cc016c113c439c7b83', null, '123456', null, '2020-06-06 18:04:14', null, '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` int(10) DEFAULT NULL COMMENT '角色ID',
  `user_id` int(10) DEFAULT NULL COMMENT '用户ID',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `create_id` int(10) DEFAULT NULL,
  `update_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='系统管理 - 用户角色关联表 ';

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('12', '1', '1', '2019-08-21 10:49:41', '2019-08-21 10:49:41', null, null);
INSERT INTO `sys_user_role` VALUES ('27', '2', '2', '2019-09-07 21:50:33', '2019-09-07 21:50:33', null, null);
