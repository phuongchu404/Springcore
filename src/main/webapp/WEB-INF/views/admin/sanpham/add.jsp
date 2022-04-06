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
			<div align="center">
				<h1>Create New Course</h1>
				<br />
				<div class="col-sm-4">
					<form action="/sanpham/save" method="post" model>


						<div alight="left">
							<tr>
							<label class="form-label">mã loai sản phẩm</label>
								<select class="form-control" id="loaiSPs" name="loaiSPs" >
                                            <c:forEach var="item" items="${loaiSP}">
                                                <option value="${item.maLoaiSP}">${item.tenLoaiSP}</option>
                                            </c:forEach>
                                 </select>
							</tr>
						</div>


						<div alight="left">
							<tr>
								<label class="form-label">tên sản phẩm</label>

								<td><input type="text" name="tenSP"
									class="form-control" placeholder="Tên sản phẩm" /></td>
							</tr>
						</div>
						
						<div alight="left">
							<tr>
								<label class="form-label">mô tả</label>

								<td><input type="text" name="moTa"
									class="form-control" placeholder="Mô tả" /></td>
							</tr>
						</div>
						
						<div alight="left">
							<tr>
								<label class="form-label">đơn giá</label>

								<td><input type="text" name="donGia"
									class="form-control" placeholder="đơn giá" /></td>
							</tr>
						</div>
						
						<div alight="left">
							<tr>
								<label class="form-label">số lượng</label>

								<td><input type="text" name="soLuong"
									class="form-control" placeholder="số lượng" /></td>
							</tr>
						</div>

						<br>
						<tr>
							<td colspan="2"><button type="submit" class="btn btn-info">Save</button>
							</td>
						</tr>

					</form>
				</div>
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