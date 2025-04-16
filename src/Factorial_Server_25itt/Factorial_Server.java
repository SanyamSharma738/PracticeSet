package Factorial_Server_25itt;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class Factorial_Server {
    public static void main(String[] args) {
        try {

            System.out.println("Waiting for clients: ");
            ServerSocket ss = new ServerSocket(9806);
            Socket soc = ss.accept();
            System.out.println("Connection Established!");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
           out.println("Factorial of "+number+" is "+CalculateFactorial(number));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static int CalculateFactorial(int number){
        int fact =1;
        for (int i =1;i<=number;i++){
            fact=fact*i;
        }return fact;
    }
}