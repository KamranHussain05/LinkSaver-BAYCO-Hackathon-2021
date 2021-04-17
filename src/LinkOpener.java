import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LinkOpener {

	public static void openLink(String s) {
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {

			if (urlValid(s) == true) {
				try {
					Desktop.getDesktop().browse(new URI(s));
				} catch (IOException | URISyntaxException e) {
					System.out.println("error opening link");
					e.printStackTrace();
				}
			}
		}
	}

	public static Boolean urlValid(String url) {
		if (url == "")
			return false;

		try {
			new URL(url).toURI();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
