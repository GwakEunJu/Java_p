<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<style>
    * {
   	 	margin: 0;
   		padding:0;
	}
	
	header {
		width:100%;
		height: 100px;
		background-color: #c4f4fe;
	}
	
	header > .logo {
		width: 200px;
		height:60px;
		background-color: #ff0;
		font-size: 2rem;
		line-height: 60px;
		margin: 0 auto;
		text-align: center;
	}
	
	nav {
		display: flex;
		flex-direction: row;
		justify-content: space-around;
		align-items: center;
		width: 500px;
		height: 40px;
		float: right;
	}
	
	nav > a {
		display: block;
    	text-decoration: none;
   		width: 100px;
   		height: 30px;
   		line-height: 30px;
   		color: #83a7a3;
   		text-align: center;
   		border-radius: 5px;
   		transition-duration: 0.5s; /* 전환 효과(transition)가 일어날 때, 그 전환이 얼마나 오래 지속될지를 지정 */
	}
	
	
	.login {
		border: 1px solid #ccc;
		width:80px;
		height: 25px;
		text-align: center;
		line-height: 25px;
	}
   
</style>

<header>
	<div class="logo">logo</div>
	<nav>
		<a href="shop.jsp">매장안내</a>
		<a href="servi.jsp">고객센터</a>
		<a href="login.jsp" class="login">로그인</a>
	</nav>
</header>