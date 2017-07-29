

-- 管理员-用户信息
create or replace view v_admin_user
as
select * 
FROM
cp_admin_user;

-- 角色和用户关系
create or replace view v_admin_role_user
as
SELECT
a.adminId,
a.adminPwd,
a.adminName,
a.adminJoin,
b.roleId,
b.roleName,
c.urid
FROM
cp_admin_user AS a,cp_admin_role AS b,cp_admin_role_user AS c 
where c.adminId = a.adminId AND c.roleId = b.roleId ;




-- 角色和URL资源关系
CREATE OR REPLACE VIEW v_admin_role_url
AS
SELECT
a.uId,
a.url,
a.uName,
a.uTitle,
a.uParentId,
a.uType,
a.uCsscls,
b.roleId,
b.roleName,
c.ruId
FROM
cp_admin_url AS a,cp_admin_role AS b,cp_admin_role_url AS c 
where a.uId=c.uId AND b.roleId=c.roleId ;


-- 所有用户和角色的关系
create or replace view v_admin_role_alluser
as
SELECT
a.adminId,
a.adminPwd,
a.adminName,
a.adminJoin,
b.roleId,
b.roleName,
c.urid
FROM
cp_admin_user AS a 
CROSS  JOIN cp_admin_role AS b
LEFT JOIN cp_admin_role_user AS c on c.adminId = a.adminId AND c.roleId = b.roleId ;




-- 所有URL资源和角色关系
CREATE OR REPLACE VIEW v_admin_role_allurl
AS
SELECT
a.uId,
a.url,
a.uName,
a.uTitle,
a.uParentId,
a.uType,
a.uCsscls,
b.roleId,
b.roleName,
c.ruId
FROM
cp_admin_url AS a
CROSS  JOIN cp_admin_role AS b
LEFT JOIN cp_admin_role_url AS c on a.uId=c.uId AND b.roleId=c.roleId ;


-- 管理用户的资源列表
create or replace view v_admin_user_url
as
SELECT DISTINCT
a.adminId,
c.uId,
c.url,
c.uName,
c.uTitle,
c.uParentId,
c.uType,
c.uCsscls
FROM
cp_admin_role_user AS a
INNER JOIN cp_admin_role_url AS b ON a.roleId = b.roleId
INNER JOIN cp_admin_url AS c ON b.uId = c.uId ;









