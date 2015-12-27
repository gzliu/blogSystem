<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="../js/comm.js"></script>
<script type="text/javascript" src="../js/angular.js"></script>
<script type="text/javascript">
	$(function(){
		$("#postAjax").click(function(){
			$.post("postAjax.do",{uID :"2",uName :"xiaoming"},function(data){
				alert(data.uName);
				
			},'json');
			
		});
		$("#rest1").click(function(){
			$.get("login/1",function(data){
				alert(data.uName);
				
			},'json');
			
		});
	});
</script>
</head>
<body>
<h1>欢迎你！！！</h1>
 dfasfdasfds
<%--  <h2>${user.uName }</h2> --%>
<div ng-app="">
 	<p>在输入框中尝试输入：</p>
 	<p>姓名：<input type="text" ng-model="name"></p>
 	<p ng-bind="name"></p>
</div>
 <input type="button" title="Submit" value="Submit" id="postAjax"/>
 <br/>
 <input type="button" title="REST1" value="REST1" id="rest1"/>
 <div id="show"></div>
 
 <select service="">
 	<option value="1">test1</option>
 </select>
 
</body>
</html>