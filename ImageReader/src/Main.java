import java.io.IOException;
import java.net.URISyntaxException;


public class Main {

	public static void main(String[] args) {
		
		ImageConverter converter = new ImageConverter();
		try {
			converter.exec("C:\\Users\\John\\Desktop\\3.jpg", 50);
		} catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}

	}

}
