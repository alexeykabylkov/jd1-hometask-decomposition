package by.htp.hometask.decomposition;

/*4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел. */

public class Task04 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 14;
		int nodab;
		int nod;
		int nokab;
		int nok;
		
		nodab = findNodab(a, b);
		nokab = findNokab(a, b);
		nod = findNod(nodab, c);
		nok = findNok(nod, c, nodab);
		
		//System.out.println(nok);
		//System.out.println(nok);
		System.out.println(nod);
	}
	public static int findNodab(int a, int b) {
		int nodab = Math.min(a, b);
		while (!(a%nodab==0 && b%nodab==0)) {
			nodab--;
		}
		return nodab;  
	}
	
	public static int findNod (int nodab, int c) {
		int nod = Math.min(nodab, c);
		while (!(c%nod==0 && nodab%nod==0)) {
			nod--;
		}
		return nod;
	}
	
	public static int findNokab(int a, int b) {
		int nokab = (a*b) / findNodab(a, b);
		return nokab;
	}
	
	public static int findNok(int nod, int c, int nodab) {
		int nok = (nodab * c) / nod;
		return nok;
	}

}
