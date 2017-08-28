/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/8/28 10:01:43                           */
/*==============================================================*/


drop table if exists cp_admin_log;

drop table if exists cp_admin_role;

drop table if exists cp_admin_role_url;

drop table if exists cp_admin_role_user;

drop table if exists cp_admin_url;

drop table if exists cp_admin_user;

drop table if exists cp_annualreport;

drop table if exists cp_config;

drop table if exists cp_industry;

drop table if exists cp_industrysecury;

drop table if exists cp_report_chart;

drop table if exists cp_report_page;

drop table if exists cp_report_pagechart;

drop index Index_1 on cp_securities;

drop table if exists cp_securities;

/*==============================================================*/
/* Table: cp_admin_log                                          */
/*==============================================================*/
create table cp_admin_log
(
   logid                bigint not null auto_increment comment '日志ID',
   uId                  bigint,
   adminId              bigint,
   adminname            varchar(50) comment '管理用户名',
   opstart              datetime comment '开始时间',
   optime               int comment '操作耗时(毫秒)',
   putitle              varchar(100) comment '父资源标题',
   utitle               varchar(100) comment '资源标题',
   opcontent            varchar(500) comment '操作内容',
   opstatus             varchar(50) comment '操作结果',
   primary key (logid)
);

alter table cp_admin_log comment '-管理日志';

/*==============================================================*/
/* Table: cp_admin_role                                         */
/*==============================================================*/
create table cp_admin_role
(
   roleId               bigint not null auto_increment comment '角色ID',
   roleName             varchar(50) not null comment '角色名称',
   primary key (roleId),
   unique key AK_Key_2 (roleName)
);

alter table cp_admin_role comment '管理角色';

/*==============================================================*/
/* Table: cp_admin_role_url                                     */
/*==============================================================*/
create table cp_admin_role_url
(
   ruId                 bigint not null auto_increment comment '角色资源ID',
   uId                  bigint,
   roleId               bigint,
   primary key (ruId)
);

alter table cp_admin_role_url comment '角色与资源关系';

/*==============================================================*/
/* Table: cp_admin_role_user                                    */
/*==============================================================*/
create table cp_admin_role_user
(
   urid                 bigint not null auto_increment,
   adminId              bigint,
   roleId               bigint,
   primary key (urid)
);

alter table cp_admin_role_user comment '管理角色用户关系';

/*==============================================================*/
/* Table: cp_admin_url                                          */
/*==============================================================*/
create table cp_admin_url
(
   uId                  bigint not null auto_increment comment 'url资源ID',
   url                  varchar(250) comment 'url连接',
   uName                varchar(100) not null comment '资源唯一名称',
   uTitle               varchar(100) not null comment '资源标题',
   uParentId            bigint not null comment '父级资源ID',
   uType                int not null comment '资源类型：0视图，1目录，2操作',
   uCsscls              varchar(50) comment '资源图标样式',
   primary key (uId),
   unique key AK_Key_2 (uName)
);

alter table cp_admin_url comment '管理URL资源库';

/*==============================================================*/
/* Table: cp_admin_user                                         */
/*==============================================================*/
create table cp_admin_user
(
   adminId              bigint not null auto_increment comment '管理用户ID',
   adminEmail           varchar(100) comment '工作邮箱',
   adminPwd             varchar(50) not null comment '管理密码',
   adminName            varchar(50) not null comment '管理名称',
   headerpic            varchar(255),
   admindesc            varchar(64) not null,
   adminJoin            datetime not null comment '加入时间',
   loginTime            datetime,
   location             varchar(20),
   primary key (adminId)
);

alter table cp_admin_user comment '后台用户关系';

/*==============================================================*/
/* Table: cp_annualreport                                       */
/*==============================================================*/
create table cp_annualreport
(
   id                   int not null auto_increment,
   code                 varchar(32) not null comment '股票代码',
   year                 int not null comment '年',
   revenue              decimal(20,2) comment '营业收入',
   operprofit           decimal(20,2) comment '营业利润',
   totalprofit          decimal(20,2) comment '利润总额',
   netprofit            decimal(20,2) comment '净利润',
   shnetprofit          decimal(20,2) comment '归属于本行股东的净利润',
   deshnetprofit        decimal(20,2) comment '扣除非经常性损益后归属于股东的净利润',
   netcashflow          decimal(20,2) comment '经营活动产生的现金流量净额',
   totalassets          decimal(20,2) comment '总资产',
   totalliability       decimal(20,2) comment '总负债',
   shequity             decimal(20,2) comment '股东权益',
   totalshares          bigint comment '股份总数',
   remark               varchar(256) comment '备注',
   primary key (id)
);

