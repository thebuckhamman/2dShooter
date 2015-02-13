package com.game;

import java.awt.Graphics2D;

public interface Entity
{
	/**
	 * Used to update the entity, so it can move
	 * @return If the entity should be removed
	 */
	public boolean update();
	/**
	 * Get the X location of the entity
	 * @return the X location of the entity
	 */
	public double getX();
	/**
	 * Get the Y location of the entity
	 * @return the Y locaiton of the entity
	 */
	public double getY();
	/**
	 * Get the R value of the entity
	 * @return the R value of the entity
	 */
	public double getR();
	/**
	 * To let the entity draw itself
	 * @param g The graphics object the entity will draw itself on
	 */
	public void draw(Graphics2D g);
}
