abstract class Parent{
	abstract void message();
}

class subclass extends Parent{
	public void message() {
		System.out.println("This is first subclass");
	}
}
class subclass2 extends Parent{
	public void message() {
		System.out.println("This is second subclass");
	} 
}

