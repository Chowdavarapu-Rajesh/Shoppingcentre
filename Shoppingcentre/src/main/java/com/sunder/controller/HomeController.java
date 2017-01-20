package com.sunder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	RegisterDao registerdao;
@RequestMapping("/")
public String home()
{
System.out.println("i am from controller");
return "index";
}

@RequestMapping("/test")
public String test(){
	System.out.println("i am a tester");
Users u= new Users();
u.setUsername("rajesh");
u.setPassword("amma@123");
usersDao.registerUser(u);
return "login";
}
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
public String register(@RequestParam("FIRSTNAME") String firstName,@RequestParam("LASTNAME") String lastname,@RequestParam("CREATEPASSWORD") String createpassword,@RequestParam("CONFIRMPASSWORD") String confirmpassword,@RequestParam("EMAILID") String emailid)
{System.out.println("register is");
Register r=new Register();r.setFirstName("chowdavarapu");
r.setLastName("rajesh");
r.setCreatePassword("amma@143");
r.setConfirmPassword("amma@143");
r.setEmailId("rajesh.ch1993@gmail.com");
registerdao.addRegister(r);

return "index";
	}


}

