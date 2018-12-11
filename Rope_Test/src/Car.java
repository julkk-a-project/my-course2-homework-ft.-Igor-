
public class Car {

	public double speed = 0;
	public double mass = 10;
	public double accelerator = 2;
	public double damage = 1;
	public double location = 0;
	public String name = "";
	public double maxSpeed = 100;
	
	public Car(double speed, double mass, double accelerator, double location, String name, double maxSpeed) {
		this.speed = speed;
		this.mass = mass;
		this.accelerator = accelerator;
		this.location = location;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	public double getLocation() {
		return this.location;
	}
	public void fixLocation(double x) {
		this.location -= x;
	}
	
	
	
	
	
	
	public double energyLoss(double distance, Car Car){
		
		double ultDist = (distance - 50) / distance;
		double energyTransfer = 0.5*ultDist*speed*speed;
		double speedChange = energyTransfer / this.mass;
		System.out.println(this.name +" "+ speedChange);
		return speedChange;
	}
	
	
	
	
	
	public void runMe(Car Car){
		double distance = Math.abs(this.location - Car.location);
		double rope = this.location - Car .location;
		if (distance >= 50) {
			if (rope >= 0) {
				this.speed -= energyLoss(distance, Car);
			}
			else {
				this.speed += energyLoss(distance, Car);
			}
		}
		this.speed += engine(speed);
	}
	
	public double engine(double speed) {
		double finalAcc = this.accelerator;
		if (speed > this.maxSpeed) {
			finalAcc = -1;
		}
		return finalAcc;
	}
	
	
	public double calculateLocation() {
		this.location += this.speed;
		return this.location;
	}

}
