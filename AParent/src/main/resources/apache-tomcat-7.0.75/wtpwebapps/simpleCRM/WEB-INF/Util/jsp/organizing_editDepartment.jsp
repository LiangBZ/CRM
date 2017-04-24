<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- 模态框 -->
<div class="modal fade" data-Modal="organizing_editDepartment" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel" data-modalPart="modalTitle">
					编辑部门
				</h4>
			</div>
			<div class="modal-body" data-modalPart="modalBody">
				<form class="form-horizontal" role="form">
				    <div class="form-group">
				        <label for="inputEmail3" class="col-sm-2 control-label">部门名称:</label>
				        <div class="col-sm-10">
				            <input name="departmentName" type="text" class="form-control" placeholder="请输入名称">
				        </div>
				    </div>
				    <input name="departmentId" type="hidden" >
				    <button type="submit" class="btn btn-default hidden">保存</button>
				</form>
			</div>
			<div class="modal-footer" data-modalPart="modalFooter">
				<button type="button" class="btn btn-default" onclick='saveClick("${pageContext.request.contextPath}/mainBodys/updateDepartmentVo");'>保存</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>