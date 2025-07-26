<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <style>
    * {
   	 	margin: 0;
   		padding:0;
    
    }
    
    .side {
    	width: 300px;
    	height: auto;
    
    }
    
    .lis {
    	list-style : none;
    	background-color: yellow;
    }
    
   .lis > a {
    	text-decoration: none;
    	display: block;
    	heigth: 60px;
    	line-height: 60px;
    	text-align: center;
    	text-justify: center;
    	color: #333;
    	margin: 0 50px;
    
    }
    
    a:hover {
    	color:#f30;
    }
    
    </style>
	<aside class="side">
	<ul>
		<li class= "lis"><a href="info.jsp">빵집소개</a></li>
		<li class= "lis"><a href="product.jsp">제품</a></li>
		<li class= "lis"><a href="event.jsp">이벤트</a></li>
	
	</ul>
	</aside>
