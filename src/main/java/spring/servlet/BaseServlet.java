package spring.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseServlet extends HttpServlet
{
	private static final long serialVersionUID = 2199370299833709055L;

	public BaseServlet() {super();}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			doProcess(request, response);
		} catch (Exception ex)
		{
			log.error(ex.getMessage(), ex);
			throw new ServletException(ex);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			doProcess(request, response);
		} catch (Exception ex)
		{
			log.error(ex.getMessage(), ex);
			throw new ServletException(ex);
		}
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try
		{
			
		} catch (Exception ex)
		{
			log.error(ex.getMessage(), ex);
			throw ex;
		}
	}
	
	public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
