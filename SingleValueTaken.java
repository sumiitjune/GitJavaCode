import java.util.*;

class SingleValueTaken {

    int num1;
    Scanner sc = new Scanner(System.in);

    void getValue(){
        while(true){
            try {
                System.out.print("Enter a number: ");
                num1 = sc.nextInt();
                break;
            } catch (Exception e) {
            // TODO: handle exception
                System.out.println("Please enter the numerical number : ");
                sc.next();
        }
        }
    }
}