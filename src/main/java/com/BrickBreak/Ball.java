//Jonah Banks
//12.9.25
//Stores ball constructor, methods and attributes
package com.BrickBreak;
import java.awt.*;

public class Ball {
	//your code here!

	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int velocityX=1;
	private int velocityY=1;
	//constructor(s):
	public Ball(int x,int y,int radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	//methods:
	//Precondition: g is a graphics object created by the port
	//Postcondition: a ball is drawn to the screen
	public void draw(Graphics g){
		g.setColor(Color.CYAN);
		g.fillOval(x,y,radius*2,radius*2);
	}
	//Precondition: velocityX and velocityY have been declared and initialized
	//Postcondition: Moves the ball by velocityX and velocityY
	public void move(){
		this.x+=velocityX;
		this.y+=velocityY;
	}
	//Precondition: velocityX hasbeen declared and initialized
	//Postcondition: Flips the sign of velocityX
	public void reverseX(){
		velocityX*=-1;
	}
	//Precondition: velocityY hasbeen declared and initialized
	//Postcondition: Flips the sign of velocityY
	public void reverseY(){
		velocityY*=-1;
	}
	//getters and setters
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return radius*2;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setXVelocity(int velocityX){
		this.velocityX=velocityX;
	}
	public void setYVelocity(int velocityY){
		this.velocityY=velocityY;
	}
}
