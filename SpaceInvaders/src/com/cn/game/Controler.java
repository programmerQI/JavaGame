package com.cn.game;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controler extends JFrame {
	
	private static final String TITTLE_STRING = "Space Invader";
	private JPanel gamePanel;

	Controler(int width, int height){
		setTitle(TITTLE_STRING);
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
}
