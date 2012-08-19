package com.johnmalc.aplikace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;



/**
 * @author  John Malc
 * @version 1.3
 *
 */

	//public static void main(String[] args) {
		/**
		 * http://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
		 * 
		 * Create a URL. 
		 * Retrieve the URLConnection object. 
		 * Set output capability on the URLConnection. 
		 * Open a connection to the resource.
		 * Get an output stream from the connection. 
		 * Write to the output stream.
		 * Close the output stream.
		 * 
		 * 
		 */
		
//		HttpClient httpclient = new DefaultHttpClient();
//	    HttpPost httppost = new HttpPost("http://www.comrad.cz/vyhledavani?text=");
//	   
//	    URLConnection uconn = uri.openConnection();
//	    HttpURLConnection conn = (HttpURLConnection)uconn;
////	    
//	    System.out.println("Zadejte vase cisla pro vyhledavani");	
//		int numbers = new Scanner(System.in).nextInt();
//	}}
//		
		// Variables to hold the URL object and its connection to that URL.
		// http://www.dreamincode.net/forums/blog/114/entry-2715-login-to-a-website-from-java/
public class Connection {		
	    private static URL URLObj;
	    private static URLConnection connect;
		
	    @SuppressWarnings({ "resource", "unused" })
		public static void main(String[] args) {
	        try {
	            // Establish a URL and open a connection to it. Set it to output mode.
	        	// int a = new Scanner(System.in).nextInt();
		   		int a = new Scanner(System.in).nextInt();

	            URLObj = new URL("http://www.conrad.cz/vyhledavani?text=" + a);
	            connect = URLObj.openConnection();
	            connect.setDoOutput(true);	
	            connect.setDoInput(true);
	        }
	        catch (MalformedURLException ex) {
	            System.out.println("The URL specified was unable to be parsed or uses an invalid protocol. Please try again.");
	            System.exit(1); 
	        }
	        catch (Exception ex) {
	            System.out.println("An exception occurred. " + ex.getMessage());
	            System.exit(1);
	        }
			
	        try {
	            // Create a buffered writer to the URLConnection's output stream and write our forms parameters.
	            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream()));
	          /* int a = new Scanner(System.in).nextInt();
	            		writer.write(a);
	    	            writer.close();*/
	    				
	    	            // Now establish a buffered reader to read the URLConnection's input stream.
	    	            BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
	    				
	    	                 
	    	            
	    	            String lineRead = "";
	    			
	    	            // Read all available lines of data from the URL and print them to screen.
	    	           // while ((lineRead = reader.readLine()) != null) {
	    	             //   System.out.println(lineRead);
	    	            // }
	    	            
	    	            reader.close();
	            }
	    	        catch (Exception ex) {
	    	        	// If not found then this, 404
	    	            System.out.println("Nothing to be found: " + ex.getMessage());
	            	}
	    }
}

	            
	        	            		
	            		
//	            writer.write("vyhledavani?text=" + a);
//	            writer.close();
//				
//	            // Now establish a buffered reader to read the URLConnection's input stream.
//	            BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
//				
//	            String lineRead = "";
//				
//	            // Read all available lines of data from the URL and print them to screen.
//	            while ((lineRead = reader.readLine()) != null) {
//	                System.out.println(lineRead);
//	            }
//				
//	            reader.close();
//	        }
//	        catch (Exception ex) {
//	        	// If not found then this, 404
//	            System.out.println("Nothing to be found: " + ex.getMessage());
//	        }
//	    }
//		   
//}		   
		   
//		if(numbers == exist) {
//			System.out.print(numbers + "Existuje");
//			else {
//				System.out.print(numbers + "neexistuje");
//			}

//        // Execute HTTP Post Request
//        HttpResponse response = httpclient.execute(httppost);
//        try {
//            // Add your data
//            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
//            nameValuePairs.add(new BasicNameValuePair("id", "12345"));
//            nameValuePairs.add(new BasicNameValuePair("stringdata", "AndDev is Cool!"));
//            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//
//    } catch (IOException e) {
//        // TODO Auto-generated catch block

//		HttpURLConnection connection = null;
//	    try {
//	        URL url = new URL("http://www.conrad.cz");
//	        connection = (HttpURLConnection) url.openConnection();
//	        connection.connect();
//	        connection.getInputStream();  		        
//	        System.out.println("Connected to conrad.cz");   
////	       
//	        System.out.println("Zadejte vase cisla pro vyhledavani");	
//			String str = new Scanner(System.in).next();
//
//	        
//	       // do something with the input stream here
//	       // InputStream error = ((HttpURLConnection) connection).getErrorStream();
//	      
//	       // # means special ID to understand where & what is wrong
//	    	} catch (MalformedURLException e1) {
//	    		e1.printStackTrace();
//	    		System.err.println("Something's wrong #1");
//	    	} catch (IOException e1) {
//	    		e1.printStackTrace();
//	    		System.err.println("Something's wrong #2");
//	    	} finally {
//	    		if(null != connection) { connection.disconnect(); }
//	    	}									
//	   
//	    URIBuilder builder = new URIBuilder();
//			builder.setScheme("http").setHost("www.conrad.cz").setPath("/vyhledavani")
//		      	   .setParameter("text", "");
//		URI uri = builder.build();
//		HttpGet httpget = new HttpGet(uri);
//		
//		// http://www.conrad.cz/vyhledavani?text=dsfsmf%2C
//	    // HttpGet httpget = new HttpGet("http://www.google.com/search?hl=en&q=httpclient&btnG=Google+Search&aq=f&oq=");
//	
//		
//		
//		
//	}}
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
//			if(test <= 8) {
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

	
	
	


