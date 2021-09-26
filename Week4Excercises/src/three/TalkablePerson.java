package three;

public class TalkablePerson {
	
	String name;
	int age;
	
	
	//If set to private, Error: Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	// The method talk() from the type TalkablePerson is not visible
	
	public void talk() {
		System.out.println("Hello my name is: " + this.name);
	}
	
}
