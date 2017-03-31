var projectURL="http://localhost:8080/simpleCRM/";
var socketURL = 'ws://localhost:8080/simpleCRM/websocket';
var webSocketInstance = null;

function doNext(callback, _url, _data1, _data2) {
	callback(_url, _data1, _data2);
}

function isTrue(isTrue) {
	return isTrue;
}

function setAlertModalTitleAndBody(title, body) {
	$.alert({
	    title: title,
	    content: body,
	});
}



function showInfos(infos, message, obj, url) {
	if(infos !== null && infos !== "") {
		alert(message + ":" + obj);
		location.href = url;
	}
}

/************************************************************/
/** yyyy-mm-ss转为date begin**/
function converDateFromString(dataString) {
	if(dataString) {
		var date = new Date(dateString.replace(/-/,"/"));
		return date;
	}
}

/** /yyyy-mm-ss转为date /end **/

/** 返回yyyy-MM-dd格式日期 begin **/

function dateFormat_1(longTypeDate){  
    var dateType = "";  
    var date = new Date();  
    date.setTime(longTypeDate);  
    dateType += date.getFullYear();   //年  
    dateType += "-" + getMonth(date); //月   
    dateType += "-" + getDay(date);   //日  
    return dateType;
} 
//返回 01-12 的月份值   
function getMonth(date){  
    var month = "";  
    month = date.getMonth() + 1; //getMonth()得到的月份是0-11  
    if(month<10){  
        month = "0" + month;  
    }  
    return month;  
}  
//返回01-30的日期  
function getDay(date){  
    var day = "";  
    day = date.getDate();  
    if(day<10){  
        day = "0" + day;  
    }  
    return day;  
}

function dateFormat_2(longTypeDate){  
    var dateType = "";  
    var date = new Date();  
    date.setTime(longTypeDate); 
    dateType = date.getFullYear()+"-"+getMonth(date)+"-"+getDay(date);//yyyy-MM-dd格式日期
    return dateType;
} 

/**  /返回yyyy-MM-dd格式日期 /end **/
/************************************************************/
/** 返回yyyy-MM-dd 00:00:00格式日期 begin **/


function datetimeFormat_1(longTypeDate){  
    var datetimeType = "";  
    var date = new Date();  
    date.setTime(longTypeDate);  
    datetimeType+= date.getFullYear();   //年  
    datetimeType+= "-" + getMonth(date); //月   
    datetimeType += "-" + getDay(date);   //日  
    datetimeType+= "&nbsp;&nbsp;" + getHours(date);   //时  
    datetimeType+= ":" + getMinutes(date);      //分
    datetimeType+= ":" + getSeconds(date);      //分
    return datetimeType;
} 
//返回 01-12 的月份值   
function getMonth(date){  
    var month = "";  
    month = date.getMonth() + 1; //getMonth()得到的月份是0-11  
    if(month<10){  
        month = "0" + month;  
    }  
    return month;  
}  
//返回01-30的日期  
function getDay(date){  
    var day = "";  
    day = date.getDate();  
    if(day<10){  
        day = "0" + day;  
    }  
    return day;  
}
//返回小时
function getHours(date){
    var hours = "";
    hours = date.getHours();
    if(hours<10){  
        hours = "0" + hours;  
    }  
    return hours;  
}
//返回分
function getMinutes(date){
    var minute = "";
    minute = date.getMinutes();
    if(minute<10){  
        minute = "0" + minute;  
    }  
    return minute;  
}
//返回秒
function getSeconds(date){
    var second = "";
    second = date.getSeconds();
    if(second<10){  
        second = "0" + second;  
    }  
    return second;  
}


function datetimeFormat_2(longTypeDate){  
    var datetimeType = "";  
    var date = new Date();  
    date.setTime(longTypeDate);
    datetimeType = date.getFullYear()+"-"+getMonth(date)+"-"+getDay(date)+" "+getHours(date)+":"+getMinutes(date)+":"+getSeconds(date);//yyyy-MM-dd 00:00:00格式日期
    return datetimeType;
}


/** /返回yyyy-MM-dd 00:00:00格式日期 /end **/
/************************************************************/
/** 格式化Date为 yyyy-MM-dd 00:00 begin **/
Date.prototype.format = function(fmt) { 
    var o = { 
       "M+" : this.getMonth()+1,                 //月份 
       "d+" : this.getDate(),                    //日 
       "h+" : this.getHours(),                   //小时 
       "m+" : this.getMinutes(),                 //分 
       "s+" : this.getSeconds(),                 //秒 
       "q+" : Math.floor((this.getMonth()+3)/3), //季度 
       "S"  : this.getMilliseconds()             //毫秒 
   }; 
   if(/(y+)/.test(fmt)) {
           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
   }
    for(var k in o) {
       if(new RegExp("("+ k +")").test(fmt)){
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
        }
    }
   return fmt; 
}  

/** /格式化Date为 yyyy-MM-dd 00:00 /end **/
/************************************************************/
/** 组织管理 begin **/

var dataTables;
var dataTableURL;
var treeURL;

var option =
{
    message: 'This value is not valid',
    feedbackIcons:{
        valid: 'glyphicon glyphicon-ok',
        invalid:'glyphicon glyphicon-remove',
        validating:'glyphicon glyphicon-refresh'
    },
    fields: {
    	departmentName: {
            validators: {
                notEmpty: {
                    message: '请输入部门名称'
                },
            }
        }
    }
}

//初始化表格
var script = function (_dataTableURL,_treeURL) {
	dataTableURL = _dataTableURL;
	treeURL = _treeURL;
	
	dataTables = $('table[data-table="organizingTable"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
		"sAjaxSource": dataTableURL,
		"sAjaxDataProp": "data",
		'bStateSave': true
    });
	jQuery('#sample_1_wrapper .dataTables_filter input').addClass("input-medium"); // modify table search input
	jQuery('#sample_1_wrapper .dataTables_length select').addClass("input-mini"); // modify table per page dropdown
};

/*
 	var addDepartment = function() {
	$modal = $('div[data-Modal="organizing_addDepartment"]');
	$modal.modal('show');
}*/
var addDepartment = function() {
	$.confirm({
	    title: '添加部门',
	    content: 
	    	'<form class="form-horizontal" role="form" data-Modal="organizing_addDepartment">' +
			    '<div class="form-group">' +
			        '<label for="inputEmail3" class="col-sm-2 control-label">部门名称:</label>' +
			        '<div class="col-sm-10">' +
			            '<input name="departmentName" type="text" class="form-control" placeholder="请输入名称">'+
			        '</div>' +
			    '</div>' +
			    '<button type="submit" class="btn btn-default hidden">保存</button>' +
			'</form>'
	    	,
	    buttons: {
	        确定: {
	            text: '保存',
	            btnClass: 'btn-blue',
	            action: function () {
	            	addDepartmentClick( projectURL + "mainBodys/insertDepartmentVo");
	            }
	        },
	        取消: function () {
	            //close
	        },
	    }
	});
}

