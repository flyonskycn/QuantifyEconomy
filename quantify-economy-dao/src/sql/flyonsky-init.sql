

-- 系统初始化用户

-- 系统管理URL资源和默认用户
insert into cp_admin_user(adminId,adminPwd,headerpic,adminName,admindesc,adminJoin) values(1,'c7dbd7a41068a5ad94e6fc681601617d','http://wx.qlogo.cn/mmopen/b2lJCPXL9icsFoJw3NXaibSw8axuzqBibeuEiazJNFDoqjzohUCcTdfc9M3U4x8pMRgC4qib0ia8JfJmgAP0UroAnicKbIGe7gs0DHI/0','admin','超级管理员','2017-04-25 17:23:50');
insert into cp_admin_role values(1,'administrators');
insert into cp_admin_role_user values(1,1,1);
	
	