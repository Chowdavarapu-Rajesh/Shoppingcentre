package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dataalert.dao.RegisterDao;
import com.dataalert.dao.UsersDao;
import com.dataalert.model.Register;
import com.dataalert.model.Users;

@Controller
public class HomeController {
	@Autowired
	UsersDao usersDao;

@RequestMapping("/registeruser")
public String registerUser(@ModelAttribute("user") Users user)
{
System.out.println(user.getEmailId());
boolean b=usersDao.registerUser(user);
  System.out.println("value of b:"+b);
if(b)
{
	return"login";
	}
else
{
	return"register";
	}



}
	
	
	
	

@RequestMapping("/")
public String home()
{
System.out.println("i am from controller");
return "index";
}

/*@RequestMapping("/test")
public String test(){
	System.out.println("i am a tester");
Users u= new Users();
u.setUsername("rajesh");
u.setPassword("amma@123");
usersDao.registerUser(u);
return "login";
}*/
@RequestMapping("/adminhome")
public String adminHome()
{System.out.println("i am from admin page");
	return "adminhome";}
@RequestMapping("/userhome")
public String userHome()

{System.out.println("i am from user home");
	
	return "userhome";}


@RequestMapping("/login")
public String login(){
	System.out.println("Login With Controller");
	return "login";
}

/*
@RequestMapping("/product")
public String product(){
	System.out.println("product With Controller");
	return "product";
}
*/


@RequestMapping("/logout")
public String logout()

{System.out.println("i am from logout");
	
	return "logout";}

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
public String Register(Model model)
{System.out.println("register is");
Users user=new Users();
model.addAttribute("user",user);
return "Register";
	}
/*
@RequestMapping("/Register")
public String Register(){


return "Register";
}*/
}

