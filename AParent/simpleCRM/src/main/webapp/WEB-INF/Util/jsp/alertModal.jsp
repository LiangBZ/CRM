<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!-- 模态框 -->
<div class="modal fade" data-Modal="alertModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="false">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
					&times;
				</button>
				<h4 class="modal-title" id="myModalLabel" data-modalPart="modalTitle">
					模态框（Modal）标题
				</h4>
			</div>
			<div class="modal-body" data-modalPart="modalBody">
				在这里添加一些文本
			</div>
			<div class="modal-footer" data-modalPart="modalFooter">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			</div>
		</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

<script>
	//$('div[data-Modal="alertModal"]').modal('show');
	
	function setAlertModalTitleAndBody(title, body) {
		$alertModal = $('div[data-Modal="alertModal"]');
		$alertModal.find('h4[data-modalPart="modalTitle"]').html(title);
		$alertModal.find('div[data-modalPart="modalBody"]').html(body);
	}
</script>