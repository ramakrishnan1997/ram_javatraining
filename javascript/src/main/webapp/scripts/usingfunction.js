/**
 * 
 */
// Simple funtion

function simple()
{
	console.log("Hello World");
}

function withArgs(name)
{
	if(name==null)
	{
		document.write("Welcome Guest");
	}
	else
	{
        document.write("welcome"+name)
}	
}
var usdToInr =function(usd)
{
	return usd*0.80;
};
var InrToUsd =function(inr)
{
	return usd=inr/0.80;
};
function converter(funref,name)
{
	console.log(name);
	console.log(funref());
}
function display()
{
	return "Ram";
}
(function(){
	//simple();
	//withArgs('ram');
	//wthArgs();
	/*console.log(usdToInr);
	console.log("Multiply"+usdToInr(100));
	console.log("divide"+InrToUsd(100));*/
	converter(function(){
		return 'Good Morning'
	},'Greeting')
	converter(display)
})();



























