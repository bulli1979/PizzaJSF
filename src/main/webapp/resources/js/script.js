/**
 * MEB 
 */

app = {};
app.openLogInDialog = function(){
	var dialog = document.getElementById("logInDialog");
	dialog.style.display="block";
};
app.login = function(){
	var button = document.getElementById("loginButton");
	button.click();
	app.closeDialog();
}
app.closeDialog = function(){
	var dialog = document.getElementById("logInDialog");
	dialog.style.display="none";
}