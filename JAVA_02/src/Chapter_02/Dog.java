package Chapter_02;

/**
 * 宠物狗类
 * **/
public class Dog extends Pet {
	private String strain;
	/**
	 * 有参构造函数
	 * **/
	public Dog(String name,String strain)
	{
		super(name);
		this.strain=strain;
		
	}
	public String getStrain()
	{
		
		return strain;
	}
	public void print()
	{
		System.out.println("宠物的自白:\n我的名字叫"+getName()+",健康值为"+ getHealth()+"我主人的亲密度为"+getLove()+".我是一只:"+this.strain+".");

		System.out.println("我是一只:"+this.strain+".");
		
	}
}
