package com.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * The ingame explosions
 * @author goofybud16
 *
 */
public class Explosion implements Entity{
	
	/**
	 * The X location of the Explosion
	 */
	private double _XLoc;
	/**
	 * The Y locaiton of the Explosion
	 */
	private double _YLoc;
	/**
	 * Not sure what R is for, but it is used in a lot of calculations
	 */
	private int _r;
	/**
	 * The maximum size of the explosion
	 */
	private int _maxRadius;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param r
	 * @param max
	 */
	public Explosion(double x, double y, int r, int max)
	{
		_XLoc = x;
		_YLoc = y;
		_maxRadius = max;
		_r = r;
	}
	
	@Override
	public boolean update()
	{
		_r += 2;
		if(_r >= _maxRadius)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void draw(Graphics2D g)
	{
		g.setColor(new Color(255, 255, 255, 128));
		g.setStroke(new BasicStroke(3));
		g.drawOval((int)(_XLoc - _r), (int)(_YLoc - _r), 2 * _r, 2 * _r);
		g.setStroke(new BasicStroke(1));
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
