<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>证券分类查看</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>

	<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	
    <script type="text/javascript" charset="utf-8" src="<s:url value="/" />ext/jquery/jQuery-2.2.0.min.js"> </script>
    
    <link rel="stylesheet" type="text/css" href="/ext/jquery-ui/jquery-ui.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/jquery-ui/jquery-ui.min.js"></script>
	
	
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


    <link rel="stylesheet" type="text/css" href="/ext/bs_grid/jquery.bs_grid.min.css">
	<script type="text/javascript" src="<s:url value="/" />ext/bs_grid/jquery.bs_grid.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/bs_grid/localization/zh.min.js"></script>
	
	<!--  if timepicker is used in filters -->
	<link href="//cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/jquery-ui-timepicker-addon.css" rel="stylesheet">
	<script src="//cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/jquery-ui-timepicker-addon.js"></script>
	<script src="<s:url value="/" />/cdn.bootcss.com/jquery-ui-timepicker-addon/1.6.1/i18n/jquery-ui-timepicker-zh-CN.js"></script>
	
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
	<script type="text/javascript" src="<s:url value="/" />js/flyonsky-admin.js"> </script>
	<style type="text/css">
        .cover{max-width:100px;max-height:35px;margin: -7px -7px -7px -7px;}
    </style>
</head>
<body>
<div class="container-fluid">
    <h1>证券分类查看</h1>
    <div class="row" id="datagird">
    	
    </div>
</div>

<script type="text/javascript">
$(function() {	 	 
    $("#datagird").bs_grid({
 
        ajaxFetchDataURL: "queryindustry.co",
        row_primary_key: "id",
 
        columns: [
            {field: "id", header: "ID", visible: "no"},
            {field: "industryid", header: "分类ID", visible: "no"},
            {field: "name", header: "分类名称"}
        ],
        
        sorting: [
                  {sortingName: "分类名称", field: "name", order: "none"}
              ],
 
        filterOptions: {
            filters: [
                {
                    filterName: "分类名称", "filterType": "text", field: "name", filterLabel: "分类名称",
                    excluded_operators: ["in", "not_in"],
                    filter_interface: [
                        {
                            filter_element: "input",
                            filter_element_attributes: {"type": "text"}
                        }
                    ]
                }
            ]
        }
    });
 
});



    
</script>

</body>
</html>