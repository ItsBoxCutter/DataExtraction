package data.html;

import java.util.Scanner;

public class Link {
	public static String jobTitle;
	public static String cityName;
	public static String provinceName;
	public static Scanner input = new Scanner(System.in);

	public static String getProperties(int purpose) {
		switch (purpose) {
		case 1:
			System.out.println("Input a Job title");
			jobTitle = input.nextLine().replaceAll("\\s", "+");
			return jobTitle;
		case 2:
			System.out.println("Input the name of your city");
			cityName = input.nextLine().replaceAll("\\s", "+");
			return cityName;
		case 3:
			System.out.println("what province do you live in?(Abbreviation)");
			provinceName = input.nextLine().replaceAll("\\s", "+");
			return provinceName;
		default:
			return "Broke";
		}
	}

	public static String createLink(String jobTitle, String city, String province) {
		String link = "https://ca.indeed.com/jobs?q=" + jobTitle + "&l=" + city + "%2C+" + province;
		System.out.println(link);
		return link;
	}

}
