package by.htp.hometask.decomposition;

/*14. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр. */

public class Task14 {

	public static void main(String[] args) {
		int n = 354;
		int m = 3456;
		int ncount;
		int mcount;
		
		ncount = findAmount(n);
		mcount = findAmount(m);
		if (ncount>mcount) {
			System.out.println("n have more numbers");
		} else {
			System.out.println("m have more numbers");
		}
		

	}
	
	public static int findAmount(int n) {
		int i = 1;
		while (n/10!=0) {
			n = n/10;
			i++;
		}
		return i;
	}
	
	public static int findMax(int nmax, int mmax) {
		int max = Math.max(nmax, mmax);
		return max;
	}

}
