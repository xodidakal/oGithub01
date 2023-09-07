

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGu
 */
// @WebServlet("/GuGu")
public class GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// gugu.html에서 받은 파라미터 값을 가지고 온다.
		int num = Integer.parseInt(request.getParameter("num"));
		
		// response 인코딩
		response.setContentType("text/html;charset=utf-8");
		
		// html에 출력하기 위한 객체 생성
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>구구단 "+num+"단</h1>");
		for (int i=1; i<10; i++) {
			out.println(num+" * "+i+" = "+(num*i));
			out.println("<br>");
		}
		out.println("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
