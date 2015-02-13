package com.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class PowerUp
{

	/**
	 * The X location of the powerup
	 */
	private double _XLoc;
	/**
	 * The Y location of the powerup
	 */
	private double _YLoc;
	/**
	 * Not sure what this is for, but it is used
	 */
	int r;
	/**
	 * What type of powerup this is
	 */
	private PowerupType _Type;
	/**
	 * What color this powerup is
	 */
	private Color color1;

	/**
	 * Initialize a powerup
	 * @param type What type of powerup this powerup is.
	 * @param x The initial X location of the powerup
	 * @param y The initial Y location of the powerup
	 */
	public PowerUp(PowerupType type, double x, double y)
	{
		_Type = type;
		_XLoc = x;
		_YLoc = y;

		if(type == PowerupType.HEALTH)
		{
			color1 = Color.RED;
			r =3;
		}
		else if(type == PowerupType.ONE_LEVEL)
		{
			color1 = Color.YELLOW;
			r =3;
		}
		else if(type == PowerupType.TWO_LEVELS)
		{
			color1 = new Color(0, 255, 255);
			r =5;
		}
		else if(type == PowerupType.SLOW_TIME)
		{
			color1 = new Color(0, 255, 0);
			r =3;
		}
	}

	/**
	 * Get the X location of the powerup
	 * @return the X location of the powerup
	 */
	public double getx()
	{
		return _XLoc;
	}
	/**
	 * Get the Y location of the powerup
	 * @return the Y location of the powerup
	 */
	public double gety()
	{
		return _YLoc;
	}
	/**
	 * Get the R value of the powerup
	 * @return the R valuve of the powerup
	 */
	public double getr()
	{
		return r;
	}
	/**
	 * Get the type that the powerup is
	 * @return the type the powerup is
	 */
	public PowerupType getType()
	{
		return _Type;
	}

	/**
	 * Called when the powerup needs to update
	 * @return If the powerup should be removed
	 */
	public boolean update(){

		_YLoc += 2;

		if(_YLoc>GamePanel.HEIGHT+r){
			return true;
		}

		return false;

	}

	/**
	 * When the Powerup needs to render
	 * @param g The Graphics2D object that it will render on to
	 */
	public void draw(Graphics2D g){

		g.setColor(color1);
		g.fillRect((int)(_XLoc-(2*r)), (int)(_YLoc-(2*r)), 4*r, 4*r);
		g.setStroke(new BasicStroke(3));
		g.setColor(color1.darker());
		g.drawRect((int)(_XLoc-(2*r)), (int)(_YLoc-(2*r)), 4*r, 4*r);
		g.setStroke(new BasicStroke(1));

	}

}
