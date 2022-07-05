/**
 * 
 */
function validate()
{
	var result=true;
	console.log("validate called");
	var textflds =document.getElementsByTagName("input");
	for(var i=0;i<textflds.length;i++)
	{
	console.log(textflds[i].value);
	if(textflds[i].value == "")
	{
		
		document.getElementById("msg").innerHTML="Required should not be blank";
	return false;
	}
	}
	return result;
}

function init()
{
	var frmElement = document.getElementById("regForm");
	frmElement.addEventListener("submit",validate);
}
(function()
{
	init();
})();





























































































