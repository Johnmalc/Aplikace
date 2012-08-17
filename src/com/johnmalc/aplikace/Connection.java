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
 * @version 1.2
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
		
		
		
	}}
//		double [] vars = new double[350]; 
//		for(int i = 0; i < vars.length; i++) {
//			 // System.out.println("Zadejte vase cisla pro vyhledavani ");
//			  vars[i] = str.nextDouble();
//			  break;
//		
//		Scanner in = new Scanner(System.in);
//		int[] vars = new int[1000];
//
//		System.out.println("Zadejte maximalne "+vars.length+" znaku: ");
//		for(int i = 0; i < vars.length; i++)
//		  vars[i] = in.nextInt();
//	}
//	}
		
		
//		while(true) {
//			test = str.nextDouble();
//			double length = str.length();
//			if(test >= 8) {
//				System.out.println("Takove cislo muze existovat");
//				}
//			else 	
//				System.out.println("Takove cislo nemuze existovat");
//		
//				}
//		}
//	}
			
		//	int srt;
			// int length = str.length();
		
		
//		// int length = str.length(); // length() method of String returns the length of a String.											
//			if (length <= 8){  // compares the length of the string to the number 8 and smaller (==, not =)
//				System.out.println("Takove cislo muze existovat"); // System.out.println("Length of a String is : " + length);
//				}
//			else 
//				System.out.println("Takove cislo nemuze existovat");
//			}	
//	}
//	}	
//			

//	HttpResponse response = new BasicHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK, "OK");
//	System.out.println(response.getStatusLine().getStatusCode());
	
//	}

	
	
	


