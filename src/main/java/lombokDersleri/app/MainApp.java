package lombokDersleri.app;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		System.out.println("Mesaj");
		Person p = new Person();
		p.setName("mehmet");
		System.out.println(p.getName());
		
	System.out.println(p.toString());
		System.out.println(p);
		
		PersonData
		 pd = new PersonData();
		
		Person np = Person.builder().name("TestName").build();
		
		System.out.println(np);
		
		
	}
	
}
