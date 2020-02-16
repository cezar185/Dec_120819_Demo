//derived class from Cars class
class BMW extends Cars{
	//BMW is a subclass
	public int seatNum;
	//BMW subclass has constructor
	public BMW(int gear, int speed, int startspeed)
	{
		//invoking base-class(CARS) constructor
		super(gear, speed);
	
		seatNum = startspeed;
	}	
	//Encapsulation getter and setter
		public void setNum(int newValue)
		{
			seatNum = newValue;
		}
		public String toString()
		{
			return (super.toString()+
					"\nNumber of Seat is "+seatNum);
		}
		
	}


