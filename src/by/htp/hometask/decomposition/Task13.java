package by.htp.hometask.decomposition;

/*13. Дано натуральное число N. Написать метод(методы) для формирования массива, 
 * элементами которого являются цифры числа N. */

public class Task13 {

	public static void main(String[] args) {
		int i;
		int n = 456567;
		
		i = findAmount(n);
		
		int[] arr = makeArray(n, i);
		
		for(int f=0; f<arr.length; f++) {
			System.out.print(arr[f] + " ");
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
	
	public static int[]  makeArray(int n, int i) {
		int arr[] = new int[i];
		for(i=arr.length-1; i>=0; i--) {
			if(n>=10) {
				arr[i] = n%10;
				n=n/10;
			} else {
				arr[i] = n;
			}
		}
		return arr;
	}

}
