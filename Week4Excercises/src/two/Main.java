package two;

public class Main {
	public static void main(String[] args) {
		
		PrivatePerson person = new PrivatePerson();
		
		person.setAge(3);
		person.setName("Carl");
		
		System.out.println(person.getAge());
		System.out.println(person.getName());
	}
}
