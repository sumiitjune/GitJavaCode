public class Pattern4 extends SingleValueTaken {
    public static void main(String[] args) {
        Pattern4 obj = new Pattern4();
        obj.getValue();

        for (int i = 0; i < obj.num1; i++) {
            for (int j = 0; j < obj.num1 - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
