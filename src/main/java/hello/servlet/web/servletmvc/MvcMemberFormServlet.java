package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        /*
         * Redirect vs. forward
         * 리다이렉트는 실제 클라이언트로 응답 전송 후 클라이언트가 redirect 경로 서버 요청
         * - 클라이언트 인지 가능
         * - url 경로 변경
         * 포워드는 서버 내부에서 일어나는 호출
         * - 클라이언트는 인지 못함
         */
        /*
         리다이렉트가 발생한 게 아님.
         서버 내부에서 다시 호출이 발생해 다른 서블릿이나 JSP 로 이동할 수 있는 코드
         WEB-INF 내부에 있는 JSP는 외부에서 직접 호출이 불가하고 항상 컨트롤러를 통해 호출해야 하므로, 이 코드가 필요
         */
        dispatcher.forward(request, response);
    }
}
