package polymorphism;
import java.util.*;
public class P_OffSeason extends P_OnSeason{
	
	static boolean quit;
	
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("OffSeason Discount : 15%");
		System.out.println("Enter the Total Price:");
		int price=sc.nextInt();
		int discount=(price*15)/100;
		System.out.println();
		System.out.println("Your Discount:"+discount);
		System.out.println("Pay:"+(price-discount));
		System.out.println();
	}
	public void optionSelect()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Select Options \n 1.OFFSEASON \n 2.ONSEASON \n 3.EXIT");
			int op=sc.nextInt();
			quit=false;
			switch (op) 
			{
				case 1:
					discount();
					break;
				case 2:
					super.discount();
					break;
				case 3:
					System.out.println("Thank You..!!Come Again!!");
					quit=true;
					System.exit(0);
					break;
				default:
					System.out.println("Enter a valid selection..!");
					break;
			}
		}while(!quit);
	}
	public static void main(String[] args) {
		
		P_OffSeason  ob=new P_OffSeason();
		ob.optionSelect();
		
	}
}