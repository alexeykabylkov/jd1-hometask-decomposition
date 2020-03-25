package by.htp.hometask.decomposition;

/*19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. 
 * Для решения задачи использовать декомпозицию. */

public class Task19 {

	public static void main(String[] args) {
		int n = 2;
		int x;
		int sum = 0;
		
		for (int i=(int) Math.pow(10, n-1); i<Math.pow(10, n); i++) {
			x = checkArray(getArray(i, n));
			if (x>0) {
				sum = sum + x;
			}
		}
		System.out.println(sum);
		

	}
	
	public static int[] getArray(int x, int n) {
		int ar[] = new int[n];
		int i = 0;
		while(x>9) {
			ar[i] = x%10;
			x = x/10;
			i++;
		}
		ar[i] = x;
		return ar;
	}
	
	public static int checkArray(int [] ar) {
		int sum = 0;
		for (int i=0; i<ar.length; i++ ) {
			if (ar[i] % 2 != 0) {
				sum = sum + ar[i];
			} else {
				sum = sum*0;
			}
		}
		return sum;
	}
	
	
	

}
