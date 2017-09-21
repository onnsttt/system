package excel;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import Init.Stu;
import Init.TeachingPlan;

public class Text {

	public static void main(String[] args) {
		
		File a = new File("D:/20141128学生.xls");
		File b = new File("D:/教学计划1128.xls");
		ArrayList<ArrayList<Object>> result = ReadExcel.readExcel(a);
		ArrayList<ArrayList<Object>> ans = ReadExcel.readExcel(b);
	}
}
