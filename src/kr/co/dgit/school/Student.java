package kr.co.dgit.school;

import com.mysql.fabric.xmlrpc.base.Data;

public class Student {
	private int studId;
	private String name;
	private String email;
	private Data dob;
	
	public Student() {
		
	}
	
	
	public Student(int studId, String name, String email, Data dob) {
		super();
		this.studId = studId;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}


	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Data getDob() {
		return dob;
	}

	public void setDob(Data dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
