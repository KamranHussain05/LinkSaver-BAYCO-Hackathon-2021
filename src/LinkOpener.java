import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LinkOpener {

	public static void openLink(String s)
	{
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) 
		{
			try {
				Desktop.getDesktop().browse(new URI(s));
			} catch (IOException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		openLink("https://fuhsd-org.zoom.us/j/95157752442?pwd=aWczQ3VXM0pPYXJIZHRtZDdMZ1A0UT09");
	}
}
