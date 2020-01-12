package com.cn.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Shooter {
	
	private static final String DIR_IMG = "images/shooter.png";
	// The size of the printed image
	private static final int DWIDTH_IMG = 32;
	private static final int DHEIGHT_IMG = 32;
	
	private int coordinate_x;
	private int coordinate_y;
	private int speed;
	private int left_boundary;
	private int right_boundary;
	
	private BufferedImage img;
	// The source image width and height
	private int sw_img;
	private int sh_img;
	
	public Shooter(int x, int y, int speed, int left_boundary, int right_boundary) {
		
		try {
			img = ImageIO.read(new File(DIR_IMG));
			sw_img = img.getWidth();
			sh_img = img.getHeight();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Fail to load shooter images");
		}
		
		this.coordinate_x = x;
		this.coordinate_y = y;
		this.speed = speed;
		this.left_boundary = left_boundary;
		this.right_boundary = right_boundary;	
	}
	
	public void move_to_left() {
		if(coordinate_x - speed >= left_boundary) {
			coordinate_x = coordinate_x - speed;
		}
	}
	
	public void move_to_right() {
		if(coordinate_x + speed <= right_boundary) {
			coordinate_x = coordinate_x - speed;
		}
	}
	
	public void draw(Graphics g) {
		int dx1 = coordinate_x;
		int dy1 = coordinate_y;
		int dx2 = coordinate_x + DWIDTH_IMG;
		int dy2 = coordinate_y + DHEIGHT_IMG;
		g.drawImage(img, dx1, dy1, dx2, dy2, 0, 0, sw_img, sh_img, null);
	}
	
}
