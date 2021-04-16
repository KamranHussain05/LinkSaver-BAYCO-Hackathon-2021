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
				System.out.println("error opening link");
				e.printStackTrace();
			}
		}
	}
}
