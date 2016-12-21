package kr.co.dgit.school;

import static org.junit.Assert.fail;

import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.co.dgit.school.util.ConnectionFactory;
import kr.co.dgit.school.util.JdbcUtil;

public class ConnectionFactoryTest {
	private static Connection instance;
	
	
	
	public ConnectionFactoryTest() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instance = ConnectionFactory.getInstance();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		JdbcUtil.close(instance);
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(instance);
	}

}
