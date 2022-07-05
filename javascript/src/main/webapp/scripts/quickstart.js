/**
 * 
 */
function display()
{
	alert("Welcome to Java Script");
}

var app={}
app.display=function()
{
	alert("I am from annoyous function");
}
app.readFile = function()
{
	var message=document.getElementById("msg");
	alert(message.innerHTML);
	var messagetwo=document.getElementsByTagName("div")[0];
	alert(messagetwo.innerHTML);
}
app.attachment = function()
{
	var cityBtn=document.getElementById("city");
	cityBtn.addEventListener("click",function()
	{
		var message=document.getElementById("msg");
		message.innerHTML=" Best City is Coimbatore";
	});
	
	
	var linkToWelcome=document.getElementById("link");
	linkToWelcome.addEventListener("click",function(event)
	{
		event.preventDefault();
	});
}