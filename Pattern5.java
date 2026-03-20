public class Pattern5 extends SingleValueTaken {
    public static void main(String[] args) {
        Pattern5 obj = new Pattern5();
        obj.getValue();

       for (int i = 0; i < obj.num1; i++) {
        for (int j = i; j < obj.num1; j++) {
            System.out.print(" ");
        }
        System.out.println();
       }
       for (int i = 0; i < args.length; i++) {
        System.out.println("* ");
       }
    }
    
}
