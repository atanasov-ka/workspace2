import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLogger extends Logger {

	public DateLogger() {
		super(3);
	}

	@Override
	public void log(int aLogLevel, String aMessage) {
		String dateStr = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(Calendar.getInstance().getTime());
		System.out.println(String.format("|%s| %s", dateStr, getFormatedLog(aLogLevel, aMessage)));
	}

	@Override
	public void log(String aMessage) {
		log(mLogLevel, aMessage);
	}

}
