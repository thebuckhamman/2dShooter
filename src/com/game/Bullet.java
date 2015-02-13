package com.game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;

public class Bullet implements Entity{

	private double _XLoc;
	private double _YLoc;
	private int _r;

	private double _dx;
	private double _dy;
	private double _rad;
	private double _speed;

	private Color _color1;
	/**
	 * Used to create a bullet on the screen
	 * @param angle The angle the bullet will go (in degrees)
	 * @param x The initial bullet X location
	 * @param y The initial bullet Y location
	 */
	public Bullet(double angle,int x, int y)
	{
		_XLoc = x;
		_YLoc = y;
		_r = 2;
		_rad = Math.toRadians(angle);
		_speed = 10;
		_dx = Math.cos(_rad)* _speed;
		_dy = Math.sin(_rad)* _speed;


		_color1 = Color.YELLOW;
	}
	
	@Override
	public boolean update()
	{
		_XLoc += _dx;
		_YLoc += _dy;
		if(_XLoc < -_r || _XLoc > GamePanel.WIDTH + _r || _YLoc <- _r || _YLoc > GamePanel.HEIGHT + _r)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void draw(Graphics2D g)
	{
		g.setColor(_color1);
		g.fillOval((int) (_XLoc-_r), (int) (_YLoc-_r), 2*_r, 2*_r);
	}

	@Override
	public double getX()
	{
		return _XLoc;
	}

	@Override
	public double getY()
	{
		return _YLoc;
	}

	@Override
	public double getR()
	{
		return _r;
	}
}

