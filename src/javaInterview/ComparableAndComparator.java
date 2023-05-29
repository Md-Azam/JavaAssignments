package javaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class UrlSortner {
	String chars = "abcdef";	
	Random random = new Random();
	
	List<String> urls = new ArrayList<>();
	
	public String generateUrl( ) {
		String sUrl = "";
		int index = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<6;i++) {
		 index = random.nextInt(chars.length());
		sb.append(chars.charAt(index));
		}
		sUrl = sb.toString();
//		urls.add(sUrl);
//		System.out.println("generated");
		return sUrl;
		
	}
	
	public void fillurls() {
		for(int i=0;i<100;i++) {
			urls.add(generateUrl());
		}
	}
}

public class ComparableAndComparator  {

	public static void main(String[] args) {
		String url = "https://www.youtube.com/watch?v=2Gik4bFYJbM&list=PLsyeobzWxl7odnI5wl4LvRl6C0bn1Jg7B&index=7&ab_channel=Telusko";
		String sortUrl = "";
		
		UrlSortner service = new UrlSortner();
		service.fillurls();
		do {
			sortUrl = service.generateUrl();
		}while (service.urls.contains(sortUrl));
		//sortUrl = service.generateUrl(url);
		
		System.out.println("telus.ko/" + sortUrl);
	}
	
	
}
