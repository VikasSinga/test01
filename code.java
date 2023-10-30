public class DiamondPattern {
    public static void main(String[] args) {
        int n = 7; // Change this to the desired number of rows

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for a proper diamond pattern.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        // Print the top half of the diamond
        for (int i = 1; i <= n / 2 + 1; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            spaces--;
            stars += 2;
        }

        // Print the bottom half of the diamond
        spaces = 1;
        stars = n - 2;

        for (int i = 1; i <= n / 2; i++) {
            // Print leading spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            spaces++;
            stars -= 2;
        }
    }
}
