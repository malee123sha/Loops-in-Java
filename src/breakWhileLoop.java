public class breakWhileLoop {
    public static void main(String[] args) {
        int i =0;
        while (i < 10) {
            System.out.print(i+" ");
            i++;
            if (i == 5) {
                break;
            }
        }
    }
}
