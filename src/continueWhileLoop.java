public class continueWhileLoop {
        public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
                if (i == 6) {
                    i++;
                    continue;
                }
                System.out.print(i+" ");
                i++;
            }
        }
}



