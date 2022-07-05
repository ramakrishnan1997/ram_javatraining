/**
 * 
 */
var size=1.2;

function incFontSize()
{
var para = document.getElementById("firstpara");
size=size+0.4;
if(size<2.8)
{
	para.setAttribute("style","font-size:"+size+"em");
}



}
function addclickEvent()
{
	var imgRef = document.getElementById("increment");
	imgRef.addEventListener("click",incFontSize);
	
}
function downclickevent()
{
var downpara = document.getElementById("firstpara");
size=size-0.4;
if(size>0.8)
{
	downpara.setAttribute("style","font-size:"+size+"em");
}

}
function decrementclickevent()
{
	var imgRefdown = document.getElementById("decrement");
	imgRefdown.addEventListener("click",downclickevent);
}
(function(){
	addclickEvent();
	decrementclickevent();
})();


















