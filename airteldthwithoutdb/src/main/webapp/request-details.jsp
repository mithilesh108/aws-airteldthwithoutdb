<!DOCTYPE html>
<%@page isELIgnored="false"%>
<html>
  <head>
    <title>New DTH Connection Request</title>
    <style>
	    body {
               font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
            }
            p {
              border: 1px solid black;
            }
    </style>
  </head>            
  <body>
  	<h2>New Connection Request Information</h2>
  	<p>
  	  Hi ${name}<br>
  	  Contact No :  ${contactNo}<br>
  	  Email Address : ${emailAddress}<br>
  	  City : ${city}<br>
  	  State : ${state}<br>
  	  Pin Code : ${pincode}<br>
  	  Thank you for your interest on Airtel DTH Services, we have received your new connection request for : ${connectionType}.<br>
  	  Our team will reach to you within 24-48 hours. Your reference No is : ${refNo}	
  	</p>
  	<a href="${pageContext.request.contextPath}/request-new-connection.jsp">Home</a>
  </body>
</html>
