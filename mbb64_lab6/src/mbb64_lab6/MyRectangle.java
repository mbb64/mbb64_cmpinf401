package mbb64_lab6;

public class MyRectangle {
	private int x;
	private int y;
	private int w;
	private int h;
	
		public MyRectangle(){
		this.x = 0;
		this.y = 0;
		this.w = 0;
		this.h = 0;
			// Default constructor -- initialize all instance variables
			// to 0
		}

		public MyRectangle(int xStart, int yStart, int width, int height){
		this.x = xStart;
		this.y = yStart;
		this.w = width;
		this.h = height;
			 // Initialize instance variables based on parameters shown.
			// Be careful to get the order correct!
		}

		public int area(){
			int area;
			area = this.h * this.w;
			return area;
			// Return the area of this Rectangle
		}

		// I have written this method for you.  Note how a StringBuilder is
		// utilized, since (as we discussed in lecture) it can be modified
		// without having to create a new object each time (unlike a String).
		public String toString(){
			StringBuilder S = new StringBuilder();
			S.append("Width: " + w);
			S.append(" Height: " + h);
			S.append(" X: " + x);
			S.append(" Y: " + y);
			return S.toString();
		}

		public boolean isInside(int xInside, int yInside){
			int xEndPoint = x + w;
			int yEndPoint = y + h;
			
			if ((xInside >= x && xInside <= xEndPoint) && (yInside >= y && yInside <= yEndPoint)) {
				System.out.println("Point is within the rectangle.");
			}else{
					System.out.println("Point outside rectangle.");
				}
			}
			
			// This is the trickiest of the methods to write.  This should
			// return true if point (x,y) is anywhere within the borders of the
			// current MyRectangle (including the borders themselves).  Use a
			// pencil and paper to figure out how this can be determined with
			// just a few simple relational operations.


		public void setSize(int newW, int newH){
			this.w = newW;
			this.h = newH;
			// Update width and height as shown
		}

		public void setPosition(int newX, int newY){
			this.x = newX;
			this.y = newY;
			// Update startX and startY as shown
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getW() {
			return w;
		}

		public void setW(int w) {
			this.w = w;
		}

		public int getH() {
			return h;
		}

		public void setH(int h) {
			this.h = h;
		}

}
