//@ sourceURL=cookie.js
function getCookie(name){
	var array=document.cookie.split(";");
	for(var i=0;i<array.length;i++){
		var temp=array[i].split("=");
		if(temp[0]==name){
//			如果没有=号，也就不可能等于name不会进入下面
			return unescape(temp[1]);
		}
	}
	return "";
}
function addCookie(name,value,hour){
	var str=name+"="+escape(value);
	if(hour>0){
		var time=hour*3600*1000;
		var date=new Date();
		date.setTime(date.getTime()+time);
		str+="; expires="+date.toGMTString();
	}
	document.cookie=str;
}
function setCookie(name,value){
	addCookie(name,value,24*30);
}
function deleteCookie(name){
	var str=name+"="+escape(getCookie(name));
	var date=new Date();
	date.setTime(date.getTime()-1);
	document.cookie=str+"; expires="+date.toGMTString();
}
function deleteRealCookie(name){
	var str=name+"="+getCookie(name);
	var date=new Date();
	date.setTime(date.getTime()-1);
	document.cookie=str+"; expires="+date.toGMTString();
}

