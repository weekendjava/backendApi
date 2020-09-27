package com.src.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.src.model.Employee;
import com.src.model.Employee.EmployeeBuilder;
import com.src.util.HttpUtil;

/**
 * Servlet implementation class FetchEmployee
 */
@WebServlet("/FetchEmployee")
public class FetchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Employee employee = new Employee(13, "mojombo", "Tom Preston-Werner", "User", false, null, null, null, null, null, null, 11, 22128, 62, 62);
		Employee employee = new Employee.EmployeeBuilder(1, "mojombo", "Tom Preston-Werner", "User", false, 11, 22128, 62, 62)
										.withProfilePic("https://avatars0.githubusercontent.com/u/1?v=4")
										.withBlog("http://tom.preston-werner.com")
										.build();
		HttpUtil.sendJsonResponse(response, employee);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
