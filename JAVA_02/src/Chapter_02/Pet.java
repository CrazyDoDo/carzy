package Chapter_02;

public abstract class Pet {

	private String name="无名氏";
	
	private int health=100;
	private int love=0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;	
		
	}
	public void setLove(int love) {
		this.love = love;
	}
	/**
	 * 无参构造方法
	 * **/
	public Pet()
	{
		
		this.health=95;
		System.out.println("执行宠物的无参构造方法");
	}
	/**
	 * 有参构造方法
	 * **/
	public Pet(String name)
	{
		this.name=name;
		
	}
	/**
	 * 输出宠物信息
	 * **/
	public abstract void print();
}
