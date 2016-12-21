package kr.co.dgit.school;

import java.sql.Connection;

import kr.co.dgit.school.util.ConnectionFactory;

public class TestMain {
	public static void main(String[] args) {
		Connection con = ConnectionFactory.getInstance();
		
		System.out.println(con);
	}
}
