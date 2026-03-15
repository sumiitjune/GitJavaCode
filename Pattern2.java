public class Pattern2 extends SingleValueTaken{
    public static void main(String[] args) {

        Pattern2 obj = new Pattern2();
        obj.getValue();

        for (int i = 0; i < obj.num1; i++) {
            for (int j = i; j < obj.num1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
