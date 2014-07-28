import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PropertiesParser {
	public static Map<String, String> parseProperties(Path pathToProperties) throws IOException
	{
		List<String> propertiesLines = Files.readAllLines(pathToProperties, Charset.defaultCharset());
		Map<String, String> itemMap = new HashMap<String, String>();
		for (String string : propertiesLines) {
			if ('#' == string.charAt(0))
				continue;
			
			String[] items = string.split("=", 2);
			if (items[0].isEmpty())
				continue;
			
			itemMap.put(items[0], items[1]);
		}
		
		return itemMap;
	}
}
