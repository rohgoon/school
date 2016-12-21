package kr.co.dgit.school.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static final ConnectionFactory instance = new ConnectionFactory();
	
	public static Connection getInstance(){
		
		return instance.createConnection();
	}
	
	public ConnectionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	private Connection createConnection(){
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "user_school";
		String password = "rootroot";
		
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.err.println("jdbc ����̹� �߰�, Ȥ�� url user password Ȯ��");
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
