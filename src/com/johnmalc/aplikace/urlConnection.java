package com.johnmalc.aplikace;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * @author  John Malc
 * @version 
 *
 */
public class urlConnection {

	/**
	 * @param args
	 */
  public void main(String[] argv) throws Exception {
    String data = URLEncoder.encode("key1", "UTF-8") + "=" + URLEncoder.encode("value1", "UTF-8");
    data += "&" + URLEncoder.encode("key2", "UTF-8") + "=" + URLEncoder.encode("value2", "UTF-8");
    int data1 = new Scanner(System.in).nextInt();
    URL url = new URL("http://www.xxx.cz/vyhledavani?text=" + data1);
    URLConnection conn = url.openConnection();
    conn.setDoOutput(true);
    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
    wr.write(data1);
    wr.flush();

    BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    String line;
    if( !(URL.equals("http://www.xxx.cz/vyrobek-nenalezen"))) {
    	System.out.println("sfgd");
    }
    	else ("Vyrobek existuje" != null);
    
    
//    while ((line = rd.readLine()) != null) {
 //   System.out.println(line);
  //  }
    wr.close();
    rd.close();
  }
	}

