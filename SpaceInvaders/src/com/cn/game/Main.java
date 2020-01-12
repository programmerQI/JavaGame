package com.cn.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		Vector<Invaders> invaders = new Vector<Invaders>();
		invaders.add(new Invaders(0, 0, 5, 8, 2, 0, 400));
		invaders.add(new Invaders(0, 30, 0, 8, 2, 0, 400));
		invaders.add(new Invaders(0, 60, 5, 8, 2, 0, 400));
		invaders.add(new Invaders(0, 90, 0, 8, 2, 0, 400));
		invaders.add(new Invaders(0, 120, 5, 8, 2, 0, 400));
		
		Shooter shooter = new Shooter(300, 300, 0, 400, 400);
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel() {
			public void paint(Graphics g) {
				shooter.draw(g);
			};
		};
		
		jFrame.setSize(400, 400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(jPanel);
		jFrame.setVisible(true);

	}

}
