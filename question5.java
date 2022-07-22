package training;

public class question5 {

	public static void main(String[] args) {
			Car myCar = new Car();
			
			myCar.setMass(5);
			myCar.setAcceleration(23);
			myCar.calcForce();
			

	}

}


abstract class Machine{
	int mass;
	int acceleration;
	
	abstract void calcForce();
	
}

class Car extends Machine{
	void setMass(int mass) {
		this.mass = mass;
	}
	void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}
	
	void calcForce()
	{
		System.out.println(this.mass * this.acceleration);
	}
}