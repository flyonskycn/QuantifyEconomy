<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>日志列表</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    	
    <script type="text/javascript" charset="utf-8" src="<s:url value="/" />script/jquery-1.12.3.js"> </script>
    
    <link rel="stylesheet" type="text/css" href="/ext/bootstrap/css/bootstrap.css">	
	<script src="/ext/bootstrap/js/bootstrap.js"></script>
	
    <script type="text/javascript" charset="utf-8" src="<s:url value="/ext/jQuery/jquery.form.js" />"> </script>
    
    <link rel="stylesheet" type="text/css" href="/ext/jquery-ui/jquery-ui.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/jquery-ui/jquery-ui.min.js"></script>

    <link rel="stylesheet" type="text/css" href="/ext/bs_grid/jquery.bs_grid.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/bs_grid/jquery.bs_grid.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/bs_grid/localization/zh.min.js"></script>
	
	<!--  if timepicker is used in filters -->
	<link href="//cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/jquery-ui-timepicker-addon.css" rel="stylesheet">
	<script src="//cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/jquery-ui-timepicker-addon.js"></script>
	<script src="//cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/i18n/jquery-ui-timepicker-zh-CN.js"></script>
	
	<!--  required from filters plugin -->
	<script type="text/javascript" src="<s:url value="/" />ext/moment/moment.min.js"></script>

	<!--  PAGINATION plugin -->
	<link rel="stylesheet" type="text/css" href="/ext/bs_pagination/jquery.bs_pagination.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/bs_pagination/jquery.bs_pagination.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/bs_pagination/localization/zh.min.js"></script>
	 
	<!--  FILTERS plugin --> 
	<link rel="stylesheet" type="text/css" href="<s:url value="/" />ext/jui_filter_rules/jquery.jui_filter_rules.bs.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/jui_filter_rules/jquery.jui_filter_rules.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/jui_filter_rules/localization/zh.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/jquery.toaster.js"> </script>
	
	
	<script type="text/javascript" src="<s:url value="/" />js/wristband-admin.js"> </script>
	<style type="text/css">
        .cover{max-width:100px;max-height:35px;margin: -7px -7px -7px -7px;}
        .pull-left {
		    margin-right: 5px;
		}
    </style>
</head>
<body>
<div class="container-fluid">
    <h1>日志列表</h1>
    <div class="row" id="datagird">    	
    </div>
</div>
<iframe id="downfrm" name="downfrm" style="width:0;height:0"></iframe>
<form id="downfom" action="" target="downfrm" method="POST">
<input type="hidden" name="head" id="head" />
</form>

<script type="text/javascript">
var columns=[
             {field: "logid", header: "日志ID序号", visible: "yes",order:'descending',type:'number'},
             {field: "opstart", header: "发生时间"},
             {field: "adminid", header: "管理员ID", visible: "no"},
             {field: "adminname", header: "管理员名称"},
             {field: "uid", header: "资源ID", visible: "no"},
             {field: "utitle", header: "资源标题"},
             {field: "putitle", header: "父资源"},
             {field: "opcontent", header: "操作描述", visible: "no"},
             {field: "opstatus", header: "操作状态"},
             {field: "optime", header: "操作耗时(毫秒)"},
         	];
    function excel(status){    	
    	var cols=[];
    	$.each(columns,function(){
    		cols.push({field:this.field,header:this.header});
    	});
    	//location.href="export.co?head="+JSON.stringify(cols)+"&status="+(status||'');
    	
    	$('#head').val(JSON.stringify(cols));    	
    	$('#downfom').attr('action',"export.co?status="+status).submit();
    }   
    
    
$(function() {	 

    // 加载表格
    $("#datagird").bs_grid({
        ajaxFetchDataURL: "listdata.co",
        row_primary_key: columns[0].field,
        customTools:[
         			{tagName: "a", id: "export",href:'javascript:void(0)', title: "导出记录",label:"导出",iconClass:"glyphicon glyphicon-export",
         				subs:[
							{tagName: "a", id: "export1",href:'javascript:excel(0)', label: "当前记录",iconClass:"glyphicon glyphicon-export"},
							{tagName: "a", id: "export1",href:'javascript:excel(1)', label: "所有记录",iconClass:"glyphicon glyphicon-export"}
         				    ]
         			}                 
         			],
        columns: columns,
        sorting: sorting(columns),

        filterOptions: {
            filters: filter(columns)
        }
    });
    

});


 
 

    
</script>

</body>
</html>