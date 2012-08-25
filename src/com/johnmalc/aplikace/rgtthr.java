package com.johnmalc.aplikace;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @author  John Malc
 * @version 
 *
 */


//public class rgtthr {
//	
//	
////	public void homePage() throws Exception {
////	    final WebClient webClient = new WebClient();
//	    final HtmlPage page = webClient.getPage("http://htmlunit.sourceforge.net");
//	    assertEquals("HtmlUnit - Welcome to HtmlUnit", page.getTitleText());
//
//	    final String pageAsXml = page.asXml();
//	    assertTrue(pageAsXml.contains("<body class=\"composite\">"));
//
//	    final String pageAsText = page.asText();
//	    assertTrue(pageAsText.contains("Support for the HTTP and HTTPS protocols"));
//
//	    webClient.closeAllWindows();
//	}





















// public class rgtthr{
//
////   public static void main(String args[]){
//////
////        Scanner alex = new Scanner(System.in);
////        Double test;
////        while(true) {
////            test = alex.nextDouble();
////            if (test == 9){
////                System.out.println("eat");
////            }else{
////                System.out.println("do not eat");
////            }
////        }
//    
////
	   public class rgtthr {

   		   int a = new Scanner(System.in).nextInt();

		   // http://stackoverflow.com/questions/4596447/java-check-if-file-exists-on-remote-server-using-its-url
		   // http://stackoverflow.com/questions/4177864/checking-a-url-exist-or-not
	   	public static void main(String[] args) {
	   		Scanner a = new Scanner(System.in);
	   		System.out.println(rgtthr.checkIfURLExists("http://www.xxx.cz/vyhledavani?text=" + a));  	
	   	
	   	
	    try {
            // Create a buffered writer to the URLConnection's output stream and write our forms parameters.
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connect.getOutputStream()));
          /* int a = new Scanner(System.in).nextInt();
            		writer.write(a);
    	            writer.close();*/
    				
    	            // Now establish a buffered reader to read the URLConnection's input stream.
    	            BufferedReader reader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
    	            
	   	public static boolean checkIfURLExists(String targetUrl) {
	   		HttpURLConnection httpUrlConn;
	   		try {
	   			httpUrlConn = (HttpURLConnection) new URL(targetUrl)
	   					.openConnection();

	   			// A HEAD request is just like a GET request, except that it asks
	   			// the server to return the response headers only, and not the
	   			// actual resource (i.e. no message body).
	   			// This is useful to check characteristics of a resource without
	   			// actually downloading it,thus saving bandwidth. Use HEAD when
	   			// you don't actually need a file's contents.
	   			httpUrlConn.setRequestMethod("HEAD");

	   			// Set timeouts in milliseconds
	   			httpUrlConn.setConnectTimeout(30000);
	   			httpUrlConn.setReadTimeout(30000);

	   			// Print HTTP status code/message for your information.
	   			System.out.println("Response Code: "
	   					+ httpUrlConn.getResponseCode());
	   			System.out.println("Response Message: "
	   					+ httpUrlConn.getResponseMessage());

	   			return (httpUrlConn.getResponseCode() == HttpURLConnection.HTTP_OK);
	   		} catch (Exception e) {
	   			System.out.println("Error: " + e.getMessage());
	   			return false;
	   		}
	   	}}

	   

//    public class rgtthr {
//
//        public static void main(String[] args) throws IOException {
//            BufferedReader in = new BufferedReader(
//                new InputStreamReader(System.in));
//            String s;
//
//            while ((s = in.readLine()) != null) {
//                System.out.println(s);
//            }
//        }
////    }
//
//public class rgtthr{
//	public static void main(String[] args) {
//Scanner dd = new Scanner(System.in);
//int[] vars = new int[3]; 
//
//double [] vars1 = new double[350]; 
//for(int i = 0; i < vars1.length; i++) {
//	 // System.out.println("Zadejte vase cisla pro vyhledavani ");
//	//  vars1[i] = srt.nextDouble();
//	  break;
//}}}
	



//double [] vars = new double[350]; 
//for(int i = 0; i < vars.length; i++) {
//	 // System.out.println("Zadejte vase cisla pro vyhledavani ");
//	  vars[i] = b.nextDouble();
//	  break;
////
//Scanner in = new Scanner(System.in);
//int[] vars1 = new int[1000];
//
//System.out.println("Zadejte maximalne "+vars1.length+" znaku: ");
//for(int i1 = 0; i1 < vars1.length; i1++)
//  vars1[i1] = in.nextInt();
//
//}}}
