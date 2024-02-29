
function main_save(){
	var POST_TITLE = $("#POST_TITLE").val();
	
	if(POST_TITLE == "" || POST_TITLE == null){
		alert("no title");
		return;
	}
	
	
	if(confirm("Do you want to save it ")){
		document.save.submit();
	} else {
		return;
	}
}

function main_delete(no){
	var path = "delete.do?POST_NO=" + no;
	var text = "Do you want to delete '" + no + "' Post";
	
	if(confirm(text)){
		location.href = path;
	} else {
		return;
	}
}

function main_update(no){
	var path = "edit.do?POST_NO=" + no;
	

	location.href = path;

}

function main_insert(ty){
	var path = "edit.do?POST_NO=0&POST_TYPE=" +ty;
	

	location.href = path;

}


function comp_save(){
	if(confirm("Do you want to save it ")){
		document.compSave.submit();
	} else {
		return;
	}
}

function mail_save(){
	if(confirm("Do you want to save it ")){
		document.mailSave.submit();
	} else {
		return;
	}
}


function main_mail(){
	
	var MAIL_TITLE = $("#MAIL_TITLE").val();
	var MAIL_RECEIVE = $("#MAIL_RECEIVE").val();
	var MAIL_BODY = $("#MAIL_BODY").val();
	var path = `mailto:`;
	
	console.log(MAIL_TITLE);
	
	MAIL_BODY = MAIL_BODY.split("\n").join("%0D%0A");
	
	path = path + MAIL_RECEIVE
		 + `?subject=` + MAIL_TITLE
		 + `&body=` + MAIL_BODY;
	
	console.log(path);
	
	location.href = path;

}


function main_check(obj){
	console.log(obj.checked);
	var checked = obj.checked;
	if(checked){
		obj.value = "Y"
	} else {
		obj.value = "N"
	}
}


function main_login(){
	document.login.submit();
}