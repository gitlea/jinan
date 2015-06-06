<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s"  uri="/struts-tags"%>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	ul{
		text-decoration: none;
		display: inline;
	}
	ul li{
		list-style: none;
	}

</style>


</head>
<body>
	<form action="regist" method="post" enctype="multipart/form-data">
		<input type="text" name="u.loginName"/>
		<s:fielderror name="u.loginName"></s:fielderror>
		<br/>
		<input type="password" name="u.psd"/><br/>
		<input type="text" name="u.salary"/><br/>
		<input type="radio" name="u.sex" value="true" checked="checked">男</input>
		<input type="radio" name="u.sex" value="false">女</input><br/>
		<input type="checkbox" value="basket" name="u.favs">篮球</input>
		<input type="checkbox" value="foot" name="u.favs">足球</input><br/>
		<input type="file" name="head"/><br/>
		<input type="submit"/>
	</form>
	
	
</body>
</html>