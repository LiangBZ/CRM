function showInfos(infos, message, obj, url) {
	if(infos !== null && infos !== "") {
		alert(message + ":" + obj);
		location.href = url;
	}
}