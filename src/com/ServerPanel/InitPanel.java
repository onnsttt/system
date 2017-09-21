package com.ServerPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.commons.collections4.map.Flat3Map;
import org.apache.poi.hssf.usermodel.examples.NewLinesInCells;

import Init.Init;

public class InitPanel extends JPanel{
	private JTextField studentfile = new JTextField("xxx");
	private JTextField plantfile = new JTextField("sss");
	private JButton buttonsure = new JButton("确认");
	private JButton button1 = new JButton("...");//计划地址；
	private JButton button2 = new JButton("...");//学生地址；
	private Label label1 = new Label("教学计划：");
	private File plan;
	private File student;
	private Label label2 = new Label("学生表:");
	private boolean planstate = false;
	private boolean studentstate = false;
	private JTextArea jta = new JTextArea();
	private JFileChooser chooser = new JFileChooser();
	public InitPanel() {
		setLayout(null);
		setSize(800,500);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chooser.setFileSelectionMode(0);
				int state = chooser.showOpenDialog(null);
				if(state==1){
					planstate = false;
				}else {
					plan = chooser.getSelectedFile();
					planstate = true;
					studentfile.setText(plan.getAbsolutePath());
				}
			}
		});
		button2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				chooser.setFileSelectionMode(0);
				int state = chooser.showOpenDialog(null);
				if(state==1){
					studentstate = false;
				}else {
					student = chooser.getSelectedFile();
					studentstate = true;
					studentfile.setText(student.getAbsolutePath());
				}
			}
		});
		buttonsure.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(studentstate&&planstate){
					new Init();
					jta.append("资料初始化成功\n");
				}else {
					jta.setText("");
					if(!studentstate)
						jta.append("没有添加学生资料\n");
					if(!planstate)
						jta.append("没有添加教学计划\n");
				}
			}
		});
		jta.setBounds(220, 300, 250, 100);
		button1.setBounds(420,100,50,40);
		button2.setBounds(420,150,50,40);	
		plantfile.setBounds(300,100,100, 40);
		studentfile.setBounds(300,150,100,40);
		label1.setBounds(220, 100, 60, 40);
		label2.setBounds(220, 150, 60, 40);
		buttonsure.setBounds(300, 200,100,60);
		add(button1);
		add(button2);
		add(label1);
		add(label2);
		add(buttonsure);
		add(studentfile);
		add(plantfile);
		add(jta);
	}
	/*public static void main(String[] args) {
		JFrame  j = new JFrame();
		j.setSize(800, 500);
		j.add(new InitPanel());
		j.setVisible(true);
		j.getDefaultCloseOperation();
	}*/
}
