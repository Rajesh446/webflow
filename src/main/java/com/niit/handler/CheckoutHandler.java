package com.niit.handler;

import org.springframework.stereotype.Service;

import com.niit.model.Cart1;


@Service
public class CheckoutHandler {

	public String cardPayment(Cart1 cart1)
	
	{
	/*String name = cart1.getCardnumber();
		String date=cart1.getDate();
		String cvv=cart1.getCvv();
		*/
		
		return "true";
		
		/*
		System.out.println(name);
		
		if(name.equals("1234567890")&&date.equals("01/2018")&&cvv.equals("111"))
		
		{
			
			return "true";
		}
		else{
			return "false";
		}*/
	}
	
	 public String paymentMethod(Cart1 cart1)
	 
	 {
		System.out.println("method");
		//cart1.setMethod("card");
		String method=cart1.getMethod();
		System.out.println(method);
		if(method.equals("cod"))
		
		{
			
			return "cod";
		}
		
		else 
		
		{
			
			return "card";
		}
	
	 }
}