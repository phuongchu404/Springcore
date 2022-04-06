<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="/common/style.jsp"></jsp:include>
</head>
<body class="no-skin">
	<jsp:include page="/common/admin/header.jsp"></jsp:include>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>
		<!-- header -->
		<jsp:include page="/common/admin/menu.jsp"></jsp:include>
		<!-- header -->

		<!--body  -->
		<div class="main-content">
		<form action="<c:url value='/sanpham/getAll'/>" id="formSubmit" method="get">
			<div align="left">
				<h3>
					<a href="<c:url value='/sanpham/add'/>">Add new</a>
				</h3>
			</div>

			<div class="col-sm-8" align="center">
				<div class="panel-body" align="center">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th>mã sản phẩm</th>
								<th>mã loại sản phẩm</th>
								<th>tên sản phẩm</th>
								<th>mô tả</th>
								<th>số lượng</th>
								<th>đơn giá</th>
								<th>Thao tác</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="sanpham" items="${list}">
								<tr>
									<td>${sanpham.maSP}</td>
									<td>${sanpham.loaiSPs.maLoaiSP}</td>
									<td>${sanpham.tenSP }</td>
									<td>${sanpham.moTa }</td>
									<td>${sanpham.soLuong }</td>
									<td>${sanpham.donGia }</td>
									<td><a class="btn btn-sm btn-primary btn-edit"
										data-toggle="tooltip" title="Cập nhật bài viết" href="<c:url value='/sanpham/edit/${sanpham.maSP }'/>"><i
											class="fa fa-pencil-square-o" aria-hidden="true"></i> </a>
											||<a class="btn btn-danger glyphicon glyphicon-remove"
										data-toggle="tooltip" title="Cập nhật bài viết" href="<c:url value='/sanpham/delete/${sanpham.maSP }'/>"><i
											class="fa fa-pencil-square-o" aria-hidden="true"></i> </a>
											</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
			</form>
		</div>
		<!-- footer -->
		<jsp:include page="/common/admin/footer.jsp"></jsp:include>
		<!-- footer -->

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse display"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<jsp:include page="/common/script.jsp"></jsp:include>
	
</body>
</html>