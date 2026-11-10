public class Main {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces to center this row.
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print an odd number of stars on each row.
            for (int star = 1; star <= 2 * i - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
