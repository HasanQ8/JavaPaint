
public class LessonThree {

	
		public static void main(String [] args){
			
			
			
			int value1 =10;
			int value2 =2;
			
			
			int biggest=(value1 > value2)? value1:value2;
			
			
			System.out.println(biggest);
			
			
			char grade = 'A';
			
			switch(grade){
			
			
			case 'A':
				System.out.println("first class");
				break;
				
			case 'B':
				System.out.println("second class");
				break;
			
			case 'C':
				System.out.println("Pass");
				break;
			
			case 'D':
				System.out.println("Fail");
				break;
			
			default:
				System.out.println("Not Registered");
				break;
			}
		}
	}
