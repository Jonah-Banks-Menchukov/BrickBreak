package com.BrickBreak;

import java.awt.Graphics;
import java.awt.*;

public class Paddle {
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocityX;
	//your code here!


	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	public Paddle (int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	//methods:
		//Precondition: g is a graphics object created by the port
	//Postcondition: a ball is drawn to the screen
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x,y,width,height);
	}
	//Precondition: velocityX hasbeen declared and initialized
	//Postcondition: Moves the ball by velocityX
	public void move(){
		this.x+=velocityX;
	}
	public void addVelocity(int vel){ 
		velocityX+=vel;
	}
	//getters and setters
	public int getVelocity(){
		return velocityX;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public void setVelocity(int velocityX){
		this.velocityX=velocityX;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
}
