public class printer {
       static void show(int bound) {
        System.out.println("--- Counting 1 to " + bound + " ---");
        for (int num = 1; num <= bound; num++) {
            System.out.println("Number: " + num + " | Square: " + (num * num));
        }
    }
 
    public static void main(String[] args) {
        show(10);   // original bound
        show(20);   // changed bound, output updates
    } 
    }
______________________________________________________________________________________

public class value {
    public static void main(String[] args) {
        /* Pretend these were typed in, one by one
           (-3 is negative but is NOT the stop value)*/
        int[] inputs = {3, 6, -3, 9, -1, 66};
 
        int index = 0;
        int total = 0;
        int number = inputs[index];
 
        // -1 ends the loop and is never added
        while (number != -1) {
            total += number;
            index++;
            number = inputs[index];
        }
 
        System.out.println("Final total: " + total);
    }
}
______________________________________________________________________________________

public class generator {
    public static void main(String[] args) {
        int size = 6;

        for (int row = 1; row <= size; row++) {

            // Skip row 3
            if (row == 7) {
                continue;
            }

            for (int col = 1; col <= size; col++) {

                // Stop at column 5
                if (col == 7) {
                    break;
                }

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
______________________________________________________________________________________

public class scanner {
   // While loop + return: keep trying until a valid amount is used
    static boolean restock(int[][] shelves, int row, int col, int[] amounts) {
        int index = 0;
        while (index < amounts.length) {
            int amount = amounts[index];
            index++;
            if (amount <= 0) {
                System.out.println("Invalid amount " + amount + ", try again.");
                continue;
            }
            shelves[row][col] += amount;
            System.out.println("Restocked shelf (" + row + "," + col + ") with " + amount
                    + ". New count: " + shelves[row][col]);
            return true;
        }
        return false;   // ran out of amounts
    }
 
    public static void main(String[] args) {
        // -1 means damaged shelf
        int[][] shelves = {
            {36, 69, -1},
            {9, 3, 66},
            {6, 93, 39}
        };
 
        int limit = 6;                    // below this is critically low
        int lowrow = -1;
        int lowcol = -1;
 
        /* Pretend menu choices and restock amounts were typed in
           3 = total, 6 = find low shelf, 9 = restock, 99 = exit*/
        int[] choices = {3, 6, 9, 99};
        int[] amounts = {-3, -6, 9};
 
        int index = 0;
        int choice;
 
        // Menu runs until exit is chosen
        do {
            choice = choices[index];
            index++;
 
            switch (choice) {
                case 3: {
                    int total = 0;
                    for (int row = 0; row < shelves.length; row++) {
                        for (int col = 0; col < shelves[row].length; col++) {
                            // CONTINUE: skip damaged shelves
                            if (shelves[row][col] == -1) {
                                continue;
                            }
                            total += shelves[row][col];
                        }
                    }
                    System.out.println("Total inventory: " + total);
                    break;
                }
                case 6: {
                    boolean found = false;
                    for (int row = 0; row < shelves.length; row++) {
                        for (int col = 0; col < shelves[row].length; col++) {
                            int stock = shelves[row][col];
                            if (stock == -1) {
                                continue;
                            }
                            // BREAK: stop at the first low shelf
                            if (stock < limit) {
                                lowrow = row;
                                lowcol = col;
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("First low shelf: row " + lowrow + ", col " + lowcol
                                + " (count " + shelves[lowrow][lowcol] + ")");
                    } else {
                        System.out.println("No low shelves.");
                    }
                    break;
                }
                case 9: {
                    if (lowrow == -1) {
                        System.out.println("Find a low shelf first.");
                    } else if (!restock(shelves, lowrow, lowcol, amounts)) {
                        System.out.println("Restock failed: no valid amount.");
                    }
                    break;
                }
                case 99: {
                    System.out.println("Goodbye!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice.");
                }
            }
        } while (choice != 99);
    } 
}
