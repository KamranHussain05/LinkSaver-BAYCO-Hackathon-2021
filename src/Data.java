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
	
	public String getFullString(int n) {
		return strings.get(n);
	
	}
	
	/*
	courseName = inputCourseName.getText();
    courseLink = inputCourseLink.getText();
    meetingLink = inputMeetingLink.getText();
    */
	public String getCourseName(int n)
	{
		String s = strings.get(n);
		return s.substring(0, s.indexOf(';'));
		
	}
	public String getCourseLink(int n)
	{
		String s = strings.get(n);
		return s.substring(s.indexOf(';')+1, s.lastIndexOf(';'));

		
	}
	public String getMeetingLink(int n)
	{
		String s = strings.get(n);
		return s.substring(s.lastIndexOf(';')+1);
	}
	
	
	
	public void printStrings()
	{
		for(String s : strings)
		{
			System.out.println(s);
		}
	}
}
