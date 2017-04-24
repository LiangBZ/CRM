/*
 * var zNodes = [ { id : 1, pId : "root", name : "crm", open : true }, { id :
 * 11, pId : 1, name : "技术部" }, { id : 111, pId : 11, name : "张三" }, { id : 112,
 * pId : 11, name : "李四" }, { id : 113, pId : 11, name : "王五" }, { id : 114, pId :
 * 11, name : "赵六" }, { id : 12, pId : 1, name : "人事部" }, { id : 121, pId : 12,
 * name : "梁伯昭" }, { id : 122, pId : 12, name : "黄河森" }, { id : 123, pId : 12,
 * name : "江彦增" }, { id : 124, pId : 12, name : "洪清猫" }, { id : 13, pId : 1,
 * name : "离岗员工", isParent : true },{ id : 131, pId : 13, name : "洪清猫" } ];
 */

function initTree(treeDataSourceURL) {
	var setting = {
			enable:true,
			view : {
				selectedMulti : false
			},
			check : {
				enable : false
			},
			data : {
				simpleData : {
					enable : true,
					idKey : "id",
					pIdKey : "pId",
				}
			},
			async : {
				enable : true,
				url : treeDataSourceURL,
			},
			edit : {
				enable : false
			}
		};
	var zNodes = [];
	
	$.fn.zTree.init($("#treeDemo"), setting, zNodes);
}