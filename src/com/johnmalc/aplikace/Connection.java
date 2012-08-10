package com.johnmalc.aplikace;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.cache.CachingHttpClient;
import org.apache.http.impl.conn.BasicClientConnectionManager;


/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class Connection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Napsat tridu pro overeni conradu (pripojeni na conrad). Resit take ruzne chyby.
		Scheme http = new Scheme("http", 80, PlainSocketFactory.getSocketFactory());
		SchemeRegistry sr = new SchemeRegistry();
		sr.register(http);
		ClientConnectionManager connMrg = new BasicClientConnectionManager(sr);

		// Request new connection. This can be a long process
		ClientConnectionRequest connRequest = connMrg.requestConnection(
		        new HttpRoute(new HttpHost("http://www.conrad.de", 80)), null);

		// Wait for connection up to 10 sec
		ManagedClientConnection conn = null;
		try {
			conn = connRequest.getConnection(10, TimeUnit.SECONDS);
		} catch (ConnectionPoolTimeoutException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		    // Do useful things with the connection.
		    // Release it when done.
		    conn.releaseConnection();
		} catch (IOException ex) {
		    // Abort connection upon an I/O error.
		    try {
				conn.abortConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    try {
				throw ex;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
