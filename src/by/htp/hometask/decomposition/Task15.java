package by.htp.hometask.decomposition;

/*15. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N. */

public class Task15 {

	public static void main(String[] args) {
		int k;
		int n = 20;
		int i;
		int numbers[] = new int [n];

	}
	public static int initArray(int numbers[], int n) {
		for(int i=1; i<n; i++) {
			numbers[i] = i+1; 
			
		}
		return numbers[];
	}
	
	public static int calcSumOfNumbers (int numbers[], int n, int k) {
		
		
		int sum = 0;
		for (int i=1; i<n; i++) {
			if (numbers[i] > 10) {
				while (numbers[i]>10) {
					sum = sum+(numbers[i] % 10);
					numbers[i] = numbers[i] / 10;
				}
			sum = sum + numbers[i];
			} else {
				sum = numbers[i];
			}
		}
	}
		
	
	

}
