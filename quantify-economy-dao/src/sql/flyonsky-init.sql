

-- 系统初始化用户

-- 系统管理URL资源和默认用户
insert into cp_admin_user(adminId,adminPwd,headerpic,adminName,admindesc,adminJoin) values(1,'c7dbd7a41068a5ad94e6fc681601617d','http://wx.qlogo.cn/mmopen/b2lJCPXL9icsFoJw3NXaibSw8axuzqBibeuEiazJNFDoqjzohUCcTdfc9M3U4x8pMRgC4qib0ia8JfJmgAP0UroAnicKbIGe7gs0DHI/0','admin','超级管理员','2017-04-25 17:23:50');
insert into cp_admin_role values(1,'administrators');
insert into cp_admin_role_user values(1,1,1);
	

insert into cp_admin_url values(10,null,'ANALYZE','数据分析',0,1,'fa-user-secret text-gray'),
(1001,'/admin/pdf/index.co','ANALYZE.PDF','年报PDF管理',10,0,''),
	(10011,'/admin/pdf/upload.co','ADMIN.PDF.UPLOAD','年报文件上传',1001,2,''),
(1002,'/admin/annual/index.co','ANALYZE.ANNUAL','年报处理',10,0,''),
	(10021,'/admin/annual/review.co','ANALYZE.ANNUAL.REVIEW','年报编辑',1002,2,''),
	(10022,'/admin/annual/saveannual.co','ANALYZE.ANNUAL.SAVEANNUAL','保存',1002,2,''),
(1003,'/admin/analyser/salevertical.co','ANALYZE.ANALYSER.SALESVERTICAL','销售分析-纵向',10,0,''),
	(10031,'/admin/analyser/sales.co','ANALYZE.ANALYSER.SALES','销售数据查询',1003,2,''),
	(10032,'/admin/analyser/salesrate.co','ANALYZE.ANALYSER.SALESRATE','销售比率查询',1003,2,'')
(1004,'/admin/analyser/securityvertical.co','ANALYZE.ANALYSER.SECURITYVERTICAL','证券主要指标-纵向',10,0,''),
	(10041,'/admin/analyser/securities.co','ANALYZE.ANALYSER.SECURITIES','证券主要指标查询',1004,2,''),
	(10042,'/admin/analyser/securitiesrate.co','ANALYZE.ANALYSER.SECURITIESRATE','证券主要指标比率查询',1004,2,'');
	

insert into cp_admin_url values(99,null,'ADMIN','系统管理',0,1,'fa-user-secret text-gray'),
(9901,'/admin/role/index.co','ADMIN.ROLE','角色管理',99,0,''),
	(99011,'/admin/role/query.co','ADMIN.ROLE.QUERY','角色查询',9901,2,''),
	(99012,'/admin/role/info.co','ADMIN.ROLE.INFO','角色编辑',9901,2,''),
	(99013,'/admin/role/save.co','ADMIN.ROLE.SAVE','角色保存',9901,2,''),
(9903,'/admin/user/index.co','ADMIN.USER','管理员用户列表',99,1,''),
	(99031,'/admin/user/query.co','ADMIN.USER.QUERY','用户查询',9903,2,''),
	(99032,'/admin/user/info.co','ADMIN.USER.INFO','用户编辑',9903,2,''),
	(99033,'/admin/user/save.co','ADMIN.USER.SAVE','用户保存',9903,2,''),
	(99152,'/admin/user/getUrls.co','URLS','查询角色组的权限树',9903,2,''),
(9912,'/admin/log/index.co','ADMIN.OPLOG','管理日志',99,0,''),
	(99121,'/admin/log/query.co','ADMIN.OPLOG.QUERY','日志查询',9912,2,''),
	(99122,'/admin/log/export.co','ADMIN.OPLOG.EXPORT','日志导出',9912,2,'');
insert into cp_admin_role_url(uid,roleid) select uid,1 from cp_admin_url;

