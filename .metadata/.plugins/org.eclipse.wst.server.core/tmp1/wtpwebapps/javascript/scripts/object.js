/**
 * 
 */
function usingWindowObj()
{
	window.location="http://www.google.com";
}

function openWindowObj()
{
	window.open('index.html','indexPage');
}
function printButton()
{

	window.print();
}
function invoke()
{
	
	var goToGoogleButton =document.getElementById("googleBtn");
	goToGoogleButton.addEventListener('click',usingWindowObj);
	var openWindow =document.getElementById("openBtn");
	openWindow.addEventListener('click',openWindowObj);
	var print =document.getElementById("printbtn");
	print.addEventListener('click',printButton);
	
}
function usingArray()
{
	var linkText =["home","client","career","aboutus","downloads"];
	writeToFile(linkText);
	var city=new Array("chennai","coimbatore","delhi");
	writeToFile(city);
	var countries = new Array();
	countries[0]='nepal';
	countries[1]='us';
	countries[2]='India';
	writeToFile(countries);
}
function writeToFile(items)
{
	document.write("<ul>");
	for(eachItem in items)
	{
        document.write("<li>"+items[eachItem]+"</li>")		
	}
	document.write("</ul>");
}
function usingDate(){
	var birthdate = new Date();
	var option = confirm("is your date of birth"+birthdate);
	if(option)
	{
		birthdate.setFullYear(1997,8,14);
		document.write("year"+birthdate.getFullYear());
		document.write("month"+birthdate.getMonth());
		document.write("date"+birthdate.getDate());
	}
	else
	{
		document.write("year"+birthdate.getFullYear());
		document.write("month"+birthdate.getMonth());
		document.write("date"+birthdate.getDate());
	}
}
(function(){
	
	invoke();
	usingArray();
	usingDate();
})();




































