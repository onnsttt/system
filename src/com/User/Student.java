package com.User;
/**
 * 
 * @author ŷ����
 *
 */
public class Student {
	/**
	 * ����
	 */
	private String Name;
	
	
	private int StuName; 
	private String ClassGrade; //�༶
	private int Grade;   //�꼶
	private String Major;  //רҵ
	private int AllBookNum;   //��������
	private int NeedBookNum;  //�Թ���Ŀ
	private long Phonenum;  //�绰����
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public String getClassGrade() {
		return ClassGrade;
	}
	public void setClassGrade(String classGrade) {
		ClassGrade = classGrade;
	}
	public int getStuName() {
		return StuName;
	}
	public void setStuName(int stuName) {
		StuName = stuName;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
	public int getAllBookNum() {
		return AllBookNum;
	}
	public void setAllBookNum(int allBookNum) {
		AllBookNum = allBookNum;
	}
	public int getNeedBookNum() {
		return NeedBookNum;
	}
	public void setNeedBookNum(int needBookNum) {
		NeedBookNum = needBookNum;
	}
	public long getPhonenum() {
		return Phonenum;
	}
	public void setPhonenum(long phonenum) {
		Phonenum = phonenum;
	}
	
}
