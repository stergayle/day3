package training;

public class question2 {

	
	
	public static void main(String[] args) {
		
		animal myAnimal = new cat("Mittens", "Tortoiseshell");
		
		myAnimal.eatsFood();

	}

}

class animal{
	
	public String name;
	
	public animal(String name)
	{
		this.name = name;
	}
	
	public void eatsFood()
	{
		System.out.println("yummyyummyyummy");
	}
	
	public void sound()
	{
		System.out.println("aosidgjosifjg");
	}
}

class cat extends animal{
	
	public String name;
	public String pattern;
	
	public cat(String name, String pattern)
	{
		super(name);
		this.pattern = pattern;
	}
	
	public void eatsFood()
	{
		System.out.println("im a cat i eat in silence");
	}
	
	public void sound(int loudness)
	{
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