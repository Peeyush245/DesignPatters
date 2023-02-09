package singleton;

public class LogManager {

	private static LogManager logManagerInstance = null;
	private LogManager() {
		System.out.println("Log Manager Instantiated");
	}
	
	public static LogManager getInstance() {
		if(logManagerInstance == null)
			logManagerInstance = new LogManager();
		return logManagerInstance;
	}
}
