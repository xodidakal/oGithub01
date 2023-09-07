

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add3
 */
@WebServlet("/Add3")
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet 여기왔네");
		// Parameter 받기
		int num = Integer.parseInt(request.getParameter("num")); //add3.html에서 num은 텍스트 형식이기 때문에 숫자로 변환해줘야 함.
		String loc = request.getParameter("loc");
		System.out.println("num->"+num);
		System.out.println("loc->"+loc);
		// 목표 : 1부터 누적값 전달
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("sum->"+sum);
		
		// Encoding 적용 (get 방식은 request 인코딩을 생략해도 되나 post는 request 인코딩을 해야한다)
		// request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 공식 -> 사용자 Browser에 보여주는 객체
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 합계</h1>",num);
		out.printf("<h4>LOC --> %s</h4>",loc);
		out.println(sum);
		out.printf("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 여기왔네");
		
		// request Encoding 적용 (request는 파라미터를 받기 전에 인코딩해주어야 한다)
		request.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(request.getParameter("num")); //add3.html에서 num은 텍스트 형식이기 때문에 숫자로 변환해줘야 함.
		String loc = request.getParameter("loc");
		System.out.println("num->"+num);
		System.out.println("loc->"+loc);
		// 목표 : 1부터 누적값 전달
		int sum = 0;
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("sum->"+sum);
		
		// Encoding 적용
		 response.setContentType("text/html;charset=utf-8");
		
		// 공식 -> 사용자 Browser에 보여주는 객체
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.printf("<h1>1부터 %d까지 Post 합계</h1>",num);
		out.printf("<h4>LOC --> %s</h4>",loc);
		out.println(sum);
		out.printf("</body></html>");
		out.close();
	}

}
