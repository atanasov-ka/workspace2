import java.sql.Date;
import java.text.SimpleDateFormat;

public class Time {
	
	private long mSecs = 0;
	// Factory Method
	public static Time now() {
		return new Time();
	}
	
	/**
	 * 
	 * @param aSecs - Unix Style
	 */
	public Time (long aSecs) {
		if (aSecs < 0)
			throw new IllegalArgumentException();
		mSecs = aSecs;
	}
	
	private Time () {
		mSecs = System.currentTimeMillis() / 1000;
	}

	@Override
	public String toString() {
		Date date = new Date(mSecs * 1000);
		return new SimpleDateFormat("hh:mm:ss dd.MM.YY").format(date);
	}
	
}
