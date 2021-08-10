import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I will not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Ong Yi Liang
 * Student ID: 20029055
 * Class: W65L
 * Date/Time created: Tuesday 03-08-2021 15:34
 */

public class Subject_Test {
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	Subject subject1 = new Subject(1, "English");
	Subject subject2 = new Subject(2, "Maths");
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddSubjects() {
		assertNotNull("Test that list is not null", subjectList);
		
		
	}
	
}
