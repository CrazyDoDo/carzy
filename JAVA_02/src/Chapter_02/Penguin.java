package Chapter_02;

/**
 * 宠物狗类
 * **/
public class Penguin extends Pet {
		private String sex;

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}
	public Penguin(String name,String sex)
	{
		super(name);
		this.sex=sex;
		
	}
	public void print()
	{
		System.out.println("宠物的自白:\n我的名字叫"+getName()+",健康值为"+getHealth()+"我主人的亲密度为"+getLove()+"性别是:"+this.sex+".");

		
	}
	
}
