<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>点餐系统登录</title>
<style type="text/css">
	/*清除网页内外边距*/
	*{margin:0; padding:0;}
	/*清除a标签自带样式*/
	a{text-decoration:none;}
	/*字体12号 行高12*2*/
	body,html{font:12px/2 "微软雅黑"}
	body{background:url(images/1.jpg) no-repeat;}
	
	span{color:#f00;float:left;margin-left:26px;}
	h2{color:rgb(255,255,255);}
	#wside{width:366px;height:480px;margin:70px auto;border:1px solid #9a9a9a; box-shadow:0 15px 50px;}
	

	table{width:254px;height:350px; margin:50px auto;}
	/*input背景白色  透明度百分之百*/
	input{background-color:rgba(255,255,255,0);}

	#user{width:248px;height:26px; border-top:1px solid #9a9a9a;border-bottom:1px solid #eeeeee;border-right:1px solid #9a9a9a;border-right:1px solid #eeeeee;}
	/*去掉框的text*/
	#uid{width:212px;height:26px; border:none; float:right;padding-left:10px;color:rgba(0,0,0,0.7);}
	/*用户图标*/
	#user .img1{width:26px;height:26px;background:url(images/user_03.jpg);no-repeat;border:0;}
	
	
	#password{width:248px;height:26px; border-top:1px solid #9a9a9a;border-bottom:1px solid #eeeeee;border-right:1px solid #9a9a9a;border-right:1px solid #eeeeee;}
	#paw{width:212px;height:26px; border:none; float:right;padding-left:10px;color:rgba(0,0,0,0.7);}
	#password .img2{width:26px;height:26px;background:url(images/paw_03.jpg);no-repeat;border:0}
	
	/*提交按钮*/
	#sub{width:124px;height:28px;background-color:rgba(255,255,0,0);} 
	/*a标签样式*/
	/*a{display:block;width:62px;height:26px; color:#00F; border-bottom:1px solid #9a9a9a;border-top:1px solid #eeeeee;border-right:1px solid #9a9a9a;border-left:1px solid #eeeeee;text-align:center;background-color:rgba(0,0,0,0);}*/
	a{display:block;width:62px;height:26px; color:#00F;border:1px solid #30b477;text-align:center;background-color:#30b477;}
	#longlong{text-decoration:none;};
	
</style>
<script language="JavaScript">
	function check()
	{
		var t1=document.getElementById("uid");
		if(t1.value=="账号" || t1.value=="")
		{
			document.getElementById("tip1").style.display="";
			t1.focus();
		}
		else
		{
			document.getElementById("tip1").style.display="none";
		}
		
		var t2=document.getElementById("paw");
		if(t1.value=="账号" || t1.value=="")
		{
			document.getElementById("tip2").style.display="";
			t1.focus();
		}
		else
		{
			document.getElementById("tip2").style.display="none";
		}
		if((t1.value!="" && t1.value!="账号" )&&(t2.value!="" && t2.value!="密码"))
		{
			document.getElementById("submit").action="/Work/LoginServlet";
			document.getElementById("sub").type="submit"; 
		}
	}
	function check2()
	{
		var t1=document.getElementById("uid");
		if(t1.value=="账号")
		{
			document.getElementById("uid").value='';
			t1.focus();
		}
		
	}
	
	function check3()
	{
		var t2=document.getElementById("paw");
		if(t2.value=="密码")
		{
			document.getElementById("paw").value='';
			t2.type='password';
			t2.focus();
		}
		
	}
	
</script>
</head>
<body>
<form id="submit" method="post">
<div id="wside">
<table>
		<tr><td colspan="2" align="left"><h2>欢迎登陆点餐系统</h2></td></tr>
		<tr><td colspan="2" align="center">
        	<div id="user"><img class="img1"></img><input type="text"  name="num" value="账号" id="uid"  maxlength="11" onclick="check2()" />
        	</div>
        	<div style="display:none" id="tip1"><span>此处不能为空</span></div>
        </td></tr>
        
		<tr><td colspan="2" align="center"> 
        	<div id="password">
        		<img class="img2"></img><input type="text" name="password" value="密码" id="paw" onclick="check3()" />
        	</div>
        	<div style="display:none" id="tip2"><span>此处不能为空</span></div>
        </td></tr>
        
		<tr><td><input type="button" id="sub" value="登录" onClick="check()"></td>
			<td align="right"><a href="register.jsp" id="zhuce">注册</a></td>
 		</tr>
 		<tr>
			<td align="left" colspan="2" id="longlong"><a href="../管理员界面/Login.jsp">管理员登录</a></td>
 		</tr>
</table>
</div>
</form>
</body>
</html>