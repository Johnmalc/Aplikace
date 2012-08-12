package com.johnmalc.aplikace;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;



/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class Connection {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws URISyntaxException {
				
		HttpURLConnection connection = null;
	    try {
	        URL url = new URL("http://www.conrad.cz");
	        connection = (HttpURLConnection) url.openConnection();
	        connection.connect();
	        connection.getInputStream();  		        
	        System.out.println("Connected to conrad.cz");   
	       
	       // do something with the input stream here
	       // InputStream error = ((HttpURLConnection) connection).getErrorStream();
	      
	       // # means special ID to understand where & what is wrong
	    	} catch (MalformedURLException e1) {
	    		e1.printStackTrace();
	    		System.err.println("Something's wrong #1");
	    	} catch (IOException e1) {
	    		e1.printStackTrace();
	    		System.err.println("Something's wrong #2");
	    	} finally {
	    		if(null != connection) { connection.disconnect(); }
	    	}									
	   
	    URIBuilder builder = new URIBuilder();
			builder.setScheme("http").setHost("www.conrad.cz").setPath("/vyhledavani")
		      	   .setParameter("text", "");
		URI uri = builder.build();
		HttpGet httpget = new HttpGet(uri);
		
		// http://www.conrad.cz/vyhledavani?text=dsfsmf%2C
	    // HttpGet httpget = new HttpGet("http://www.google.com/search?hl=en&q=httpclient&btnG=Google+Search&aq=f&oq=");
	
		System.out.println("Zadejte vase cisla pro vyhledavani");	
		String str = new Scanner(System.in).next();
		int length = str.length(); // length() method of String returns the length of a String.											
			if (length == 6){  //compares the length of the string to the number 6 and use == instead of =
				System.out.println("Takove cislo muze existovat"); // System.out.println("Length of a String is : " + length);
				}
			else 
				System.out.println("Takove cislo nemuze existovat");
			}	
	}	
			
//	
//	
//	
//	
//	
//	HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");
//	System.out.println(response.getStatusLine().getStatusCode());
//	
//	}
//	
	
	
	


