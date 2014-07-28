
public class Main {

	public static void main(String[] args) {
		Logger logger = new Logger(3); //set LEVEL to 3
		//I can also call 'new Logger()', in which case use a default LEVEL of 3
		logger.log(1, "Very Important Messge"); //gets logged as "2 => Somewhat important message"
		logger.log(2, "Somewhat important message"); //gets logged as "2 => Somewhat important message"
		logger.log(3, "Less important message"); // also gets logged!
		logger.log(5, "Not important"); //this is less important than LEVEL, so it will **not be logged**.
		logger.log("Meh"); //overload without a LEVEL parameter, use 3 as default.

		
		logger.setLevel(2);
		logger.log(3, "My message does not get printed!"); //does not get printed!
		//logger.log(Integer.MIN_VALUE, "THIS is most important message in the world!!!");
		
		Logger logger1 = new DateLogger(); //I am not obliged to set a log level, by default your class should print everything in this case
		logger1.log("My message with date"); //this is an overload without a LEVEL parameter. In this situation, assume the LEVEL given to you is 3.
		logger1.log(1, "My message with date"); 

	}

}
