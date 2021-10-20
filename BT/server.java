package BT;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class server {
    public final static int serverPort = 8888 ;
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server da duoc tao");
            while (true){
                try {
                    Socket s = ss.accept();
                    RequestProcessing rp = new RequestProcessing(s);
                    
                    rp.start();
                } catch (IOException ie1) {
                    //TODO: handle exception
                    System.out.println("Connection Error: "+ ie1);
                }
            }
        } catch (IOException ie) {
            //TODO: handle exception
            System.out.println("Connection Error: "+ ie);
        }
    }
   
}