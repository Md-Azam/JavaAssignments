package javaInterview;
import java.util.HashMap;
public class UrlSortnerAssignment {

	

	    private HashMap<String, String> urlMap;
	    private String baseUrl;
	    
	    public UrlSortnerAssignment(String baseUrl) {
	        this.urlMap = new HashMap<>();
	        this.baseUrl = baseUrl;
	    }
	    
	    public String shortenURL(String originalURL) {
	        String shortURL = generateShortURL();
	        urlMap.put(shortURL, originalURL);
	        return baseUrl + "/" + shortURL;
	    }
	    
	    public String getOriginalURL(String shortURL) {
	        String key = shortURL.substring(baseUrl.length() + 1);
	        return urlMap.get(key);
	    }
	    
	    private String generateShortURL() {
	        // Implement your own logic to generate a unique short URL
	        // For simplicity, this example generates a random 6-character string
	        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < 6; i++) {
	            int index = (int) (Math.random() * characters.length());
	            sb.append(characters.charAt(index));
	        }
	        return sb.toString();
	    }
	    public static void main(String[] args) {
	    	UrlSortnerAssignment urlShortener = new UrlSortnerAssignment("https://www.youtube.com/watch?v=aPnW0kcf4k0&list=PLEddxYDy_kFcINDSiZkGgfIbUuqc64-f4&index=2&ab_channel=FURQAANIMAM.");
	         
	         String originalURL = "https://www.youtube.com/watch?v=aPnW0kcf4k0&list=PLEddxYDy_kFcINDSiZkGgfIbUuqc64-f4&index=2&ab_channel=FURQAANIMAM.";
	         String shortURL = urlShortener.shortenURL(originalURL);
	         System.out.println("Short URL: " + shortURL);
	         
	         String retrievedURL = urlShortener.getOriginalURL(shortURL);
	         System.out.println("Original URL: " + retrievedURL);
		}
	}


