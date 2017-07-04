package data.main;

import java.io.IOException;

import data.html.HTML;
import data.html.Link;

public class Main {
	
	public static void main(String[] args) throws IOException{
		for(int i = 1; i < 4; i++ ){
			Link.getProperties(i);
		}
		
		System.out.println(HTML.getHTML("https://stackoverflow.com/questions/218384/what-is-a-nullpointerexception-and-how-do-i-fix-it"));
	}
	
}
