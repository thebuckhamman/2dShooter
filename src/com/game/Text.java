package com.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 * Used to draw text onto the screen for a timed period of time
 * @author goofybud16
 *
 */
public class Text implements Entity{

	/**
	 * The X location of the text
	 */
	private double _XLoc;
	/**
	 * The Y location of the text
	 */
	private double _YLoc;
	/**
	 * How long the text will stay
	 */
	private  long _time;
	/**
	 * What is displayed
	 */
	private String _displayText;
	/**
	 * When the text started being displayed
	 */
	private long _startTime;
	/**
	 * Not used
	 */
	private double _r;

	/**
	 * Used to render text at a specific location for a certain time
	 * @param x X location on screen
	 * @param y Y location on screen
	 * @param time Time it will stay
	 * @param s What is displayed
	 */
	public Text(double x, double y, long time, String s){
		_XLoc = x;
		_YLoc = y;
		_time = time;
		_displayText = s;
		_startTime = System.nanoTime();
		_r = 0;
	}

	@Override
	public boolean update(){
		long elapsed = (System.nanoTime()- _startTime)/ 1000000;
		if (elapsed > _time){
			return true;
		}
		return false;
	}

	@Override
	public void draw(Graphics2D g){
		g.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		long elapsed = (System.nanoTime()- _startTime)/ 1000000;
		int alpha = (int)(255 * Math.sin(3.14* elapsed / _time));
		if(alpha > 255)alpha = 255;
		g.setColor(new Color(255,255,255,alpha));
		int length = (int) g.getFontMetrics().getStringBounds(_displayText, g).getWidth();
		g.drawString(_displayText, (int)(_XLoc-(length/2)), (int)_YLoc);
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
