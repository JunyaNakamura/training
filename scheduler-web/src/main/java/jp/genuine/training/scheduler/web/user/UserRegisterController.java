package jp.genuine.training.scheduler.web.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.service.user.UserRegisterService;

@Controller
@SessionAttributes("userRegister")
@RequestMapping("/account/register")
public class UserRegisterController {

	@Autowired
	UserRegisterService userRegisterService;

	@RequestMapping(value="", method=RequestMethod.GET)
	public String form(
			Model model,
			HttpServletRequest request){
		model.addAttribute("userRegister", new User());
		return "/user/register/form";
	}

	@RequestMapping(value="", method=RequestMethod.POST)
	public String execute(
			@Validated @ModelAttribute("userRegister") User userRegister,
			BindingResult bindingResult,
			Model userModel,
			HttpServletRequest httpServletRequest){
		userModel.addAttribute("userRegister", userRegister);

		if(bindingResult.hasErrors())
			return "/user/register/form";

		userRegisterService.register(userRegister);

		return "/user/register/completed";
	}
}
