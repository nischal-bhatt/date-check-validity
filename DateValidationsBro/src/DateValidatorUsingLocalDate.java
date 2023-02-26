import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidatorUsingLocalDate implements DateValidator{

	private DateTimeFormatter dateFormatter;
	
	public DateValidatorUsingLocalDate(DateTimeFormatter da)
	{
		this.dateFormatter = da;
	}
	
	@Override
	public boolean isValid(String dateStr) {
		
		try {
			LocalDate.parse(dateStr, this.dateFormatter);
		}catch (DateTimeParseException e)
		{
			return false;
		}
		return true;
		
	}

}
