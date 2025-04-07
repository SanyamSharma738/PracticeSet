//In this Program it is checking if there is an Exception , which Catch block will handle it!

public class SecondProgram {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4};
        try {
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("This is a ArithmeticException! First Catch block is Executed");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This is a ArrayOutOfIndexException! Second Catch block is Executed");
        }finally {
            System.out.println("This Program is executed");
        }
    }
}
