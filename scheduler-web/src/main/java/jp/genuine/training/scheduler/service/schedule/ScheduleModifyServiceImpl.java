package jp.genuine.training.scheduler.service.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.exception.ResourceNotFoundException;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleDetailRepository;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.LoginUser;
@Service
public class ScheduleModifyServiceImpl implements ScheduleModifyService{

	@Autowired
	private ScheduleDetailRepository scheduleDetailRepository;

	@Override
	public Schedule findBy(ScheduleId scheduleId, LoginUser loginUser) throws ResourceNotFoundException{
		Schedule schedule = scheduleDetailRepository.findBy(scheduleId,loginUser.getUser()).orElseThrow(ResourceNotFoundException::new);
		return schedule;
	}

	@Override
	public void modify(Schedule schedule) {
		scheduleDetailRepository.modify(schedule);
	}

	@Override
	public void delete(Schedule schedule) {
		scheduleDetailRepository.delete(schedule);
	}

}
