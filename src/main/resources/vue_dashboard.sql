# 创建数据库
create database vue_dashboard default character set utf8;

# 用户表
create table `sys_user` (
  `id` varchar(64) not null comment 'id',
  `login_name` varchar(100) not null comment '登录名',
  `pwd` varchar(100) not null comment '密码',
  `user_no` varchar(100) default null comment '工号',
  `user_name` varchar(100) default null comment '姓名',
  `email` varchar(100) default null comment '邮箱',
  `phone` varchar(64) default null comment '电话',
  `mobile` varchar(64) default null comment '手机',
  `user_type` char(1) default null comment '用户类型[0:user,1:admin,2:super]',
  `photo` varchar(1000) default null comment '用户头像',
  `login_ip` varchar(100) default null comment '最后登陆IP',
  `login_time_last` datetime default null comment '最后登陆时间',
  `login_flag` char(1) not null default '1' comment '是否可登录[1:允许,0:不允许]',
  `create_by` varchar(64) not null comment '创建者id',
  `create_time` datetime not null comment '创建时间',
  `update_by` varchar(64) not null comment '更新者id',
  `update_time` datetime not null comment '更新时间',
  `remarks` varchar(255) default null comment '备注信息',
  `del_flag` char(1) not null default '0' comment '删除标记[1:删除]',
  primary key (`id`)
) engine=innodb default charset=utf8 comment='用户表';




insert into sys_user 
      (id,login_name,pwd,user_no,user_name,email,phone,mobile,create_by,create_time,update_by,update_time) 
values
('01','admin','admin','no-0001','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('02','cs','cs','no-0002','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('03','zs','zs','no-0003','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('04','admin4','admin','no-0004','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('05','admin5','admin','no-0005','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('06','admin6','admin','no-0006','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('07','admin7','admin','no-0007','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('08','admin8','admin','no-0008','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('09','admin9','admin','no-0009','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('10','admin10','admin','no-00010','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('11','admin11','admin','no-00011','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('12','admin12','admin','no-00012','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now()),
('13','admin13','admin','no-00013','小五哥','ce@163.com','02188888888','13888888888','1',now(),'1',now());



