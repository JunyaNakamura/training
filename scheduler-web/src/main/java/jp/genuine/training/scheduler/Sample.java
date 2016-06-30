package jp.genuine.training.scheduler;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static void main( String[] args )
	{
		LocalDate from = LocalDate.of( 2016, 6, 25 );
		LocalDate to = LocalDate.of( 2016, 7, 6 );
		Long dayCount = ChronoUnit.DAYS.between(from, to);
		List<LocalDate> days = new ArrayList<LocalDate>();
		LocalDate start = LocalDate.of( from.getYear(), from.getMonth(), from.getDayOfMonth() );
		for( int i = 0; i<=dayCount; i++ )
		{
			days.add(start);
			start = start.plusDays(1);
		}
		System.out.println(days);
	}
}
