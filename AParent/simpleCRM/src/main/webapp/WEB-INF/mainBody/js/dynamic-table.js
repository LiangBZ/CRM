/*
var dataTables;
var dataTableURL;
var treeURL;

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


var addEmployee = function(_this) {
	alert("add..");
}

var editDepartment = function(_this, projectURL) {
	alert("edit");
	var dataId = $(_this).data("id");
	$.ajax({
		url : projectURL + "\\mainBodys\\getDepartmentVoList",
		type : "POST",
		data : {
			departmentId : dataId
		},
		success : function(data) {
			var department = data[0];
			$('div[data-Modal="organizing_editDepartment"]').find(':input[name="departmentName"]').val(department.departmentId);
			$('div[data-Modal="organizing_editDepartment"]').modal('show');
		},
		error : function() {
			alert("查询部门失败");
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
*/