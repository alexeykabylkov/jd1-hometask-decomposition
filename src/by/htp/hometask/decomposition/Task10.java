package by.htp.hometask.decomposition;

/*10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. */

public class Task10 {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9};
		int fact = 1;
		int sum = 0;
		
		sum = calcSumFactorial(arr, fact, sum);
		System.out.println(sum);

	}
	
	public static int calcFactorial(int i) {
		int f = 1;
		while (i>0) {
			f = f*i;
			i--;
		}
		return f;
	}
	
	public static int calcSumFactorial(int arr[], int fact, int sum) {
		for(int i=0; i<arr.length; i++) {
			fact = calcFactorial(arr[i]);
			//System.out.print(fact + " ");
			sum = sum + fact;
		}
		return sum;
	}
	

}
