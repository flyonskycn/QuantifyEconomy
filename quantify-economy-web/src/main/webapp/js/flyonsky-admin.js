$(document).ajaxError(function(event,request, settings){
	if(request.status==404){
		$.toaster(settings.url+'接口不存在，请联系管理员','结果','danger');
	}else if(request.status==500){
		$.toaster('服务端处理异常，请联系管理员','结果','warning');
	}else if(request.responseText && request.responseText.indexOf('权限不足')>0){
		$.toaster('权限不足，请联系管理员','结果','danger');
	}else{
		$.toaster('请求异常，请检查网络或稍后重试','结果','warning');
	}		 
});


function sorting(cols){
	var sortings=[];
	$.each(cols,function(){
		sortings.push($.extend({sortingName:this.header,order:this.order||'none'},this));
	});
	return sortings;
}

function filter(cols){
	var filters=[];
	$.each(cols,function(){
		if(this.lookup_values){
			filters.push({
		        filterName: this.header, "filterType": "number", "numberType": "integer", field: this.field, filterLabel: this.header,
                excluded_operators: ["equal", "not_equal", "less", "less_or_equal", "greater", "greater_or_equal"],
                filter_interface: [
                    {
                        filter_element: "input",
                        filter_element_attributes: {type: "checkbox"}
                    }
                ],
                lookup_values:this.lookup_values
		    });
		}else{
			filters.push({
		        filterName: this.header, "filterType": this.type||"text", field: this.field, filterLabel: this.header,
		        excluded_operators: ["in", "not_in"],
		        filter_interface: [
		            {
		                filter_element: "input",
		                filter_element_attributes: {"type": "text"}
		            }
		        ]
		    });
		}
		
	});
	return filters;
}