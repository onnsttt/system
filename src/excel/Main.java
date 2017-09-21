package excel;

import java.io.File;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		File file = new File("D:/1.xlsx");
		ArrayList<ArrayList<Object>> result = ReadExcel.readExcel(file);
		for(int i = 0 ;i < result.size() ;i++){
			for(int j = 0;j<result.get(i).size(); j++){
				System.out.println(i+"ÐÐ "+j+"ÁÐ  "+ result.get(i).get(j).toString());
			}
		}
		WriteExcel.writeExcel(result,"F:/bb.xls");
	}

}
