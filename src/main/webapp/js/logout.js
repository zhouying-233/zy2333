//@ sourceURL=lcoal.js   logout
$(function(){
	$("#logout").click(function(){
		$.ajax({
			url:basePath+"user/logout/logout",
			type:"get",
			dataType:"json",
			success:function(result){
				if(result.status==1){
					deleteRealCookie("JSESSIONID");
					window.location.href="login.html";
				}
			},
			error:function(){
				alert("请求失败")
			}
		});
	});
});