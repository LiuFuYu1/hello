<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<script type="text/javascript" src="/resources/js/jquery-3.2.1.js"></script>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<tr>
  <form action="">
  <input type="text" name="mname">
  <input type="submit" value="查询">
  </form>
</tr>

	<table class="table table-dark">
	            <tr>
	            <td>序号</td>
	            <td>电影名</td>
	            <td>价格</td>
	            <td>描述</td>
	            <td>上映时间</td>
	            <td>类型</td>
	            </tr>
		<c:forEach items="${selects }" var="s">
			<tr>
				<td>${s.mid }</td>
				<td>${s.mname }</td>
				<td>${s.price }</td>
				<td>${s.misosu }</td>
				<td>${s.mtime }</td>
			 	<%-- <td>${s.tnames }</td> --%>
			</tr>
		</c:forEach>
	</table>

</body>
</html>

