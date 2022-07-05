/**
 * 
 */
function setcookie()
{
	var name="collorsize";
	var value="green";
	document.cookie =name+"="+value;
}
function readcookie()
{

	var mycookie = document.cookie;
	
	var cookieList = mycookie.split(";");

   var 	sizecookie = cookieList[2];

	var values =sizecookie.split("=");
	
	//document.write("i will show models & brand for size "+values); 
	var colorvalue =values[1];

	document.body.setAttribute("style","background-color:"+colorvalue)
}
(function(){
	setcookie();
	
})();