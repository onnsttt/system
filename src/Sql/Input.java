package Sql;

import java.sql.SQLException;

import com.User.Student;
import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Init.Init;
import Init.Stu;

public class Input {
	private static Connection con;
	static boolean flag = false;
	public Input(Connection con) {
		this.con = con;
		flag = true;
	}
	public static void setIniSql() {
		if(!flag)
			return;
		 PreparedStatement inp;
		 Stu stu;
		 try {
			inp = (PreparedStatement) con.prepareStatement("insert into stu(SchoolNum,Name,Collge,Major,ClassName,Grade)"+"values(?,?,?,?,?,?)");
			for(int i = 0;i<Init.studen.size();i++) {
				stu = Init.studen.get(i);
				inp.setInt(1, stu.getSchoolNum());
				inp.setString(2, stu.getName());
				inp.setString(3, stu.getCollge());
				inp.setString(4, stu.getMajor());
				inp.setString(5, stu.getClassName());
				inp.setInt(6, stu.getGrace());
				inp.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
