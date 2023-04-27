import java.io.*;
import java.net.*;

public class MyClient{
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter first number: ");
            int num1 = Integer.parseInt(br.readLine());

            System.out.print("Enter second number: ");
            int num2 = Integer.parseInt(br.readLine());

            dout.writeInt(num1);
            dout.writeInt(num2);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            int sum = dis.readInt();

            System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);

            dout.close();
            dis.close();
            s.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
 