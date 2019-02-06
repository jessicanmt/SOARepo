<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

.submit {
  background-color: #599A9B;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
}

.cancelButton {
background-color: #FF0000;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 50%;
}


.container {
  padding: 16px;
}

</style>
</head>
<body>

<h2>Add new event</h2>

<form action="/saveEvent" method="post">
 
  <div class="container">
    <label for="id"><b>Id</b></label><br> 
    <input type="text" id="id" name="id" ><br>
 	<label for="ev"><b>Event Id </b></label><br>
    <input type="text" id="ev" name="ev" ><br>
     <label for="evname"><b>Event name: </b></label><br>
    <input type="text" id="evname" name="evname" ><br>
     <label for="evtype"><b>Event type</b></label><br>
    <input type="text" id="evtype" name="evtype" ><br>
     <label for="desc"><b>Description</b></label><br>
    <input type="text" id="desc" name="desc" ><br>
    <label for="url"><b>URL</b></label><br>
    <input type="text" id="url" name="url" >
    
        
    <button type="submit" class="submit">Add event</button>
  </div>
</form>

 <div class="container">
  	<form action="/events">
	    <button type="submit" class="cancelButton">Cancel</button>
  </form>
  </div>
</body>
</html>
