package Chapter_02;

public abstract class Pet {

	private String name="������";
	
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
	 * �޲ι��췽��
	 * **/
	public Pet()
	{
		
		this.health=95;
		System.out.println("ִ�г�����޲ι��췽��");
	}
	/**
	 * �вι��췽��
	 * **/
	public Pet(String name)
	{
		this.name=name;
		
	}
	/**
	 * ���������Ϣ
	 * **/
	public abstract void print();
}
