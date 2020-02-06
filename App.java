package anjali.anju;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class App 
{
	static int q1;
	static int q2,q3;
	public static void main(String[] args)
	{ @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of chocolates to add to the gift box : ");
	int n=sc.nextInt();
	int count =n;
	System.out.println("Enter the dairymilk quantity not more than "+n +":");
	q1=sc.nextInt();
	count =q1;
	if(q1>n)
	{
	count =q1;
	try
	{ System.out.println("cant enter more than"+n);

	  throw new NumberFormatException();
	}
	finally
	{
	 
	System.out.println("cant enter more than"+n);
	}
	}
	  if(count<n)
	{
	System.out.println("Enter the silk quantity not more than "+(n-q1)+":");
	 q2=sc.nextInt();
	 if(q2>(n-count))
	 {
	   try
	    { System.out.println("cant enter more than"+(n-q1));

	       throw new NumberFormatException();
	    }
	   finally
	   {

	System.out.println("cant enter more than"+(n-q1));
	   }
	}
	 }
	if((q1+q2)<n)
	{
	System.out.println("Enter the fivestar quantity : ");
	q3=sc.nextInt();
	if((q1+q2+q3)>n) {
	try
	    { 
	    System.out.println("cant enter more than"+(n-(q1+q2)));

	       throw new NumberFormatException();
	    }
	   finally
	   {

	System.out.println("cant enter more than"+(n-(q1+q2)));
	   }
	}
	}
	Chocolates dairymilk=new  Chocolates("dairymilk",50);
	Chocolates silk=new  Chocolates("silk",70);
	Chocolates fivestar=new  Chocolates("fivestart",30);
	Sweets jamun=new Sweets();
	Sweets kajukatli=new Sweets();
	Sweets rasgulla=new Sweets();
	// TODO Auto-generated method stub
	List<Chocolates> giftbox = new ArrayList();
	giftbox.add(dairymilk);
	giftbox.add(silk);
	giftbox.add(fivestar);
	System.out.print("Total weight of the giftbox : ");//Calculates the total weight of the gift box
	System.out.println(q1*(dairymilk.weight)+q2*(silk.weight)+q3*(fivestar.weight)+"grams");
	Comparator<Chocolates> titleComparator = (c1, c2) -> c1.candiName().compareTo(c2.candiName());
	giftbox.sort(titleComparator);//It sorts the list based on their alphabetical order
	System.out.println("sorted list in ascending order of candie: " + giftbox);
	giftbox.sort(Collections.reverseOrder(titleComparator));
	System.out.println("sorted list in descending order of candie: " + giftbox);
	System.out.println(giftbox.contains(silk)); // to check the candie whether it contains in the lit or not
	System.out.println("The working of sweet object are shown here:");
	rasgulla.mi();
	jamun.almond();
	kajukatli.mi();
	rasgulla.nuts();
	System.out.println("The ingredients of chocolates are:");
	dairymilk.mi();
	dairymilk.nuts();
	fivestar.almond();
	}
	}