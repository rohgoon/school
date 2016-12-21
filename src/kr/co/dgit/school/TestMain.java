package kr.co.dgit.school;



import java.util.Date;

import kr.co.dgit.school.dao.StudentService;
import kr.co.dgit.school.dto.Student;

public class TestMain {
	public static void main(String[] args) {
		/*Connection con = ConnectionFactory.getInstance();
		
		System.out.println(con);*/
		Student item = new Student(4, "È«µÎ±ú", "hdk@test.com", new Date());
		//StudentService.getInstance().insertItem(item);
		//item.setName("ÀüÁöÇö");
		
		//StudentService.getInstance().updateItem(item);
		
		//StudentService.getInstance().deleteItem(4);
		
		
		for (Student s : StudentService.getInstance().selectByAll()) {
			System.out.println(s);
		}
		
		System.out.println(StudentService.getInstance().selectByNo(1));
		
	}
}
