package abi_practice;

public class Fan {
    public static final int SLOW=1,MEDIUM=2,FAST=3;
	 int speed;
	 boolean fanOn;
	 String color;
	 Fan(int speed,String color,boolean fanOn)
	 {
	  this.speed=speed;
	  this.color=color;
	  this.fanOn=fanOn;
	 }
	 void display()
	 {
	  if(fanOn==true)
	  {
	   System.out.println("Fan is on \n the speed is ="+speed+"\n the color is ="+color);
	  }
	  else
	  {
	   System.out.println("Fan is off \n the color of fan is ="+color);
	  }
	 }
	public static void main(String[] args) {
		 Fan obj1 = new Fan(MEDIUM,"brown",true);
		 obj1.display();
	}
}
