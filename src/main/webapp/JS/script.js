function makeActive(linkid)
{
	document.getElementById(linkid).style.color="red";
}
function compareDate()
{
	if(document.getElementById("date1").value>=document.getElementById("date2").value)
	{
		alert("First date should be samller than second date");
		return false;
	}
	return true;
}
function checkEmployee()
{
	if(document.getElementById("eid").value==-1)
	{
		alert("Please select employee name then submit");
		return false;
	}
	return true;
}
function showPhoto()
{
	if(document.getElementById("eid").value==-1)
	{
		return false;
	}
	var obj=new XMLHttpRequest();
    obj.onreadystatechange=function()
    { 
     if(obj.readyState==4)
     {
       var res=obj.responseText;
       document.getElementById("photo").innerHTML=res; 
     }
    };
    var url="show-photo.jsp?eid="+document.getElementById("eid").value;
    obj.open("POST",url);
    obj.send();
}
function saveOuttime()
{
	saveTime("save-outtime.jsp");
}
function saveIntime()
{
	saveTime("save-intime.jsp");
}
function saveTime(url)
{
	var eid=document.getElementById("eid").value; 
	if(eid==-1)
	{
		alert("Please select employee name then submit");
		return false;
	}
	var obj=new XMLHttpRequest();
    obj.onreadystatechange=function()
    { 
     if(obj.readyState==4)
     {
       var res=obj.responseText;
       document.getElementById("msg").innerHTML=res; 
     }
    };
    var url=url+"?eid="+eid;
    obj.open("POST",url);
    obj.send();
}
function checkEmployeeId(event)
{
	var obj=new XMLHttpRequest();
	var res=0;
    obj.onreadystatechange=function()
    { 
     if(obj.readyState==4)
     {
       var res=obj.responseText;
       if(res==1)
       {
    	   document.getElementById("exist").innerHTML="Employee id already in use";
       }
     }
    };
    var url="check-employee.jsp?eid="+document.getElementById("eid").value;
    obj.open("POST",url);
    obj.send();
  
}
