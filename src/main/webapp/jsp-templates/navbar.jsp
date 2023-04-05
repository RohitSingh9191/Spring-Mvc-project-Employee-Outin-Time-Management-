<%@ page isELIgnored="false" %>
<html>
 <head>
  <script src='/employee-outin-time-management/JS/script.js'></script>
  <link href="/employee-outin-time-management/CSS/style.css" rel='stylesheet'>
  <link href="/employee-outin-time-management/CSS/bootstrap.min.css" rel='stylesheet'>
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css">
 </head>
 <body bgcolor='cyan'>
   <hr style='border:2px solid green'>
    <nav class='navbar navbar-expand navbar-light bg-light'>
     <ul class='nav nav-pills mx-auto'>
      <li><a id="home" class='nav-link lau' href='/employee-outin-time-management/home'>Home</a>
      <li><a id='add' class='nav-link lau' href='/employee-outin-time-management/employee/add'>Add employee</a>
      <li><a id='out' class='nav-link lau' href='/employee-outin-time-management/employee/outtime'>Time Out</a>
      <li><a id='in' class='nav-link lau' href='/employee-outin-time-management/employee/intime'>Time In</a>
      <li><a id='outlist' class='nav-link lau' href='/employee-outin-time-management/employee/out-list'>Todays' Out</a>
      <li><a id='inlist' class='nav-link lau' href='/employee-outin-time-management/employee/in-list'>Edit Intime</a>
      <li><a id='datewise' class='nav-link lau' href='/employee-outin-time-management/report/date'>Date wise report</a>
      <li><a id='empwise' class='nav-link lau' href='../empwise-report/employee-list.jsp'>Employee wise report</a>
     </ul>
    </nav>
   <hr style='border:2px solid green'>
 </body>
</html>