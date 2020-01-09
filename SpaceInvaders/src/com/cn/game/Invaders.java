package com.cn.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

public class Invaders {
	
	private static final String DIR_IMG = "images/invader.png";
	private static final int DWIDTH_IMG = 32;
	private static final int DHEIGHT_IMG = 32;
	
	class Invader {
		
		boolean alive;
		int x;
		int y;
		
		public Invader(boolean alive, int x, int y) {
			this.alive = alive;
			this.x = x;
			this.y = y;			
		}
		
	}
	
	private BufferedImage img;
	// The source image width and height
	private int sw_img;
	private int sh_img;
	
	private Vector<Invader> ins;
	// The coordinate of the invaders
	private int x, y;
	private int rows;
	private int columns;
	// The space between each invader
	private int space;
	
	public Invaders(int x, int y, int rows, int columns, int space) {
		
		try {
			img = ImageIO.read(new File(DIR_IMG));
			sw_img = img.getWidth();
			sh_img = img.getHeight();
		} catch (IOException e) {
			System.out.println("Can not load Invader image!");
			e.printStackTrace();
		}
		
		this.x = x;
		this.y = y;
		this.rows = rows;
		this.columns = columns;
		this.space = space;
		ins = new Vector<Invaders.Invader>();
		for(int i = 0; i < rows; i ++) {
			for(int j = 0; j < columns; j ++) {
				int ix = x + space * j + DWIDTH_IMG * j;
				int iy = y + space * i + DHEIGHT_IMG * i;
				ins.add(new Invader(true, ix, iy));
			}
		}
	}
	
	void draw(Graphics g) {
		for(Invader in : ins) {
			int dx1 = in.x;
			int dy1 = in.y;
			int dx2 = in.x + DWIDTH_IMG;
			int dy2 = in.y + DHEIGHT_IMG;
			g.drawImage(img, dx1, dy1, dx2, dy2, 0, 0, sw_img, sh_img, null);
		}
	}

}
