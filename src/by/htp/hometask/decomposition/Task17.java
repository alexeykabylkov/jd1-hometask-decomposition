package by.htp.hometask.decomposition;

/*17. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
 * возведенная в степень n, равна самому числу. 
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию. */

public class Task17 {

	public static void main(String[] args) {
		int amount;
		int k = 1000;
		int sum;
		//amount = calcAmountOfFigures(34);
		//System.out.println(amount);
		//sum = calcSumOfFigures(12222);
		//System.out.println(sum);
		for(int x=1; x<=k; x++) {
			checkIfArmstrong(x);
		}
		

	}
	
	public static int calcAmountOfFigures(int n) {
		int amount = 0;
		if (n<10) {
			amount = 1;
		} else {
			while (n>=10) {
				n = n/10;
				amount = amount+1;
			}
			amount = amount+1;
		}
		return amount;
	}
	
	public static int calcSumOfFigures(int i) {
		int sum = 0;
		if (i<10) {
			sum = i;
		} else {
			while (i>=10) {
				sum = sum + i%10;
				i = i/10;
			}
			sum = sum + i;
		}
		return sum;
	}
	
	public static void checkIfArmstrong(int x) {
		if (Math.pow(calcSumOfFigures(x), calcAmountOfFigures(x)) == x) {
			System.out.print(x + " ");
		}
		
	}

}
