package Sql;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Query {
	private static Connection con;
	static String sql="";
	static boolean flag = false;
	static Statement state;
	public Query(Connection con) {
		this.con = con;
		try {
			this.state = (Statement) con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		flag = true;
	}
	String query(int stunum){
		if(!flag)
			return new String("≤È—Ø¥ÌŒÛ");
		String ans = "";
		sql ="select * from userlist where SchoolNum = 20153769";
		ResultSet rs;
		try {
			rs = state.executeQuery(sql);
			System.out.println("ans="+ans);
			while(rs.next()) {
				ans = rs.getString("SchoolNum");
				System.out.println(ans);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(ans);
		/*"\t"+
		rs.getString("Name")+"\t"+
		rs.getString("Collge")+"\t"+
		rs.getString("Major")+"\t";*/
		//rs.getString("BookList")+"\t"+
	//	rs.getString("BookNum")+"\t"+
		//rs.getString("ChooseNum")+"\t"+
		//rs.getString("Price")+"\t"+
		//rs.getString("Grade")+"\n";;
		return ans;
	}
}
