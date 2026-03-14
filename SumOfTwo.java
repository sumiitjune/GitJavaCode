import java.util.Scanner;
import java.io.*;

class SumOfTwo{
public static void main(String... s){
int num1, num2, sum;
Scanner sc = new Scanner(System.in);

try{
    System.out.print("ENTER THE FIRST NUMBER : ");
    num1 = sc.nextInt();

    System.out.print("ENTER THE SECOND NUMBER : ");
    num2 = sc.nextInt();
}catch(Exception e){
    System.out.println("Please enter the correct value : in Numericals");
    return;
}
sum = num1 + num2;

System.out.println("THE SUM OF "+ num1 + " and " + num2 + " is = "+ sum );

sc.close();
}
}

