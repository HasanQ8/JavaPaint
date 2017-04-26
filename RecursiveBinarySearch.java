
public class RecursiveBinarySearch {

	
	
		public static void main(String [] args){
			
			
			int [] array = {1,2,3,4,5,6,7,8,9,10};
			
			
			boolean result = binarySearch(array,1,0,array.length-1);
			System.out.println(result);
			
			
		}
		
		
		public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx){
			
			
		
			
			int middleIndex = (fromIdx + toIdx)/2;
			
			
			if(toIdx < fromIdx){
				return false;
			}
			if(key == array[middleIndex]){
				
				return true;
			}
			
			
			if(key < array[middleIndex]){
				
				return binarySearch(array,key,fromIdx,middleIndex-1);
			}
			if(key > array[middleIndex]){
				
				return binarySearch(array,key,middleIndex+1,toIdx);
			}
			
			return false;
			
			
		}
}
