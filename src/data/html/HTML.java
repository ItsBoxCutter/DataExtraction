package data.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class HTML {
	private static String line = "";
	public static String getHTML(String link) throws IOException {
		URL url = new URL(link);
		InputStream is = (InputStream) url.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		String htmlContent = sb.toString();
		return htmlContent;
	}
}
