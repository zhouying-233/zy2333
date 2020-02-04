//@ sourceURL=role.js
var roleID;
$(function(){
	findRolesByPage(1);
	$("#rolePanel .row button").click(function(){
		findRolesByPage(1);
		return false;
	});
	$("#addPanel button[type=submit]").click(function(){
		addRoleByName();
		return false;
	});
//	编辑角色
	$("#editRole form").submit(function(){
		updateRole();
		return false;
	});
//	删除角色
	$(".bs-example-modal-sm button:eq(1)").click(function(){
		deleteRole();
	});
});
function deleteRole(){
	$.ajax({
		url:basePath+"role/deleteRole/"+roleID,
		type:"post",
		dataType:"json",
		success:function(result){
			if(result.status==1){
				$("#"+roleID).remove();
				$(".bs-example-modal-sm").modal("toggle");
			}
		},
		error:function(){
			alert("请求失败！");
		}
	});
}
function deleteRole1(id){
	roleID=id;
}
function updateRole(){
	var roleName=$("#role_update").val();
	$.ajax({
		url:basePath+"role/updateRole",
		type:"post",
		data:{"id":roleID,"name":roleName},
		dataType:"json",
		success:function(result){
			if(result.status==1){
				var newroleName=result.message;
				$("#"+roleID).find("td:eq(2)").text(newroleName);
			$("#editRole").modal("toggle");
			}
		},
		error:function(){
			alert("请求失败");
		}
	});
}
function editRole(id){
	roleID=id;
	var roleName=$("#"+id).find("td:eq(2)").text();
	$("#role_update").val(roleName);
}
function addRoleByName(){
	var name=$("#role_add").val();
	if(name==""||name==null){
		alert("不能为空");
	}
	if(name!=""&&name!=null){
		$.ajax({
			url:basePath+"role/addRoleByName/"+name,
			type:"get",
			dataType:"json",
			success:function(result){
				if(result.status==1){
					alert(result.message);
				}
			},
			error:function(){
				alert("请求失败");
			}
		});
	}
}
function findRolesByPage(currentPage){
	$("#tbody").html("");
	$("#fenyeid").html("");
	var roleKeyword=$("#rolePanel .input-group input[type=text]").val();
	if(roleKeyword==""||roleKeyword==null){
		roleKeyword="undefined";
	}
	$.ajax({
		url:basePath+"role/findRolesByPage",
		type:"get",
		data:{"currentPage":currentPage,"roleKeyword":roleKeyword},
		dataType:"json",
		success:function(result){
			
			var page=result.data;
			var roles=page.data;
			$(roles).each(function(n,role){
				if(role.name!='超级管理员'&&role.name!='学员'&&role.name!='教师'){
					var str=
						'<tr id="'+role.id+'">'+
						'<td>'+n+'</td>'+
						'<td>'+role.id+'</td>'+
						'<td>'+role.name+'</td>'+
						'<td>'+
						'</td>'+
						'</tr>';
					$("#tbody").append(str);
				}else{
					var str=
						'<tr id="'+role.id+'">'+
						'<td>'+n+'</td>'+
						'<td>'+role.id+'</td>'+
						'<td>'+role.name+'</td>'+
						'<td>'+
						'<a href="" onclick="editRole(\''+role.id+'\')" data-toggle="modal" data-target="#editRole" ><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑</a>'+
						'<a href="" onclick="deleteRole1(\''+role.id+'\')" data-toggle="modal" data-target=".bs-example-modal-sm"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除</a>'+
						'</td>'+
						'</tr>';
					$("#tbody").append(str);
				}
			});
			if(page.totalPage>1){
				var previous=
					'<li>'+
					'<a href="javascript:findRolesByPage('+page.previousPage+')" aria-label="Previous">'+
					'<span aria-hidden="true">&laquo;</span>'+
					'</a>'+
					'</li>';
				$("#fenyeid").append(previous);
				$(page.aNum).each(function(n,value){
					var mid=
						'<li><a href="javascript:findRolesByPage('+value+')">'+value+'</a></li>';
					$("#fenyeid").append(mid);
				});
				var next=
					'<li>'+
					'<a href="javascript:findRolesByPage('+page.nextPage+')" aria-label="Next">'+
					'<span aria-hidden="true">&raquo;</span>'+
					'</a>'+
					'</li>';
				$("#fenyeid").append(next);
			}
		},
		error:function(){
			alert("请求失败");
		}
	});
}