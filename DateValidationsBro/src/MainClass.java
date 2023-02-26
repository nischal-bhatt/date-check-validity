import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;

public class MainClass {

	public static void main(String[] args) {
		DateValidator val = new DateValidatorUsingDateFormat("MMddyyyy");
		
		System.out.println(val.isValid("02282019"));
		System.out.println(val.isValid("02302019"));
		
		DateTimeFormatter df
		=DateTimeFormatter.BASIC_ISO_DATE;
		
		DateValidator val2 = new DateValidatorUsingLocalDate(df);
		
		System.out.println(val2.isValid("20190228"));
		System.out.println(val2.isValid("20190230"));
		
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuuMMdd", Locale.US)
			    .withResolverStyle(ResolverStyle.STRICT);
			DateValidator validator = new DateValidatorUsingDateTimeFormatter(dateFormatter);
			        
			System.out.println((validator.isValid("20190228")));
			System.out.println((validator.isValid("20190230")));
		

	}
	

}
