public class calculator {

    public static void main(String[] args) {
        int num1 = 369;
        int num2 = -369;   // negative on purpose
 
        System.out.println("Number 1       : " + num1);
        System.out.println("Number 2       : " + num2);
        System.out.println("Addition       : " + (num1 + num2));
        System.out.println("Subtraction    : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
 
        /* Division and modulus act differently with negatives:
           int division cuts off the decimal (toward zero),
           and % takes the sign of the first number.*/
        System.out.println("Division       : " + (num1 / num2));
        System.out.println("Modulus        : " + (num1 % num2));
    }
}
________________________________________________________________________________________

public class checker {
   public static void main(String[] args) {
        double average = 96.0;
        int absences = 36;
 
        // Pass if (75+ and 3 or fewer absences) OR 90+ no matter what
        boolean passes = (average >= 75 && absences <= 3) || average >= 90;
 
        System.out.println("Average  : " + average);
        System.out.println("Absences : " + absences);
 
        if (passes) {
            System.out.println("Result   : PASS");
        } else {
            System.out.println("Result   : FAIL");
        }
 
        // Reasoning
        if (average >= 90) {
            System.out.println("Reason   : Average is 90 or above, absences don't matter.");
        } else if (average >= 75 && absences <= 3) {
            System.out.println("Reason   : Average is 75+ and absences are 3 or fewer.");
        } else if (average >= 75) {
            System.out.println("Reason   : Average is 75+ but there are more than 3 absences.");
        } else {
            System.out.println("Reason   : Average is below 75.");
        }
   }
}
________________________________________________________________________________________

public class tracker {
    public static void main(String[] args) {
        // Compound assignment
        double balance = 369.0;
        System.out.printf("Starting balance : %.2f%n", balance);
 
        balance += 369;    // deposit
        System.out.printf("After += 369     : %.2f%n", balance);
 
        balance *= 1.5;    // growth
        System.out.printf("After *= 1.5     : %.2f%n", balance);
 
        balance += 369;    // another deposit
        System.out.printf("After += 369     : %.2f%n", balance);
 
        // Postfix increment
        int count = 369;
        System.out.println();
        System.out.println("count++ prints   : " + count++);
        System.out.println("count after      : " + count);
 
        // Prefix increment
        count = 369;   // reset
        System.out.println();
        System.out.println("++count prints   : " + ++count);
        System.out.println("count after      : " + count);
 
        /* They differ because count++ gives the OLD value first, then adds 1,
           while ++count adds 1 first, then gives the NEW value.*/
    }
}
________________________________________________________________________________________

public class solver {
    public static void main(String[] args) {
        int a = 369;
        int b = 369;
        int c = 369;
 
        /* Puzzle 1
           Predicted: 136529  (369 + 136161 - 1)*/
        int r1 = a + b * c - a / b;
        System.out.println("Puzzle 1 actual: " + r1);
 
        /* Puzzle 2
           Predicted: true  (&& runs before ||)*/
        boolean r2 = a > b && b < c || a == 369;
        System.out.println("Puzzle 2 actual: " + r2);
 
        /* Puzzle 3
           Predicted: r3 = 1111, x = 371  (369 + 371 * 2)*/
        int x = 369;
        int r3 = x++ + ++x * 2;
        System.out.println("Puzzle 3 actual: r3 = " + r3 + ", x = " + x);
 
        /* Puzzle 4
           Predicted: true  (738 < 1845 is true, and !(false) is true)*/
        boolean r4 = a + b < c * 5 && !(b != 369);
        System.out.println("Puzzle 4 actual: " + r4);
 
        // All predictions matched, so no follow-up notes needed.
    }
}