var addDepartmentClick = function(url) {
	$form = $('form[data-Modal="organizing_addDepartment"]');
	$form.bootstrapValidator(option);
	$form.data("bootstrapValidator").validateField('departmentName');
	isTrue = $form.data("bootstrapValidator").isValidField('departmentName');
//	isTrue = $modal.find("form").data("bootstrapValidator").isValidField('departmentName');
	if (isTrue == false) return;
	
	var departmentName = $form.find(':input[name="departmentName"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			departmentName : departmentName
		},
		
		success : function(data) {

			setAlertModalTitleAndBody("添加部门", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			//销毁datatable
			dataTables.fnDestroy();
			//初始化datatable
			script(dataTableURL, treeURL);
			
			//销毁树
			$.fn.zTree.destroy("treeDemo");
			//初始化树
			initTree(treeURL, dataTableURL);
		},
		error : function() {
			setAlertModalTitleAndBody("添加部门", "添加失败");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editDepartment = function(_this, projectURL) {
	var dataId = $(_this).data("id");
	$.ajax({
		url : projectURL + "\\mainBodys\\getDepartmentVoList",
		type : "POST",
		data : {
			departmentId : dataId
		},
		success : function(data) {
			var department = data[0];
//			$('div[data-Modal="organizing_editDepartment"]').find(':input[name="departmentName"]').val(department.departmentName);
//			$('div[data-Modal="organizing_editDepartment"]').find(':input[name="departmentId"]').val(department.departmentId);
//			$('div[data-Modal="organizing_editDepartment"]').modal('show');
			
			$.confirm({
			    title: '编辑部门',
			    content: 
			    	'<form class="form-horizontal" role="form" data-Modal="organizing_editDepartment">' +
					    '<div class="form-group">' +
					        '<label for="inputEmail3" class="col-sm-2 control-label">部门名称:</label>' +
					        '<div class="col-sm-10">' +
					            '<input name="departmentName" type="text" class="form-control" placeholder="请输入名称" value="'+ department.departmentName +'">' +
					        '</div>' +
					    '</div>' +
					    '<input name="departmentId" type="hidden" value="'+ department.departmentId + '">' +
					    '<button type="submit" class="btn btn-default hidden">保存</button>' +
					'</form>'
			    	,
			    buttons: {
			        确定: {
			            text: '保存',
			            btnClass: 'btn-blue',
			            action: function () {
			            	saveClick( projectURL + "/mainBodys/updateDepartmentVo");
			            }
			        },
			        取消: function () {
			            //close
			        },
			    }
			});
		},
		error : function() {
			alert("查询部门失败");
		}
	});
}

var saveClick = function(url) {
//	$modal = $('div[data-Modal="organizing_editDepartment"]');
//	$form = $modal.find("form");
	$form = $('form[data-Modal="organizing_editDepartment"]');
	$form.bootstrapValidator(option);
	$form.data("bootstrapValidator").validateField('departmentName');
//	isTrue = $modal.find("form").data("bootstrapValidator").isValidField('departmentName');
	isTrue = $form.data("bootstrapValidator").isValidField('departmentName');
	if (isTrue == false) return;
	
	var departmentId = $form.find(':input[name="departmentId"]').val();
	var departmentName = $form.find(':input[name="departmentName"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			departmentId : departmentId,
			departmentName : departmentName
		},
		
		success : function(data) {
			$('button[data-dismiss="modal"]').click();
			
			setAlertModalTitleAndBody("编辑部门", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			//销毁datatable
			dataTables.fnDestroy();
			//初始化datatable
			script(dataTableURL, treeURL);
			
			//销毁树
			$.fn.zTree.destroy("treeDemo");
			//初始化树
			initTree(treeURL, dataTableURL);
		},
		error : function() {
			setAlertModalTitleAndBody("编辑部门", "编辑失败");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var deleteConfirmWarm = function(_this, url) {
	$.confirm({
	    title: '确认删除',
	    content: '确定要删除吗？',
	    buttons: {
	        "确定": function () {
	        	deleteDepartment(_this, url);
	        },
	        "取消": function () {}
	    }
	});
}

var deleteDepartment = function(_this, url) {
	var dataId = $(_this).data("id");
	$.ajax({
		url : url,
		type : "POST",
		data : {
			departmentId : dataId
		},
		
		success : function(data) {
			
			setAlertModalTitleAndBody("删除部门", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			//销毁datatable
			dataTables.fnDestroy();
			//初始化datatable
			script(dataTableURL, treeURL);
			
			//销毁树
			$.fn.zTree.destroy("treeDemo");
			//初始化树
			initTree(treeURL, dataTableURL);
		},
		error : function() {
			setAlertModalTitleAndBody("删除部门", "删除失败");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
};

var deleteDepartmentList = function(_this, url) {
	var departmentIdArray=[];
	$checks = $('table[data-table="organizingTable"]').find(":checked");
	if($checks.length == 0) {
		$.alert({
		    title: '提示',
		    content: '请先选取部门',
		});
		return;
	}
	var departmentIdArray=[];
	$checks.each(function() {
		departmentIdArray.push({departmentId : $(this).data("id")});
	});
	var departmentIdString = JSON.stringify(departmentIdArray);
	
	$.confirm({
	    title: '确认删除',
	    content: '确定要删除吗？',
	    buttons: {
	        "确定": function () {
	        	$.ajax({
	        		url : url,
	        		type : "POST",
	        		contentType : 'application/json;charset=utf-8',
	                dataType:"json",
	        		data : departmentIdString,
	        		success : function(data) {
	        			setAlertModalTitleAndBody("删除部门", data.obj);
	        			$('div[data-Modal="alertModal"]').modal('show');
	        			
	        			//销毁datatable
	        			dataTables.fnDestroy();
	        			//初始化datatable
	        			script(dataTableURL, treeURL);
	        			
	        			//销毁树
	        			$.fn.zTree.destroy("treeDemo");
	        			//初始化树
	        			initTree(treeURL, dataTableURL);
	        		},
	        		error : function() {
	        			setAlertModalTitleAndBody("删除部门", "删除失败，请重试");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        		}
	        	});
	        },
	        "取消": function () {}
	    }
	});
}


/**  组织管理 /end **/
/************************************************************/

/************************************************************/
/**  职务权限 begin **/
var pitchOn = function(dataId) {
	var $checkbox = $(':checkbox[data-id="'+ dataId +'"]');
	$checkbox.prop("checked", "checked");
}
var pitchOff = function(dataId) {
	var $checkbox = $(':checkbox[data-id="'+ dataId +'"]');
	$checkbox.removeAttr("checked");
}	

var saveAuthority = function(_this, url) {
 	$this = $(_this);
 	var _userroleId = $this.attr("data-userroleId");
 	$tab = $('div[data-tab="' + _userroleId + '"]');
 	var $checked = $tab.find(":checked");
 	var authorityArray = [];
 	
 	if($checked.length == 0) {
 		authorityArray.push({userroleId : _userroleId});
 	}else {
 		for(var i=0; i<$checked.length; i++) {
 	 		var _authorityId = $checked.eq(i).data("id");
 	 		authorityArray.push({authorityId : _authorityId , userroleId : _userroleId});
 	 	}
 	}
 	
 	var authorityArrayString = JSON.stringify(authorityArray);
 	
 	$.ajax({
		url : url,
		type : "POST",
		contentType : 'application/json;charset=utf-8',
        dataType:"json",
		data : authorityArrayString,
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "删除失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var getAllAuthorityManager = function(url, userroleId) {
	$.ajax({
		url : url,
		type : "POST",
        data : {
    		userroleId : userroleId
    	},
		success : function(data) {
			var html = "";
			for(var i=0; i<data.length; i++) {
				html+=
				'<tr>' +
					'<td><input type="checkbox"';
				if(data[i].contain)
				html+='checked="checked"';
				html+=	
					' class="checkboxes" value="1" data-id="'+ data[i].authorityId +'" /></td>' +
					'<td><a href="#">'+ data[i].authorityName +'</a></td>' +
					'<td>'+ data[i].authorityExplain +'</td>' +
					'<td>' +
						'<button class="btn btn-success" onclick="pitchOn(\''+ data[i].authorityId +'\')">' +
							'<i class="icon-ok"></i>' +
						'</button>' +
						'<button class="btn btn-danger" onclick="pitchOff(\''+ data[i].authorityId +'\')">' +
							'<i class="icon-trash "></i>' + 
						'</button>' +
					'</td>' +
				'</tr>';
			}
			$('div[data-tab="' + userroleId +'"]').find('tbody').html(html);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "获取权限信息失败");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

/**  职务权限 /end **/
/************************************************************/

/************************************************************/
/**  成员信息 begin **/

//初始化成员表
var initMemberInformationTable = function (dataTableURL) {
	
	dataTables = $('table[data-table="memberInformation"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
        "sAjaxSource": dataTableURL,
		"sAjaxDataProp": "data",
		'bStateSave': true
    });
	
	$('form[data-menberAdd="menberAdd"]').submit(function() {  
		menberAdd();
		return false;  
	}); 
	$('form[data-menberEdit="menberEdit"]').submit(function() {  
		menberUpdate();
		return false;  
	}); 
	
	$('div[data-member="addMember"]').hide();
	$('div[data-member="showMember"]').hide(1000);
	$('div[data-member="editMember"]').hide(1000);
};

var refreshMemberInfos = function() {
	var dataTableURL = projectURL + "mainBodys/getEmployeeVoList";
	dataTables.fnDestroy();
	dataTables = $('table[data-table="memberInformation"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
        "sAjaxSource": dataTableURL,
		"sAjaxDataProp": "data",
		'bStateSave': true
    });
	$('div[data-member="addMember"]').hide();
	$('div[data-member="showMember"]').hide(1000);
	$('div[data-member="editMember"]').hide(1000);
	$('div[data-member="information"]').show(500);
}

var showAddMember = function(url) {
	
	$('div[data-member="information"]').hide(500);
	$('div[data-member="addMember"]').show(1000);
	
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var department = data[i];
				option += '<option value="'+ department.departmentId + '"';
				if(department.departmentId === '7fc51cfa-0986-11e7-b918-28d2444b860a')
					option += 'selected = "selected"'
				option += '>'+ department.departmentName +'</option>';
			}
			var $select = $('form[data-menberAdd="menberAdd"]').find('select[name="departmentIdEmployee"]');
			$select.html(option);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "获取部门信息失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}
var showMemberInfos = function() {
	$('div[data-member="showMember"]').hide(1000);
	$('div[data-member="addMember"]').hide(1000);
	$('div[data-member="editMember"]').hide(1000);
	$('div[data-member="information"]').show(500);
}

var menberAdd = function() {
	$.confirm({
	    title: '提示',
	    content: '确认保存吗？',
	    buttons: {
	        "确定": function () {
	        	var employeeUsername = $(':input[name="employeeUsername"]').val();
	        	var employeeRealName = $(':input[name="employeeRealName"]').val();
	        	var employeeEmail = $(':input[name="employeeEmail"]').val();
	        	var employeePhone = $(':input[name="employeePhone"]').val();
	        	var departmentIdEmployee = $('select[name="departmentIdEmployee"]').val();
	        	var userroleIdEmployee = $('select[name="userroleIdEmployee"]').val();
	        	
	        	var url = projectURL + "/mainBodys/addEmployeeVo";
	        	$.ajax({
	        		url : url,
	        		type : "POST",
	        		data : {
	        			employeeUsername : employeeUsername,
	        			employeeRealName : employeeRealName,
	        			employeeEmail : employeeEmail,
	        			employeePhone : employeePhone,
	        			departmentIdEmployee : departmentIdEmployee,
	        			userroleIdEmployee : userroleIdEmployee
	        		},
	        		success : function(data) {
	        			$('button[data-dismiss="modal"]').click();
	        			
	        			setAlertModalTitleAndBody("提示", data.obj);
	        			$('div[data-Modal="alertModal"]').modal('show');
	        			
	        			$('div[data-member="addMember"]').find(':input[type="reset"]').click();
	        		},
	        		error : function() {
	        			setAlertModalTitleAndBody("提示", "添加员工失败，请重试");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        		}
	        	});
	        },
	        "取消": function () {
	        }
	    }
	});
}

var addRandom = function(_this) {
	var $_this = $(_this);
	if($(':input[data-isRadom="employeeUsername"]').val() == 1) return;
	if($_this.val() !== "") {
		var num = parseInt(1000*Math.random());
		$_this.val($_this.val() + num); 
		$(':input[data-isRadom="employeeUsername"]').val(1);
	}
}

var removeRadom = function(_this) {
	var $_this = $(_this);
	if($_this.val() == "") {
		$(':input[data-isRadom="employeeUsername"]').val(0);
	}
}

var detailedEmployee = function(_this) {
	$('div[data-member="showMember"]').show(1000);
	$('div[data-member="information"]').hide(500);
	
	var employeeId = $(_this).data("id");
	var url = projectURL + "/mainBodys/detailEmployeeVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			employeeId : employeeId,
		},
		success : function(data) {
			var $form = $('form[data-menberShow="menberShow"]');
			$form.find(':input[name="employeeNumber"]').val(data.employeeNumber);
			$form.find(':input[name="employeeUsername"]').val(data.employeeUsername);
			$form.find(':input[name="employeeRealName"]').val(data.employeeRealName);
			$form.find(':input[name="employeeEmail"]').val(data.employeeEmail);
			$form.find(':input[name="employeePhone"]').val(data.employeePhone);
			$form.find(':input[name="departmentName"]').val(data.departmentVo.departmentName);
			$form.find(':input[name="userroleName"]').val(data.userroleVo.userroleName);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "查询员工信息失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editEmployee = function(_this) {
	$('div[data-member="information"]').hide(500);
	$('div[data-member="editMember"]').show(1000);
	
	var url = projectURL + "/mainBodys/getDepartmentVoList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var department = data[i];
				option += '<option value="'+ department.departmentId + '"';
				option += '>'+ department.departmentName +'</option>';
			}
			var $select = $('form[data-menberEdit="menberEdit"]').find('select[name="departmentIdEmployee"]');
			$select.html(option);
			
			//获取员工信息
			var employeeId = $(_this).data("id");
			$.ajax({
				url : projectURL + "/mainBodys/detailEmployeeVo",
				type : "POST",
				data : {
					employeeId : employeeId,
				},
				success : function(data) {
					var $form = $('form[data-menberEdit="menberEdit"]');
					$form.find(':input[name="employeeId"]').val(data.employeeId);
					$form.find(':input[name="employeeUsername"]').val(data.employeeUsername);
					$form.find(':input[name="employeeRealName"]').val(data.employeeRealName);
					$form.find(':input[name="employeeEmail"]').val(data.employeeEmail);
					$form.find(':input[name="employeePhone"]').val(data.employeePhone);
					$form.find('select[name="departmentIdEmployee"]').val(data.departmentVo.departmentId);
					$form.find('select[name="userroleIdEmployee"]').val(data.userroleVo.userroleId);
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "查询员工信息失败，请重试");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
			
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "获取部门信息失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var menberUpdate = function() {
	$.confirm({
	    title: '提示',
	    content: '确认保存更改吗？',
	    buttons: {
	        "确定": function () {
	        	$form = $('form[data-menberEdit="menberEdit"]');
	        	var employeeId = $form.find(':input[name="employeeId"]').val();
	        	var employeeUsername = $form.find(':input[name="employeeUsername"]').val();
	        	var employeeRealName = $form.find(':input[name="employeeRealName"]').val();
	        	var employeeEmail = $form.find(':input[name="employeeEmail"]').val();
	        	var employeePhone = $form.find(':input[name="employeePhone"]').val();
	        	var departmentIdEmployee = $form.find('select[name="departmentIdEmployee"]').val();
	        	var userroleIdEmployee = $form.find('select[name="userroleIdEmployee"]').val();
	        	
	        	var url = projectURL + "mainBodys/updateEmployeeVo";
	        	$.ajax({
	        		url : url,
	        		type : "POST",
	        		data : {
	        			employeeId : employeeId,
	        			employeeUsername : employeeUsername,
	        			employeeRealName : employeeRealName,
	        			employeeEmail : employeeEmail,
	        			employeePhone : employeePhone,
	        			departmentIdEmployee : departmentIdEmployee,
	        			userroleIdEmployee : userroleIdEmployee
	        		},
	        		success : function(data) {
	        			$('button[data-dismiss="modal"]').click();
	        			
	        			setAlertModalTitleAndBody("提示", data.obj);
	        			$('div[data-Modal="alertModal"]').modal('show');
	        			
	        			$('div[data-menberEdit="menberEdit"]').find(':input[type="reset"]').click();
	        		},
	        		error : function() {
	        			setAlertModalTitleAndBody("提示", "修改失败，请重试");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        		}
	        	});
	        },
	        "取消": function () {
	        }
	    }
	});
}

/**  成员信息 /end **/
/************************************************************/

/************************************************************/
/**  个人信息 begin **/

var getProfileInfo = function(employeeId) {
	$.ajax({
		url : projectURL + "/mainBodys/detailEmployeeVo",
		type : "POST",
		data : {
			employeeId : employeeId,
		},
		success : function(data) {
			$('span[name="employeeUsername"]').html(data.employeeUsername);
			$('span[name="employeeNumber"]').html(data.employeeNumber);
			$('span[name="employeeEmail"]').html(data.employeeEmail);
			$('span[name="employeePhone"]').html(data.employeePhone);
			$('span[name="departmentName"]').html(data.departmentVo.departmentName);
			$('span[name="userroleName"]').html(data.userroleVo.userroleName);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "获取个人信息失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var initEditProfileSubmit = function() {
	$('form[data-editProfile="editProfile"]').submit(function() {  
		updateProfile();
		return false;  
	}); 
}

var initEditProfileForm = function(employeeId) {
	$.ajax({
		url : projectURL + "/mainBodys/detailEmployeeVo",
		type : "POST",
		data : {
			employeeId : employeeId,
		},
		success : function(data) {
			$(':input[name="employeeId"]').val(data.employeeId);
			$(':input[name="employeeEmail"]').val(data.employeeEmail);
			$(':input[name="employeePhone"]').val(data.employeePhone);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "获取个人信息失败，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var updateProfile = function() {
	$.confirm({
	    title: '提示',
	    content: '确定保存更改吗？',
	    buttons: {
	        "确定": function () {
	        	var data;
	        	$form = $('form[data-editProfile="editProfile"]');
	        	var employeeId = $form.find(':input[name="employeeId"]').val();
	        	var employeeEmail = $form.find(':input[name="employeeEmail"]').val();
	        	var employeePhone = $form.find(':input[name="employeePhone"]').val();
	        	if($form.find('div[data-newImg="newImg"]').find("img").length != 0) {
	        		var $img = $form.find('div[data-newImg="newImg"]').find("img");
	        		var imgData = $img.attr("src");
	        		var imagePart = imgData.split(",");
	        		if(imagePart[0] != "data:image/png;base64") {
	        			setAlertModalTitleAndBody("提示", "只支持png图片，请重新选择");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        			return;
	        		}
	        		employeeImg = imagePart[1];
	        		data =  {
		        			employeeId : employeeId,
		        			employeeEmail : employeeEmail,
		        			employeePhone : employeePhone,
		        			employeeImg : employeeImg
		        		};
	        	}else if($form.find('div[data-newImg="newImg"]').find("img").html() != "" && $form.find('div[data-newImg="newImg"]').find("img").html() != undefined) {
	        		setAlertModalTitleAndBody("提示", "只支持png图片，请重新选择");
        			$('div[data-Modal="alertModal"]').modal('show');
        			return;
	        	}else {
	        		data =  {
		        			employeeId : employeeId,
		        			employeeEmail : employeeEmail,
		        			employeePhone : employeePhone,
		        		};
	        	}
	        	
	        	var url = projectURL + "mainBodys/updateEmployeeVo";
	        	$.ajax({
	        		url : url,
	        		type : "POST",
	        		data : data,
	        		success : function(data) {
	        			$.confirm({
	        			    title: '提示',
	        			    content: data.obj + ',请重新登录',
	        			    buttons: {
	        			        "确定": function () {
	        			        	location.reload();
	        			        }
	        			    }
	        			});
	        		},
	        		error : function() {
	        			setAlertModalTitleAndBody("提示", "修改失败，请重试");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        		}
	        	});
	        },
	        "取消": function () {
	        }
	    }
	});
}

var resetPasswordValidate = function() {
	$form = $('form[data-resetPassword="resetPassword"]');
	var employeePassword = $form.find(':input[name="employeePassword1"]').val();
	var employeeId = $form.find(':input[name="employeeId"]').val();
	if(employeePassword == "") {
		setAlertModalTitleAndBody("提示", "请输入原密码");
		$('div[data-Modal="alertModal"]').modal('show');
		return;
	}
	var url = projectURL + "mainBodys/getOneEmployeeVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			employeeId : employeeId,
			employeePassword : employeePassword
		},
		success : function(data) {
			if(data.message == "SUCCESS") {
				$('a[href="#pills-tab2"]').click();
			}else {
				setAlertModalTitleAndBody("提示", "密码错误，请重新输入");
				$('div[data-Modal="alertModal"]').modal('show');
				$('a[href="#pills-tab1"]').click();
			}
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
	
	return;
}

var updatePassword = function() {
	$form = $('form[data-resetPassword="resetPassword"]');
	var employeePassword = $form.find(':input[name="employeePassword2"]').val();
	var employeeId = $form.find(':input[name="employeeId"]').val();
	if(employeePassword == "") {
		setAlertModalTitleAndBody("提示", "请输入新密码");
		$('div[data-Modal="alertModal"]').modal('show');
		return;
	}
	var url = projectURL + "mainBodys/updateEmployeeVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			employeeId : employeeId,
			employeePassword : employeePassword
		},
		success : function(data) {
			if(data.message == "SUCCESS") {
				$('a[href="#pills-tab3"]').click();
			}else {
				setAlertModalTitleAndBody("提示", "修改密码失败，请重试");
				$('div[data-Modal="alertModal"]').modal('show');
				$('a[href="#pills-tab1"]').click();
			}
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
	
	return;
}

/**  /个人信息 /end **/
/************************************************************/

/************************************************************/
/**  产品信息 begin **/

var initProductInfos = function() {
	var dataTableURL = projectURL + "mainBodys/getAllProduct";
	dataTables = $('table[data-table="productInformation"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-product="addProduct"]').submit(function() {  
		addProduct();
		return false;  
	}); 
	$('form[data-product="editProduct"]').submit(function() {  
		updateProduct();
		return false;  
	}); 
	
	$('div[data-product="addProduct"]').hide(500);
	$('div[data-product="showProduct"]').hide(500);
	$('div[data-product="editProduct"]').hide(500);
	$('div[data-product="information"]').show(1000);
}

var refreshProductInfos = function() {
	dataTables.fnDestroy();
	
	var dataTableURL = projectURL + "mainBodys/getAllProduct";
	dataTables = $('table[data-table="productInformation"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('div[data-product="addProduct"]').hide(500);
	$('div[data-product="showProduct"]').hide(500);
	$('div[data-product="editProduct"]').hide(500);
	$('div[data-product="information"]').show(1000);
	
//	initProductInfos();
	$('form[data-product="addProduct"]').find(':input[type="reset"]').click();
}

var addProductShow = function() {
	$('div[data-product="information"]').hide(500);
	$('div[data-product="showProduct"]').hide(500);
	$('div[data-product="addProduct"]').show(1000);
}

var addProduct = function() {
	var $form = $('form[data-product="addProduct"]');
	var formData = new FormData($('form[data-product="addProduct"]')[0]);
	var url = projectURL + "/mainBodys/addProduct";
	$.ajax({
		url : url,
		type : "POST",
		data : formData,
		cache : false,
		contentType : false,
		processData : false,
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			if(data.message == "SUCCESS") {
				$form.find(':input[type="reset"]').click();
			}
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var downloadPDF = function(_this) {
	var productId = $(_this).data("id");
	var url = projectURL + "mainBodys/downLoadPDF";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			productId : productId
		},
		success : function(data) {
			if(data != null) {
				setAlertModalTitleAndBody("提示", data.obj);
				$('div[data-Modal="alertModal"]').modal('show');
			}
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var datailProduct = function(_this) {
	var url = projectURL + "mainBodys/detailproduct";
	var productId = $(_this).data("id");
	$.ajax({
		url : url,
		type : "POST",
		data : {
			productId : productId,
		},
		success : function(data) {
			var productVo = data;
			var $form = $('form[data-product="showProduct"]');
			$form.find(':input[name="productId"]').val(productVo.productId);
			$form.find(':input[name="productName"]').val(productVo.productName);
			$form.find(':input[name="productPrice"]').val(productVo.productPrice);
			$form.find(':input[name="productDetail"]').val(productVo.productDetail);
			if(productVo.productPdf != null) {
				$form.find('a[data-button="downloadPDF"]').removeClass("disabled");
				$form.find('a[data-button="downloadPDF"]').attr("data-id",productVo.productId).attr("href",projectURL + "mainBodys/downLoadPDF?productId= "+ productVo.productId);
			}else {
				$form.find('a[data-button="downloadPDF"]').addClass("disabled");
				$form.find('a[data-button="downloadPDF"]').attr("href","javasvript:void(0);");
			}
			$('div[data-product="addProduct"]').hide(500);
			$('div[data-product="information"]').hide(500);
			$('div[data-product="showProduct"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editProduct = function(_this) {
	var url = projectURL + "mainBodys/detailproduct";
	var productId = $(_this).data("id");
	$.ajax({
		url : url,
		type : "POST",
		data : {
			productId : productId,
		},
		success : function(data) {
			var productVo = data;
			var $form = $('form[data-product="editProduct"]');
			$form.find(':input[name="productId"]').val(productVo.productId);
			$form.find(':input[name="productNum"]').val(productVo.productNum);
			$form.find(':input[name="productName"]').val(productVo.productName);
			$form.find(':input[name="productPrice"]').val(productVo.productPrice);
			$form.find('textarea[name="productDetail"]').val(productVo.productDetail);
			if(productVo.productPdf != null) {
				$form.find('a[data-button="downloadPDF"]').removeClass("disabled");
				$form.find('a[data-button="downloadPDF"]').attr("data-id",productVo.productId).attr("href",projectURL + "mainBodys/downLoadPDF?productId= "+ productVo.productId);
			}else {
				$form.find('a[data-button="downloadPDF"]').addClass("disabled");
				$form.find('a[data-button="downloadPDF"]').attr("href","javasvript:void(0);");
			}
			$('div[data-product="information"]').hide(500);
			$('div[data-product="addProduct"]').hide(500);
			$('div[data-product="showProduct"]').hide(500);
			$('div[data-product="editProduct"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var updateProduct = function(_this) {
	var $form = $('form[data-product="editProduct"]');
	var formData = new FormData($('form[data-product="editProduct"]')[0]);
	var url = projectURL + "/mainBodys/updateProduct";
	$.ajax({
		url : url,
		type : "POST",
		data : formData,
		cache : false,
		contentType : false,
		processData : false,
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			if(data.message == "SUCCESS") {
				$form.find(':input[type="reset"]').click();
				refreshProductInfos();
			}
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

/**  /产品信息 /end **/
/************************************************************/

/************************************************************/
/**  /客户信息 begin **/

var initCustomInfos = function() {
	var dataTableURL = projectURL + "mainBodys/getAllCustom";
	dataTables = $('table[data-custom="information"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-custom="addCustom"]').submit(function() {  
		addCustom();
		return false;
	}); 
	$('form[data-custom="editCustom"]').submit(function() {  
		editCustom();
		return false;
	}); 
	$('form[data-BusinessOpportunity="addBusinessOpportunity"]').submit(function() {  
		if(income()) addBusinessOpportunity();
		return false;
	}); 
	
	$('div[data-custom="addCustom"]').hide(500);
	$('div[data-custom="editCustom"]').hide(500);
	$('div[data-BusinessOpportunity="addBusinessOpportunity"]').hide(500);
	$('div[data-custom="information"]').show(1000);
}

var refreshCustomInfos = function() {
	if(dataTables != null)
		dataTables.fnDestroy();
	
	var dataTableURL = projectURL + "mainBodys/getAllCustom";
	dataTables = $('table[data-custom="information"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	$('div[data-custom="addCustom"]').hide(500);
	$('div[data-custom="editCustom"]').hide(500);
	$('div[data-BusinessOpportunity="addBusinessOpportunity"]').hide(500);
	$('div[data-custom="information"]').show(1000);
	
//	initCustomInfos();
	
	$('form[data-custom="addCustom"]').find(':input[type="reset"]').click();
}

var addCustomShow = function() {
	$('div[data-custom="addCustom"]').show(1000);
	$('div[data-custom="information"]').hide(500);
	$('div[data-BusinessOpportunity="addBusinessOpportunity"]').hide(500);
	if($('form[data-custom="addCustom"]').find('select[name="followEmployeeId"]').length == 0) return;
	var url = projectURL + "mainBodys/getSalesmanList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var employeeVo = data[i];
				option += '<option value="'+ employeeVo.employeeId + '">'+ employeeVo.employeeRealName +'</option>';
			}
			var $select = $('form[data-custom="addCustom"]').find('select[name="followEmployeeId"]');
			$select.html(option);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var addCustom = function() {
	$.confirm({
	    title: '提示',
	    content: '确认保存吗？',
	    buttons: {
	        "确定": function () {
	        	var data;
	        	var customName = $(':input[name="customName"]').val();
	        	var customAddress = $(':input[name="customAddress"]').val();
	        	var customLinkmanName = $(':input[name="customLinkmanName"]').val();
	        	var customLinkmanPhone = $(':input[name="customLinkmanPhone"]').val();
	        	var customLinkmanPost = $(':input[name="customLinkmanPost"]').val();
	        	var customLinkmanRemark = $('textarea[name="customLinkmanRemark"]').val();
	        	var followEmployeeId = $('select[name="followEmployeeId"]').val();
	        	var customRankId = $('select[name=customRankId]').val();
	        	var customStateId = $('select[name="customStateId"]').val();
        		data = {
        				customName : customName,
        				customAddress : customAddress,
        				customLinkmanName : customLinkmanName,
        				customLinkmanPhone : customLinkmanPhone,
        				customLinkmanPost : customLinkmanPost,
        				customLinkmanRemark : customLinkmanRemark,
        				followEmployeeId : followEmployeeId,
        				customRankId : customRankId,
        				customStateId : customStateId
        		}
	        	
	        	var url = projectURL + "/mainBodys/addCustomVo";
	        	$.ajax({
	        		url : url,
	        		type : "POST",
	        		data : data,
	        		success : function(data) {
	        			$('button[data-dismiss="modal"]').click();
	        			
	        			setAlertModalTitleAndBody("提示", data.obj);
	        			$('div[data-Modal="alertModal"]').modal('show');
	        			
	        			$('div[data-member="addMember"]').find(':input[type="reset"]').click();
	        		},
	        		error : function() {
	        			setAlertModalTitleAndBody("提示", "添加客户失败，请重试");
	        			$('div[data-Modal="alertModal"]').modal('show');
	        		}
	        	});
	        },
	        "取消": function () {
	        }
	    }
	});
}

var editCustomShow = function(customId) {
	var $form = $('form[data-custom="editCustom"]');
	var url = projectURL + "mainBodys/getSalesmanList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var employeeVo = data[i];
				option += '<option value="'+ employeeVo.employeeId + '">'+ employeeVo.employeeRealName +'</option>';
			}
			var $select = $form.find('select[name="followEmployeeId"]');
			$select.html(option);
			
			var url = projectURL + "mainBodys/editCustomShow";
			$.ajax({
				url : url,
				type : "POST",
				data : {
					customId : customId
				},
				success : function(data) {
					var custom = data;
					$form.find(':input[name="customId"]').val(custom.customId);
					$form.find(':input[name="customName"]').val(custom.customName);
					$form.find(':input[name="customAddress"]').val(custom.customAddress);
					$form.find(':input[name="customLinkmanName"]').val(custom.customLinkmanName);
					$form.find(':input[name="customLinkmanPhone"]').val(custom.customLinkmanPhone);
					$form.find(':input[name="customLinkmanPost"]').val(custom.customLinkmanPost);
					$form.find('textarea[name="customLinkmanRemark"]').val(custom.customLinkmanRemark);
					$form.find('select[name="customRankId"]').val(custom.customRankId);
					$form.find('select[name="customStateId"]').val(custom.customStateId);
					$form.find('select[name="followEmployeeId"]').val(custom.followEmployeeId);
					
					$('div[data-custom="information"]').hide(500);
					$('div[data-custom="addCustom"]').hide(500);
					$('div[data-BusinessOpportunity="addBusinessOpportunity"]').hide(500);
					$('div[data-custom="editCustom"]').show(1000);
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editCustom = function() {
	var url = projectURL + "mainBodys/editCustom";
	
	var $form = $('form[data-custom="editCustom"]');
	var customId = $form.find(':input[name="customId"]').val();
	var customName = $form.find(':input[name="customName"]').val();
	var customAddress = $form.find(':input[name="customAddress"]').val();
	var customLinkmanName =$form.find(':input[name="customLinkmanName"]').val();
	var customLinkmanPhone =$form.find(':input[name="customLinkmanPhone"]').val();
	var customLinkmanPost =$form.find(':input[name="customLinkmanPost"]').val();
	var customLinkmanRemark =$form.find('textarea[name="customLinkmanRemark"]').val();
	var customRankId =$form.find('select[name="customRankId"]').val();
	var customStateId =$form.find('select[name="customStateId"]').val();
	var followEmployeeId = $form.find('select[name="followEmployeeId"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			customId : customId,
			customName : customName ,
			customAddress : customAddress ,
			customLinkmanName : customLinkmanName ,
			customLinkmanPhone : customLinkmanPhone ,
			customLinkmanPost : customLinkmanPost ,
			customLinkmanRemark : customLinkmanRemark ,
			customRankId : customRankId ,
			customStateId : customStateId ,
			followEmployeeId : followEmployeeId
		},
		success : function(data) {
			
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			refreshCustomInfos();
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var datailCustom = function(customId) {
	$('#main-content').load(projectURL + "mainBodys/loadMainBody/", {jspURL: 'mainBody/jsp/detailCustom'},function() {
		$(':input[name="customId"]').val(customId);
		datailCustomShow();
	});
}

var datailCustomShow = function() {
	var customId = $(':input[name="customId"]').val();
	var url = projectURL + "mainBodys/selectCustomDetailed";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			customId : customId
		},
		success : function(data) {
			$('span[name="customName"]').html(data.customName);
			$('span[name="customAddress"]').html(data.customAddress);
			$('span[name="customLinkmanName"]').html(data.customLinkmanName);
			$('span[name="customLinkmanPost"]').html(data.customLinkmanPost);
			$('span[name="customLinkmanPhone"]').html(data.customLinkmanPhone);
			$('span[name="departmentName"]').html(data.departmentVo.departmentName);
			$('span[name="customRankName"]').html(data.customRankVo.customRankName);
			$('span[name="customStateName"]').html(data.customStateVo.customStateName);
			$('span[name="customLinkmanRemark"]').html(data.customLinkmanRemark);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var getCustomBusinessOpportunity = function() {
	var customId = $(':input[name="customId"]').val();
	var dataTableURL = projectURL + "mainBodys/selectCustomDetailedTable/"+customId;
	
	dataTables.fnDestroy();
	
	dataTables = $('table[data-custom="businessOpportunityInfos"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	$('table[data-custom="businessOpportunityInfos"]').removeAttr("style");
}

//加载添加商机页面
var showAddBusinessOpportunity = function(customId) {
	$('form[data-BusinessOpportunity="addBusinessOpportunity"]').find(':input[name="customId"]').val(customId);
	var url = projectURL + "mainBodys/getAllProductList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var $form = $('form[data-BusinessOpportunity="addBusinessOpportunity"]');
			
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var productVo = data[i];
				option += '<option value="'+ productVo.productId + '">'+ productVo.productName + "(" + productVo.productNum + ")" +'</option>';
			}
			var $select = $form.find('select[name="productId"]');
			$select.html(option);
			
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var productVo = data[i];
				option += '<option value="'+ productVo.productId + '">'+ productVo.productPrice +'</option>';
			}
			var $select = $form.find('select[name="productPrice"]');
			$select.html(option);
			
			$('div[data-custom="addCustom"]').hide(500);
			$('div[data-custom="editCustom"]').hide(500);
			$('div[data-custom="information"]').hide(1000);
			$('div[data-BusinessOpportunity="addBusinessOpportunity"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var addBusinessOpportunity = function() {
	var url = projectURL + "mainBodys/addBusinessOpportunityVo";
	
	var $form = $('form[data-BusinessOpportunity="addBusinessOpportunity"]');
	var customId = $form.find(':input[name="customId"]').val();
	var productId =$form.find('select[name="productId"]').val();
	var preSalesAmount = $form.find(':input[name="preSalesAmount"]').val();
	var preDealTime = $form.find(':input[name="preDealTime"]').val();
	var remark =$form.find('textarea[name="remark"]').val();
	var salesStageId =$form.find('select[name="salesStageId"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			customId : customId,
			productId : productId ,
			preSalesAmount : preSalesAmount ,
			preDealTime : preDealTime ,
			remark : remark ,
			salesStageId : salesStageId
		},
		success : function(data) {
			
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			refreshCustomInfos();
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var productIdSelect = function(_this) {
	var productId = $(_this).val();
	$('select[name="productPrice"]').val(productId);
}

var income = function() {
	var $form = $('form[data-BusinessOpportunity="addBusinessOpportunity"]');
	
	var productPrice =$form.find('select[name="productPrice"]').val();
	productPrice = $('select[name="productPrice"]').find("option[value='"+ productPrice +"']").html();
	var preSalesAmount = $form.find(':input[name="preSalesAmount"]').val();
	
	if(preSalesAmount < productPrice) {
		setAlertModalTitleAndBody("提示", "低于产品价格，无法创建商机");
		$('div[data-Modal="alertModal"]').modal('show');
		return false;
	}else {
		return true;
	}
	
}

/**  /客户信息 /end **/
/************************************************************/


/************************************************************/
/**   商机 begin **/
var initBusinessOpportunityInfos = function() {
	var dataTableURL = projectURL + "mainBodys/getBusinessOpportunityVoByFollwer";
	dataTables = $('table[data-businessOpportunity="allBusinessOpportunityInfos"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-BusinessOpportunity="editBusinessOpportunity"]').submit(function() {  
		editBusinessOpportunity();
		return false;
	}); 
	
	$('form[data-Task="addTask"]').submit(function() {
		addTask();
	});
	
	//任务开始时间
	$('div[name="taskStartTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-mm-dd',
		startDate : new Date() 
    }).on('changeDate',function() {
    	var date = Date.parse($('div[name="taskStartTime"]').data().date);
    	date.setDate(date.getDate() + 1);
    	$(':input[name="taskEndTime"]').val("");
    	$('div[name="taskEndTime"]').datetimepicker('setStartDate',date);
    	
    	var taskStartTime = Date.parse($('div[name="taskStartTime"]').data().date);
    	var taskEndTime = Date.parse($('div[name="taskEndTime"]').data().date);
    	var dataTime = taskEndTime.getTime() - taskStartTime.getTime();
    	var days = Math.floor(dataTime/(24*3600*1000))
    	if(days < 1) 
    		$(':input[name="taskEndTime"]').val(dateFormat_2(date));
    });
	
	//任务截止时间
	$('div[name="taskEndTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-mm-dd'
    }).on('changeDate',function() {
    	var taskStartTime = Date.parse($('div[name="taskStartTime"]').data().date);
    	var taskEndTime = Date.parse($('div[name="taskEndTime"]').data().date);
    	var dataTime = taskEndTime.getTime() - taskStartTime.getTime();
    	var days = Math.floor(dataTime/(24*3600*1000))
    	if(days < 1) 
    		$(':input[name="taskStartTime"]').val("");
    });

	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-Task="addTask"]').hide(500);
	$('div[data-task="businessOpportunitysAllTask"]').hide(500);
	$('div[data-oTaskDetail="oTaskDetail"]').hide(500);
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').show(1000);
}

var refreshBusinessOpportunityInfos = function() {
	if(dataTables != null)
		dataTables.fnDestroy();
	var dataTableURL = projectURL + "mainBodys/getBusinessOpportunityVoByFollwer";
	dataTables = $('table[data-businessOpportunity="allBusinessOpportunityInfos"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-Task="addTask"]').hide(500);
	$('div[data-task="businessOpportunitysAllTask"]').hide(500);
	$('div[data-oTaskDetail="oTaskDetail"]').hide(500);
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').show(1000);
	
	$('form[data-BusinessOpportunity="editBusinessOpportunity"]').find(':input[type="reset"]').click();
}

var editBusinessOpportunityShow = function(businessOpportunityId) {
	var url = projectURL + "mainBodys/selectBusinessOpportunityVoByPrimaryKey";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			businessOpportunityId : businessOpportunityId
		},
		success : function(data) {
			//获取商机信息
			
			var url = projectURL + "mainBodys/canChooseSalesStageVo";
			$.ajax({
				url : url,
				type : "POST",
				data : {
					rateOfProgress : data.salesStageVo.rateOfProgress
				},
				success : function(dataNow) {
					//获取可选的销售阶段
					$form = $('form[data-BusinessOpportunity="editBusinessOpportunity"]');
					var option = '';
					for(var i=0 ;i<dataNow.length; i++) {
						var salesStageVo = dataNow[i];
						option += '<option value="'+ salesStageVo.salesStageId + '">'+ salesStageVo.salesStageName +'</option>';
					}
					var $select = $form.find('select[name="salesStageId"]');
					$select.html(option);
					
					$form.find(':input[name="businessOpportunityId"]').val(data.businessOpportunityId);
					$form.find(':input[name="productName"]').val(data.productVo.productName);
					$form.find('select[name="salesStageId"]').val(data.salesStageVo.salesStageId);
					$form.find(':input[name="productPrice"]').val(data.productVo.productPrice);
					$form.find(':input[name="preSalesAmount"]').val(data.preSalesAmount);
					$form.find(':input[name="preDealTime"]').val(dateFormat_2(data.preDealTime));
					$form.find('textarea[name="remark"]').val(data.remark);
					
					$('div[data-BusinessOpportunity="editBusinessOpportunity"]').show(1000);
					$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').hide(500);
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editBusinessOpportunity = function() {
	if(income2() == false) return;
	
	$form = $('form[data-BusinessOpportunity="editBusinessOpportunity"]');
	
	var businessOpportunityId = $form.find(':input[name="businessOpportunityId"]').val();
	var salesStageId = $form.find('select[name="salesStageId"]').val();
	var preSalesAmount = $form.find(':input[name="preSalesAmount"]').val();
	var preDealTime = $form.find(':input[name="preDealTime"]').val();
	var remark = $form.find('textarea[name="remark"]').val();
	var salesStageId = $form.find('select[name="salesStageId"]').val();
	
	var url = projectURL + "mainBodys/updateBusinessOpportunityVoByPrimaryKey";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			businessOpportunityId : businessOpportunityId,
			salesStageId : salesStageId ,
			preSalesAmount : preSalesAmount ,
			preDealTime : preDealTime ,
			remark : remark ,
			salesStageId : salesStageId
		},
		success : function(data) {
			
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var income2 = function() {
	var $form = $('form[data-BusinessOpportunity="editBusinessOpportunity"]');
	//如果已经输单
	if($('select[name="salesStageId"]').val() == "0b16581b-0d4c-11e7-9e9d-28d2444b860a") {
		$form = $('form[data-BusinessOpportunity="editBusinessOpportunity"]');
		$form.find(':input[name="preSalesAmount"]').val(0);
		$form.find(':input[name="preDealTime"]').val("3000-01-01");
		return true;
	}
	
	var productPrice =$form.find(':input[name="productPrice"]').val();
	var preSalesAmount = $form.find(':input[name="preSalesAmount"]').val();
	
	if(preSalesAmount < productPrice) {
		setAlertModalTitleAndBody("提示", "出售价格小于产品价格，无法创建商机");
		$('div[data-Modal="alertModal"]').modal('show');
		return false;
	}else {
		return true;
	}
}

var showCustomBusinessOpportunity = function(businessOpportunityId) {
	$('#main-content').load(projectURL + "mainBodys/loadMainBody/", {jspURL: 'mainBody/jsp/customBusinessOpportunity'},function() {
		$(':input[name="businessOpportunityId"]').val(businessOpportunityId);
		showCustomAndBusinessOpportunity();
	});
}

var showCustomAndBusinessOpportunity = function() {
	var url = projectURL + "mainBodys/selectBusinessOpportunityVoDeatailNoTask";
	
	var businessOpportunityId = $(':input[name="businessOpportunityId"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			businessOpportunityId : businessOpportunityId
		},
		success : function(data) {
			$('span[name="customName"]').html(data.customVo.customName);
			$('div[name="customLinkmanName"]').html(data.customVo.customLinkmanName);
			$('div[name="customLinkmanPost"]').html(data.customVo.customLinkmanPost);
			$('div[name="customLinkmanPhone"]').html(data.customVo.customLinkmanPhone);
			$('div[name="customAddress"]').html(data.customVo.customAddress);
			$('div[name="customLinkmanRemark"]').html(data.customVo.customLinkmanRemark);
			$('span[name="productName"]').html(data.productVo.productName);
			$('span[name="employeeRealName"]').html(data.customVo.receiver.employeeRealName);
			$('span[name="departmentName"]').html(data.customVo.departmentVo.departmentName);
			$('span[name="preSalesAmount"]').html(data.preSalesAmount);
			$('span[name="preDealTime"]').html(dateFormat_2(data.preDealTime));
			$('span[name="salesStageName"]').html(data.salesStageVo.salesStageName);
			$('span[name="remark"]').html(data.remark);
			$('span[name="rateOfProgress"]').html(data.salesStageVo.rateOfProgress);
			$('div[data-rateOfProgress="rateOfProgress"]').css("width",data.salesStageVo.rateOfProgress + "%");
		
		
			var url = projectURL + "mainBodys/selectFeedbackByBusinessOpportunityVoId";
			$.ajax({
				url : url,
				type : "POST",
				data : {
					businessOpportunityId : businessOpportunityId
				},
				success : function(data) {
					if(data == null || data == "") {
						$('div[data-timeLine="feedback"]').html("");
						return;
					}
					var html = "";
					var feedbackVoList = data.feedbackVoList;
					for(var i=0; i<feedbackVoList.length; i++) {
						var feedbackVo = feedbackVoList[i];
						html += 
							'<div class="msg-time-chat">' +
								'<a class="message-img" href="#">' +
									'<img alt="" src="' + feedbackVo.employeeVo.employeeImgPath + '" class="avatar"> '+
								'</a>' +
								'<div class="message-body msg-in">' +
									'<span class="arrow"></span>' +
									'<div class="text">' +
										'<p class="attribution">' +
											'<a href="javascript:void(0)" >' + feedbackVo.employeeVo.employeeRealName + '</a>' +
												datetimeFormat_2(feedbackVo.feedbackTime) +
										'</p>' +
										'<p>' + feedbackVo.feedbackDetail + '</p>' +
									'</div>' +
								'</div>' +
							'</div>';
					}
					$('div[data-timeLine="feedback"]').html(html);	
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
		
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var addTaskShow = function(businessOpportunityId, followEmployeeIdTask, employeeRealName) {
	var $form = $('form[data-Task="addTask"]');
	$form.find(':input[name="businessOpportunityIdTask"]').val(businessOpportunityId);
	$form.find(':input[name="followEmployeeIdTask"]').val(followEmployeeIdTask);
	$form.find(':input[name="employeeRealName"]').val(employeeRealName);
	
	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').hide(500);
	$('div[data-Task="addTask"]').show(1000);
}

var addTask = function() {
	var $form = $('form[data-Task="addTask"]');
	var businessOpportunityId = $form.find(':input[name="businessOpportunityIdTask"]').val();
	var followEmployeeIdTask = $form.find(':input[name="followEmployeeIdTask"]').val();
	var taskContent = $form.find('textarea[name="taskContent"]').val();
	var taskStartTime = $form.find(':input[name="taskStartTime"]').val();
	var taskEndTime = $form.find(':input[name="taskEndTime"]').val();
	
	
	var url = projectURL + "mainBodys/addTask";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			businessOpportunityIdTask : businessOpportunityId,
			followEmployeeIdTask : followEmployeeIdTask ,
			taskContent : taskContent ,
			taskStartTime : taskStartTime ,
			taskEndTime : taskEndTime
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			var url = projectURL + "mainBodys/getUserInfos";
			$.ajax({
				url : url,
				type : "POST",
				success : function(data) {
					var WebsocketVo = {
							approverId : followEmployeeIdTask,
							senderId : data.employeeId,
							senderName : data.employeeRealName + "(新任务)",
							message : taskContent,
							URL : "mainBody/jsp/receiveTaskInformation"
					};
					doSend(JSON.stringify(WebsocketVo));
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
			
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var showBusinessOpportunitysTask  = function(businessOpportunityId) {
	var dataTableURL = projectURL + "mainBodys/getbusinessOpportunitysAllTask/" + businessOpportunityId;
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-task="businessOpportunitysAllTask"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').hide(500);
	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-Task="addTask"]').hide(500);
	$('div[data-oTaskDetail="oTaskDetail"]').hide(500);
	$('div[data-task="businessOpportunitysAllTask"]').show(1000);
	
	$('table[data-task="businessOpportunitysAllTask"]').removeAttr("style");
}

var reShowBusinessOpportunitysTask = function() {
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').hide(500);
	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-Task="addTask"]').hide(500);
	$('div[data-oTaskDetail="oTaskDetail"]').hide(500);
	$('div[data-task="businessOpportunitysAllTask"]').show(1000);
	
	$('table[data-task="businessOpportunitysAllTask"]').removeAttr("style");
}

var reShowBusinessOpportunity = function() {
	$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
	$('div[data-Task="addTask"]').hide(500);
	$('div[data-oTaskDetail="oTaskDetail"]').hide(500);
	$('div[data-task="businessOpportunitysAllTask"]').hide(500);
	$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').show(1000);
	
	$('table[data-task="businessOpportunitysAllTask"]').removeAttr("style");
}

var taskDetailShow = function(taskId, taskContent, taskReportDate, taskStartTime, taskEndTime, spEmployeeRealName, reEmployeeRealName, reEmployeeId, taskStop, reEmployeeId) {
	$form = $('form[data-oTaskDetail="oTaskDetail"]');
	$form.find(':input[name="taskId"]').val(taskId);
	$form.find(':input[name="reEmployeeId"]').val(reEmployeeId);
	$form.find('textarea[name="taskContent"]').val(taskContent);
	$form.find(':input[name="taskStartTime"]').val(taskStartTime);
	$form.find(':input[name="taskEndTime"]').val(taskEndTime);
	$form.find(':input[name="spEmployeeRealName"]').val(spEmployeeRealName);
	$form.find(':input[name="reEmployeeRealName"]').val(reEmployeeRealName);
	$form.find('select[name="taskStop"]').val(taskStop);
	
	var url = projectURL + "mainBodys/selectFeedbackVoByTaskId";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			taskId : taskId
		},
		success : function(data) {
			var html = "";
			for(var i=0; i<data.length; i++) {
				var dataNow = data[i];
				html += 
					'<div class="msg-time-chat">' +
						'<a class="message-img" href="#">' +
							'<img alt="" src="' + dataNow.employeeVo.employeeImgPath + '" class="avatar"> '+
						'</a>' +
						'<div class="message-body msg-in">' +
							'<span class="arrow"></span>' +
							'<div class="text">' +
								'<p class="attribution">' +
									'<a href="javascript:void(0)" >' + dataNow.employeeVo.employeeRealName + '</a>' +
										datetimeFormat_2(dataNow.feedbackTime) +
								'</p>' +
								'<p>' + dataNow.feedbackDetail + '</p>' +
							'</div>' +
						'</div>' +
					'</div>';
			}
			
			$('div[data-timeLine="feedback"]').html(html);	
			
			$('div[data-businessOpportunity="allBusinessOpportunityInfos"]').hide(500);
			$('div[data-BusinessOpportunity="editBusinessOpportunity"]').hide(500);
			$('div[data-Task="addTask"]').hide(500);
			$('div[data-task="businessOpportunitysAllTask"]').hide(500);
			$('div[data-oTaskDetail="oTaskDetail"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

/**   /商机 /end **/
/************************************************************/

/************************************************************/
/**   任务 begin **/

var initReceiveTaskInfo = function() {
	var dataTableURL = projectURL + "mainBodys/getReceiveTask";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-task="receiveTask"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-feedback="addFeedback"]').submit(function() {  
		addFeedback();
		return false;
	}); 
	
	$('div[data-feedback="addFeedback"]').hide(500);
	$('div[data-task="receiveTask"]').show();
}


var refreshTaskInfos = function() {
	if(dataTables != null) dataTables.fnDestroy();
	var dataTableURL = projectURL + "mainBodys/getReceiveTask";
	dataTables = $('table[data-task="receiveTask"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	$('div[data-feedback="addFeedback"]').hide(500);
	$('div[data-task="receiveTask"]').show();
	
	$('form[data-feedback="addFeedback"]').find(':input[type="reset"]').click();
}

var addFeedBackShow = function(taskId, taskContent, taskReportDate, taskStartTime, taskEndTime, spEmployeeRealName, reEmployeeRealName, reEmployeeId) {
	$form = $('form[data-feedback="addFeedback"]');
	$form.find(':input[name="taskId"]').val(taskId);
	$form.find('textarea[name="taskContent"]').val(taskContent);
	$form.find(':input[name="taskStartTime"]').val(taskStartTime);
	$form.find(':input[name="taskEndTime"]').val(taskEndTime);
	$form.find(':input[name="spEmployeeRealName"]').val(spEmployeeRealName);
	$form.find(':input[name="reEmployeeRealName"]').val(reEmployeeRealName);
	$form.find(':input[name="reEmployeeId"]').val(reEmployeeId);
	
	var url = projectURL + "mainBodys/selectFeedbackVoByTaskId";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			taskId : taskId
		},
		success : function(data) {
			var html = "";
			for(var i=0; i<data.length; i++) {
				var dataNow = data[i];
				html += 
					'<div class="msg-time-chat">' +
						'<a class="message-img" href="#">' +
							'<img alt="" src="' + dataNow.employeeVo.employeeImgPath + '" class="avatar"> '+
						'</a>' +
						'<div class="message-body msg-in">' +
							'<span class="arrow"></span>' +
							'<div class="text">' +
								'<p class="attribution">' +
									'<a href="javascript:void(0)" >' + dataNow.employeeVo.employeeRealName + '</a>' +
										datetimeFormat_2(dataNow.feedbackTime) +
								'</p>' +
								'<p>' + dataNow.feedbackDetail + '</p>' +
							'</div>' +
						'</div>' +
					'</div>';
			}
			
			$('div[data-timeLine="feedback"]').html(html);	
			
			
			$('div[data-task="receiveTask"]').hide(500);
			$('div[data-feedback="addFeedback"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var addFeedback = function() {
	$form = $('form[data-feedback="addFeedback"]');
	var taskId = $form.find(':input[name="taskId"]').val();
	var followEmployeeIdFeedback = $form.find(':input[name="reEmployeeId"]').val();
	var feedbackDetail = $form.find('textarea[name="feedbackDetail"]').val();
	
	var url = projectURL + "mainBodys/insertFeedback";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			taskId : taskId,
			followEmployeeIdFeedback : followEmployeeIdFeedback ,
			feedbackDetail : feedbackDetail
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			refreshTaskInfos();
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}


var initSenderTaskInfo = function() {
	var dataTableURL = projectURL + "mainBodys/getSenderTask";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-task="senderTask"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-Task="editTask"]').submit(function() {  
		editTask();
		return false;
	}); 
	
	
	//任务开始时间
	$('div[name="taskStartTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-mm-dd',
		startDate : new Date() 
    }).on('changeDate',function() {
    	var taskStartTime = Date.parse($(':input[name="taskStartTime"]').val());
    	var taskEndTime = Date.parse($(':input[name="taskEndTime"]').val());
    	var dataTime = taskEndTime.getTime() - taskStartTime.getTime();
    	var days = Math.floor(dataTime/(24*3600*1000))
    	if(days < 1) {
    		$(':input[name="taskEndTime"]').val("");
    	}
    	var date = Date.parse($('div[name="taskStartTime"]').data().date);
    	date.setDate(date.getDate() + 1);
    	$('div[name="taskEndTime"]').datetimepicker('setStartDate',date);
    });
	
	//任务截止时间
	var taskStartTime = Date.parse($(':input[name="taskStartTime"]').val());
	$('div[name="taskEndTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-mm-dd',
		startDate: taskStartTime
    }).on('changeDate',function() {
    	var taskStartTime = Date.parse($(':input[name="taskStartTime"]').val());
    	var taskEndTime = Date.parse($(':input[name="taskEndTime"]').val());
    	var dataTime = taskEndTime.getTime() - taskStartTime.getTime();
    	var days = Math.floor(dataTime/(24*3600*1000))
    	if(days < 1) 
    		$(':input[name="taskStartTime"]').val("");
    });
	
	
	$('div[data-Task="editTask"]').hide(500);
	$('div[data-task="senderTask"]').show();
}

var refreshSenderTaskInfos = function() {
	if(dataTables != null) dataTables.fnDestroy();
	var dataTableURL = projectURL + "mainBodys/getSenderTask";
	dataTables = $('table[data-task="senderTask"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	$('div[data-Task="editTask"]').hide(500);
	$('div[data-task="senderTask"]').show();
	
	$('form[data-feedback="addFeedback"]').find(':input[type="reset"]').click();
}

var editTaskShow = function(taskId, taskContent, taskReportDate, taskStartTime, taskEndTime, spEmployeeRealName, reEmployeeRealName, reEmployeeId, taskStop, reEmployeeId) {
	$form = $('form[data-Task="editTask"]');
	$form.find(':input[name="taskId"]').val(taskId);
	$form.find(':input[name="reEmployeeId"]').val(reEmployeeId);
	$form.find('textarea[name="taskContent"]').val(taskContent);
	$form.find(':input[name="taskStartTime"]').val(taskStartTime);
	$form.find(':input[name="taskEndTime"]').val(taskEndTime);
	$form.find(':input[name="spEmployeeRealName"]').val(spEmployeeRealName);
	$form.find(':input[name="reEmployeeRealName"]').val(reEmployeeRealName);
	$form.find('select[name="taskStop"]').val(taskStop);
	
	//任务开始时间
	var taskStartTime = Date.parse($(':input[name="taskStartTime"]').val());
	if(taskStartTime.getTime() < new Date().getTime()) {
		$(':input[name="taskStartTime"]').attr("readonly", "readonly");
	}
	$('div[name="taskStartTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-MM-dd',
		startDate : new Date() 
    }).on('changeDate',function() {
    	var taskStartTime = Date.parse($(':input[name="taskStartTime"]').val());
    	var taskEndTime = Date.parse($(':input[name="taskEndTime"]').val());
    	var dataTime = taskEndTime.getTime() - taskStartTime.getTime();
    	var days = Math.floor(dataTime/(24*3600*1000))
    	if(days < 1) {
    		$(':input[name="taskEndTime"]').val("");
    	}
    	var date = Date.parse($('div[name="taskStartTime"]').data().date);
    	date.setDate(date.getDate() + 1);
    	$('div[name="taskEndTime"]').datetimepicker('setStartDate',date);
    });
	
	//任务截止时间
	$('div[name="taskEndTime"]').datetimepicker({
        language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0,
		format: 'yyyy-MM-dd',
    });
	var date = Date.parse($(':input[name="taskStartTime"]').val());
	date.setDate(date.getDate() + 1);
	$('div[name="taskEndTime"]').datetimepicker('setStartDate',date);
	
	var url = projectURL + "mainBodys/selectFeedbackVoByTaskId";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			taskId : taskId
		},
		success : function(data) {
			var html = "";
			for(var i=0; i<data.length; i++) {
				var dataNow = data[i];
				html += 
					'<div class="msg-time-chat">' +
						'<a class="message-img" href="#">' +
							'<img alt="" src="' + dataNow.employeeVo.employeeImgPath + '" class="avatar"> '+
						'</a>' +
						'<div class="message-body msg-in">' +
							'<span class="arrow"></span>' +
							'<div class="text">' +
								'<p class="attribution">' +
									'<a href="javascript:void(0)" >' + dataNow.employeeVo.employeeRealName + '</a>' +
										datetimeFormat_2(dataNow.feedbackTime) +
								'</p>' +
								'<p>' + dataNow.feedbackDetail + '</p>' +
							'</div>' +
						'</div>' +
					'</div>';
			}
			
			$('div[data-timeLine="feedback"]').html(html);	
			
			$('div[data-task="senderTask"]').hide(500);
			$('div[data-Task="editTask"]').show(1000);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var editTask = function() {
	$form = $('form[data-Task="editTask"]');
	var taskId = $form.find(':input[name="taskId"]').val();
	var taskContent = $form.find('textarea[name="taskContent"]').val();
	var taskStartTime = $form.find(':input[name="taskStartTime"]').val();
	var taskEndTime = $form.find(':input[name="taskEndTime"]').val();
	var taskStop = $form.find('select[name="taskStop"]').val();
	
	var url = projectURL + "mainBodys/updateSenderTask";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			taskId : taskId,
			taskContent : taskContent ,
			taskStartTime : taskStartTime ,
			taskEndTime : taskEndTime ,
			taskStop : taskStop 
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

/**   /任务 /end **/
/************************************************************/
/************************************************************/
/**   外勤 begin **/

var initWorkOutsideInfo = function() {
	var dataTableURL = projectURL + "mainBodys/selectProcessVo";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-workOutside="showWorkOutside"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('form[data-process="addProcess"]').submit(function() {  
		addProcess();
		return false;
	}); 
	
	$('div[data-process="addProcess"]').hide(500);
	$('div[data-workOutside="showWorkOutside"]').show(1000);
}

var reFreshWorkOutsideInfo = function() {
	var dataTableURL = projectURL + "mainBodys/selectProcessVo";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-workOutside="showWorkOutside"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
	$('div[data-process="addProcess"]').hide(500);
	$('div[data-workOutside="showWorkOutside"]').show(1000);
}

var addProcessShow = function() {
	
	//外勤开始时间
	$('div[name="processStartTime"]').datetimepicker({
		language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 0,
		format: 'yyyy-mm-dd hh:ii',
		startDate : new Date() 
    }).on('changeDate',function() {
    	var date = Date.parse($('input[name="processStartTime"]').val());
    	$('div[name="processEndTime"]').datetimepicker('setStartDate',date);
    	
    	if($(':input[name="processEndTime"]').val() == "" || $(':input[name="processEndTime"]').val() == undefined)
    		return;
    	var processStartTime = Date.parse($(':input[name="processStartTime"]').val());
    	var processEndTime = Date.parse($(':input[name="processEndTime"]').val());
    	var dataTime = processEndTime.getTime() - processStartTime.getTime();
    	if(dataTime < 0) {
    		$(':input[name="processEndTime"]').val("");
    	}
    });
	
	//外勤截止时间
	$('div[name="processEndTime"]').datetimepicker({
		language:  'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
        showMeridian: 0,
		format: 'yyyy-mm-dd hh:ii',
		startDate : new Date() 
    });
	
	//获取申请人
	var url = projectURL + "mainBodys/getUserInfos";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var $form = $('form[data-process="addProcess"]');
			$form.find(':input[name="processEmployeeName"]').val(data.employeeRealName);
			$form.find(':input[name="processEmployeeId"]').val(data.employeeId);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
	
	//获取审批人
	var url = projectURL + "mainBodys/getApproverList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var $form = $('form[data-process="addProcess"]');
			
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var processApprover = data[i];
				option += '<option value="'+ processApprover.employeeId + '">'+ processApprover.employeeRealName +'</option>';
			}
			var $select = $form.find('select[name="processApprover"]');
			$select.html(option);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
	
	
	$('div[data-workOutside="showWorkOutside"]').hide(500);
	$('div[data-process="addProcess"]').show(1000);
}


var addProcess = function() {
	var $form = $('form[data-process="addProcess"]');
	var processContent = $form.find('textarea[name="processContent"]').val();
	var processStartTime = $form.find(':input[name="processStartTime"]').val();
	var processEndTime = $form.find(':input[name="processEndTime"]').val();
	var processEmployeeId = $form.find(':input[name="processEmployeeId"]').val();
	var processApprover = $form.find('select[name="processApprover"]').val();
	var processEmployeeName = $form.find(':input[name="processEmployeeName"]').val();
	
	var url = projectURL + "mainBodys/addProcessVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			processEmployeeId : processEmployeeId,
			processApprover : processApprover,
			processContent : processContent,
			processStartTime : processStartTime,
			processEndTime : processEndTime
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			
			var WebsocketVo = {
					approverId : processApprover,
					senderId : processEmployeeId,
					senderName : processEmployeeName,
					message : processContent,
					URL : "mainBody/jsp/workOutsideApprove"
			};
			doSend(JSON.stringify(WebsocketVo));
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var initWorkOutsideApprove = function() {
	var dataTableURL = projectURL + "mainBodys/selectProcessVoApprove";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-workOutside="approve"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });
	
//	$('form[data-process="addProcess"]').submit(function() {  
//		addProcess();
//		return false;
//	}); 
//	
//	$('div[data-process="addProcess"]').hide(500);
//	$('div[data-workOutside="showWorkOutside"]').show(1000);
}

var refreshWorkOutsideApprove = function() {
	var dataTableURL = projectURL + "mainBodys/selectProcessVoApprove";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-workOutside="approve"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });	
}

var processOkResult = function(processId) {
	var url = projectURL + "mainBodys/updateProcessVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			processId : processId,
			processState : 1
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			refreshWorkOutsideApprove();
			
			var url = projectURL + "mainBodys/getProcessVoByProcessVoId";
			$.ajax({
				url : url,
				type : "POST",
				data : {
					processId : processId
				},
				success : function(data) {
					var WebsocketVo = {
							approverId : data.spOutEmployee.employeeId,
							senderId : data.reOutEmployee.employeeId,
							senderName : data.reOutEmployee.employeeRealName,
							message : "同意" + "(" + data.processContent +")",
							URL : "mainBody/jsp/workOutside"
					};
					doSend(JSON.stringify(WebsocketVo));
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "websocket发送信息失败");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}

var processTrashResult = function(processId) {
	var url = projectURL + "mainBodys/updateProcessVo";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			processId : processId,
			processState : -1
		},
		success : function(data) {
			setAlertModalTitleAndBody("提示", data.obj);
			$('div[data-Modal="alertModal"]').modal('show');
			refreshWorkOutsideApprove();
			
			var url = projectURL + "mainBodys/getProcessVoByProcessVoId";
			$.ajax({
				url : url,
				type : "POST",
				data : {
					processId : processId
				},
				success : function(data) {
					var WebsocketVo = {
							approverId : data.spOutEmployee.employeeId,
							senderId : data.reOutEmployee.employeeId,
							senderName : data.reOutEmployee.employeeRealName,
							message : "不同意" + "(" + data.processContent +")",
							URL : "mainBody/jsp/workOutside"
					};
					doSend(JSON.stringify(WebsocketVo));
				},
				error : function() {
					setAlertModalTitleAndBody("提示", "websocket发送信息失败");
					$('div[data-Modal="alertModal"]').modal('show');
				}
			});
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}


var workOutsideCalendarInit =function() {
	var url = projectURL + "mainBodys/selectProcessVoForCalendar";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			processState : 1
		},
		success : function(data) {
			if(data.length == 0) return;
			var dataSource = [];
			for(var i=0; i<data.length; i++) {
				calendarInfos = data[i];
				var dd = {
					title: calendarInfos.title,
	                start: new Date(calendarInfos.startY, calendarInfos.startM, calendarInfos.startD, calendarInfos.startH, calendarInfos.startI),
	                end: new Date(calendarInfos.endY, calendarInfos.endM, calendarInfos.endD, calendarInfos.endH, calendarInfos.endI),
	                allDay: false
				};
				dataSource[i] = dd;
			}
			
			
			var date = new Date();
		    var d = date.getDate();
		    var m = date.getMonth();
		    var y = date.getFullYear();
			$('div[data-calendar="calendar"]').fullCalendar({
		        header: {
		            left: 'prev,next today',
		            center: 'title',
		            right: 'month,basicWeek,basicDay'
		        },
		        editable: true,
		        monthNames: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
				monthNamesShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
				dayNames: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
				dayNamesShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六"],
				today: ["今天"],
				firstDay: 1,
				buttonText: {
					today: '本月',
					month: '月',
					week: '周',
					day: '日',
					prev: '往前',
					next: '往后',
				},
		        events: dataSource,
		        dayClick: function(date, allDay, jsEvent, view) {
//		        	var timestamp = Date.parse(date);
//		        	timestamp = timestamp / 1000;
//		        	
//		        	var url = projectURL + "mainBodys/selectProcessVoNoOut";
//		        	$.ajax({
//		        		url : url,
//		        		type : "POST",
//		        		data : {
//		        			nowTime : timestamp,
//		        			processState : 1
//		        		},
//		        		success : function(data) {
//		        			alert(data);
//		        		},
//		        		error : function() {
//		        			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
//		        			$('div[data-Modal="alertModal"]').modal('show');
//		        		}
//		        	});
		        },
				eventClick: function (event){
					$.confirm({
					    title: false,
					    content:  '出勤原因：' + event.title + ' <br> ' +
					              '开始时间：' + event.start.format("yyyy-MM-dd hh:mm") + ' <br> ' +
					    		  '结束时间: ' + event.end.format("yyyy-MM-dd hh:mm") + ' <br> ',
					    buttons: {
					        确定: {
					        },
					    }
					});
				},
		    });
			
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
	
}
/**   /外勤 /end **/
/************************************************************/
/**  预测分析 begin **/

var initProspective = function() {
	var dataTableURL = projectURL + "mainBodys/selectForAnalyse";
	
	if(dataTables != null) dataTables.fnDestroy();
	
	dataTables = $('table[data-prospective="prospectiveCustomers"]').dataTable({
    	"bLengthChange": false,   // 去掉每页显示多少条数据方法
    	"sDom": "<'row-fluid'<'span6'l><'span6'f>r>t<'row-fluid'<'span6'i><'span6'p>>",
        "sPaginationType": "bootstrap",
        "oLanguage": {
            "sLengthMenu": "_MENU_ per page",
            "oPaginate": {
                "sPrevious": "Prev",
                "sNext": "Next"
            }
        },
      "sAjaxSource": dataTableURL,
      "sAjaxDataProp": "data",
      "bStateSave": true
    });	
}

var initChars = function() {
	$('div[data-char="charLine"]').hide();
	$('div[data-char="charPie"]').hide();
}

var charShow = function(callback, charFeedbackCount , data, xAxisData) {
	var charInstance = echarts.getInstanceByDom(charFeedbackCount);
	if(charInstance != undefined && charInstance != null) {
		charInstance.dispose();
	}
	var charInstance = echarts.init(charFeedbackCount);
	charInstance.showLoading();
	var option = callback(charInstance, data, xAxisData);
	charInstance.setOption(option);
	charInstance.resize();
	charInstance.hideLoading();
}

var setLineData = function(myChart, data, xAxisData) {
	var symbolSize = 20;
	option = {
	    xAxis: {
	        data:['2017-3-1', '2017-3-8', '2017-3-15', '2017-3-22', '2017-3-29']
	    },
	    yAxis: {
	    	data: [1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12, 13, 14, 15]
	    },
	    tooltip: {
	    	trigger: 'axis'
	    },
	    series: [
	        {
	        	name: '沟通次数',
	            type: 'line',
	            smooth: true,
	            symbolSize: symbolSize,
	            data: data
	        }
	    ]
	};
	return option;
}

var setPieData = function(myChart, data, xAxisData) {
	option = {
		    backgroundColor: '#fff',

		    tooltip : {
		        trigger: 'item',
		        formatter: "{a} <br/>{b} : {c} ({d}%)"
		    },

		    visualMap: {
		        show: false,
		        min: 10000,
		        max: 99999999,
		        inRange: {
		            colorLightness: [0, 0.9]

		        }
		    },
		    color : ['red', 'yellow'],
		    series : [
		        {
		            name:'销售金额',
		            type:'pie',
		            radius : '55%',
		            center: ['50%', '50%'],
		            data:data,
		            roseType: 'angle',
		            label: {
		                normal: {
		                    textStyle: {
		                        color: 'red',
		                        fontSize: 13
		                    }
		                }
		            },
		            labelLine: {
		                normal: {
		                    lineStyle: {
		                        color: 'rgba(0, 0, 0, 1)'
		                    },
		                    smooth: 0.2,
		                    length: 20,
		                    length2: 40
		                }
		            },
		            itemStyle: {
		                normal: {
		                    color: '#c23531',
		                    shadowBlur: 2000,
		                    shadowColor: 'rgba(0, 0, 0, 1)'
		                }
		            },

		            animationType: 'scale',
		            animationEasing: 'elasticOut',
		            animationDelay: function (idx) {
		                return Math.random() * 200;
		            }
		        }
		    ]
		};
	return option;
}


var showAnalyse = function(businessOpportunityId) {
	var url = projectURL + "mainBodys/selectForChar";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			businessOpportunityId : businessOpportunityId,
		},
		success : function(data) {
			$('div[data-char="charLine"]').show();
			$('div[data-char="charPie"]').show();
			$('body').animate({
				scrollTop: '440px'
			});
			
			var lineData = [
					data.lineCharData.data[0],
					data.lineCharData.data[1],
					data.lineCharData.data[2],
					data.lineCharData.data[3],
					data.lineCharData.data[4]
				];
			var xAxisData = [
			        data.lineCharData.xAxisData[0],
			        data.lineCharData.xAxisData[1],
			        data.lineCharData.xAxisData[2],
			        data.lineCharData.xAxisData[3],
			        data.lineCharData.xAxisData[4]
			    ];
			var lineChar = $('div[data-char="feedbackCount"]')[0];
			charShow(setLineData, lineChar, lineData, xAxisData);
			
			var pieData = [
			                {value:data.pieCharList[0].value, name:data.pieCharList[0].name},
			                {value:data.pieCharList[1].value, name:data.pieCharList[1].name}
			              ];
			var pieChar = $('div[data-char="money"]')[0];
			charShow(setPieData, pieChar, pieData, null);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}
/**  /预测分析 /end **/

/**  socket begin  **/

var connect = function() {
	webSocketInstance = new WebSocket(socketURL);
    console.log("websocket connect ...");
    
    webSocketInstance.onmessage = function(event) {
    	data = eval('(' + event.data + ')' );
    	$.gritter.add({
            title: data.senderName,
            text:  data.message,
            image: data.imgURL,
            sticky: true,
            time: '',
            class_name: 'my-sticky-class'
        });
    };
    
    webSocketInstance.onerror = function(event) {
    	webSocketInstance.close();
    	console.log("error");
    };
    
}

var doSend = function(webSocketMessage) {
	if(webSocketInstance == null) {
		connect();
	}
	webSocketInstance.send(webSocketMessage);
}

/**  /socket /end  **/