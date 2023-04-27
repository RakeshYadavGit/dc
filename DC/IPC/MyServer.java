import java.io.*;
import java.net.*;

public class MyServer{
    public static void main(String args[]){
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            
            DataInputStream dis = new DataInputStream(s.getInputStream());

            int num1 = dis.readInt();
            int num2 = dis.readInt();

            int sum = num1 + num2;

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeInt(sum);

            dout.close();
            s.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
