package by.htp.hometask.decomposition;

/*5. Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел. */
public class Task05 {

	public static void main(String[] args) {
		int a = 1;
		int b = 7;
		int c = 5;
		int sum;
		
		int max;
		int min;
		
		min = findMin(a, b, c);
		max = findMax(a, b, c);
		sum = findSum(max, min);
		
		System.out.println(sum);
	}
	
	public static int findMin(int a, int b, int c) {
		int minab = Math.min(a, b);
		int min = Math.min(c, minab);
		return min;
	}
	
	public static int findMax(int a, int b, int c) {
		int maxab = Math.max(a, b);
		int max = Math.max(c, maxab);
		return max;
	}
	
	public static int findSum(int min, int max) {
		int sum  = min + max;
		return sum;
		
	}
	

}
