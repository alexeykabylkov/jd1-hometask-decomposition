package by.htp.hometask.decomposition;

/*6. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника. */

public class Task06 {

	public static void main(String[] args) {
		double area;
		Triangle t1 = new Triangle();
		t1.a = 3;
		
		area = calcArea(t1);
		
		System.out.println(area);
 
	}
	public static double calcArea(Triangle t1) {
		double area = t1.findS() * 6;
		return area;
	}

}
class Triangle{
	int a;
	double s;
	
	double findS() {
		s = ((a*a)*Math.sqrt(3)) / 4;
		return s;
	}
}
