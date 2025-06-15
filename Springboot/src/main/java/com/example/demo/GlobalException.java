package com.example.demo;

import java.time.LocalDate;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.exception.ErrorMsg;
import com.example.demo.exception.InvalidTrainException;

// All the methods present will globally apply to all the controllers
@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(InvalidTrainException.class)
	public @ResponseBody ErrorMsg checkInvalidTrain(InvalidTrainException e) {
		ErrorMsg msg=new ErrorMsg(LocalDate.now(), e.getMessage());
		return msg;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public @ResponseBody ErrorMsg
	checkFieldError(MethodArgumentNotValidException me) {
		
		/*
		 * 
		 * So here
		 * BindingResult getBindindResult()
		 * BindResult interface having a method callled
		 * FieldError getFieldError()
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		String errorMsg=me.getBindingResult().
				getFieldError().getDefaultMessage();
		ErrorMsg msg=new ErrorMsg(LocalDate.now(), errorMsg);
		return msg;
	}
	

}
