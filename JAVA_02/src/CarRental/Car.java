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
		if (getBrand()=="����")
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
		else if (getBrand()=="���") 
		{
			if (getType()=="�����GL8")
			{
				money=day*600;
			}
			else if (getType()=="���ȴ��")
			{
				money=day*300;
			}
		}
		return money;
	}
}
