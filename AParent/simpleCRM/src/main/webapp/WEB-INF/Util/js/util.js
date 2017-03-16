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
