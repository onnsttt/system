package Sql;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.fabric.xmlrpc.base.Value;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class Touch {
	public static void main(String[] args) {
		Connection con;
		String drive = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rm-uf6v551n278hfk2zio.mysql.rds.aliyuncs.com/my?useSSL=false";
		String user = "root";
		String password = "opcOPC8320578";
		try {
			Class.forName(drive);
			con = (Connection) DriverManager.getConnection(url,user,password);
			if(!con.isClosed())
				System.out.println("Suceed");
			else 
				System.out.println("connect fail");
			//Statement statement = (Statement) con.createStatement();
			Init.Init.input();
			Input inp = new Input(con);
			//inp.setIniSql();
			Query quer = new Query(con);
			System.out.println("x");
			System.out.println(quer.query(20153769));
		}catch (Exception e) {
			System.out.println("连接数据库失败");
		}
	}
}
