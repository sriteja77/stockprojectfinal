package com.example.SpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBoot.Model.User;

@Controller
public class HelloController {

	// TODO Auto-generated method stub
	@RequestMapping(path = "/")
	public ModelAndView sayHello(Model model) throws Exception{
		ModelAndView mav1 = new ModelAndView();
		mav1.setViewName("userReg");
		model.addAttribute("userRegister", new User());
		return mav1;

		
	}

}
