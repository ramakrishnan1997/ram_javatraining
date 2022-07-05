/**
 * 
 */
// using function constructor  note the this in function body can create new 
function usingObjectLiteral()
{
	var book ={};
	book.bookname ="kathy sieera";
	book.discount = function()
	{
		return 0.10;
	}
	document.write("Book Name"+book.bookname);
	document.write("Discount"+book.discount());
}
// using  the  blank object and dynamically adding methods , properties 
function usingBlankObject()
{
	var book = new Object();
	book.bookname ="Think";
	book.discount = function()
	{
		return 1.50;
	}
	document.write("<p>"+"Book Name"+book.bookname);
	document.write("Discount"+book.discount());
}
// using empty object literal  
function usingObjectLiteralSecondWay()
{
	var book ={
	bookname:"Earn Money",
	discount:function()
	{
		return 2.50;
	}
	};
	document.write("<p>"+"Book Name"+book.bookname);
	document.write("Discount"+book.discount());
	
}
// using function constructor  note the this in function body can create new 
function usingFunctionconstructo()
{
	var Book =function(name)
	{
		this.name=name;
		this.discount = function()
		{
			return 50.60;
		}
	}
	var MyBook =new Book("html");
	document.write("<p>"+"Book Name"+MyBook.name);
	document.write("Discount"+MyBook.discount());
}
(function(){
	usingObjectLiteral();
	usingBlankObject();
	usingObjectLiteralSecondWay();
	usingFunctionconstructo();
})();






























