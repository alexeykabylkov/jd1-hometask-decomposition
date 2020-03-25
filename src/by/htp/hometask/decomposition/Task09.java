package by.htp.hometask.decomposition;

/*9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми. */

public class Task09 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 12;
		int c = 18;
		int nod;
		
		nod = findNod(a, b, c);
		
		checkNod(nod);
		

	}
	public static int findNod(int a, int b, int c) {
		int nodab = Math.min(a, b);
		while (!(a%nodab==0 && b%nodab==0)) {
			nodab--;
		}
		int nod = Math.min(nodab, c);
		while (!(c%nod==0 && nodab%nod==0)) {
			nod--;
		}
		return nod;
	}
	
	public static void checkNod ( int nod) {
		
		if (nod == 1) {
			System.out.println("Числа взаимно простые");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}
		
	}
}
