package com.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PowerUp {

	private double x;
	private double y;
	int r;
	private int type;
	private Color color1;
	
	//1 -- +1 life
	//2 -- +1 power
	//3 -- +2 power
	//4 -- slow down time
	public PowerUp(int type, double x, double y){
		this. type = type;
		this.x = x;
		this.y = y;
		
		if(type == 1){
			color1 = Color.CYAN;
			r =3;
		}
		if(type == 2){
			color1 = Color.YELLOW;
			r =3;
		}
		if(type == 3){
			color1 = new Color(0, 255, 255);
			r =5;
		}
		if(type == 4){
			color1 = new Color(0, 255, 0);
			r =3;
		}
		
	}
	
	public double getx(){
		return x;
	}
	public double gety(){
		return y;
	}
	public double getr(){
		return r;
	}
	public int getType(){
		return type;
	}
	
	
	public boolean update(){
		
		y += 2;
		
		if(y>GamePanel.HEIGHT+r){
			return true;
		}
		
		return false;
		
	}
	
	public void draw(Graphics2D g){
		
		g.setColor(color1);
		g.fillRect((int)(x-(2*r)), (int)(y-(2*r)), 4*r, 4*r);
		g.setStroke(new BasicStroke(3));
		g.setColor(color1.darker());
		g.drawRect((int)(x-(2*r)), (int)(y-(2*r)), 4*r, 4*r);
		g.setStroke(new BasicStroke(1));
		
	}
	
}
