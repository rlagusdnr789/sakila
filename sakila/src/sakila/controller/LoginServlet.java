package sakila.controller;

import java.io.IOException;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sakila.service.*;
import sakila.vo.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	// �α��� ������ �̵�

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�α��εǸ� �ε���������
		HttpSession session = request.getSession();

		if (session.getAttribute("loginStaff") != null) {

			response.sendRedirect(request.getContextPath() + "/auth/IndexServlet");

			return;

		}

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	// �α��� �׼����� �̵�(����)

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {

	}

}