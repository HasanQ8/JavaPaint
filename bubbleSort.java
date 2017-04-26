
public class bubbleSort {

	
		public static void main(String [] args){
			
			
			int [] array = {9,2,4,1,5};
			
			
			bubbleSort bubble = new bubbleSort();
			
			bubble.printArray(array);
			bubble.bubbleSorting(array);
			System.out.println();
			bubble.printArray(array);
		}
		
		
		public static void bubbleSorting(int [] array){
			for(int i=0;i<array.length;i++){
				
				for(int j=0;j<array.length-1;j++){
					
					
					if(array[j] > array[j+1]){
						
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
			
		}
		 public void printArray(int[] x) {
		      for(int i=0; i<x.length; i++)
		        System.out.print(x[i] + " ");
		   }
}
