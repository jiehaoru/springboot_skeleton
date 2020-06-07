Springboot 相关骨架的集成
*****************************************************************************************************
这是一个学习的过程，在参考网上各种博客以及成功的项目后，我会尝试将其中的某些组件添加进这个工程里！！！
*****************************************************************************************************
1.关于反向生成工具generator的配置，参考博客：

https://blog.csdn.net/lettuce_/article/details/99725550

https://blog.csdn.net/winter_chen001/article/details/77249029

2.关于Mybatis的集成，配置，参考博客：

https://blog.csdn.net/lettuce_/article/details/101375865

https://blog.csdn.net/chengqiuming/article/details/84033510

3. 集成 mybatie-plus

*************************************************************************************************
postman调用

*****************************************************************************************************
book表的sql脚本
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `book_id` int(10) NOT NULL,
  `book_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `book_number` int(10) NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (1, '三国演义', 1);
INSERT INTO `t_book` VALUES (2, '水浒传', 10);
INSERT INTO `t_book` VALUES (3, '西游记', 100);
INSERT INTO `t_book` VALUES (4, '红楼梦', 1000);

SET FOREIGN_KEY_CHECKS = 1;

******************************************************************************************************
