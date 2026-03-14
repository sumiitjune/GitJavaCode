import java.util.*;
import java.io.*;

class Program2{
    int num1, num2;
    Scanner sc = new Scanner(System.in);
    public void check(){
        while(true){
        try{
            System.out.print("Enter a Number : ");
            num1 = sc.nextInt();
            break;
        }catch(Exception e){
            System.out.println("Please Enter a NUMERICAL value");
            sc.next();
        }
    }
        if(num1%2 == 0){
            System.out.println(num1 + " is even number " );
        }else {
            System.out.println(num1 + " is odd number ");
        }
    }
    public static void main(String[] args) {
        Program2 obj = new Program2();
        obj.check();

    }
}

