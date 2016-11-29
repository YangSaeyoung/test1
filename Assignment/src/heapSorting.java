class Sorting {
	public static void heapSort(int[] a) {
		int n = a.length-1;
		
		for(int i = n/2; i >= 1; i--) {
			makeHeap(a, i, n);
		}
		
		for(int i = n-1; i >= 1; i--) {
			int temp;
			temp = a[1];
			a[1] = a[i+1];
			a[i+1] = temp;
			makeHeap(a, 1, i);
		}
	}
	
	public static void makeHeap(int[] a, int h, int m) {
		int root = a[h];
		int j;
		
		for(j = 2*h; j <= m; j *= 2) {
			if(j < m) {
				if(a[j] < a[j+1])
					j++;
			}
			
			if(root >= a[j])
				break;
			else
				a[j/2] = a[j];
		}
		a[j/2] = root;
	}
}


public class heapSorting {

	public static void main(String[] args) {
		int[] a = {0, 69, 10, 30, 2, 16, 8, 31, 22};
		
		System.out.println("정렬할 원소");
		print(a);
		
		Sorting.heapSort(a);
		
		System.out.println("힙 정렬된 원소");
		print(a);
	}
	
	public static void print(int[] a) {
		for(int i = 1; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
