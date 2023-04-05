<%@ include file='../navbar.jsp' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <body onload='makeActive("date")'>
 <div class='dvv'>
     <label class='lahu'>Report of current date</label>
  </div>
  <div class='container'>
   <div class='card col-md-12 mx-auto'>
    <div class='card-body'>
    <c:choose>
     <c:when test="${elist=='[]'}">
     	<div class='dvv'> 
      		<label class='la' style='color:red'>No employee is out today</label>
      	</div>
     </c:when>
     <c:otherwise>
     <div class='table scrollit'>
     <table class='table table-hover'>
      <thead>
       <tr>
        <th class='las'>S.No</th><th class='las'>Employee id</th>
        <th class='las'>Out Time</th><th class='las'>In Time</th>
        <th class='las'>Total Time</th><th class='las'>Date</th>
       </tr>
      </thead>
      <tbody>
       <c:set var="sn" value="0"></c:set>
       <c:forEach var="emp" items="${elist}">
        <tr>
         <td>${sn=sn+1}</td>
         <td><a style="text-decoration:underline;font-size:1.5vw" href='details?eid=${emp.eid}'>${emp.eid}</a></td>
         <td>${emp.outtime}</td>
         <td>${emp.intime==null?"<label style='color:red'>Not in yet</label>":emp.intime}</td>
         <td>${emp.totaltime==null?"<label style='color:red'>Not applicable</label>":emp.totaltime}</td>
         <td>${emp.date}</td>
        </tr>
       </c:forEach>
      </tbody>
     </table>
     </div>
     </c:otherwise>
     </c:choose>
    </div>
   </div>
  </div>
  <div class='dvv'>
	 <button class='btr' onclick='history.back()'>Back</button>
  </div>
 </body>
</html>