package com.src.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public final class HttpUtil {
		//prevent obj creation
	private HttpUtil() {
		
	}
	
	public static void sendJsonResponse(HttpServletResponse response, Object entityToBeConverted) throws IOException {
		Gson g = new Gson();
		String employeeJson = g.toJson(entityToBeConverted);
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		out.println(employeeJson);
		out.flush();
	}
}
