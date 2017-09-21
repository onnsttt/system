package Init;

import java.beans.beancontext.BeanContext;
import java.io.File;
import java.util.ArrayList;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.xmlbeans.impl.xb.xsdschema.All;

import excel.ReadExcel;

public class Init {
	public static ArrayList<TeachingPlan> Plant = new ArrayList<>();
	public static ArrayList<Stu> studen = new ArrayList<>();
	public static void main(String[] args) {
		input();
		for(int i = 0;i<studen.size();i++)
			System.out.println(studen.get(i).getSchoolNum());
	}
	
	public static void input(){
		File PlantRoard = new File("D:/教学计划1128.xls");
		File StudenRoard = new File("D://20141128学生.xls");
		ArrayList<ArrayList<Object>> AllPlant = ReadExcel.readExcel(PlantRoard);
		ArrayList<ArrayList<Object>> Allstuden = ReadExcel.readExcel(StudenRoard);
		for(int i = 1;i<AllPlant.size();i++){
			TeachingPlan tmp = new TeachingPlan();
			for(int j = 0;j<AllPlant.get(i).size();j++){
				switch(j){
				case 0:
					tmp.setJXJHH(Integer.valueOf(AllPlant.get(i).get(j).toString()).intValue());
					break;
				case 1:
					tmp.setZYDM(Integer.valueOf(AllPlant.get(i).get(j).toString()).intValue());
					break;
				case 2:
					tmp.setMajorName(AllPlant.get(i).get(j).toString());
					break;
				case 3:
					tmp.setGrace(Integer.valueOf(AllPlant.get(i).get(j).toString()).intValue());
					break;
				case 4:
					tmp.setCourceCode(AllPlant.get(i).get(j).toString());
					break;
				case 5:
					tmp.setCourceName(AllPlant.get(i).get(j).toString());
					break;
				case 6:
					tmp.setCollge(AllPlant.get(i).get(j).toString());
					break;
				case 7:
					tmp.setCollgeOffice(AllPlant.get(i).get(j).toString());
					break;
				default:
					break;
				}
			}
			Plant.add(tmp);
		}
		for(int i = 1;i<Allstuden.size();i++){
			Stu stu = new Stu();
			for(int j  = 0;j<Allstuden.get(i).size();j++){
				switch (j) {
				case 0:
					stu.setSchoolNum(Integer.valueOf(Allstuden.get(i).get(j).toString()).intValue());
					break;
				case 1:
					stu.setName(Allstuden.get(i).get(j).toString());
					break;
				case 2:
					stu.setSex(Allstuden.get(i).get(j).toString());
					break;
				case 3:
					stu.setCollge(Allstuden.get(i).get(j).toString());
					break;
				case 4:
					stu.setMajor(Allstuden.get(i).get(j).toString());
					break;
				case 5:
					stu.setClassName(Allstuden.get(i).get(j).toString());
					break;
				case 6:
					stu.setGrace(Integer.valueOf(Allstuden.get(i).get(j).toString()).intValue());
					break;
				case 8:
					stu.setMajorCodeNum(Integer.valueOf(Allstuden.get(i).get(j).toString()).intValue());
					break;
				default:
					break;
				}
			}
			studen.add(stu);
		}
	}
}








