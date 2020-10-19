package sakila.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/auth/*")
public class LoginFilter implements Filter {


    public LoginFilter() {
   
    }

   
   public void destroy() {
   
   }

   
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      System.out.println("LoginFilter ���� : session �˻�");
      HttpSession session = ((HttpServletRequest)request).getSession();
      if(session.getAttribute("loginStaff")==null) {
         System.out.println("�α��� �� ����!");
          ((HttpServletResponse)response).sendRedirect((request.getServletContext().getContextPath()+"/LoginServlet"));
         return;
      }
      chain.doFilter(request, response);
   }

   
   public void init(FilterConfig fConfig) throws ServletException {
      
      
   }

}