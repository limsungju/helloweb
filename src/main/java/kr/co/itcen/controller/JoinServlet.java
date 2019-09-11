package kr.co.itcen.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식의 문자열 인코딩
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email"); // 하나의 값을 받을때 사용
		String password = request.getParameter("password");
		String birthYear = request.getParameter("birth-year");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobby"); // 여러개의 값을 받을때 사용
		String selfIntro = request.getParameter("self-intro");
		
		System.out.println(email + ":" + password + ":" + birthYear);
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
		System.out.println(selfIntro);
		
		// 응답 문자열 인코딩
		response.setContentType("text/html; charset=utf-8");
		response.getWriter().println("안녕하세요!");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
