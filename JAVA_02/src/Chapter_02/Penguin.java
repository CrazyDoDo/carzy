package Chapter_02;

/**
 * ���ﹷ��
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
		System.out.println("������԰�:\n�ҵ����ֽ�"+getName()+",����ֵΪ"+getHealth()+"�����˵����ܶ�Ϊ"+getLove()+"�Ա���:"+this.sex+".");

		
	}
	
}
