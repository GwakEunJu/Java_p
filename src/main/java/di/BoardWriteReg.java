package di;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BoardWriteReg implements MvcAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDTO dto = new BoardDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setPname(request.getParameter("pname"));
		dto.setPw(request.getParameter("pw"));
		dto.setContent(request.getParameter("content"));
		//dto.setUpfile(request.getParameter("upfile"));
		
		try {
			Part upfile = request.getPart("upfile");
			System.out.println(upfile.getSubmittedFileName());	// 파일이름
			
			//파일 저장
			dto.setUpfile(upfile.getSubmittedFileName());
			
			//파일 존재하면 저장
			if(dto.getUpfile() != null) {
				//실제 서버용- 서버사용 시 이클립스 주석처리
				String dirPath = request.getServletContext().getRealPath("fff")+"\\";
				
				//이클립스용 -  배포 시 주석 처리
				dirPath = "C:\\Users\\user\\eclipse\\jspPrj\\src\\main\\webapp\\fff\\";  // 파일 저장할 폴더의 절대경로
				System.out.println(dirPath); 
				
				fileSave(upfile, dirPath);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		new BoardDAO().write(dto);
		
		System.out.println("BoardWriteReg 서비스 실행"+dto);
		
		request.setAttribute("msg", "등록되었습니다.");
		request.setAttribute("goUrl", request.getContextPath()+"/board/BoardDetail?id="+dto.getId());
		
		request.setAttribute("mainUrl", "board/alert.jsp");

	}
	
	
	void fileSave(Part pp, String dirName ) {
		
		try {
			pp.write(dirName+pp.getSubmittedFileName());	// 파일 저장
			pp.delete();                                    // 브라우저의 임시폴더에 있는 파일 삭제		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	

}
