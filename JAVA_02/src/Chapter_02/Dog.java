package Chapter_02;

/**
 * ���ﹷ��
 * **/
public class Dog extends Pet {
	private String strain;
	/**
	 * �вι��캯��
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
		System.out.println("������԰�:\n�ҵ����ֽ�"+getName()+",����ֵΪ"+ getHealth()+"�����˵����ܶ�Ϊ"+getLove()+".����һֻ:"+this.strain+".");

		System.out.println("����һֻ:"+this.strain+".");
		
	}
}
