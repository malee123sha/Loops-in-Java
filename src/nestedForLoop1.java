public class nestedForLoop1 {
        public static void main(String[] args) {
            for(int x = 1; x <=2; x++) {
                for(int y = 1; y <=3; y++) {
                    System.out.println("Inner Loop:-" + y);
                }
                System.out.println("Outer Loop:-"+x);
            }
        }
}
