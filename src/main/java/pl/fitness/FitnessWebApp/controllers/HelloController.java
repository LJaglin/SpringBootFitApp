package pl.fitness.FitnessWebApp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.fitness.FitnessWebApp.models.HelloMessage;

//annotation below tells that this class is important
@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloForm() {
		return "helloForm";
	}
	
	//annotation below allows to use hello method by typing /hello in the search bar..
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	//annotation below allows to display html page on the screne... It is only for first use...
	//@ResponseBody
	public String hello(HttpServletRequest request, Model model) {
		
		//get name parameter from request; will be null of no parameter passed in
		String nameFromRequest = request.getParameter("name");
		//if nameFromReguest is null then use word mate
		if (nameFromRequest == null || nameFromRequest == "") {
			nameFromRequest = "mate";
		}
			
		model.addAttribute("message", HelloMessage.getMessage(nameFromRequest));
		return "hello";
	}
}
