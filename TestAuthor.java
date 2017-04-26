
public class TestAuthor {

	public static void main(String[] args) {
		
		
		
		Author ahTeck = new Author("Tan Ah Tecl", "ahteck@nowhere.com",'M');
		
		System.out.println(ahTeck);
		
		ahTeck.setEmail("PaulTan@nowhere.com");
		
		
		System.out.println("my name is: " + ahTeck.getName() );
		System.out.println("my email is: " + ahTeck.getEmail());
		System.out.println("my gender is: " + ahTeck.getGender());
		
	}

}
