package com.shpitc.driveshare.server.controllers;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.shpitc.driveshare.server.dao.TorqueDao;

public class TorqueController implements Controller {
	
	TorqueDao torqueDao;



	public void setTorqueDao(TorqueDao torqueDao) {
		this.torqueDao = torqueDao;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		
		try {
			String qs = request.getQueryString();
			System.out.println(qs);
			String[] params = qs.split("&");
			String[] data = new String[params.length];
			
			for(int i=0;i<params.length;i++) {
				String[] pair = params[i].split("=");
				data[i] = pair[1];
				System.out.println(data[i]);
			}
			
			
			torqueDao.insertData(data);
			
			PrintWriter out = response.getWriter();

			out.println("OK!");
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		return null;
	}
}
