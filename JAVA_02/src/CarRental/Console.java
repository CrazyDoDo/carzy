package CarRental;

import java.text.MessageFormat;
import java.util.Scanner;

public class Console {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			Scanner input=new Scanner(System.in);
			int random =(int)(Math.random()*(99999-10000));
			System.out.println("��ӭ�����������޹�˾");
			System.out.println("��ѡ��Ҫ���޵�����:");
			int days=input.nextInt();
			System.out.println("������Ҫ���޵���������(1.�γ�,2.�ͳ�)");
			switch (input.nextInt()) {
			case 1:
				 
				System.out.println("������Ҫ���޵�����Ʒ��(1.����,2.���)");
				 Car car=new Car();
				 int brand=input.nextInt();
				 car.setNo("��A"+random);
				
				 if (brand==1)
				 {
					
					 car.setBrand("����");
					 System.out.println("��ѡ��γ����ͺ�(1.X6,2.750i)");
					 if (input.nextInt()==1)
					 {
						 car.setType("X6")	;
					 }
					 else
					{
						 car.setType("750i")	;
					}
					
					
				}
				 else if (brand==2)
				 {
					

						 car.setBrand("���");
						 System.out.println("��ѡ��γ����ͺ�(1.�����GL8,2.���ȴ��)");
						 if (input.nextInt()==1)
							 {
								 car.setType("�����GL8");
							 }
						 else
							{
								 car.setType("���ȴ��");
							}
			     }
				 
				System.out.println("\n"+"��������ĳ��ƺ���:"+car.getNo());
				System.out.println("�˿�����!����Ҫ֧�������޷�����:"+car.calRent(days));
				break;
			case 2:
				System.out.println("������Ҫ���޵Ŀͳ�Ʒ��(1.��,2.����)");
				Bus bus=new Bus();
				 int brands=input.nextInt();
				 int seatCount=0;
				 bus.setNo("��A"+random);
				 if (brands==1)
				 {
					
					 bus.setBrand("��");
					 System.out.print("������ͳ�����λ��:");
					 seatCount=input.nextInt();
					 if (seatCount>16)
					 {
						 bus.setSeatCount(seatCount)	;
					 }
					 else
					{
						 bus.setSeatCount(seatCount)	;
					}
					
					
				}
				 else if (brands==2);;
				 {
					    bus.setNo(MessageFormat.format("��A{0}", random));
					 	bus.setBrand("����");
						 System.out.print("������ͳ�����λ��:");
						 seatCount=input.nextInt();
						 if (seatCount>16)
						 {
							 bus.setSeatCount(seatCount)	;
						 }
						 else
						{
							 bus.setSeatCount(seatCount)	;
						}
			     }
				 
				System.out.println("\n"+"��������ĳ��ƺ���:"+bus.getNo());
				
				System.out.println("�˿�����!����Ҫ֧�������޷�����:"+bus.calRent(days));
				break;
				default:
					System.out.println("��������ȷ��������");
				
				break;
			}
			
	}

}
