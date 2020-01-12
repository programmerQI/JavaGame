package com.cn.game;

import java.awt.Graphics;
import java.util.Vector;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	private Vector<Invaders> invaders;
	
	public GamePanel(Vector<Invaders> invaders) {
		this.invaders = invaders;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for(Invaders in : invaders) {
			in.draw(g);
		}
	}
}
