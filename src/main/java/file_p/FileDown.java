package file_p;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Servlet implementation class FileDown
 */
@WebServlet("/FileDown")
public class FileDown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDown() {
        super();
        // TODO Auto-generated constructor stub
    }
    // GET 방식으로 웹 요청을 보냈을 때 실행되는 코드
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		// 다운로드로 변경
    	// 웹 주소에 붙어있는 fileName 값을 가져오는 코드/ 예: FileDown?fileName=test.jpg → fileName은 "test.jpg"
		String fileName = request.getParameter("fileName");
		
		//파일이름이 한글이라면 컴퓨터가 알아볼수 있는 문자로 바꾸기위한 인코딩
		String enName = URLEncoder.encode(fileName,"UTF-8");
		
		// 1. 다운로드로 변경 - 웹 브라우저에 다운로드 파일이라고 알려주는 코드
		response.setHeader("Content-Disposition", "attachment;filename="+enName);
		
		// 파일 저장 된 경로를 찾는 코드
		String path = request.getServletContext().getRealPath("asdf/"+fileName);
		
		// 2. 파일 읽기
		FileInputStream fis = new FileInputStream(path);
		
		// 3. 파일 쓰기
		ServletOutputStream sos = response.getOutputStream();
		
		// 4. 파일 내용 전송 
		byte [] buf = new byte[1024];
		
		while (fis.available() > 0) {
			int len= fis.read(buf);	// buf에 내용을 담는다
			sos.write(buf,0,len);	//담을 내용을 사용자에게 보내기 byte[0]부터 시작, len : 보내려는 바이트 수 
		}
		
		// 5. 스트림 종료
		sos.close();
		fis.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
