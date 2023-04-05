<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../navbar.jsp" %>
<html>
 <body onload="makeActive('outlist')">
 <form action="update-list" method="post">
  <div class='dv'>
   <label class='hd'>Edit employee</label> 
  </div> 
  <div class='dvv'>
   <input type='hidden' name='oeid' value='${eid}'> 
   <label class='lah'>Id of out employee:${eid}</label> 
  </div>
  <div class='dvv'>
   <select name="eid" id="eid" class='la'>
   <option value="-1">Select Employee</option>
   	<c:forEach var="emp" items="${elist}"> 
    	<option value="${emp.eid}">${emp.name}(${emp.eid})</option>
    </c:forEach>
   </select>
  </div>
  <div class='dv'>
   <button class='btn btn-primary' onclick="return checkEmployee()">Submit</button>
  </div>
 </form> 
 </body>
</html>