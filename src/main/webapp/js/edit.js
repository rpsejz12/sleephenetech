
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

function main_check(obj){
	console.log(obj.checked);
	var checked = obj.checked;
	if(checked){
		obj.value = "Y"
	} else {
		obj.value = "N"
	}
}