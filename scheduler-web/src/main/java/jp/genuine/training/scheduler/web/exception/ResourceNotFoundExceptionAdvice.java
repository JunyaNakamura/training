package jp.genuine.training.scheduler.web.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jp.genuine.training.scheduler.exception.ResourceNotFoundException;

@ControllerAdvice
public class ResourceNotFoundExceptionAdvice {
	@ExceptionHandler( value = ResourceNotFoundException.class )
	public void resourceNotFoundException( HttpServletResponse response ) throws IOException
	{
		response.sendError( HttpStatus.NOT_FOUND.value());
	}
}
