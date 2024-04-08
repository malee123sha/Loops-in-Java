public class nestedWhileLoop {
        public static void main(String[] args) {
            int x = 1;
            while (x < 3) {  //outer loop
                int y = 5;
                while (y < 8) {  //inner loop
                    System.out.println("Outer Loop:-"+x+"***");
                    System.out.println("Inner Loop:-"+y);
                    y++;
                }
                x++;
            }
        }
}
