package file_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

@WebServlet("/UploadReg1")
@MultipartConfig	// 업로드 파일 정보 가져오기 
public class UploadReg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadReg1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");	// getWriter호출 전에 먼저 호출해야한다/ 응답 타입 설정
		response.getWriter()	// 클라이언트로 문자열 전송
		.append("reg1 입니다. <br/>")
		.append(request.getParameter("pid")+"<br/>")	//form에서 전달된 pid 값 출력
		.append(request.getParameter("pname")+"<br/>")	//form에서 전달된 pname 값 출력
		
		//multipart/form-data인 경우 type="file"의 파일명이 null 로 출력
		.append(request.getParameter("upfile")+"<br/>");
	
		// multipart/form-data가 필수 
		// 파라미터를 받는다.
		Collection<Part> pps = request.getParts();
		// collection을 쓰는 이유는 part가 몇개 인지 모르기 때문에 동적으로 다룰수있는 collection을 사용
		
		// 절대 경로
		//실제 서버용- 서버사용 시 이클립스 주석처리
		String dirPath = request.getServletContext().getRealPath("dsttt")+"\\";
		
		//이클립스용 -  배포 시 주석 처리
		dirPath = "C:\\Users\\user\\eclipse\\jspPrj\\src\\main\\webapp\\dsttt\\";  // 파일 저장할 폴더의 절대경로
		System.out.println(dirPath);
		
		
		String gImg = null;
		for (Part part : pps) {
			System.out.println(part.getName()+":"+part.getContentType()+","+part.getSize()+","+part.getSubmittedFileName());
			
			if(part.getName().equals("upfile")) { //파라미터 이름이 upfile(파일이라면)
				
				// 파일크기가 0보다 크다면 (파일이 존재핟다면)
				// 파일 이름이 있다면 (파일이 존재한다면)
				if(part.getSize()>0 || part.getSubmittedFileName().trim().length()>0) {
					// 파일저장 메소드실행
					fileSave(part, dirPath);
					
					//파일명 받기
					gImg = part.getSubmittedFileName();
				}
				
			}
		}	
	
		/*
		 	pid:null,3,null : 일반 파라메타 - 정보 없음 , request.getParameter() 로 확인
			pname:null,11,null
			upfile:image/jpeg,26013,2.jpg : 파일인 경우 ContentType, 파일크기 , 파일명 확인(part)
		*/	
		
		// 새로고침 시 파일 중복 저장을 피하기 위해서 리다이렉팅이 필수 - 주소 빠져나오기
		response.sendRedirect("file/imgView.jsp?gImg="+gImg);
	}
	
	// 파일 저장 메소드
	void fileSave(Part pp, String dirName ) {
		
		try {
			pp.write(dirName+pp.getSubmittedFileName());	// 파일 저장
			pp.delete();                                    // 브라우저의 임시폴더에 있는 파일 삭제		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
