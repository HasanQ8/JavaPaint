import java.util.Arrays;
import java.util.LinkedList;


public class JavaLessonTwelve {

	public static void main(String[] args) {
		

		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("John Benedict");
		names.add("Ali Syed");
		
		names.addLast("Nathan Red");
		names.addFirst("Noah Peters");
		
		names.set(2, "Paul Newman");
		
		
		
		for(String name : names){
			
			System.out.println(name);
		}
		
		LinkedList<String> namesCopy = new LinkedList<String>(names);
		
		System.out.println(namesCopy);
		
		if(names.contains("Nathan Red")){
			
			System.out.println("They are the same");
		}
	}

}
