package com.sunder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
public String home()
{
System.out.println("i am from controller");
return "index";
}
@RequestMapping("/login")
public String login(){
	System.out.println("Login With Controller");
	return "login";
}

@RequestMapping("/About us")
public String aboutUs()
{System.out.println("about us is");
return "About us";
	}

@RequestMapping("/Carrers")
public String Carrers()
{System.out.println("Carrers is");
return "Carrers";
	}
@RequestMapping("/Contact us")
public String contactUs()
{
	System.out.println("contact numbers");
	return "Contact us";
	}

@RequestMapping("/Services")
public String Services()
{System.out.println("services is");
return "Services";
	}

@RequestMapping("/Register")
public String register()
{System.out.println("register is");
return "Register";
	}


}

