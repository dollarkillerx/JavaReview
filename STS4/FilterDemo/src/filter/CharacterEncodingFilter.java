package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.Filter.Chain;

public class CharacterEncodingFilter implements Filter {
	private FilterConfig config;
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		System.out.println("hello filter Ending destroy");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO 自动生成的方法存根
		System.out.println("hello filter Ending doFilter");
		arg0.setCharacterEncoding(config.getInitParameter("charset"));
//		String systemName = config.getInitParameter("systemName");
//		String version = config.getInitParameter("version");
//		
//		System.out.println("systeName" + systemName);
//		System.out.println("version" + version);
		arg2.doFilter(arg0,arg1);
	}

	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根
		System.out.println("hello filter Ending Init");
		this.config = arg0;
		
	}

	public FilterConfig getConfig() {
		return config;
	}

	public void setConfig(FilterConfig config) {
		this.config = config;
	}

}
