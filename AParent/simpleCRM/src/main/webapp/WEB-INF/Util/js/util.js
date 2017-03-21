var projectURL="http://localhost:8080/simpleCRM/";

function doNext(callback, _url, _data1, _data2) {
	callback(_url, _data1, _data2);
}

function isTrue(isTrue) {
	return isTrue;
}

function setConfirmModalTitleAndBody(title, body) {
	$confirmModal = $('div[data-Modal="confirmModal"]');
	$confirmModal.find('h4[data-modalPart="modalTitle"]').html(title);
	$confirmModal.find('div[data-modalPart="modalBody"]').html(body);
}

function setAlertModalTitleAndBody(title, body) {
	$alertModal = $('div[data-Modal="alertModal"]');
	$alertModal.find('h4[data-modalPart="modalTitle"]').html(title);
	$alertModal.find('div[data-modalPart="modalBody"]').html(body);
}

function showInfos(infos, message, obj, url) {
	if(infos !== null && infos !== "") {
		alert(message + ":" + obj);
		location.href = url;
	}
}

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

var addDepartment = function() {
	$modal = $('div[data-Modal="organizing_addDepartment"]');
	$modal.modal('show');
}

var addDepartmentClick = function(url) {
	$modal = $('div[data-Modal="organizing_addDepartment"]');
	$form = $modal.find("form");
	$form.bootstrapValidator(option);
	$form.data("bootstrapValidator").validateField('departmentName');
	isTrue = $modal.find("form").data("bootstrapValidator").isValidField('departmentName');
	if (isTrue == false) return;
	
	var departmentName = $form.find(':input[name="departmentName"]').val();
	$.ajax({
		url : url,
		type : "POST",
		data : {
			departmentName : departmentName
		},
		
		success : function(data) {
			$('button[data-dismiss="modal"]').click();
			
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


var addEmployee = function(_this) {
	alert("add..");
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
			$('div[data-Modal="organizing_editDepartment"]').find(':input[name="departmentName"]').val(department.departmentName);
			$('div[data-Modal="organizing_editDepartment"]').find(':input[name="departmentId"]').val(department.departmentId);
			$('div[data-Modal="organizing_editDepartment"]').modal('show');
		},
		error : function() {
			alert("查询部门失败");
		}
	});
}

var saveClick = function(url) {
	$modal = $('div[data-Modal="organizing_editDepartment"]');
	$form = $modal.find("form");
	$form.bootstrapValidator(option);
	$form.data("bootstrapValidator").validateField('departmentName');
	isTrue = $modal.find("form").data("bootstrapValidator").isValidField('departmentName');
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
	initProductInfos();
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
	
	$('div[data-custom="addCustom"]').hide(500);
	$('div[data-custom="editCustom"]').hide(500);
	$('div[data-custom="information"]').show(1000);
}

var refreshCustomInfos = function() {
	dataTables.fnDestroy();
	initCustomInfos();
	$('form[data-custom="addCustom"]').find(':input[type="reset"]').click();
}

var addCustomShow = function() {
	$('div[data-custom="addCustom"]').show(1000);
	$('div[data-custom="information"]').hide(500);
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
/*var addCustomShow = function() {
	$('div[data-custom="addCustom"]').show(1000);
	$('div[data-custom="information"]').hide(500);
	if($('form[data-custom="addCustom"]').find('select[name="departmentId"]').length == 0) return;
	var url = projectURL + "mainBodys/getCustomDepartmentVoList";
	$.ajax({
		url : url,
		type : "POST",
		success : function(data) {
			var option = '';
			for(var i=0 ;i<data.length; i++) {
				var department = data[i];
				option += '<option value="'+ department.departmentId + '">'+ department.departmentName +'</option>';
			}
			var $select = $('form[data-custom="addCustom"]').find('select[name="departmentId"]');
			$select.html(option);
		},
		error : function() {
			setAlertModalTitleAndBody("提示", "系统出现错误，请重试");
			$('div[data-Modal="alertModal"]').modal('show');
		}
	});
}
*/
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
	var url = projectURL + "mainBodys/editCustomShow";
	$.ajax({
		url : url,
		type : "POST",
		data : {
			customId : customId
		},
		success : function(data) {
			var custom = data;
			var $form = $('form[data-custom="editCustom"]');
			$form.find(':input[name="customId"]').val(custom.customId);
			$form.find(':input[name="customName"]').val(custom.customName);
			$form.find(':input[name="customAddress"]').val(custom.customAddress);
			$form.find(':input[name="customLinkmanName"]').val(custom.customLinkmanName);
			$form.find(':input[name="customLinkmanPhone"]').val(custom.customLinkmanPhone);
			$form.find(':input[name="customLinkmanPost"]').val(custom.customLinkmanPost);
			$form.find('textarea[name="customLinkmanRemark"]').val(custom.customLinkmanRemark);
			$form.find('select[name="customRankId"]').val(custom.customRankId);
			$form.find('select[name="customStateId"]').val(custom.customStateId);
			
			$('div[data-custom="information"]').hide(500);
			$('div[data-custom="addCustom"]').hide(500);
			$('div[data-custom="editCustom"]').show(1000);
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

var showCustomBusinessOpportunity = function(customId) {
	$('#main-content').load(projectURL + "mainBodys/loadMainBody/", {jspURL: 'mainBody/jsp/showCustom'},function() {
		
	});
}

/**  /客户信息 /end **/
/************************************************************/
