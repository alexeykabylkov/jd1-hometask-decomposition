package by.htp.hometask.decomposition;

/*3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. */

public class Task03 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 24;
		int c = 6;
		int d = 18;
		int nodab;
		int nodc;
		int nod;
		
		nodab = findNodab(a, b);
		nodc = findNodC(nodab, c);
		nod = findNod(nodc, d);
		
		System.out.println("NOD (a, b, c, d) = " + nod);
		
		
	}
	
	
	public static int findNodab(int a, int b) {
		int nodab = Math.min(a, b);
		while (!(a%nodab==0 && b%nodab==0)) {
			nodab--;
		}
		return nodab;  
	}
	
	public static int findNodC (int nodab, int c) {
		int nodc = Math.min(nodab, c);
		while (!(c%nodc==0 && nodab%nodc==0)) {
			nodc--;
		}
		return nodc;
	}

	public static int findNod(int nodc, int d) {
		int nod = Math.min(nodc, d);
		while (!(nodc%nod==0 && d%nod==0)) {
			nod--;
		}
		return nod;
	}
}
