//@ sourceURL=login.js
$(function(){
	$("#inputName").val(getCookie("loginName"));
	$("#form_login").submit(function(){
		login();
		return false;
	});
});

function login(){
	var name=$("#inputName").val();
	var password=$("#inputPassword").val();
	var remember=$("#form_login input[type=checkbox]").get(0).checked;
	$.ajax({
		url:basePath+"user/login/"+name+"/"+password,
		type:"get",
		dataType:"json",
		success:function(result){
			if(result.status==1){
				if(remember){
					addCookie("loginName",name,1);
				}
				window.location.href="index.jsp";
			}else if(result.status==0){
				alert("登录失败");
			}
			
		},
		error:function(){
			alert("请求失败");
		}
	
	});
}