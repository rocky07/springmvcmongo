package com.forsfortis.springweb;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.forsfortis.springweb.service.UserService;
import com.forsfortis.springweb.validators.UserVO;

@Controller
@RequestMapping("/adduser")
public class HelloController {

	@Autowired
	UserService userService;
	@RequestMapping("/list")
	public ModelAndView getAllUsers() throws AuthException{
		ModelAndView modelView=new ModelAndView();
		final List<UserVO> listUsers = userService.listUsers();
		modelView.addObject("userList",listUsers);
		modelView.addObject("no",listUsers.size());
		modelView.setViewName("listusers");
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("user") UserVO userVo,BindingResult results){
		
		ModelAndView modelView=new ModelAndView();
		if(results.hasErrors()){
			modelView.setViewName("adduser");
			return modelView;
		}
		
		userService.addUser(userVo);
		modelView.addObject("name", userVo.getName());
		modelView.addObject("email", userVo.getEmail());
		modelView.setViewName("success");
		return modelView;    
	}

	 @RequestMapping(method = RequestMethod.GET)
	    public String setupForm(Model model) 
	    {
	         UserVO employeeVO = new UserVO();
	         model.addAttribute("user", employeeVO);
	         return "adduser";
	    }
}
