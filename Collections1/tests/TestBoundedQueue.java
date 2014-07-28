import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBoundedQueue {

	private BoundedQueue<Integer> queue;
	@Before
	public void setUp() throws Exception {
		queue = new BoundedQueue<>(3);
	}

	@Test
	public void testAdd() {
		queue.add(1);
		queue.add(2);
		assertEquals(new Integer(1), queue.peek());
		queue.add(3);
		assertEquals(new Integer(1), queue.peek());
		queue.add(4);
		assertEquals(new Integer(2), queue.peek());
		queue.add(5);
		assertEquals(new Integer(3), queue.peek());
	}

}
