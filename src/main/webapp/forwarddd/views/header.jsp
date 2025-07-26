<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <style>
    	header {
    		width:100% ;
    		height: 100px;
    		background-color: #0f0;
    	}
    	
    	header > .logo {
    		width:200px ;
    		height: 60px;
    		background-color: #0ff;
    		font-size: 3rem;
    		line-height: 50px;
    		margin: 0 auto;
    		text-align: center;
    	}
    	
    	nav {
    		display: flex;
    		flex-direction: row;
    		justify-content: space-around;
    		align-items: center;
    		width:500px;
    		height: 40px;
    		float: right;
    		background-color: #f0f; 
    	}
    	
    	nav > a {
    		display: block;
    		text-decoration: none;
    		width: 100px;
    		height: 30px;
    		line-height: 30px;
    		background-color: #fa0;
    		color: #fff;
    		text-align: center;
    		border-radius: 10px 0px 0px 0px;
    		transition-duration: 0.5s; /* 전환 효과(transition)가 일어날 때, 그 전환이 얼마나 오래 지속될지를 지정 */
    	}
    	
    	nav > a:hover { 
    		background-color: #fff8;  /*rgba(255,255,255,0.8)와 동일;*/
    		box-shadow: 2px 2px 3px #333 ; 
    	}	
    </style>
    
	<header>
		<div class="logo">logo</div>
		<nav>
			<a href="info.jsp">회사소개</a>
			<a href="gall.jsp">갤러리</a>
			<a href="mypage.jsp">마이페이지</a>
			<a href="notice.jsp">공지사항</a>		
		</nav>
	</header>