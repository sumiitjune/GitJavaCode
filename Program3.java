public class Program3 extends ValueTake{ 
    //inheritance_practice
    int num1;
    public void factorial(){
        while(true){
            try {
                System.out.print("ENTER A NUMBER TO CHECK FACTORIAL : ");
                num1 = sc.nextInt();
                break;
            } catch (Exception e) {
            // TODO: handle exception
                System.out.println("PLEASE ENTER THE CORRECT VALUE :");
                sc.next();
            }
        }
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " + num1 + " = " + fact);
    }
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.factorial();
    }
}
