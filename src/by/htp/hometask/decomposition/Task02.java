package by.htp.hometask.decomposition;

/*2. Написать метод(методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух натуральных чисел: */

public class Task02 {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 9;
		int nod;
		int nok;
		
		nod = findNod(a, b);
		nok = findNok(a, b);
		
		System.out.println("nod = " + nod);
		System.out.println("nok = " + nok);
	
	}
	public static  int findNod(int a, int b) {
		int nod = Math.min(a, b);
		while (!(a%nod==0 && b%nod==0)) {
			nod--;
		}
		return nod;
	}
	
	public static int findNok(int a, int b) {
		int nok = (a*b) / findNod(a, b);
		return nok;
	}

}
