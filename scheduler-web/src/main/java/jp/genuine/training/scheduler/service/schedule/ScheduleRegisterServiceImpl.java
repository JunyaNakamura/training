package jp.genuine.training.scheduler.service.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.exception.ResourceNotFoundException;
import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceDetailRepository;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleRegisterRepository;
import jp.genuine.training.scheduler.model.user.LoginUser;
@Service
public class ScheduleRegisterServiceImpl implements ScheduleRegisterService{
	@Autowired
	private ScheduleRegisterRepository scheduleRegisterRepository;
	@Autowired
	private PerformanceDetailRepository performanceDetailRepository;

	@Override
	public void register(Schedule schedule) {
		scheduleRegisterRepository.register(schedule);
	}

	@Override
	public Performance findBy(PerformanceId performanceId, LoginUser loginUser) throws ResourceNotFoundException{
		Performance performance = performanceDetailRepository.findBy(performanceId,loginUser.getUser()).orElseThrow(ResourceNotFoundException::new);
		return performance;
	}

	@Override
	public List<Schedule> selectAll() {
		List<Schedule> list = scheduleRegisterRepository.selectAll();
		return list;
	}

}
