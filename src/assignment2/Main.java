/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hanafim1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
           
               for ( int port = 1; port <=65000; port++) {
                   try{


                             Socket s = new Socket();
                             InetSocketAddress a = new InetSocketAddress("www.southernct.edu",port);
                             //this will connect to a during100ms
                             s.connect(a, 100);
                             
                             System.out.println("Server is listening on port " + port);
                             s.close();
                             System.out.println("Successfully connected");

                    } catch (UnknownHostException ex) {
                        System.out.println("Unknownhostexception!");
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }catch(SocketTimeoutException e){
                        System.out.println("Socket time out, port "+port);
                    }
               }
                
        
    }

}
