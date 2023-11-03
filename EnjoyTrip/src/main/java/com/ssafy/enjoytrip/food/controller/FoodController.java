package com.ssafy.enjoytrip.food.controller;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssafy.enjoytrip.food.model.FoodDto;
import com.ssafy.enjoytrip.food.model.service.FoodService;
import com.ssafy.enjoytrip.food.model.service.FoodServiceImpl;

@CrossOrigin("*")
//@RestController
@RequestMapping("/api/food")
public class FoodController extends HttpServlet {
	
	private FoodService foodService;
	public FoodController(FoodService foodService) {
		this.foodService = foodService;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if("list".equals(action)) {
			list(req, resp);
		}
	}

	private void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int areaCode = Integer.parseInt(req.getParameter("city"));
			int foodCode = 1; // 임의로
			List<FoodDto> list = foodService.listFood(areaCode, foodCode);
			
			Collections.sort(list, new Comparator<FoodDto>() {
				@Override
			    public int compare(FoodDto o1, FoodDto o2) {
			        double distance1 = o1.getDistance();
			        double distance2 = o2.getDistance();
			        
			        if (distance1 < distance2) {
			            return -1;
			        } else if (distance1 > distance2) {
			            return 1;
			        } else {
			            return 0;
			        }
			    }
			});
			
			// ObjectMapper를 사용하여 Java 객체 리스트를 JSON 형식으로 변환
			ObjectMapper objectMapper = new ObjectMapper();
			
			String json = objectMapper.writeValueAsString(list);
			
//			resp.setContentType("application/json;charset=utf-8");
//			resp.getWriter().print(json);
//			
			req.setAttribute("foodList", json);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		doGet(req, resp);
	}
	
}