package file_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collection;

/**
 * Servlet implementation class PageReg
 */
@WebServlet("/PageReg")
@MultipartConfig	// 업로드 파일 정보 가져오기 
public class PageReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter()
		.append("이력서 입니다 <br/>")
		.append(request.getParameter("pname")+"<br/>")
		.append(request.getParameter("birth")+"<br/>")
		.append(request.getParameter("upfile")+"<br/>")
		;
		
		//Java Servlet에서 multipart/form-data 형식으로 전송된 요청(request)에서 파일 업로드와 관련된 
		//모든 Part를 가져오는 코드
		Collection<Part> ps = request.getParts(); 

		
		String dirPath = request.getServletContext().getRealPath("dsttt")+"\\";
		System.out.println(dirPath);
		
		//이클립스용 -  배포 시 주석 처리
		dirPath = "C:\\Users\\user\\eclipse\\jspPrj\\src\\main\\webapp\\dsttt\\";  // 파일 저장할 폴더의 절대경로
		System.out.println(dirPath);
				
			
		String imgYam= null;
		for (Part part : ps) {
			System.out.println(part.getName()+":"+part.getContentType()+","+part.getSize()+","+part.getSubmittedFileName());
			
			if(part.getName().equals("upfile")) {
				if(part.getSize()>0 || part.getSubmittedFileName().trim().length()>0) {

						fileSave(part, dirPath);
						
						imgYam = part.getSubmittedFileName();
					}
				}
			}
	
		String enGImg = URLEncoder.encode(imgYam, "UTF-8");
		System.out.println(enGImg);
		response.sendRedirect("file/imgView2.jsp?imgYam="+imgYam);
	}
	
	void fileSave(Part pp, String dirName) {
		 try {
			pp.write(dirName+pp.getSubmittedFileName());
			pp.delete();
		 } catch (IOException e) {
			 
			e.printStackTrace();
		 }
		 
	}

}
