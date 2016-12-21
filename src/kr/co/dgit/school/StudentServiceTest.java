package kr.co.dgit.school;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.school.dao.StudentService;
import kr.co.dgit.school.dto.Student;

public class StudentServiceTest {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = StudentService.getInstance();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		studentService = null;
	}

	@Test
	public void testSellectByAll() {
		List<Student> list = studentService.selectByAll();
		Assert.assertNotEquals(0, list.size());
		for (Student s : list) {
			System.out.println(s);
		}
	}
	
	@Test
	public void testSellectByNo() {
		Student selectedItem = studentService.selectByNo(1);
		Assert.assertNotNull(selectedItem);
		
	}
	
	@Test
	public void testdelectItem(){
		int boforeSize = studentService.selectByAll().size();
		
		studentService.deleteItem(3);
		
		int afterSize = studentService.selectByAll().size();
		
		Assert.assertNotEquals(boforeSize, afterSize);
		
	}

}
