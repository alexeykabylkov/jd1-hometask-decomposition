package by.htp.hometask.decomposition;

/*1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади. */
public class Task01 {
	
	public static void main(String[] args) {
		
		double p;
		Point p1 = new Point();
		p1.x = 2;
		p1.y = 3;
		
		Point p2 = new Point();
		p2.x = 6;
		p2.y = 3;
		
		Point p3 = new Point();
		p3.x = 6;
		p3.y = 0;
		
		
		double d1 = calcD1(p1, p2);
		double d2 = calcD2(p2, p3);
		double d3 = calcD3(p1, p3);
		
		p = calcSemiPerimetr(d1, d2, d3);
		System.out.println(calcS(p, d1, d2, d3));
		
		
	}
	public static double calcD1(Point p1, Point p2) {
		double dist1 = Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
		return dist1;
	}
	
	public static double calcD2(Point p2, Point p3) {
		double dist2 = Math.sqrt((p3.x-p2.x)*(p3.x-p2.x) + (p3.y-p2.y)*(p3.y-p2.y));
		return dist2;
	}
	
	public static double calcD3(Point p1, Point p3) {
		double dist3 = Math.sqrt((p3.x-p1.x)*(p3.x-p1.x) + (p3.y-p1.y)*(p3.y-p1.y));
		return dist3;
	}
	
	public static double calcSemiPerimetr(double p1, double p2, double p3) {
		double per = (p1+p2+p3) / 2; 
		return per;
	}
	
	public static double calcS(double p, double d1, double d2, double d3) {
		double s = Math.sqrt(p*(p-d1)*(p-d2)*(p-d3));
		return s;
	}
}
	
class Point{
	int x;
	int y;
}




