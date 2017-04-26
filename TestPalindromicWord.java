import java.util.Scanner;

public class TestPalindromicWord {

		public static void main(String [] args){
			
			
			Scanner in = new Scanner(System.in);
			
			System.out.print("Enter a word: ");
			String str = in.next();
			
			for(int i=0;i<str.length()/2;i++){
				
				
				if(str.charAt(i)== str.charAt(str.length()-1)){
					
					System.out.println(str + " is a Palindrome");
					break;
					
				}
				else {
					
					System.out.println( str + " is not a Palindrome");
					break;
				}
			}
			
		}
}
