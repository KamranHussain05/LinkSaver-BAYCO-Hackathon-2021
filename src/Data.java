import java.util.ArrayList;

public class Data {
	
	private ArrayList<String> strings = new ArrayList<String>();

	public Data(int num)
	{
		for(int i = 0; i < num; i++)
		{
			strings.add("");
		}
	}
	
	public void replaceStrings(int num, String s)
	{
		strings.remove(num);
		strings.add(num,s);
	}
	
	public ArrayList<String> returnStrings()
	{
		return strings;
	}
	public void printStrings()
	{
		for(String s : strings)
		{
			System.out.println(s);
		}
	}
}
