package anjali.anju;

public class Chocolates extends Cadbury implements Milk {
	public void mi()
	{
	System.out.println("Contains milk");
	}
	String candiname;
	int weight;
	Chocolates(String str , int weight)
	{
	candiname = str;
	this.weight = weight;
	}
	public String candiName()
	{
	return candiname;
	}

	public int wgt()
	{
	return weight;
	}
	public String toString()
	{
		return String.format(candiname + " with weight " + weight +" grams");
	}
}
