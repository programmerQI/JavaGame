package com.cn.game;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private static final String TITTLE_STRING = "Space Invader";
	
	private JPanel gamePanel;

	Window(int width, int height, JPanel panel){
		setTitle(TITTLE_STRING);
		setSize(width, height);
		
	}
	
}
