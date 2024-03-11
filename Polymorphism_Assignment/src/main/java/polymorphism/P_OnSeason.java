package polymorphism;
import java.util.*;
public class P_OnSeason {
	
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("OnSeason Discount : 40%");
		System.out.println("Enter the Total Price:");
		int price=sc.nextInt();
		int discount=(price*40)/100;
		System.out.println();
		System.out.println("Your Discount:"+discount);
		System.out.println("Pay:"+(price-discount));
		System.out.println();
	}
}