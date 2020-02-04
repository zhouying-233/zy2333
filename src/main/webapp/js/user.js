//@ sourceURL=user.js
var roleType="all";
$(function(){
	findUsersByPage(1);
	$("#role_type .btn-default").click(function(){
		roleType=$(this).text();
		if(roleType=="全部"){
			roleType="all";
		}
		findUsersByPage(1);
	});
//	添加点击事件，将所有角色放入角色选项框中
	$("#user_tab li:eq(2)").click(function(e){
		e.preventDefault();
		findAllRoles();
	});
//	确认提交，添加事件
	$("#addUserPanel form").submit(function(){
		addUser();
		return false;
	});
	$("#user_export").click(function(){
		alert("gr");
		window.location.href=basePath+"user/user_export";
	});

});
function addUser(){
	var loginName=$("#inputEmail").val();
	var password=$("#inputPassword").val();
	var password2=$("#inputPassword2").val();
	var nickName=$("#nickName").val();
	var age=$("#age").val();
	var roleId=$("#roleCategory").val();
	var sex=$("#addUserPanel form input[name=user-type]").val();
	if(password!=password2){
		alert("密码不一致");
		return;
	}
	if(age<=0){
		alert("年龄不符合");
		return;
	}
	$.ajaxFileUpload({
		url:basePath+"user/addUser",
		secureuri:false,
		fileElementId:"picture",
		type:"post",
		data:{
			"loginName":loginName,
			"password":password,
			"nickName":nickName,
			"age":age,
			"sex":sex,
			"roleId":roleId},
		dataType:"text",
		success:function(data,status){
				alert(data);
		},
		error:function(){
			alert("请求失败");
		}
	});

}
function findAllRoles(){
	$("#roleCategory").html("");
	$.ajax({
		url:basePath+"role/findAllRoles",
		type:"get",
		dataType:"json",
		success:function(result){
			if(result.status==1){			
				$(result.data).each(function(n,role){
					var select='<option value="\''+role.id+'\'">'+role.name+'</option>';
					$("#roleCategory").append(select);
				});
			}
		},
		error:function(){
			alert("请求失败");
		}
	});	
}
function findUsersByPage(currentPage){
	var userKeyword=$("#userPanel form input").val();
	if(userKeyword==null||userKeyword==""){
		userKeyword="undefined";
	}
	$.ajax({
		url:basePath+"user/findUsersByPage",
		type:"get",
		data:{"currentPage":currentPage,"roleType":roleType,"userKeyword":userKeyword},
		dataType:"json",
		success:function(result){
			if(result.status==1){
				var page=result.data;
				var users=page.data;
				$("#tbody").html("");
				$(users).each(function(index,user){
					var roleString=""
						var roles=user.roles
						$(roles).each(function(n,role){
							roleString+=role.name+",";
						});
					if(roleString!=""){
						roleString=roleString.substring(0, roleString.length-1);
					}else{
						roleString="无角色";
					}
					var tr=
						'<tr>'+
						'<td>'+(index+1)+'</td>'+
						'<td>'+user.loginName+'</td>'+
						'<td>'+user.nickName+'</td>'+
						'<td>'+user.loginType+'</td>'+
						'<td>'+user.score+'</td>'+
						'<td>'+new Date(user.regDate).toLocaleString()+'</td>'+
						'<td>'+user.isLock+'</td>'+
						'<td>'+roleString+'</td>'+
						'<td>'+
						'<a href="" data-toggle="modal" data-target="#editUser"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑</a>'+
						'<a href="" data-toggle="modal" data-target=".bs-example-modal-sm"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</a>'+
						'</td>'+
						'</tr>';
					$("#tbody").append(tr);
				});

				$("#userfenye").html("");
				var pre=
					'<li>'+
					'<a href="javascript:findUsersByPage('+page.previousPage+')" aria-label="Previous">'+
					'<span aria-hidden="true">&laquo;</span>'+
					'</a>'+
					'</li>';
				$("#userfenye").append(pre);
				$(page.aNum).each(function(n,v){
					var mid=
						'<li><a href="javascript:findUsersByPage('+v+')">'+v+'</a></li>';
					$("#userfenye").append(mid);
				});
				var next=
					'<li>'+
					'<a href="javascript:findUsersByPage('+page.nextPage+')" aria-label="Next">'+
					'<span aria-hidden="true">&raquo;</span>'+
					'</a>'+
					'</li>';
				$("#userfenye").append(next);


			}
		},
		error:function(){
			alert("请求失败");
		}
	});

}