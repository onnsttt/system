package com.ServerPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.plaf.RootPaneUI;

import Init.Init;


public class RootFrame extends JFrame{
	private JMenuBar bar = new JMenuBar();
	private JMenu init = new JMenu("初始化");
	private JMenu BookManage = new JMenu("教材管理");
	private JMenu Select = new JMenu("查询");
	private JMenu UserManage = new JMenu("用户管理");
	private JMenu Toexcel = new JMenu("生成表格");
	private JMenu Exit = new JMenu("退出");
	private JPanel jpanel = new JPanel();
	static private Toolkit kit = Toolkit.getDefaultToolkit();
	static private Dimension ScreenSize = kit.getScreenSize();
	static public final int width = 800;
	static public final int heiget = 250;
	static public final int x = ScreenSize.width;
	static public final int y = ScreenSize.height;
	private InitPanel initpanel = new InitPanel();
	private Lisener lisenner = new Lisener();
	public RootFrame() {
		setLayout(new BorderLayout());
		initmenu();
		jpanel.setLayout(null);
		jpanel.setSize(800,500);
		add("North",bar);
		add(jpanel);
		setTitle("Text");
		setSize(800, 500);
		setLocation(ScreenSize.width/2-400,ScreenSize.height/2-250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initmenu(){
		init.addMouseListener(lisenner);
		BookManage.addMouseListener(lisenner);
		Select.addMouseListener(lisenner);
		UserManage.addMouseListener(lisenner);
		Toexcel.addMouseListener(lisenner);
		Exit.addMouseListener(lisenner);
		bar.add(init);
		bar.add(BookManage);
		bar.add(Select);
		bar.add(UserManage);
		bar.add(Toexcel);
		bar.add(Exit);
	}
		public static void main(String[] args) {
		new RootFrame();
	}
	class Lisener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			System.out.println("aaa");
			JMenu jm = (JMenu)e.getSource();
			if(jm==init){
				jpanel.removeAll();
				jpanel.add("Center",initpanel);
				jpanel.validate();
				jpanel.repaint();
				System.out.println("bbb");
			}
			if(jm==BookManage){
				
			}
			if(jm==UserManage){
				
			}
			if(jm==Select){
				
			}
			if(jm==Toexcel){
				
			}
			if(jm==Exit){
				System.exit(0);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}
}
