package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.Userdao;
import hibernate.backend.User;

@Controller
	public class usercontroller {
	@Autowired
	Userdao Userdao;
	@ModelAttribute("adduser")
	public User getUser()
	{
	return new User();
	}
	@RequestMapping(value="adduser",method=RequestMethod.POST)
	public String addUser(User user)
	{
	Userdao.addUser(user);
	return "login";
	}
}
