package com.exam;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("â ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout()); //��ġ������
		
		c.add(new JButton("���ϱ�"));
		c.add(new JButton("����"));
		c.add(new JButton("���ϱ�"));
		c.add(new JButton("������"));
		c.add(new JButton("���"));
		
		
		setSize(300, 300); // â�� ũ�Ⱑ 300x300
		setVisible(true); // â ���̱�
		
	}
	
	
	
	public static void main(String[] args) {
		new MyFrame();

	}

}
