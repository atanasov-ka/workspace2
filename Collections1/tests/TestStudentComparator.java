import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestStudentComparator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCompare() {
		List<Student> people = Arrays.asList(
                new Student(5, "Abaa"),
                new Student(5, "Aabb"),
                new Student(5, "Aaaa"),
                new Student(4, "Aaaa"),
                new Student(6, "Aaaa")
        );
		System.out.println(people.toString());
		Collections.sort(people, new StudentComparator());
		System.out.println(people.toString());
	}

}
