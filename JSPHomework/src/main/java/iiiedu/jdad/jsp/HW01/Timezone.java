package iiiedu.jdad.jsp.HW01;

import java.io.IOException;
import java.util.TimeZone;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Timezone
 */
@WebServlet("/ex01/showTime.do")
public class Timezone extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String zone = request.getParameter("city");
		String place = null;
		
		ChangeZone zones = new ChangeZone();
		if(zone.equalsIgnoreCase("NewYork")){
			place = zones.change("America/New_York");	
		}else if(zone.equalsIgnoreCase("Tokyo")){
			place = zones.change("Asia/Tokyo");	
		}else if(zone.equalsIgnoreCase("Taipei")){
			place = zones.change("Asia/Taipei");	
		}else if(zone.equalsIgnoreCase("London")){
			place = zones.change("Europe/London");	
		}else if(zone.equalsIgnoreCase("Sydney")){
			place = zones.change("Australia/Sydney");	
		}else if(zone.equalsIgnoreCase("")){
			place = "你未選擇任何時區！！";
		}
		
		request.setAttribute("TimeZone", place);
		RequestDispatcher rd = request.getRequestDispatcher("/ex01/TimeZone.jsp");
		rd.forward(request, response);
		return;
	}

}
