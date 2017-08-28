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
   logid                bigint not null auto_increment comment '��־ID',
   uId                  bigint,
   adminId              bigint,
   adminname            varchar(50) comment '�����û���',
   opstart              datetime comment '��ʼʱ��',
   optime               int comment '������ʱ(����)',
   putitle              varchar(100) comment '����Դ����',
   utitle               varchar(100) comment '��Դ����',
   opcontent            varchar(500) comment '��������',
   opstatus             varchar(50) comment '�������',
   primary key (logid)
);

alter table cp_admin_log comment '-������־';

/*==============================================================*/
/* Table: cp_admin_role                                         */
/*==============================================================*/
create table cp_admin_role
(
   roleId               bigint not null auto_increment comment '��ɫID',
   roleName             varchar(50) not null comment '��ɫ����',
   primary key (roleId),
   unique key AK_Key_2 (roleName)
);

alter table cp_admin_role comment '�����ɫ';

/*==============================================================*/
/* Table: cp_admin_role_url                                     */
/*==============================================================*/
create table cp_admin_role_url
(
   ruId                 bigint not null auto_increment comment '��ɫ��ԴID',
   uId                  bigint,
   roleId               bigint,
   primary key (ruId)
);

alter table cp_admin_role_url comment '��ɫ����Դ��ϵ';

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

alter table cp_admin_role_user comment '�����ɫ�û���ϵ';

/*==============================================================*/
/* Table: cp_admin_url                                          */
/*==============================================================*/
create table cp_admin_url
(
   uId                  bigint not null auto_increment comment 'url��ԴID',
   url                  varchar(250) comment 'url����',
   uName                varchar(100) not null comment '��ԴΨһ����',
   uTitle               varchar(100) not null comment '��Դ����',
   uParentId            bigint not null comment '������ԴID',
   uType                int not null comment '��Դ���ͣ�0��ͼ��1Ŀ¼��2����',
   uCsscls              varchar(50) comment '��Դͼ����ʽ',
   primary key (uId),
   unique key AK_Key_2 (uName)
);

alter table cp_admin_url comment '����URL��Դ��';

/*==============================================================*/
/* Table: cp_admin_user                                         */
/*==============================================================*/
create table cp_admin_user
(
   adminId              bigint not null auto_increment comment '�����û�ID',
   adminEmail           varchar(100) comment '��������',
   adminPwd             varchar(50) not null comment '��������',
   adminName            varchar(50) not null comment '��������',
   headerpic            varchar(255),
   admindesc            varchar(64) not null,
   adminJoin            datetime not null comment '����ʱ��',
   loginTime            datetime,
   location             varchar(20),
   primary key (adminId)
);

alter table cp_admin_user comment '��̨�û���ϵ';

/*==============================================================*/
/* Table: cp_annualreport                                       */
/*==============================================================*/
create table cp_annualreport
(
   id                   int not null auto_increment,
   code                 varchar(32) not null comment '��Ʊ����',
   year                 int not null comment '��',
   revenue              decimal(20,2) comment 'Ӫҵ����',
   operprofit           decimal(20,2) comment 'Ӫҵ����',
   totalprofit          decimal(20,2) comment '�����ܶ�',
   netprofit            decimal(20,2) comment '������',
   shnetprofit          decimal(20,2) comment '�����ڱ��йɶ��ľ�����',
   deshnetprofit        decimal(20,2) comment '�۳��Ǿ��������������ڹɶ��ľ�����',
   netcashflow          decimal(20,2) comment '��Ӫ��������ֽ���������',
   totalassets          decimal(20,2) comment '���ʲ�',
   totalliability       decimal(20,2) comment '�ܸ�ծ',
   shequity             decimal(20,2) comment '�ɶ�Ȩ��',
   totalshares          bigint comment '�ɷ�����',
   remark               varchar(256) comment '��ע',
   primary key (id)
);

/*==============================================================*/
/* Table: cp_config                                             */
/*==============================================================*/
create table cp_config
(
   cfgkey               varchar(64) not null comment '����KEY',
   cfgpkey              varchar(200) comment '������KEY',
   cfgname              varchar(200) not null comment '��������',
   cfgvalue             varchar(2000) comment '��������',
   cfgtype              varchar(10) comment '��������:text,number,datetime,email',
   cfgdesc              varchar(200) comment '����˵��',
   cfgregex             varchar(200) comment '�����������:',
   cfglist              varchar(500) comment '���ô�ѡ�б�JSON',
   cfgsort              int comment '����ID����������',
   primary key (cfgkey)
);

/*==============================================================*/
/* Table: cp_industry                                           */
/*==============================================================*/
create table cp_industry
(
   id                   int not null auto_increment,
   industryid           int,
   name                 varchar(64) not null comment '��ҵ����',
   primary key (id)
);

alter table cp_industry comment '��ҵ����';

/*==============================================================*/
/* Table: cp_industrysecury                                     */
/*==============================================================*/
create table cp_industrysecury
(
   id                   int not null auto_increment,
   industryid           int not null comment '��ҵID',
   code                 varchar(32) not null,
   remart               varchar(128),
   primary key (id)
);

alter table cp_industrysecury comment '��ҵ��֤ȯ��';

/*==============================================================*/
/* Table: cp_report_chart                                       */
/*==============================================================*/
create table cp_report_chart
(
   chartid              int not null comment 'ͼ��ID',
   chartname            varchar(100) not null comment 'ͼ������',
   chartdesc            varchar(255) comment 'ͼ������',
   charttype            varchar(8) not null comment 'ͼ�����ͣ�grid,bar,line,column',
   chartsql             varchar(255) comment 'ͼ��sql����',
   nitems               varchar(255) comment 'ͳ������: name|����,name2|����2',
   vitems               varchar(255) comment 'ͳ����ֵ:value|ֵ,value2|ֵ2',
   yitems               varchar(255) comment 'ͳ����ֵ:value|ֵ,value2|ֵ2',
   primary key (chartid)
);

alter table cp_report_chart comment '����ͼ����';

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

alter table cp_report_page comment '����ҳ';

/*==============================================================*/
/* Table: cp_report_pagechart                                   */
/*==============================================================*/
create table cp_report_pagechart
(
   pcid                 bigint not null auto_increment,
   chartid              int comment 'ͼ��ID',
   pageid               int,
   sortid               int comment '����',
   primary key (pcid)
);

alter table cp_report_pagechart comment '����ҳ��ͼ����Ĺ�ϵ';

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

