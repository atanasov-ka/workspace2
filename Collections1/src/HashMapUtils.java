import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashMapUtils {
	public static String toStringHashMap (HashMap<? extends Object, ? extends Object> aInput) {
		//Set<?> keySet = aInput.keySet();
		SortedSet<Object> keySet = new TreeSet<Object>(aInput.keySet());
		
		String result = "";
		for (Object item : keySet) {
			Object val = aInput.get(item);	
			result += String.format("'%s' : [%s]\r\n", item, val);
		}
		return result;
	}
	
	public static HashMap<String, Integer> countWords(String aInput) {
		String[] words = aInput.split(" ");
		HashMap<String, Integer> result = new HashMap<>();
		for (String word : words) {
			Integer count = result.get(word);
			if (count == null)
				count = 0;
			count++;
			result.put(word, count);
		}
		return result;
	}
}
