package com.cn.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

public class Invaders {
	
	private static final String DIR_IMG = "images/invader.png";
	// The size of the printed image
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
	private int offset;
	private int num;
	// The space between each invader
	private int space;
	// The left and right boundary of the movement;
	private int left_boundary, right_boundary;
	
	public Invaders(int x, int y, int offset, int num, int space, int left_boundary, int right_boundary) {
		
		try {
			img = ImageIO.read(new File(DIR_IMG));
			sw_img = img.getWidth();
			sh_img = img.getHeight();
		} catch (IOException e) {
			System.out.println("Fail to load Invader image!");
			e.printStackTrace();
		}
		
		this.x = x;
		this.y = y;
		this.offset = offset;
		this.num = num;
		this.space = space;
		this.left_boundary = left_boundary;
		this.right_boundary = right_boundary;
		ins = new Vector<Invaders.Invader>();
		for(int j = 0; j < num; j ++) {
			int ix = x + space * j + DWIDTH_IMG * j + offset;
			int iy = y;
			ins.add(new Invader(true, ix, iy));
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
