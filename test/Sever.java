package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) {
        try {
            ServerSocket ss= new ServerSocket(8888);
            System.out.println("Sever duoc tao");
            while(true)
            {
                Socket s=ss.accept();
                Processing p=new Processing(s);
                p.start();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    

    
}
