<%@ include file='../navbar.jsp' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <body onload='makeActive("inlist")'>
 <div class='dvv'>
     <label class='hdu'>In list of current date</label>
  </div>
  <div class='container'>
   <div class='card col-md-12 mx-auto'>
    <div class='card-body'>
     <c:if test="${elist=='[]'}">
       <div class='dv'>
        <label class='lahu' style='color:red'>No employee is in yet now</label>
       </div>
     </c:if>
     <c:if test="${elist!='[]'}">
     <div class='table scrollit'>
     <table class='table table-hover'>
      <thead>
       <tr>
        <th class='las'>Empid</th>
        <th class='las'>Out Time</th>
        <th class='las'>In Time</th>
        <th class='las'>Total Time</th>
        <th class='las'>Date</th>
        <th class='las' style='color:orange'>Action</th>
       </tr>
      </thead>
      <tbody>
        <c:forEach var="emp" items="${elist}">
        <tr>
           <td class='las'>${emp.eid}</td>
    	   <td class='las'>${emp.outtime}</td>
    	   <td style='color:green' class='las'>${emp.intime}</td>
    	   <td style='color:green' class='las'>${emp.totaltime}</td>
    	   <td class='las'>${emp.date}</td>
    	   <td class='las'>
    	    <a href='edit-inlist?eid=${emp.eid}&time=${emp.intime}'>Edit</a>
    	   </td>
    	</tr>
    	</c:forEach>
      </tbody>
     </table>
     </div>
     </c:if>
    </div>
   </div>
  </div>
  <div class='dvv'>
	 <button class='btr' onclick='history.back()'>Back</button>
  </div>
 </body>
</html>