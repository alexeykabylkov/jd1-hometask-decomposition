package by.htp.hometask.decomposition;

/*18. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность 
 * (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию*/

public class Task18 {

	public static void main(String[] args) {
		int n = 2;
		int x = 1;
	
		printNumbers(n, x);

	}
	
	public static int findNumber(int n, int x) {
		int i = 1;
		int y = x+1;
		while (i<n) {
			x = x*10 + y;
			if (i==n-1) {System.out.print(x + " ");}
			i++;
			y++;
		}
		return x;
	}
	
	public static void printNumbers(int n, int x) {
		int i = 1;
		int m;
		while (i<=10-n) {
			m =  findNumber(n, x);
			i++;
			x++;
		}
	}

}
