package jp.genuine.training.scheduler.web.performance.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.scheduler.model.performance.PerformanceOverviewList;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.performance.PerformanceOverviewListService;

@Controller
@RequestMapping("/performances")
public class PerformanceOverviewListController {

	@Autowired
	private PerformanceOverviewListService performanceOverviewListService;

	@RequestMapping(value="",method=RequestMethod.GET)
	public String list(
			Model model,
			WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();
		PerformanceOverviewList performanceOverviewList = performanceOverviewListService.listOf(loginUser);
		model.addAttribute("performanceOverviewList",performanceOverviewList);
		return "/performance/list";
	}
}
