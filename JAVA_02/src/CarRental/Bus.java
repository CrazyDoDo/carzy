package CarRental;

public class Bus extends MotoVehicle {
	private int seatCount;
	
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public int calRent(int day)
	{
		int money=0;
		if (getBrand()=="½ð±­")
		{
			if (getSeatCount()>16)
			{
				money=day*500;
			}
			else if (getSeatCount()<16)
			{
				money=day*800;
			}
		}
		else if (getBrand()=="½­»´") 
		{
			if (getSeatCount()>16)
			{
				money=day*600;
			}
			else if (getSeatCount()<16)
			{
				money=day*300;
			}
		}
		return money;
	}
}
