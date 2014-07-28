import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCollectionsUtils {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSort() {
		assertTrue(CollectionsUtil.sort(Arrays.asList(2, 3, 1, 2, 4, 5, 6))
				.equals(Arrays.asList(1, 2, 2, 3, 4, 5, 6)));
		assertFalse(CollectionsUtil.sort(Arrays.asList(2, 3, 1, 2, 4, 5, 6))
				.equals(Arrays.asList(2, 3, 1, 2, 4, 5, 6)));
	}

	@Test
	public void testReverse() {
		assertTrue(CollectionsUtil.reverse(Arrays.asList(2, 3, 1, 2, 4, 5, 6))
				.equals(Arrays.asList(6,5,4,2,1,3,2)));
		assertFalse(CollectionsUtil.reverse(Arrays.asList(2, 3, 1, 2, 4, 5, 6))
				.equals(Arrays.asList(2, 3, 1, 2, 4, 5, 6)));
	}

	@Test
	public void testIsMonotonous() {
		assertTrue(CollectionsUtil.isMonotonous(Arrays.asList(1,2,3,4,5,6,7)));
		assertTrue(CollectionsUtil.isMonotonous(Arrays.asList(5,4,3,2,1,1,1,1)));
		assertFalse(CollectionsUtil.isMonotonous(Arrays.asList(5,4,3,2,1,1,1,1,4)));
	}

}
