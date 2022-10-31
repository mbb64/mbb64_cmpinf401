package mbb64_lab6;

public class MyRectangle {
	private int x;
	private int y;
	private int w;
	private int h;

	public MyRectangle() {
		this.x = 0;
		this.y = 0;
		this.w = 0;
		this.h = 0;
	}

	public MyRectangle(int xStart, int yStart, int width, int height) {
		this.x = xStart;
		this.y = yStart;
		this.w = width;
		this.h = height;
	}

	public int area() {
		int area;
		area = this.h * this.w;
		return area;
	}

	public String toString() {
		StringBuilder S = new StringBuilder();
		S.append("Width: " + w);
		S.append(" Height: " + h);
		S.append(" X: " + x);
		S.append(" Y: " + y);
		return S.toString();
	}

	public boolean isInside(int xInside, int yInside) {
		int xEndPoint = x + w;
		int yEndPoint = y + h;
		boolean point;
		if ((xInside >= x && xInside <= xEndPoint) && (yInside >= y && yInside <= yEndPoint)) {
			point = true;
		} else {
			point = false;
		}
		return point;
	}

	public void setSize(int newW, int newH) {
		this.w = newW;
		this.h = newH;
	}

	public void setPosition(int newX, int newY) {
		this.x = newX;
		this.y = newY;
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
