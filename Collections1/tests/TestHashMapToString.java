import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;


public class TestHashMapToString {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToStringHashMap() {
		Map<Integer, Character> map = new HashMap<>();
		map.put(1, '1');
		map.put(2, '2');
		map.put(3, '3');
		map.put(4, '4');
		map.put(5, '5');
		assertEquals("1 : [1]\r\n2 : [2]\r\n3 : [3]\r\n4 : [4]\r\n5 : [5]\r\n", HashMapUtils.toStringHashMap((HashMap<?, ?>)map));
	}
	
	@Test
	public void testCountWords() {
		HashMap<String, Integer> map = HashMapUtils.countWords("az sum elen sum elen elen");
		assertEquals("az : [1]\r\nsum : [2]\r\nelen : [3]\r\n", HashMapUtils.toStringHashMap(map));
	}

}
