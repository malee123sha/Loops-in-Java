public class Date {
    public static void main(String[] args) {
        int days = 7;
        int weeks = 4;
        int i = 1;
        //outer loop
        while (i <= weeks) {
            System.out.println("Week:-"+i+".......");
            //inner loop
            for (int j = 1; j <= days; j++) {
                System.out.println("Days:-"+j);
            }
            i++;
        }
    }
}