package by.htp.hometask.decomposition;

/*20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. */

public class Task20 {

	public static void main(String[] args) {
		int n = 123;
		getAmountOfOperations(n);
	
	}
	
	public static int getArrayAmount(int n) {
		int i = 0;
		while(n>9) {
			n = n - n%10;
			n = n/10;
			i++;
		}
		i++;
		return i;
	}
	
	public static int[] getArray(int n, int i) {
		int ar[] = new int[i];
		int j = 0;
		while(n>9) {
			ar[j] = n%10;
			n = n/10;
			j++;
		}
		ar[j] = n;
		return ar;
	}
	
	public static int getSum(int [] ar) {
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;
	}
	
	public static void getAmountOfOperations(int n) {
		int k = 0;
		while(n!=0) {
			n = n - getSum(getArray(n, getArrayAmount(n)));
			k++;
		}
		System.out.println(k);
		
	}

}
