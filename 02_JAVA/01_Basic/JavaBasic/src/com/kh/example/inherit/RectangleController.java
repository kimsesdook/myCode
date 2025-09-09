package com.kh.example.inherit;

public class RectangleController {
	 Rectangle r = new Rectangle();
	 
	 public String calcArea(int x, int y, int height, int width) {
		 r = new Rectangle(x, y, height, width);
		 return r.getX()+" " +r.getY()+" "+r.getHeight()+" "+r.getWidth()+"/"+( width * height);
	 }
	 public String calcPerimeter(int x, int y, int height, int width) {
		 r = new Rectangle(x, y, height, width);
		 return r.getX()+" "+r.getY()+" "+r.getHeight()+" "+r.getWidth()+"/"+(2*(width * height));
	 }

}
