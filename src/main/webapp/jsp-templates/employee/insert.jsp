<%@ include file="../navbar.jsp" %>
<html>
 <body onload="makeActive('add')">
  <div class='dvv'>
   <label id='exist' style='color:red' class='la'></label>
  </div>
  <form action='save-record' method="post">
   <table class="ta">
    <tr>
     <td class='pd'>Enter employee id</td>
     <td class='pd'><input type='number' id='eid' name='eid' class='tb' required></td>
    </tr> 
    <tr>
     <td class='pd'>Enter employee name</td>
     <td class='pd'><input type='text' name='name' class='tb' required></td>
    </tr>
    <tr>
     <td class='pd'>Select employee department</td>
     <td class='pd'>
      <select name='department' class='tb'>
       <option>Training</option>
       <option>Marketing</option>
       <option>Sales</option>
       <option>Human Resource</option>
       <option>Accounts</option>
      </select>
     </td>
    </tr>
    <tr>
     <td class='pd' colspan="2" align="right">
     	<button class='btr' id='btn'>Save Record</button>
     </td>
    </tr>
   </table>
  </form>
 </body>
</html>