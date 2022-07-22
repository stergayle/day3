package training;

public class question8 {

	public static void main(String[] args) {
		
		final lawsOfUniverse myLaws = new lawsOfUniverse();
		
		myLaws.whatIsGravity();

	}

}

final class lawsOfUniverse{
	final double gravity = 9.8;
	
	final void whatIsGravity()
	{
		System.out.println(this.gravity);
	}
}