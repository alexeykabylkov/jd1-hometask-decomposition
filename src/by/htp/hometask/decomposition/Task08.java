package by.htp.hometask.decomposition;

/*8. Составить программу, которая в массиве A[N] находит второе по величине число 
 * (вывести на печать число, которое меньше максимального элемента массива, 
 * но больше всех других элементов). */
import java.util.Random;
public class Task08 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int arr[] = new int[10];
		int max;
		int nmax;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(9);
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		
		max = findMaxArr(arr);
		
		nmax = findNextMax(max, arr);
		System.out.println("the second maximum element = " + nmax);
		
	}
	
	public static int findMaxArr(int arr[]) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int findNextMax(int max, int arr[]) {
		int nmax = 0;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] > nmax && arr[i]<max) {
				nmax = arr[i];
			}
		}
		return nmax;
	}

	
}
