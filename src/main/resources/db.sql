
-- 创建学生表
CREATE TABLE student(
	id INT auto_increment COMMENT '主键自增',
	name varchar(20) NOT NULL COMMENT '姓名',
	password varchar(32) NOT NULL COMMENT '密码',
	sex CHAR NOT NULL COMMENT '性别,M : 男性，F : 女性',
	PRIMARY KEY (id)
)

--课程表
CREATE TABLE course(
	id INT auto_increment PRIMARY KEY COMMENT '课程id',
	name varchar(20) NOT NULL COMMENT '名称',git
	credit SMALLINT NOT NULL COMMENT '学分',
	lession_hour SMALLINT NOT NULL COMMENT '课时',
	Key idx_name (`name`) USING BTREE
)

-- 选课表
CREATE TABLE stu_course(
	id INT auto_increment PRIMARY KEY COMMENT '主键',
	stu_id INT NOT NULL COMMENT '学生ID',
	course_id INT NOT NULL COMMENT '课程ID',
	score INT NOT NULL COMMENT '分数',
	KEY idx_stu_id (`stu_id`)
)


