
public class printingStuff {

	
	public static void main(String[] args) {
	
		int size=8;
		for(int row=0; row <size;row++){
			System.out.println();
			for(int col=row+1;col>0;col--){
				
				System.out.print(col + " ");
			}
		}
		System.out.println();
		
		
	   }
}
