package dec_27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class DbConn {
	
	@Test
	public void atTest() throws Exception{
		
		String mySQL, myDB, mySQLDB, myDriver, myT1, myUName, myPswd;
		String myQuery1, myQuery2;

		Connection myCon = null;
		Statement mySt;
		PreparedStatement myPst;
		ResultSet rs1, rs2;
		
		mySQL = "jdbc:mysql://localhost:3306/";
		myDB = "testdb";
		mySQLDB = mySQL + myDB;
		myDriver = "com.mysql.jdbc.Driver";
		myUName = "root";
		myPswd = "12345";
		
		Object myDC = Class.forName(myDriver).newInstance();
		myCon = DriverManager.getConnection(mySQLDB, myUName, myPswd);
		mySt = myCon.createStatement();
		
		myQuery1 = "Select * from table1";
		rs1 = mySt.executeQuery(myQuery1); 
		if (rs1 == null) {
		System.out.print("Empty result set");
		}
		rs1.next();
		System.out.print(rs1.getString("name"));
		System.out.print(rs1.getInt("age"));
		System.out.print(rs1.getString("office"));




		
	}
}
