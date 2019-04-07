package sortAlgorithm;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		
		int b = a[0]; 
		int i; 
		int j; 
		for(j = 10; ; j--) { 
			for(i = 1;i<j ; i++) {
				if(a[i]>b&&a[j]<b) { 
					int temp; 
					temp = a[i]; 
					a[i] = a[j]; 
					a[j] = temp; 
					} 
				} 
			}
		
//		System.out.print(a);

	}

}
