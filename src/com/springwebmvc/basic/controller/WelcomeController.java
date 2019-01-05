package com.springwebmvc.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springwebmvc.basic.bean.Friend;

@Controller

public class WelcomeController {

	@RequestMapping("/welcome")
	public ModelAndView welcomeSpring()	{
		String messgae = "Hello from Spring MVC....";
		ModelAndView mv = new ModelAndView();		
		mv.setViewName("welcome");
		mv.addObject("msg",messgae);
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView secondJsp()	{
		String messgae = "Second Jsp";
		ModelAndView mv = new ModelAndView();
		mv.addObject("command",new Friend());
		mv.setViewName("Second");
		mv.addObject("msg",messgae);
		return mv;
	}
	
	
	@RequestMapping("/third")
	public ModelAndView thirdJsp()	{
		String messgae = "Third Jsp";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Third");
		mv.addObject("msg",messgae);
		return mv;
	}
	
	
	@RequestMapping(value="/saveFriend", method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("command") Friend friend )	{
		System.out.println(friend.getFriendName());
		System.out.println(friend.getLocation());
		ModelAndView mv = new ModelAndView();
		String messgae = "From save function Friend Added";
		mv.setViewName("Third");
		mv.addObject("msg",messgae);
		return mv;
	}
}
