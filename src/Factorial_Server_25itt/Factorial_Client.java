package Factorial_Server_25itt;
import java.io.*;
import java.net.Socket;

public class Factorial_Client {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started...");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number: ");
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(number);
            BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(read.readLine());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
