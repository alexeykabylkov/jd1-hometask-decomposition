package by.htp.hometask.decomposition;

/*16. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. 
 * Для решения задачи использовать декомпозицию. */

public class Task16 {

	public static void main(String[] args) {
		int n = 7;
		findTwins(n);
	}
	public static void findTwins(int n) {
		int x, y;
		x = n;
		while (x<=n*2) {
			y = x+2;
			System.out.println(x + " " + y);
			x++;
		}
	}

}
