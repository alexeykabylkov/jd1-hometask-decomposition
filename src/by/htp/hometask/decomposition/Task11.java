package by.htp.hometask.decomposition;

/*11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных 
 * элементов массива с номерами от k до m. */

public class Task11 {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		int k = 3;
		int m = 5;
		int sum;
		
		sum = calcSum(arr,k,m);
		System.out.println(sum);

	}
	public static int calcSum (int arr[], int k, int m) {
		int sum = 0;
		for(int i=k; i<=m; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
