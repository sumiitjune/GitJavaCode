public class Pattern3 extends SingleValueTaken{
    public static void main(String[] args) {

        Pattern3 obj = new Pattern3();
        obj.getValue();

        for (int i = 0; i < obj.num1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
