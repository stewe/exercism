import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
	
	private final static int GIGA_SECOND = 1000000000;
	private final LocalDateTime date;
	
	public Gigasecond(LocalDate birthday) {
		date = birthday.atStartOfDay().plusSeconds(GIGA_SECOND);
	}

	public Gigasecond(LocalDateTime birthday) {
		date = birthday.plusSeconds(GIGA_SECOND);
	}

	public Object getDate() {
		return date;
	}

}
