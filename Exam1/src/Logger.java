public class Logger {
	protected int mLogLevel;

	public Logger(int aLogLevel) {
		mLogLevel = aLogLevel;
	}

	public Logger() {
		this(3);
	}

	public Logger(Logger copyFrom) {
		this(copyFrom.getLevel());
	}

	public int getLevel() {
		return mLogLevel;
	}

	public void setLevel(int aLogLevel) throws IllegalArgumentException {
		if (!isValidLevelRange(aLogLevel))
			throw new IllegalArgumentException("The valued aLogLevel must be positive! Given: (" + aLogLevel + ")");
			
		mLogLevel = aLogLevel;
	}

	public void log(int aLogLevel, String aMessage) throws IllegalArgumentException  {
		if (!isValidLevelRange(aLogLevel))
			throw new IllegalArgumentException("The valued aLogLevel must be positive! Given: (" + aLogLevel + ")");
		
		if (!isValidLevelToLog(aLogLevel))
			return;
		
		System.out.println(getFormatedLog(aLogLevel, aMessage));
	}
	
	protected String getFormatedLog(int aLogLevel, String aMessage) {
		return String.format("%s => %s", aLogLevel, aMessage);
	}
	
	public void log(String aMessage) {
		log(mLogLevel, aMessage);
	}

	private boolean isValidLevelRange(int aLogLevel) {
		return aLogLevel > 0;
	}

	private boolean isValidLevelToLog(int aLogLevel) {
		return aLogLevel <= mLogLevel;
	}
}
