<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>

  	label {
    	display: flex;   
   		margin-bottom: 10px;
  	}
  
  	input[type="text"],
  	input[type="password"] {
    	width: 150px;
   		margin: 0 5px;
 	 }

	.box {
		width: 600px;
	}

</style>    
 
<div class="box">로그인 페이지</div>
<form action="submit">
<label for="pid">ID<input type="text" name="pid"/></label><br />
<label for="pw">Password<input type="password" name="pw" /></label><br />
<input type="submit" value="로그인"  />
</form>