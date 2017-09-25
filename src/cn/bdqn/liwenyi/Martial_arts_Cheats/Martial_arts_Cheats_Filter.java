package cn.bdqn.liwenyi.Martial_arts_Cheats;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Martial_arts_Cheats_Filter implements Filter {

	/**
	 * Default constructor.
	 */
	public Martial_arts_Cheats_Filter() {
		System.out.println("过滤器构造方法");
		
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("过滤器已被销毁");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String name = request.getParameter("userName");
		String pwd = request.getParameter("password");

		if (null != name && null != pwd) {
			chain.doFilter(request, response);
		} else {
			// 重定向至登录界面
			request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
		/*try {
			fConfig.wait(500);
			System.out.println("延迟5s");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
		
	}

}
