/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : simplecrm

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-04-24 09:17:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `authority`
-- ----------------------------
DROP TABLE IF EXISTS `authority`;
CREATE TABLE `authority` (
  `AUTHORITY_ID` varchar(36) NOT NULL,
  `AUTHORITY_NAME` varchar(20) NOT NULL,
  `AUTHORITY_EXPLAIN` varchar(50) NOT NULL,
  PRIMARY KEY (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of authority
-- ----------------------------
INSERT INTO `authority` VALUES ('06765f5e-0f9e-11e7-8663-28d2444b860a', '发布任务', '根据商机给跟进人发布任务');
INSERT INTO `authority` VALUES ('10c42c6f-0d91-11e7-9e9d-28d2444b860a', '编辑客户', '编辑客户信息');
INSERT INTO `authority` VALUES ('1102a510-16a9-11e7-a0f7-94de80188a22', '添加部门经理', '添加部门经理');
INSERT INTO `authority` VALUES ('2ff28e74-0c0c-11e7-9e9d-28d2444b860a', '管理员角色', '添加或修改为管理员角色');
INSERT INTO `authority` VALUES ('346093a3-0a3d-11e7-8d42-28d2444b860a', '添加部门', '添加新的部门');
INSERT INTO `authority` VALUES ('34a71c5d-0d3b-11e7-9e9d-28d2444b860a', '添加客户', '添加新客户到部门');
INSERT INTO `authority` VALUES ('4d8a6d36-0a3d-11e7-8d42-28d2444b860a', '编辑部门', '编辑部门信息');
INSERT INTO `authority` VALUES ('523c4eee-0d3b-11e7-9e9d-28d2444b860a', '编辑产品', '编辑已有的产品信息');
INSERT INTO `authority` VALUES ('6fb1f7c9-0a3d-11e7-8d42-28d2444b860a', '删除部门', '删除已经存在的部门');
INSERT INTO `authority` VALUES ('7584310e-1030-11e7-8663-28d2444b860a', '收到的任务', '查看已经的收到任务');
INSERT INTO `authority` VALUES ('769c7965-1394-11e7-aa71-28d2444b860a', '编辑任务', '编辑已经发布的任务');
INSERT INTO `authority` VALUES ('8699fb77-0ace-11e7-a1cf-28d2444b860a', '管理员职务权限修改', '管理员可以访问管理员职务权限修改页面');
INSERT INTO `authority` VALUES ('8d1bacfa-0ac3-11e7-991c-28d2444b860a', '权限设置', '设置职务权限');
INSERT INTO `authority` VALUES ('8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a', '添加产品', '添加新的产品信息');
INSERT INTO `authority` VALUES ('96151773-102f-11e7-8663-28d2444b860a', '发布的任务', '查看已经的发布任务');
INSERT INTO `authority` VALUES ('96dd987b-1138-11e7-8663-28d2444b860a', '外勤审批', '审批收到的外勤申请');
INSERT INTO `authority` VALUES ('a4a35af4-167f-11e7-a0f7-94de80188a22', '外勤申请', '销售人员外勤申请');
INSERT INTO `authority` VALUES ('b3184bfb-0bfc-11e7-9e9d-28d2444b860a', '员工入职', '添加新员工');
INSERT INTO `authority` VALUES ('b7b79e68-0beb-11e7-9e9d-28d2444b860a', '添加总经理', '添加或修改员工为总经理');
INSERT INTO `authority` VALUES ('e23df149-1686-11e7-a0f7-94de80188a22', '编辑员工信息', '编辑员工信息');
INSERT INTO `authority` VALUES ('fb9ccbab-0ac3-11e7-991c-28d2444b860a', '修改总经理权限', '可以更改总经理的权限');

-- ----------------------------
-- Table structure for `business_opportunity`
-- ----------------------------
DROP TABLE IF EXISTS `business_opportunity`;
CREATE TABLE `business_opportunity` (
  `BUSINESS_OPPORTUNITY_ID` varchar(36) NOT NULL,
  `CUSTOM_ID` varchar(36) DEFAULT NULL,
  `SALES_STAGE_ID` varchar(36) DEFAULT NULL,
  `PRODUCT_ID` varchar(36) DEFAULT NULL,
  `PRE_SALES_AMOUNT` decimal(10,2) DEFAULT NULL,
  `PRE_DEAL_TIME` datetime DEFAULT NULL,
  `REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`BUSINESS_OPPORTUNITY_ID`),
  KEY `FK_Reference_36` (`CUSTOM_ID`),
  KEY `FK_Reference_37` (`SALES_STAGE_ID`),
  KEY `FK_Reference_46` (`PRODUCT_ID`),
  CONSTRAINT `FK_Reference_36` FOREIGN KEY (`CUSTOM_ID`) REFERENCES `custom` (`CUSTOM_ID`),
  CONSTRAINT `FK_Reference_37` FOREIGN KEY (`SALES_STAGE_ID`) REFERENCES `sales_stage` (`SALES_STAGE_ID`),
  CONSTRAINT `FK_Reference_46` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business_opportunity
-- ----------------------------
INSERT INTO `business_opportunity` VALUES ('2bc95698-b2b9-4e62-8267-52296d3ccfbc', 'e16780d2-cc3d-41b9-995d-733724761717', '011bc899-0d4c-11e7-9e9d-28d2444b860a', '9c10ada0-ef0a-487f-b463-8cd8f688a984', '12000000.00', '2017-04-25 00:00:00', '');
INSERT INTO `business_opportunity` VALUES ('790f785e-1454-4089-89a1-2f74cb2eeaf3', '4df2dfa9-9487-4c76-b3ea-15ef4361766a', 'ddc2e328-0d4b-11e7-9e9d-28d2444b860a', '559f6b42-9465-48cc-8922-008e7e0da980', '233000.00', '2017-05-14 00:00:00', '对方对我司的“微瞳手机客户端”有兴趣，希望我司能派人去学校现场演示软件。');
INSERT INTO `business_opportunity` VALUES ('a779dd65-393a-402e-b768-512748072197', '42b1b716-ce39-4bad-8b4b-99f1cd37a8f4', 'fbf40d99-0d4b-11e7-9e9d-28d2444b860a', '36b445d1-d3b0-4fbc-8876-7c99a1320125', '3500.00', '2017-04-20 00:00:00', '');
INSERT INTO `business_opportunity` VALUES ('d236a5df-67f3-45fe-94cf-03eb946b5c69', '75584139-f7ff-424b-a2eb-8015ffb0c26b', '053bd26b-0d4c-11e7-9e9d-28d2444b860a', '36c14a34-e58c-483d-a69b-8c728139f43d', '2500000.00', '2017-04-23 00:00:00', '进一步沟通');

-- ----------------------------
-- Table structure for `custom`
-- ----------------------------
DROP TABLE IF EXISTS `custom`;
CREATE TABLE `custom` (
  `CUSTOM_ID` varchar(36) NOT NULL,
  `CUSTOM_RANK_ID` varchar(36) DEFAULT NULL,
  `CUSTOM_STATE_ID` varchar(36) DEFAULT NULL,
  `DEPARTMENT_ID` varchar(36) DEFAULT NULL,
  `FOLLOW_EMPLOYEE_ID` varchar(36) DEFAULT NULL,
  `CUSTOM_NAME` varchar(20) NOT NULL,
  `CUSTOM_ADDRESS` varchar(200) DEFAULT NULL,
  `CUSTOM_LINKMAN_NAME` varchar(20) DEFAULT NULL,
  `CUSTOM_LINKMAN_PHONE` varchar(20) DEFAULT NULL,
  `CUSTOM_LINKMAN_POST` varchar(40) DEFAULT NULL,
  `CUSTOM_LINKMAN_REMARK` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`CUSTOM_ID`),
  KEY `FK_Reference_21` (`FOLLOW_EMPLOYEE_ID`),
  KEY `FK_Reference_42` (`CUSTOM_RANK_ID`),
  KEY `FK_Reference_43` (`CUSTOM_STATE_ID`),
  KEY `FK_Reference_45` (`DEPARTMENT_ID`),
  CONSTRAINT `FK_Reference_21` FOREIGN KEY (`FOLLOW_EMPLOYEE_ID`) REFERENCES `employee` (`EMPLOYEE_ID`),
  CONSTRAINT `FK_Reference_42` FOREIGN KEY (`CUSTOM_RANK_ID`) REFERENCES `custom_rank` (`CUSTOM_RANK_ID`),
  CONSTRAINT `FK_Reference_43` FOREIGN KEY (`CUSTOM_STATE_ID`) REFERENCES `custom_state` (`CUSTOM_STATE_ID`),
  CONSTRAINT `FK_Reference_45` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`DEPARTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custom
-- ----------------------------
INSERT INTO `custom` VALUES ('42b1b716-ce39-4bad-8b4b-99f1cd37a8f4', '8ac12910-0d45-11e7-9e9d-28d2444b860a', '31b14919-0d46-11e7-9e9d-28d2444b860a', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '成都市青羊区高联培训学校', '成都市武侯区红瓦寺街共和村10号3F', '华盛', '02866206109', '董事长', '高联教育集团自1997年开创至今，秉承以学员服务为中心，教学效果为导向的培训理念，连续多年举办全国规模型考研培训班，培训学员超过50万人次，先后在济南、北京、上海、成都、武汉、西安等国内三十多个中心城市开办学校，是全国具影响力的考研教育企业之一。');
INSERT INTO `custom` VALUES ('4df2dfa9-9487-4c76-b3ea-15ef4361766a', '84084e44-0d45-11e7-9e9d-28d2444b860a', '373c6373-0d46-11e7-9e9d-28d2444b860a', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '成都圣达第三幼儿园', '四川省成都红光镇广场路北二段60号', '徐盛', '13431324213', '教务处主任', '成都圣达第三幼儿园是一所民办幼儿园，学生数目多。希望有一款协助教师、学生、家长沟通的软件。');
INSERT INTO `custom` VALUES ('51ff691c-508e-4cf4-b4e5-b0e54cbbea67', '84084e44-0d45-11e7-9e9d-28d2444b860a', '31b14919-0d46-11e7-9e9d-28d2444b860a', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '844595f2-16b3-4a6f-a66f-cf96aefd89c8', '博众图新（厦门）信息技术有限公司', '福建省厦门市集美区珩田路590号5楼', '张合身', '05926262196', '董事长助理', '博众图新（厦门）信息技术有限公司成立于2015年，注册资金1000万。公司由国内高校及科研机构的多位博士发起，专注于时空大数据技术研发，服务于智慧城市。');
INSERT INTO `custom` VALUES ('747a0a8f-4145-4ba3-82cb-a822a09ee4bc', '84084e44-0d45-11e7-9e9d-28d2444b860a', '31b14919-0d46-11e7-9e9d-28d2444b860a', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '844595f2-16b3-4a6f-a66f-cf96aefd89c8', '厦门创图信息技术有限公司', '集美杏林湾商务营运中心2号楼2层', '陈丽', '13243532131', '前台', '厦门创图信息技术有限公司是一家致力于气象、国土、水利、环保等防灾减灾相关行业GIS信息化建设的高科技创新型公司 ，拥有强大的GIS技术资源和行业资源,技术带头人为原Esri中国高级技术顾问，目前公司拥有自主研发的二三维地理信息平台CreateMap，成功在气象领域得到应用。');
INSERT INTO `custom` VALUES ('75584139-f7ff-424b-a2eb-8015ffb0c26b', '8ac12910-0d45-11e7-9e9d-28d2444b860a', '31b14919-0d46-11e7-9e9d-28d2444b860a', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', 'd962a7c8-a2ca-4ad3-8bb1-5d4150d2103b', '福建天赢贸易有限公司', '厦门市思明区莲前西路2号莲富大厦F14A', '林何森', '18212323311', '总经理', '福建天赢贸易有限公司成立于2000年，注册资金500万，是福建厦门一家专业代理美的产品的公司。代理的产品有：美的生活电器电磁炉、电饭煲、电压力锅、电炖锅、豆浆机、果汁机、电水壶、挂烫机等。');
INSERT INTO `custom` VALUES ('ab232254-b1aa-4934-ad2b-638b5bda13d3', '8ac12910-0d45-11e7-9e9d-28d2444b860a', '373c6373-0d46-11e7-9e9d-28d2444b860a', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '844595f2-16b3-4a6f-a66f-cf96aefd89c8', '吉联新软件股份有限公司', '福建省厦门市软件园二期望海路29号吉联大楼', '黄河', '05924253243', '区域经理', '吉联科技有限公司【简称“吉联科技”】是目前世界上极少数具有能力开发全球航运信息管理系统的专业软件服务提供商之一，专门为国际航运、物流领域的信息系统提供设计、开发、咨询、培训及技术支持服务，公司的愿景是成为全球知名航运物流关系信息系系统专业软件提供商。');
INSERT INTO `custom` VALUES ('af71e5d3-8aa3-4d27-89df-34a18f023a00', '8efeffc1-0d45-11e7-9e9d-28d2444b860a', '72c10457-0d46-11e7-9e9d-28d2444b860a', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '24ce2172-3ae5-44cb-9093-046af7df2267', '中国平安人寿保险股份有限公司深圳分公司', '深圳市', '江仨', '14214251332', '营销总监', '中国平安于1988年诞生于深圳蛇口，是中国第一家股份制保险企业，至今已发展成为融保险、银行、投资三大主营业务为一体、核心金融与互联网金融业务并行发展的个人金融生活服务集团。');
INSERT INTO `custom` VALUES ('e16780d2-cc3d-41b9-995d-733724761717', '8ac12910-0d45-11e7-9e9d-28d2444b860a', '373c6373-0d46-11e7-9e9d-28d2444b860a', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '中金支付有限公司', '北京市丰台区北京南站路2号院1号楼供销弘泰大厦13层、14层、15层', '李发', '15435313213', '总经理秘书', '中金支付有限公司（China Payment & Clearing Network Co., Ltd.）是在中国人民银行指导下建成并运营的一家专业的互联网支付服务机构，公司总部位于北京市，在上海、广州、香港和成都设有分支机构。');
INSERT INTO `custom` VALUES ('fb7a8a04-3628-4e40-be70-32b5d0dd3210', '8efeffc1-0d45-11e7-9e9d-28d2444b860a', '72c10457-0d46-11e7-9e9d-28d2444b860a', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '24ce2172-3ae5-44cb-9093-046af7df2267', '福建傲农生物科技集团股份有限公司', '思明区观音山商务运营中心10号楼12层', '徐群', '13455742234', '销售总监', '傲农集团成立于2011年6月，是一家以标准化、规范化、集约化和产业化为导向的高科技农牧企业，主营业务包括饲料、动保、育种、原料贸易等核心产业。集团市场布局覆及全国31个省、市、自治区，共成立了福建傲农、漳州傲农、南昌傲农、广州傲农、四川傲农等60多家分子公司。');

-- ----------------------------
-- Table structure for `custom_rank`
-- ----------------------------
DROP TABLE IF EXISTS `custom_rank`;
CREATE TABLE `custom_rank` (
  `CUSTOM_RANK_ID` varchar(36) NOT NULL,
  `CUSTOM_RANK_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`CUSTOM_RANK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custom_rank
-- ----------------------------
INSERT INTO `custom_rank` VALUES ('84084e44-0d45-11e7-9e9d-28d2444b860a', '小型客户');
INSERT INTO `custom_rank` VALUES ('8ac12910-0d45-11e7-9e9d-28d2444b860a', '中型客户');
INSERT INTO `custom_rank` VALUES ('8efeffc1-0d45-11e7-9e9d-28d2444b860a', '大型客户');

-- ----------------------------
-- Table structure for `custom_state`
-- ----------------------------
DROP TABLE IF EXISTS `custom_state`;
CREATE TABLE `custom_state` (
  `CUSTOM_STATE_ID` varchar(36) NOT NULL,
  `CUSTOM_STATE_NAME` varchar(20) NOT NULL,
  PRIMARY KEY (`CUSTOM_STATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of custom_state
-- ----------------------------
INSERT INTO `custom_state` VALUES ('31b14919-0d46-11e7-9e9d-28d2444b860a', '普通');
INSERT INTO `custom_state` VALUES ('373c6373-0d46-11e7-9e9d-28d2444b860a', '重要');
INSERT INTO `custom_state` VALUES ('72c10457-0d46-11e7-9e9d-28d2444b860a', '非常重要');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DEPARTMENT_ID` varchar(36) NOT NULL,
  `DEPARTMENT_NAME` varchar(20) NOT NULL,
  `DEPARTMENT_INIT` int(11) NOT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('590ce95b-b267-44cd-ba5d-6e6d95249cf3', '销售1部', '0');
INSERT INTO `department` VALUES ('85ef362e-0987-11e7-b918-28d2444b860a', '离职员工', '1');
INSERT INTO `department` VALUES ('cfd4baa2-0986-11e7-b918-28d2444b860a', '总裁办', '1');
INSERT INTO `department` VALUES ('fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '销售2部', '0');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EMPLOYEE_ID` varchar(36) NOT NULL,
  `DEPARTMENT_ID_EMPLOYEE` varchar(36) NOT NULL,
  `USERROLE_ID_EMPLOYEE` varchar(36) DEFAULT NULL,
  `EMPLOYEE_USERNAME` varchar(20) NOT NULL,
  `EMPLOYEE_PASSWORD` varchar(24) NOT NULL,
  `EMPLOYEE_NUMBER` varchar(20) NOT NULL,
  `EMPLOYEE_REAL_NAME` varchar(20) NOT NULL,
  `EMPLOYEE_EMAIL` varchar(40) DEFAULT NULL,
  `EMPLOYEE_PHONE` varchar(15) DEFAULT NULL,
  `EMPLOYEE_INIT` int(11) DEFAULT NULL,
  `EMPLOYEE_INSTRUCT` varchar(4) DEFAULT NULL,
  `EMPLOYEE_USEFUL_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`),
  KEY `FK_Reference_13` (`USERROLE_ID_EMPLOYEE`),
  KEY `FK_Reference_6` (`DEPARTMENT_ID_EMPLOYEE`),
  CONSTRAINT `FK_Reference_13` FOREIGN KEY (`USERROLE_ID_EMPLOYEE`) REFERENCES `userrole` (`USERROLE_ID`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`DEPARTMENT_ID_EMPLOYEE`) REFERENCES `department` (`DEPARTMENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('17447643-98fa-4165-ac90-b8b8c62b36b6', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '5e8d627f-0987-11e7-b918-28d2444b860a', 'lisi', '4QrcOUm6Wau+VuBX8g+IPg==', '0005', '李四', '123@gmail.com', '21343241321', '0', null, null);
INSERT INTO `employee` VALUES ('24ce2172-3ae5-44cb-9093-046af7df2267', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '57695387-0987-11e7-b918-28d2444b860a', 'wujiu', '4QrcOUm6Wau+VuBX8g+IPg==', '0010', '吴九', '123@gmail.com', '32432131232', '0', null, null);
INSERT INTO `employee` VALUES ('4d927c0f-48f8-44b2-81be-fb042182bf4d', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '57695387-0987-11e7-b918-28d2444b860a', 'wangwu', '4QrcOUm6Wau+VuBX8g+IPg==', '0006', '王五', '123@gmail.com', '12334241232', '0', null, null);
INSERT INTO `employee` VALUES ('53b4da74-9b0b-4dfa-9a27-eaac146fae49', 'fb9f645f-c07a-45da-bdb9-8c4ade624ca4', '57695387-0987-11e7-b918-28d2444b860a', 'zhouba', '4QrcOUm6Wau+VuBX8g+IPg==', '0009', '周八', '123@gmail.com', '23432432132', '0', null, null);
INSERT INTO `employee` VALUES ('5e2bf358-0985-11e7-b918-28d2444b860a', 'cfd4baa2-0986-11e7-b918-28d2444b860a', '10988d26-0986-11e7-b918-28d2444b860a', 'liangbozhao', '4QrcOUm6Wau+VuBX8g+IPg==', '0001', '梁伯昭', '1175194928@qq.com', '15605925286', '1', null, null);
INSERT INTO `employee` VALUES ('821fab2b-12c3-4606-a4e8-8a23f171f7b6', '85ef362e-0987-11e7-b918-28d2444b860a', '6566dff0-0987-11e7-b918-28d2444b860a', 'zhengshi', '4QrcOUm6Wau+VuBX8g+IPg==', '0011', '郑十', '123@gmail.com', '12323213213', '-1', null, null);
INSERT INTO `employee` VALUES ('844595f2-16b3-4a6f-a66f-cf96aefd89c8', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '57695387-0987-11e7-b918-28d2444b860a', 'zhaoliu', '4QrcOUm6Wau+VuBX8g+IPg==', '0007', '赵六', '123@gmail.com', '12312332432', '0', null, null);
INSERT INTO `employee` VALUES ('b55a5144-1ead-4b2c-8d4f-61702c446ffa', 'cfd4baa2-0986-11e7-b918-28d2444b860a', '6566dff0-0987-11e7-b918-28d2444b860a', 'liuyi', '4QrcOUm6Wau+VuBX8g+IPg==', '0002', '刘一', '123@gmail.comm', '12345678901', '0', null, null);
INSERT INTO `employee` VALUES ('cf5e17b1-c817-44ac-ad72-495741007c9a', '85ef362e-0987-11e7-b918-28d2444b860a', '57695387-0987-11e7-b918-28d2444b860a', 'zhangsan', '4QrcOUm6Wau+VuBX8g+IPg==', '0004', '张三', '123@gmail.com', '12334231231', '-1', null, null);
INSERT INTO `employee` VALUES ('d0d34b1e-6e79-4f6b-b4fb-e2fcfb1e71f0', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '5e8d627f-0987-11e7-b918-28d2444b860a', 'chener', '4QrcOUm6Wau+VuBX8g+IPg==', '0003', '陈二', '123@gmail.com', '98765432101', '0', null, null);
INSERT INTO `employee` VALUES ('d962a7c8-a2ca-4ad3-8bb1-5d4150d2103b', '590ce95b-b267-44cd-ba5d-6e6d95249cf3', '57695387-0987-11e7-b918-28d2444b860a', 'sunqi', '4QrcOUm6Wau+VuBX8g+IPg==', '0008', '孙七', '123@gmail.com', '12312321321', '0', null, null);

-- ----------------------------
-- Table structure for `feedback`
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `FEEDBACK_ID` varchar(36) NOT NULL,
  `TASK_ID` varchar(36) DEFAULT NULL,
  `FOLLOW_EMPLOYEE_ID_FEEDBACK` varchar(36) DEFAULT NULL,
  `FEEDBACK_DETAIL` varchar(200) DEFAULT NULL,
  `FEEDBACK_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`FEEDBACK_ID`),
  KEY `FK_Reference_22` (`TASK_ID`),
  KEY `FK_Reference_23` (`FOLLOW_EMPLOYEE_ID_FEEDBACK`),
  CONSTRAINT `FK_Reference_22` FOREIGN KEY (`TASK_ID`) REFERENCES `task` (`TASK_ID`),
  CONSTRAINT `FK_Reference_23` FOREIGN KEY (`FOLLOW_EMPLOYEE_ID_FEEDBACK`) REFERENCES `employee` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('0f71638d-b0bf-4bc5-aa0d-7274af983c78', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '12', '2017-04-23 14:44:18');
INSERT INTO `feedback` VALUES ('243d7eff-b36a-44f9-8915-a8c07457f97b', '675c2fdc-c813-4178-b3f3-1ca34a0a9cda', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '整理完成，已经回复客户。', '2017-03-23 17:48:52');
INSERT INTO `feedback` VALUES ('44c81f72-a967-47d3-ad9b-fbcaa5f7c2b8', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第7次反馈', '2017-04-04 17:29:10');
INSERT INTO `feedback` VALUES ('7eb06f1a-7787-449a-b2d2-2e878a989b98', 'a554493f-f758-4a59-a041-f657055a080a', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '客户对我们提供的产品有兴趣，可以进一步沟通', '2017-04-19 14:38:11');
INSERT INTO `feedback` VALUES ('959122b2-5366-4359-aea1-e1f4cde03a53', 'b71ddc44-de27-4c4a-9944-c4d20e56b189', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '这是测试消息。', '2017-04-21 17:49:32');
INSERT INTO `feedback` VALUES ('9715ced6-8068-4191-a004-1a9d6fbb3cdd', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第4次反馈', '2017-03-27 17:18:38');
INSERT INTO `feedback` VALUES ('9bbf3e22-3050-4b52-aaf8-cab5a4161d27', '0c59cbda-7f1f-4c90-8b4f-838470d6a06a', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '客户项目负责人正在出差，具体时间无法确定', '2017-04-17 17:05:44');
INSERT INTO `feedback` VALUES ('9ccc6559-6877-4893-9f52-8a7e69d06573', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第1次反馈', '2017-03-23 17:18:09');
INSERT INTO `feedback` VALUES ('afa35b23-54a0-49d9-99cd-7ea84d53f581', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第9次反馈', '2017-04-19 17:29:23');
INSERT INTO `feedback` VALUES ('beaa74d9-5aad-4944-8b37-7ccb7601612f', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第2次反馈', '2017-03-25 17:18:19');
INSERT INTO `feedback` VALUES ('d2ea71df-c19a-4b97-8a07-ed7abbfb5b7b', '0c59cbda-7f1f-4c90-8b4f-838470d6a06a', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '客户希望延迟谈判时间', '2017-04-19 17:06:56');
INSERT INTO `feedback` VALUES ('d65fd666-d517-4ae9-b602-4cac7a10971f', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第5次反馈', '2017-04-03 17:25:57');
INSERT INTO `feedback` VALUES ('dc40714a-5bc9-484e-96bd-34e20394d8c9', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第10次反馈', '2017-04-19 17:29:28');
INSERT INTO `feedback` VALUES ('ea0efbd2-2718-49ef-ba7f-70b608d1c6c4', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第6次反馈', '2017-04-04 17:29:03');
INSERT INTO `feedback` VALUES ('ec7c8246-ed08-4b57-9a7a-fe892a587f2c', '675c2fdc-c813-4178-b3f3-1ca34a0a9cda', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '整理了80%，还有些问题需要咨询本部的技术员工才能回复。', '2017-03-23 17:48:21');
INSERT INTO `feedback` VALUES ('ef69b0bb-140e-494c-a44b-af24f6272d00', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第8次反馈', '2017-04-11 17:29:17');
INSERT INTO `feedback` VALUES ('f275b798-1913-41cd-9eac-2837cfe2a49a', 'a554493f-f758-4a59-a041-f657055a080a', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '客户使用的机器和浏览器比较陈旧，项目需要做兼容处理', '2017-04-19 14:39:23');
INSERT INTO `feedback` VALUES ('f413dfd8-e008-4faf-b927-73b831b236db', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第11次反馈', '2017-04-21 17:29:36');
INSERT INTO `feedback` VALUES ('f9036dca-8819-405f-b8cb-78690ad4c128', 'eb0a771f-0480-4316-a501-0c925e2b467c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第3次反馈', '2017-03-26 17:18:29');

-- ----------------------------
-- Table structure for `process`
-- ----------------------------
DROP TABLE IF EXISTS `process`;
CREATE TABLE `process` (
  `PROCESS_ID` varchar(36) NOT NULL,
  `PROCESS_EMPLOYEE_ID` varchar(36) DEFAULT NULL,
  `PROCESS_APPROVER` varchar(36) DEFAULT NULL,
  `PROCESS_CONTENT` varchar(500) NOT NULL,
  `PROCESS_STATE` int(11) NOT NULL,
  `PROCESS_START_TIME` datetime NOT NULL,
  `PROCESS_END_TIME` datetime NOT NULL,
  PRIMARY KEY (`PROCESS_ID`),
  KEY `FK_Reference_15` (`PROCESS_EMPLOYEE_ID`),
  KEY `FK_Reference_26` (`PROCESS_APPROVER`),
  CONSTRAINT `FK_Reference_15` FOREIGN KEY (`PROCESS_EMPLOYEE_ID`) REFERENCES `employee` (`EMPLOYEE_ID`),
  CONSTRAINT `FK_Reference_26` FOREIGN KEY (`PROCESS_APPROVER`) REFERENCES `employee` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of process
-- ----------------------------
INSERT INTO `process` VALUES ('0b0fdf1c-42b7-47f9-bccf-0c1f7f5ce5ec', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '17447643-98fa-4165-ac90-b8b8c62b36b6', '和“成都市青羊区高联培训学校”客户谈价钱', '-1', '2017-04-20 09:05:00', '2017-04-20 11:15:00');
INSERT INTO `process` VALUES ('150c6702-ad2a-464a-b51f-ebf98da8666e', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '17447643-98fa-4165-ac90-b8b8c62b36b6', '福州有一所幼儿园正准备购买“家校通”系统。和学校负责人推销我司的“微瞳手机客户端”产品。', '0', '2017-04-27 14:00:00', '2017-04-27 18:05:00');
INSERT INTO `process` VALUES ('50fdfbf9-e9b7-44f5-af11-bd4038df0b88', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '17447643-98fa-4165-ac90-b8b8c62b36b6', '给“成都市青羊区高联培训学校”讲解软件使用方法', '1', '2017-04-23 09:10:00', '2017-04-23 16:00:00');
INSERT INTO `process` VALUES ('7a4debfd-810f-4888-b5f2-0551c26ec58c', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '17447643-98fa-4165-ac90-b8b8c62b36b6', 'test 。。', '1', '2017-04-23 14:45:00', '2017-04-23 14:45:00');
INSERT INTO `process` VALUES ('7be2d19e-7bd0-4bca-8400-f90c0caeb45c', '24ce2172-3ae5-44cb-9093-046af7df2267', '17447643-98fa-4165-ac90-b8b8c62b36b6', '协助周八去福州销售“微瞳手机客户端”', '0', '2017-04-27 14:00:00', '2017-04-27 18:00:00');
INSERT INTO `process` VALUES ('e0e14d0f-8df6-457d-8d65-d9e67ac79624', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '17447643-98fa-4165-ac90-b8b8c62b36b6', '去“成都圣达第三幼儿园”进一步交涉', '1', '2017-05-04 09:05:00', '2017-05-05 18:00:00');
INSERT INTO `process` VALUES ('ea43aac5-d1d5-4926-8a89-62120410e59b', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '17447643-98fa-4165-ac90-b8b8c62b36b6', '和“成都市青羊区高联培训学校”客户谈需求', '1', '2017-04-19 14:45:00', '2017-04-19 18:00:00');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `PRODUCT_ID` varchar(36) NOT NULL,
  `PRODUCT_NAME` varchar(200) NOT NULL,
  `PRODUCT_PRICE` decimal(10,2) NOT NULL,
  `PRODUCT_PDF` varchar(400) DEFAULT NULL,
  `PRODUCT_NUM` varchar(10) NOT NULL,
  `PRODUCT_DETAIL` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('28453474-651b-4ebe-8d3f-7e51f3c73ada', 'wdaasdsa', '11111111.11', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\28453474-651b-4ebe-8d3f-7e51f3c73ada.pdf', 'DX09607', 'asd');
INSERT INTO `product` VALUES ('36b445d1-d3b0-4fbc-8876-7c99a1320125', '6SQ统计for Excel 3.1', '1750.00', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\36b445d1-d3b0-4fbc-8876-7c99a1320125.pdf', 'DX02896', '一款整合Excel国产唯一综合质量统计分析软件,是质量数据分析的完美\r\n工具。特点：小巧，易用，经济，灵活，实用。');
INSERT INTO `product` VALUES ('36c14a34-e58c-483d-a69b-8c728139f43d', '易百发营销系统', '2300000.00', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\36c14a34-e58c-483d-a69b-8c728139f43d.pdf', 'DX09567', '一.网站信息群发\r\n二.信息同步\r\n三.可视化发布\r\n四.随机变量\r\n五.短信群发功能\r\n六.邮件群发功能\r\n七.名录采集\r\n八.增值服务');
INSERT INTO `product` VALUES ('559f6b42-9465-48cc-8922-008e7e0da980', '微瞳手机客户端', '150000.00', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\559f6b42-9465-48cc-8922-008e7e0da980.pdf', 'DX04028', '一款由中企云软推出的家长/教师，手机客户端。该款app软件广泛使用于幼儿园、学校、培训团体等教育机构，用于发布和查看食谱、作业、课程、学员动态等信息，家长或学员只需在手机安装微瞳手机客户端app软件，即可掌中了解各种教育机构信息，家长可即时了解孩子动态。');
INSERT INTO `product` VALUES ('9c10ada0-ef0a-487f-b463-8cd8f688a984', '智能量化决策软件', '300000.00', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\9c10ada0-ef0a-487f-b463-8cd8f688a984.pdf', 'DX02794', '明天的行情涨与跌，永远是我们关心的问题。战略家在研究行情涨跌路上永不停息。致力于用简单方式告诉您行情涨跌。');
INSERT INTO `product` VALUES ('f279147c-ff66-4c93-92e5-d77e7631e90c', '一米超级长尾关键词工具V-20161212171040版', '8902900.00', 'E:\\works\\apache-tomcat-7.0.75\\wtpwebapps\\simpleCRM-PDF\\f279147c-ff66-4c93-92e5-d77e7631e90c.pdf', 'DX05486', '热门推荐关键词是用户搜索次数较多，并且跟当前关键词匹配度较高的关键词，也就是通常见到的下拉搜索框相关关键词，一米超级长尾关\r\n键词工具可以抓取百度、谷歌、雅虎、亚马逊、阿里巴巴、速卖通等的热门推荐关键词，无限制提取。支持全球小语种，自动去重，智能延伸\r\n拓展词，自动语意归类等。');

-- ----------------------------
-- Table structure for `sales_stage`
-- ----------------------------
DROP TABLE IF EXISTS `sales_stage`;
CREATE TABLE `sales_stage` (
  `SALES_STAGE_ID` varchar(36) NOT NULL,
  `SALES_STAGE_NAME` varchar(20) NOT NULL,
  `RATE_OF_PROGRESS` int(11) NOT NULL,
  PRIMARY KEY (`SALES_STAGE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sales_stage
-- ----------------------------
INSERT INTO `sales_stage` VALUES ('011bc899-0d4c-11e7-9e9d-28d2444b860a', '谈判协商(80%)', '80');
INSERT INTO `sales_stage` VALUES ('053bd26b-0d4c-11e7-9e9d-28d2444b860a', '赢单(100%)', '100');
INSERT INTO `sales_stage` VALUES ('0b16581b-0d4c-11e7-9e9d-28d2444b860a', '输单(0%)', '0');
INSERT INTO `sales_stage` VALUES ('ddc2e328-0d4b-11e7-9e9d-28d2444b860a', '初步沟通(10%)', '10');
INSERT INTO `sales_stage` VALUES ('fbf40d99-0d4b-11e7-9e9d-28d2444b860a', '方案报价(50%)', '50');

-- ----------------------------
-- Table structure for `task`
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `TASK_ID` varchar(36) NOT NULL,
  `BUSINESS_OPPORTUNITY_ID_TASK` varchar(36) DEFAULT NULL,
  `SPONSOR_ID_TASK` varchar(36) DEFAULT NULL,
  `FOLLOW_EMPLOYEE_ID_TASK` varchar(36) DEFAULT NULL,
  `TASK_CONTENT` varchar(200) NOT NULL,
  `TASK_REPORT_DATE` datetime NOT NULL,
  `TASK_START_TIME` datetime NOT NULL,
  `TASK_END_TIME` datetime NOT NULL,
  `TASK_STOP` int(11) NOT NULL,
  PRIMARY KEY (`TASK_ID`),
  KEY `FK_Reference_19` (`FOLLOW_EMPLOYEE_ID_TASK`),
  KEY `FK_Reference_20` (`BUSINESS_OPPORTUNITY_ID_TASK`),
  KEY `FK_Reference_25` (`SPONSOR_ID_TASK`),
  CONSTRAINT `FK_Reference_19` FOREIGN KEY (`FOLLOW_EMPLOYEE_ID_TASK`) REFERENCES `employee` (`EMPLOYEE_ID`),
  CONSTRAINT `FK_Reference_20` FOREIGN KEY (`BUSINESS_OPPORTUNITY_ID_TASK`) REFERENCES `business_opportunity` (`BUSINESS_OPPORTUNITY_ID`),
  CONSTRAINT `FK_Reference_25` FOREIGN KEY (`SPONSOR_ID_TASK`) REFERENCES `employee` (`EMPLOYEE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------
INSERT INTO `task` VALUES ('0c59cbda-7f1f-4c90-8b4f-838470d6a06a', '2bc95698-b2b9-4e62-8267-52296d3ccfbc', '17447643-98fa-4165-ac90-b8b8c62b36b6', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '商讨谈判协商的时间和地点', '2017-04-21 00:00:00', '2017-04-29 00:00:00', '2017-05-03 00:00:00', '0');
INSERT INTO `task` VALUES ('675c2fdc-c813-4178-b3f3-1ca34a0a9cda', '2bc95698-b2b9-4e62-8267-52296d3ccfbc', '17447643-98fa-4165-ac90-b8b8c62b36b6', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '给客户反馈的问题整理一下，尽快回复客户', '2017-04-21 00:00:00', '2017-04-21 00:00:00', '2017-04-22 00:00:00', '0');
INSERT INTO `task` VALUES ('a554493f-f758-4a59-a041-f657055a080a', 'a779dd65-393a-402e-b768-512748072197', '17447643-98fa-4165-ac90-b8b8c62b36b6', '4d927c0f-48f8-44b2-81be-fb042182bf4d', '去客户现场，谈需求', '2017-04-19 00:00:00', '2017-04-19 00:00:00', '2017-04-20 00:00:00', '1');
INSERT INTO `task` VALUES ('b71ddc44-de27-4c4a-9944-c4d20e56b189', '2bc95698-b2b9-4e62-8267-52296d3ccfbc', '17447643-98fa-4165-ac90-b8b8c62b36b6', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '第三次任务', '2017-04-21 00:00:00', '2017-04-26 00:00:00', '2017-04-27 00:00:00', '0');
INSERT INTO `task` VALUES ('eb0a771f-0480-4316-a501-0c925e2b467c', '790f785e-1454-4089-89a1-2f74cb2eeaf3', '17447643-98fa-4165-ac90-b8b8c62b36b6', '53b4da74-9b0b-4dfa-9a27-eaac146fae49', '和客户取得联系，花两天时间去现场和客户进一步交涉。', '2017-04-21 00:00:00', '2017-05-04 00:00:00', '2017-05-05 00:00:00', '0');

-- ----------------------------
-- Table structure for `userrole`
-- ----------------------------
DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `USERROLE_ID` varchar(36) NOT NULL,
  `USERROLE_NAME` varchar(20) NOT NULL,
  `USERROLE_EXPLAIN` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`USERROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userrole
-- ----------------------------
INSERT INTO `userrole` VALUES ('10988d26-0986-11e7-b918-28d2444b860a', '管理员', '管理员');
INSERT INTO `userrole` VALUES ('57695387-0987-11e7-b918-28d2444b860a', '销售人员', '销售人员');
INSERT INTO `userrole` VALUES ('5e8d627f-0987-11e7-b918-28d2444b860a', '部门经理', '部门经理');
INSERT INTO `userrole` VALUES ('6566dff0-0987-11e7-b918-28d2444b860a', '总经理', '总经理');

-- ----------------------------
-- Table structure for `userrole_authority`
-- ----------------------------
DROP TABLE IF EXISTS `userrole_authority`;
CREATE TABLE `userrole_authority` (
  `USERROLE_AUTHORITY_ID` varchar(36) NOT NULL,
  `USERROLE_ID` varchar(36) NOT NULL,
  `AUTHORITY_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`USERROLE_AUTHORITY_ID`),
  KEY `FK_Reference_1` (`USERROLE_ID`),
  KEY `FK_Reference_2` (`AUTHORITY_ID`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`USERROLE_ID`) REFERENCES `userrole` (`USERROLE_ID`),
  CONSTRAINT `FK_Reference_2` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `authority` (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userrole_authority
-- ----------------------------
INSERT INTO `userrole_authority` VALUES ('001137cb-a208-4736-88ad-a24da230eb4c', '57695387-0987-11e7-b918-28d2444b860a', '10c42c6f-0d91-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('05be4d4a-7c63-4b51-88da-1ce4b65c13a1', '10988d26-0986-11e7-b918-28d2444b860a', '10c42c6f-0d91-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('10260b89-e367-4444-916e-fd55a6013828', '5e8d627f-0987-11e7-b918-28d2444b860a', '769c7965-1394-11e7-aa71-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('125b98c9-8e27-4e50-b0b6-8d6b4454d26e', '5e8d627f-0987-11e7-b918-28d2444b860a', '96dd987b-1138-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('19fab2f0-8305-4e92-9871-31ae3a4d0b2a', '57695387-0987-11e7-b918-28d2444b860a', '34a71c5d-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('1bae54fc-4390-4379-a7bf-198ac10bd953', '10988d26-0986-11e7-b918-28d2444b860a', '8699fb77-0ace-11e7-a1cf-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('226b69d7-dde6-4665-a6cf-c0ea69007033', '6566dff0-0987-11e7-b918-28d2444b860a', '96dd987b-1138-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('3320ec72-5a51-4651-9214-1a8a50b19719', '10988d26-0986-11e7-b918-28d2444b860a', '1102a510-16a9-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('42b07e06-eb08-4d52-9482-f47e02a14f10', '10988d26-0986-11e7-b918-28d2444b860a', 'e23df149-1686-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('43669e14-4e87-41df-865e-51b50f34f556', '6566dff0-0987-11e7-b918-28d2444b860a', 'b3184bfb-0bfc-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('44c46409-4fe5-4976-b330-14c15b81e1ae', '10988d26-0986-11e7-b918-28d2444b860a', '34a71c5d-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('4a903b38-00eb-4b94-bc3b-eef1f396184d', '6566dff0-0987-11e7-b918-28d2444b860a', '4d8a6d36-0a3d-11e7-8d42-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('4c8a6e5d-567e-40f9-8eee-44b864443c26', '5e8d627f-0987-11e7-b918-28d2444b860a', '10c42c6f-0d91-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('584e27ed-46d7-4e13-82cc-85698435a61a', '10988d26-0986-11e7-b918-28d2444b860a', '8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('598ddfea-5345-4823-92f8-2578bda11c64', '10988d26-0986-11e7-b918-28d2444b860a', 'fb9ccbab-0ac3-11e7-991c-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('5bc4d7aa-e48e-4645-b01e-b13aae6f8986', '10988d26-0986-11e7-b918-28d2444b860a', 'b7b79e68-0beb-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('6633cd38-6dcd-4494-a01c-494f09d9e23f', '57695387-0987-11e7-b918-28d2444b860a', 'a4a35af4-167f-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('68babfbb-067e-4407-a04f-e3a4044fb2ca', '5e8d627f-0987-11e7-b918-28d2444b860a', 'b3184bfb-0bfc-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('6ad73988-4ca9-4568-ac25-32c8edb8aba4', '57695387-0987-11e7-b918-28d2444b860a', '7584310e-1030-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('6c048d32-77ef-46e2-8b83-d4ef1e3ba271', '10988d26-0986-11e7-b918-28d2444b860a', '6fb1f7c9-0a3d-11e7-8d42-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('752239ca-3ecd-4792-aac0-abc405f98bc2', '6566dff0-0987-11e7-b918-28d2444b860a', '8d1bacfa-0ac3-11e7-991c-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('80fe4de4-473c-41a4-a6c3-84904166fcc0', '10988d26-0986-11e7-b918-28d2444b860a', '2ff28e74-0c0c-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('89a02f44-9ca7-4fef-84ad-2a25efb9ea25', '10988d26-0986-11e7-b918-28d2444b860a', '4d8a6d36-0a3d-11e7-8d42-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('8edcf735-b8d4-4c6f-a354-0b4b30e9c6e6', '5e8d627f-0987-11e7-b918-28d2444b860a', '96151773-102f-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('9565b418-7adc-4c67-9d04-1d9b75f48466', '6566dff0-0987-11e7-b918-28d2444b860a', '6fb1f7c9-0a3d-11e7-8d42-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('9c23e37e-b32c-4a07-bd1b-0977fa8ca387', '5e8d627f-0987-11e7-b918-28d2444b860a', '34a71c5d-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('a0885cda-760f-4b4c-9c0e-fd0f40d4ef8c', '5e8d627f-0987-11e7-b918-28d2444b860a', '06765f5e-0f9e-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('a1852e73-1553-4df0-a919-b671d409ebb8', '6566dff0-0987-11e7-b918-28d2444b860a', '10c42c6f-0d91-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('ab4b8226-2101-4d92-947d-692a866ce61f', '6566dff0-0987-11e7-b918-28d2444b860a', '96151773-102f-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('cc36b82f-9b31-4dce-9701-e7d1b1283671', '10988d26-0986-11e7-b918-28d2444b860a', '523c4eee-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('db769504-4f25-464b-9868-68b00d5e37d7', '5e8d627f-0987-11e7-b918-28d2444b860a', '523c4eee-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('dd50d7a8-d77e-42cf-954b-3c860c36adfc', '10988d26-0986-11e7-b918-28d2444b860a', 'b3184bfb-0bfc-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('df089cca-2033-4738-b0ba-2f5aed85206e', '5e8d627f-0987-11e7-b918-28d2444b860a', 'e23df149-1686-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('df89bcee-158e-41f3-a253-ce48343b241f', '6566dff0-0987-11e7-b918-28d2444b860a', 'e23df149-1686-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('e15bca67-c356-4d7f-917f-33624fdf31db', '10988d26-0986-11e7-b918-28d2444b860a', '96151773-102f-11e7-8663-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('e3de01ec-82aa-4f02-bc2a-db07dff730f6', '6566dff0-0987-11e7-b918-28d2444b860a', '34a71c5d-0d3b-11e7-9e9d-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('e75c7a48-83df-4a67-ac07-ad9b0191e250', '6566dff0-0987-11e7-b918-28d2444b860a', '1102a510-16a9-11e7-a0f7-94de80188a22');
INSERT INTO `userrole_authority` VALUES ('f4793c64-97f5-4db4-b45c-c0ea3e3cd8b2', '10988d26-0986-11e7-b918-28d2444b860a', '346093a3-0a3d-11e7-8d42-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('fb0e3d49-c955-4a41-9163-54e3affd1a24', '10988d26-0986-11e7-b918-28d2444b860a', '8d1bacfa-0ac3-11e7-991c-28d2444b860a');
INSERT INTO `userrole_authority` VALUES ('fd296f9d-8e07-404c-b562-4b338afa60e9', '5e8d627f-0987-11e7-b918-28d2444b860a', '8ee8e7eb-0ca9-11e7-9e9d-28d2444b860a');
