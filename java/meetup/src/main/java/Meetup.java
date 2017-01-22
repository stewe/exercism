import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Meetup {

	private int year;
	private Month month;

	public Meetup(int month, int year) {
		Year.of(year); // throws exception if year is invalid
		this.year = year;
		this.month = Month.of(month);
	}

	public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule nth) {
		LocalDate date = LocalDate.of(this.year, this.month, 1);
		while (date.getDayOfWeek() != dayOfWeek) {
			date = date.plusDays(1);
		}
		switch (nth) {
			case FIRST:		break;
			case SECOND:	date = date.plusWeeks(1);
							break;
			case THIRD:		date = date.plusWeeks(2);
							break;
			case FOURTH:	date = date.plusWeeks(3);
							break;
			case LAST:		date = date.plusDays(date.lengthOfMonth()-date.getDayOfMonth());
							while (date.getDayOfWeek() != dayOfWeek) {
								date = date.minusDays(1);
							}
							break;
			case TEENTH:	if (date.getDayOfMonth() >=6) {
								date = date.plusDays(7);
							} else {
								date = date.plusDays(14);
							}
							break;
			default:		break;
		}
		return date;
	}

}