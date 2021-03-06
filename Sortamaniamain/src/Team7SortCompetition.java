//Team 7
//Jason Wu & Xing Chen
//Period 2
public class Team7SortCompetition extends SortCompetition {

	
	public int compareTo(SortCompetition t)
	{
		return (int)(this.totalTime - t.totalTime); 
	}
	
	public void setNumber(int n)
	{
		number = n;
	}
	public int getNum()
	{
		return number;
	}
	
	public void addTime(double avg)
	{
		totalTime += avg;
	}
	
	public int challengeOne(int[] arr) {
		selectionSort(arr);
		return ((double)arr[arr.length/2] + (double)arr[(arr.length/2+1) + 1])/2;
	}
	
	public int challengeTwo(String[] arr, String query) {
		selectionSort2(arr);
		for(int i= 0 ; i < arr.length; i++ ) {
			if (arr[i].equals(query))
				return i; 
		}
		return -1;
		
		
		}
		
	
	public int challengeThree(int[] arr) {
		insertionSort(arr);
		return ((double)arr[arr.length/2] + (double)arr[(arr.length/2+1)])/2;
	}
	
	
	public int challengeFour(int[][] arr) {
		for (int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[i].length;j++) {
				insertionSort(arr[i]);
			}
		}
		for (int i = 0; i < arr.length-1;i++) {
			if (arr[i][((double)arr[arr.length/2] + (double)arr[(arr.length/2+1)])/2] > arr[i+1][((double)arr[arr.length/2] + (double)arr[(arr.length/2+1)])/2])
				Swap(arr,i,i+1);
		}
		
		return arr[((arr.length/2)+(arr.length/2+1))/2][((double)arr[((arr.length/2)+(arr.length/2+1))/2][arr.length/2] + (double)arr[((arr.length/2)+(arr.length/2+1))/2][(arr.length/2+1)])/2];
		
	}
	
	public int challengeFive(Comparable[] arr, Comparable query) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(query)) 
			return i ;
		}
		return -1;
	}
	
	public static void Swap(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
	public static void Swap(String[] arr,int index1, int index2) {
		String x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}

	
	//Add a custom greeting so your sorter can introduce itself
	public String greeting() {
		return "Hello?";
	}
	public static void selectionSort(int[] list1) {
		for (int j = 0; j < list1.length;j++) {
			int select = j;
			for (int i = j; i < list1.length; i++) {
				int x = list1[select];
				if (x > list1[i]) {
					x = list1[i];
					select = i;
				}
			}
			Swap(list1, select , j);
		}
		
	}
	public static void selectionSort2(String[] list1) {
		for (int j = 0; j < list1.length;j++) {
			int select = j;
			for (int i = j; i < list1.length; i++) {
				String x = list1[select];
				if (x.compareTo(list1[i]) > 0) {
					x = list1[i];
					select = i;
				}
			}
			Swap(list1, select , j);
		}
		
		
	}
	public static void insertionSort(int[] list1) {
		int pos = 0;
		if (list1[0] > list1[1]) {
			Swap(list1, 0, 1);
		}
			for (int i = 1; i < list1.length; i++) {
				for (int x = i; x >= 0; x--) {
					if (list1[i] > list1[x]) {
						break;
					}
					pos = x;
				}
				for (int x = i; x > pos;x--) {
					Swap(list1,x,x-1);
				}
			
		}
	}
}
	 

