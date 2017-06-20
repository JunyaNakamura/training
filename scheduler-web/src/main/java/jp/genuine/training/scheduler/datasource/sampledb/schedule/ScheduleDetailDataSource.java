package jp.genuine.training.scheduler.datasource.sampledb.schedule;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleDetailRepository;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.User;
@Repository
public class ScheduleDetailDataSource implements ScheduleDetailRepository{

	@Autowired
	public ScheduleDetailMapper scheduleDetailMapper;

	@Override
	public Optional<Schedule> findBy(ScheduleId scheduleId, User user) {
		Schedule scheduleDetail = scheduleDetailMapper.findBy( scheduleId, user );
		return Optional.ofNullable(scheduleDetail);
	}
	@Override
	public void modify(Schedule schedule) {
		scheduleDetailMapper.modify(schedule);
	}
	@Override
	public void delete(Schedule schedule) {
		scheduleDetailMapper.delete(schedule);
	}


}
