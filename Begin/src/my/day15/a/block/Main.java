package my.day15.a.block;

public class Main {
	public static void main(String[] args) {
		
		Child child1 = new Child();
		System.out.println("child1.id => " + child1.id);
		System.out.println("child1.name => " + child1.name);
		System.out.println("Child.count => " + Child.count);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Child child2 = new Child();
		System.out.println("child2.id => " + child2.id);
		System.out.println("child2.name => " + child2.name);
		System.out.println("Child.count => " + Child.count);
		
		
		
	}// end of main(String[] args)
	

}
