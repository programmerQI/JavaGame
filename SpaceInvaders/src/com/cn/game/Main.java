package com.cn.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		
		
		Window window = new Window(400, 400, new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				Invaders invaders = new Invaders(0, 0, 10, 10, 5);
				invaders.draw(g);
			}
		});
		
		
		
		window.setVisible(true);

	}

}
