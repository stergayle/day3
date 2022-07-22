package training;

public class question1 {

	
	
	public static void main(String[] args) {
		
		animal myAnimal = new cat("Mittens");
		
		myAnimal.sound();

	}

}

class animal{
	
	public String name;
	
	public animal(String name)
	{
		this.name = name;
	}
	
	public void sound()
	{
		System.out.println("aosidgjosifjg");
	}
}

class cat extends animal{
	
	public String name;
	
	public cat(String name)
	{
		super(name);
	}
	
	public void sound()
	{
		System.out.println("meow");
	}
}