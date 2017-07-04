package data.html;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class HTML {
	
	public static String getHTML(String link) throws IOException {
		URL url = new URL(link);
		Reader reader = new InputStreamReader((InputStream) url.getContent());
		BufferedReader br = new BufferedReader(reader);
		StringBuffer sb = new StringBuffer();
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		String htmlContent = sb.toString();
		return htmlContent;
	}

}
