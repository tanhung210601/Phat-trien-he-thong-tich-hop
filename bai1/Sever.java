package bai1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public final static int severPort=999;
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(severPort);
            System.out.println("Sever đã được tạo");
            while(true)
            {
                Socket s=ss.accept();
                OutputStream os=s.getOutputStream();
                InputStream is=s.getInputStream();
                while(true)
                {
                        
                            
                            
                                int n=is.read();
                                if(n=='q') break;
                                String kq=""; 
                                switch (n) {
                                    case '1': 
                                        kq="Mot";
                                        break;
                                    case '2': 
                                        kq="Hai";
                                        break;
                                    case '3': 
                                        kq="Ba";
                                        break;
                                    case '4': 
                                        kq="Bon";
                                        break;
                                    case '5': 
                                        kq="Nam";
                                        break;
                                    case '6': 
                                        kq="Sau";
                                        break;
                                    case '7': 
                                        kq="Bay";
                                        break;
                                    case '8': 
                                        kq="Tam";
                                        break;
                                    case '9': 
                                        kq="Chin";
                                        break;
                                    case 10: 
                                        kq="Muoi";
                                        break;
                                    default: kq="Khong phai so nguyennn";
                                }
                                os.write(kq.getBytes());
                                
                            
                        
                       
                    
                       
                    
                }
            }
            
        } catch (Exception e) {
           System.out.println("Sever creation error");
        }
    }
    
}
