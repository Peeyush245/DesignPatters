package singleton;

public class Driver {

	public static void main(String[] args) {
		
		LogManager logManager1 = LogManager.getInstance();
		LogManager logManager2 = LogManager.getInstance();
		
		System.out.println(logManager1);
		System.out.println(logManager2);

	}

}
