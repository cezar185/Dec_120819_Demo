//base class = parent class = super class
//child class = subclass
class Cars {
	//Cars class has 2 fields/characters 
	public int gear;
	public int speed;
	//constructor
	public Cars(int gear, int speed)
	{
		this.gear = gear;
		this.speed = speed;
	}
	//3 methods
	public void pushBreak(int decrement)
	{
		speed -=decrement;
	}
	public void increaseSpeed(int increment)
	{
		speed +=increment;
	}
//toString(): is function that allows to return object exist within a method
	public String toString()
	{
		return("no of gears are "+gear
				//"\n" line break
                +"\n"
				+"speed of the Car is "+speed);
	}

}
