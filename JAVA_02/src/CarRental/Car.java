package CarRental;

public class Car extends MotoVehicle {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int calRent(int day)
	{
		int money=0;
		if (getBrand()=="宝马")
		{
			if (getType()=="X6")
			{
				money=day*500;
			}
			else if (getType()=="750i")
			{
				money=day*800;
			}
		}
		else if (getBrand()=="别克") 
		{
			if (getType()=="商务舱GL8")
			{
				money=day*600;
			}
			else if (getType()=="林萌大道")
			{
				money=day*300;
			}
		}
		return money;
	}
}