/*==============================================================*/
/* Table: cp_config                                             */
/*==============================================================*/
create table cp_config
(
   cfgkey               varchar(64) not null comment '配置KEY',
   cfgpkey              varchar(200) comment '父配置KEY',
   cfgname              varchar(200) not null comment '配置名称',
   cfgvalue             varchar(2000) comment '配置数据',
   cfgtype              varchar(10) comment '配置类型:text,number,datetime,email',
   cfgdesc              varchar(200) comment '配置说明',
   cfgregex             varchar(200) comment '配置输入规则:',
   cfglist              varchar(500) comment '配置待选列表JSON',
   cfgsort              int comment '配置ID，用于排序',
   primary key (cfgkey)
);

/*==============================================================*/
/* Table: cp_industry                                           */
/*==============================================================*/
create table cp_industry
(
   id                   int not null auto_increment,
   industryid           int,
   name                 varchar(64) not null comment '行业名称',
   primary key (id)
);

alter table cp_industry comment '行业大类';

/*==============================================================*/
/* Table: cp_industrysecury                                     */
/*==============================================================*/
create table cp_industrysecury
(
   id                   int not null auto_increment,
   industryid           int not null comment '行业ID',
   code                 varchar(32) not null,
   remart               varchar(128),
   primary key (id)
);

alter table cp_industrysecury comment '行业与证券表';

/*==============================================================*/
/* Table: cp_report_chart                                       */
/*==============================================================*/
create table cp_report_chart
(
   chartid              int not null comment '图表ID',
   chartname            varchar(100) not null comment '图标名称',
   chartdesc            varchar(255) comment '图标描述',
   charttype            varchar(8) not null comment '图表类型：grid,bar,line,column',
   chartsql             varchar(255) comment '图标sql数据',
   nitems               varchar(255) comment '统计名称: name|名称,name2|名称2',
   vitems               varchar(255) comment '统计数值:value|值,value2|值2',
   yitems               varchar(255) comment '统计数值:value|值,value2|值2',
   primary key (chartid)
);

alter table cp_report_chart comment '报表图表项';

/*==============================================================*/
/* Table: cp_report_page                                        */
/*==============================================================*/
create table cp_report_page
(
   pageid               int not null,
   pagetitle            varchar(100),
   pagedesc             varchar(255),
   primary key (pageid)
);

alter table cp_report_page comment '报表页';

/*==============================================================*/
/* Table: cp_report_pagechart                                   */
/*==============================================================*/
create table cp_report_pagechart
(
   pcid                 bigint not null auto_increment,
   chartid              int comment '图表ID',
   pageid               int,
   sortid               int comment '升序',
   primary key (pcid)
);

alter table cp_report_pagechart comment '报表页和图表项的关系';

/*==============================================================*/
/* Table: cp_securities                                         */
/*==============================================================*/
create table cp_securities
(
   id                   int not null auto_increment,
   name                 varchar(64),
   code                 varchar(32),
   issuedate            date,
   exchange             varchar(64),
   primary key (id)
);

/*==============================================================*/
/* Index: Index_1                                               */
/*==============================================================*/
create unique index Index_1 on cp_securities
(
   code
);

alter table cp_admin_log add constraint FK_Reference_5 foreign key (uId)
      references cp_admin_url (uId) on delete restrict on update restrict;

alter table cp_admin_log add constraint FK_Reference_6 foreign key (adminId)
      references cp_admin_user (adminId) on delete restrict on update restrict;

alter table cp_admin_role_url add constraint FK_Reference_3 foreign key (uId)
      references cp_admin_url (uId) on delete restrict on update restrict;

alter table cp_admin_role_url add constraint FK_Reference_4 foreign key (roleId)
      references cp_admin_role (roleId) on delete restrict on update restrict;

alter table cp_admin_role_user add constraint FK_Reference_1 foreign key (adminId)
      references cp_admin_user (adminId) on delete restrict on update restrict;

alter table cp_admin_role_user add constraint FK_Reference_2 foreign key (roleId)
      references cp_admin_role (roleId) on delete restrict on update restrict;

alter table cp_report_pagechart add constraint FK_Reference_35 foreign key (chartid)
      references cp_report_chart (chartid) on delete restrict on update restrict;

alter table cp_report_pagechart add constraint FK_Reference_36 foreign key (pageid)
      references cp_report_page (pageid) on delete restrict on update restrict;

