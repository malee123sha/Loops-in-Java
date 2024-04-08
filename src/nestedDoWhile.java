public class nestedDoWhile {
        public static void main(String[] args) {
            int i = 1;
            int j = 5;
            do {
                do {
                    System.out.println("Inner Loop:-"+i); // inner loop = i
                    i++;
                }
                while (i < 3);
                System.out.println("Outer Loop:-"+j); //outer loop = j
                j++;
            }
            while (j < 8);
        }
}
