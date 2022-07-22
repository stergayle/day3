package training;

public class question6 {

	public static void main(String[] args) {
		
		Home myHome = new Home();
		myHome.sentiment();

	}

}

interface Building {
	public void sentiment();
}

class Home implements Building{
	public void sentiment()
	{
		System.out.println("Home Sweet Home");
	}
}