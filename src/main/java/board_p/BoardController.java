package board_p;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model_p.PageDTO;

import java.io.IOException;

import di.MvcAction;

/**
 * Servlet implementation class BoardController
 */
@MultipartConfig()	// 파일 업로드 요청처리하는 어노테이션
@WebServlet("/board/*")	// board로 시작하는 모든 요청을 이 서블릿이 처리함
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.setContentType("text/html;charset=UTF-8");
//		System.out.println(request.getRequestURI());	// 현재 요청 uri 출력
//		System.out.println(request.getContextPath()+"/Board/");  // 웹애플리케이션 루트 경로 = "/board/" 출력
//		System.out.println( (request.getContextPath()+"/Board/").length() ); // 위 문자열의 길이 출력
		
		String cate = "board"; // 카테고리 문자열 board를 변수에 저장
		
		String service = request.getRequestURI().substring(
				(request.getContextPath()+"/"+cate+"/").length());
		System.out.println(service);
		
		String mainUrl = cate+ "/"+service+".jsp";
		
		
		
		//MvcAction action = new di.BoardList();
		try {
			// 뷰에서 사용할 메인 url 경로를 request에 저장
			request.setAttribute("mainUrl", mainUrl);
			
		
			// 페이지 정보 보내기
			request.setAttribute("pDTO", new PageDTO(request));
			
			// 5. service 가기
			MvcAction action =(MvcAction)Class.forName("di."+service).newInstance();
			action.execute(request, response);
			
			
			
			// 9 --> 10 template
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/template.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
