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
		
		//While there is a next line, read it and append it to the string.
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		//convert the string buffer to a string
		String htmlContent = sb.toString();
		return htmlContent;
	}
	public static String getTag(String openingTag, String closingTag, String html){
		int openTagIndex = html.indexOf(openingTag);
		int closeTagIndex = html.indexOf(closingTag);
		String tag = "";
			for (int i = openTagIndex; i < closeTagIndex; i++ ){
				tag += html.charAt(i);
			}
		System.out.println(tag);
		return tag;
	}

}
