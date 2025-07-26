<%@page import="java.util.HashMap"%>
<%@page import="basic_p.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
    	HashMap<String, MemberDTO> mems = new HashMap<String, MemberDTO>();
    	mems.put("aaa",new MemberDTO("aaa","1111","장동건"));
    	mems.put("bbb",new MemberDTO("bbb","2222","장서건"));
    	mems.put("ccc",new MemberDTO("ccc","3333","장남건"));
    	mems.put("ddd",new MemberDTO("ddd","4444","장중건"));
    	mems.put("eee",new MemberDTO("eee","5555","북두신건"));
    	
    	String msg = "로그인 실패";
        
    	String pid = request.getParameter("pid");
    	String pw = request.getParameter("pw");
    	
    	
    	
    	if(mems.containsKey(pid)) {
    		MemberDTO dto = mems.get(pid);
    		if(dto.getPw().equals(pw)) {
    			msg="로그인 성공";
        		session.setAttribute("pid", new MemberDTO(pid,pw,"장동건"));	
        		session.setAttribute("pid", new MemberDTO(pid,pw,"장서건"));	
        		session.setAttribute("pid", new MemberDTO(pid,pw,"장남건"));	
        		session.setAttribute("pid", new MemberDTO(pid,pw,"장중건"));	
        		session.setAttribute("pid", new MemberDTO(pid,pw,"븍두신건"));	
        		
    		}
    		
    	}
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<script type="text/javascript">
		alert("<%=msg %>")
		location.href="loginMain.jsp"
	</script>
</body>
</html>