package jp.genuine.training.scheduler.web.performancedetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.performance.PerformanceDetailService;

@Controller
@RequestMapping("/performance")
public class PerformanceDetailController {

	@Autowired
	private PerformanceDetailService performanceDetailService;

	@RequestMapping(value="/{performanceId}",method=RequestMethod.GET)
	public String detail(
			@PathVariable("performanceId") Integer performanceId,
		Model model,
		WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		Performance performanceDetail = performanceDetailService.findBy(new PerformanceId(performanceId),loginUser);
		model.addAttribute("performanceDetail",performanceDetail);
		return "/performance/detail";
	}
}
