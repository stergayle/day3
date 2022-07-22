package training;

public class question7 {

	
	
	public static void main(String[] args) {
		
		animal myAnimal = new cat("Mittens", "Tortoiseshell");
		
		myAnimal.sound();

	}

}

class animal{
	
	public String name;
	public boolean isAnAnimal = true;
	
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
	public String pattern;
	public boolean isAnAnimal = super.isAnAnimal;
	
	public cat(String name, String pattern)
	{
		super(name);
		this.pattern = pattern;
	}
	
	public void sound(int loudness)
	{
		super.sound();
		
		
		if (loudness > 1)
		{
			System.out.println("MEOW");
		}
		else
		{
			System.out.println("meow");
		}
		
	}
}