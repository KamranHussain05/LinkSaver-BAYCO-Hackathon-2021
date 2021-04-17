import java.util.ArrayList;

public class Data {
	
	private static ArrayList<String> strings = new ArrayList<String>();

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
	
	public String getFullString(int n) {
		return strings.get(n);
	
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static String getCourseName(int n)
	{
		String s = strings.get(n);	
		if(s.indexOf(';') != -1) {
			return s.substring(0, s.indexOf(';'));
		} 
		else {
			return "";
		}
		
	}
	public String getCourseLink(int n)
	{
		String s = strings.get(n);
		if(s.indexOf(';') != -1 && s.lastIndexOf(';') != -1)
		{
			return s.substring(s.indexOf(';')+1, s.lastIndexOf(';'));
		} 
		else {
			return "";
		}
	}
	public String getMeetingLink(int n)
	{
		String s = strings.get(n);
		if(s.lastIndexOf(';') != -1) {
			return s.substring(s.lastIndexOf(';')+1);
		} 
		else {
			return "";
		}
	}
	
	
	
	public void printStrings()
	{
		for(String s : strings)
		{
			System.out.println(s);
		}
	}
}
