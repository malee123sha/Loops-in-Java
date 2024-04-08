public class nestedWhileLoops {
        public static void main(String[] args) {
            int x = 1;
            while (x < 3) {  //outer loop = x
                int y = 1;
                while (y <= 3) {  //inner loop = y
                    System.out.println("Inner Loop:-" + y + "***"); //statement inner loop
                    y++;
                }
                System.out.println("Outer Loop:-"+x); //statement outer loop
                x++;
                }
        }
}
