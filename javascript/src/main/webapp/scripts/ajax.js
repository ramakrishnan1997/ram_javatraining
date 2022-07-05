

function callServlet()
{
	var xhr=new XMLHttpRequest();
	var userNameFId=document.getElementById("userName");
	
	userNameFId.addEventListener("blur",function(){
		
		var userName= userNameFId.value;
	var url="validate?userName="+userName;
	xhr.onereadystatechange =processRequest;
	xhr.open("GET",url,true);
	xhr.send(null);
	});
	
	function processRequest()
	{
		if(xhr.status ==200 && req.readyState ==4)
		{
			var msgFID=document.getElementById("msg");
			msgFID.innerHTML = xhr.responseText;
			if(text.trim()=='valid')
			{
				msgFID.style.color='green';
				msgFID.innerHTML=text;
			}
			else
			{
				msgFID.style.color='red';
				msgFID.innerHTML=text;
			}
		}
	}
	
}