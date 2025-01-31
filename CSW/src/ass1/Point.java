//Q3
package ass1;

public class Point {
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Point(Point other) {
		this.x =other.x;
		this.y = other.y;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(2,7);
		Point q = new Point(p);
		System.out.println("X: "+p.getx()+" Y: "+p.gety());
		System.out.println("X: "+q.getx()+" Y: "+q.gety());
	}

}
