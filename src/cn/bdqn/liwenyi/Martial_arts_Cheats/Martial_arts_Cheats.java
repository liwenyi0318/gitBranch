package cn.bdqn.liwenyi.Martial_arts_Cheats;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Martial_arts_Cheats")
public class Martial_arts_Cheats extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		
		if(name.equals("Login")){
			doLogin(req, resp);
		}else{
			doOut(req, resp);
		}
		
		
	}
	
	protected void doLogin(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取提交的信息
		String username = req.getParameter("userName");
		String pwd=req.getParameter("password");
		
		//将信息保存在session中
		
		HttpSession session = req.getSession();
		
		//session.setAttribute("password", pwd);
		session.setAttribute("LoginName", username);
		
		//重定向到展示页面
		resp.sendRedirect(req.getContextPath()+"/index.jsp");
			
		
	}
	
	
	protected void doOut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		session.invalidate();
			
		
	}
	
	
	
	
	

}