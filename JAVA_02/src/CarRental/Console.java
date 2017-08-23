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
			System.out.println("欢迎来到汽车租赁公司");
			System.out.println("请选择要租赁的天数:");
			int days=input.nextInt();
			System.out.println("请输入要租赁的汽车类型(1.轿车,2.客车)");
			switch (input.nextInt()) {
			case 1:
				 
				System.out.println("请输入要租赁的汽车品牌(1.宝马,2.别克)");
				 Car car=new Car();
				 int brand=input.nextInt();
				 car.setNo("京A"+random);
				
				 if (brand==1)
				 {
					
					 car.setBrand("宝马");
					 System.out.println("请选择轿车的型号(1.X6,2.750i)");
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
					

						 car.setBrand("别克");
						 System.out.println("请选择轿车的型号(1.商务舱GL8,2.林萌大道)");
						 if (input.nextInt()==1)
							 {
								 car.setType("商务舱GL8");
							 }
						 else
							{
								 car.setType("林萌大道");
							}
			     }
				 
				System.out.println("\n"+"分配给您的车牌号是:"+car.getNo());
				System.out.println("顾客您好!您需要支付的租赁费用是:"+car.calRent(days));
				break;
			case 2:
				System.out.println("请输入要租赁的客车品牌(1.金杯,2.江淮)");
				Bus bus=new Bus();
				 int brands=input.nextInt();
				 int seatCount=0;
				 bus.setNo("京A"+random);
				 if (brands==1)
				 {
					
					 bus.setBrand("金杯");
					 System.out.print("请输入客车的座位数:");
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
					    bus.setNo(MessageFormat.format("京A{0}", random));
					 	bus.setBrand("江淮");
						 System.out.print("请输入客车的座位数:");
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
				 
				System.out.println("\n"+"分配给您的车牌号是:"+bus.getNo());
				
				System.out.println("顾客您好!您需要支付的租赁费用是:"+bus.calRent(days));
				break;
				default:
					System.out.println("请输入正确汽车类型");
				
				break;
			}
			
	}

}
