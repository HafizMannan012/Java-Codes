public class PrintFAST_Q5 {
    public static void main(String[] args) {
        int size = 5; // Size of each letter in the pattern

        // Loop for the rows
        for (int i = 1; i <= size; i++) {
            // Loop for the 'F'
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == 1 || (i == size / 2 + 1 && j <= size / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("  ");

            // Loop for the 'A'
            for (int j = 1; j <= size; j++) {
                if (i == 1 || (i == size / 2 + 1 && j == size / 2 + 1) || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.print("  ");

            // Loop for the 'S'
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size) {
                    System.out.print("*");
                } else if (i == (size + 1) / 2) {
                    System.out.print("*");
                } else if (i < (size + 1) / 2 && j == 1) {
                    System.out.print("*");
                } else if (i > (size + 1) / 2 && j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("  ");


            // Loop for the 'T'
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == (size / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
