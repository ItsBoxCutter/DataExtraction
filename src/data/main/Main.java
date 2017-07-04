package data.main;

import java.io.IOException;

import data.html.HTML;
import data.html.Link;

public class Main {
	@SuppressWarnings("unused")
	private static String jobTitle, cityName, provinceName, page;

	public static void main(String[] args) throws IOException {
		jobTitle = Link.getProperties(1);
		cityName = Link.getProperties(2);
		provinceName = Link.getProperties(3);
		
		
		String page = HTML.getHTML(Link.createLink(jobTitle, cityName, provinceName));
		HTML.getTag("<a", ">", page);
	}

}
