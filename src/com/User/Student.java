package com.User;
/**
 * 
 * @author 欧鹏程
 *
 */
public class Student {
	/**
	 * 姓名
	 */
	private String Name;
	
	
	private int StuName; 
	private String ClassGrade; //班级
	private int Grade;   //年级
	private String Major;  //专业
	private int AllBookNum;   //购书总数
	private int NeedBookNum;  //自购数目
	private long Phonenum;  //电话号码
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
