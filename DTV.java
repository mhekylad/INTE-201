public class PPF {

    public static void main(String[] args) {
        int edad = 21;
        double taas = 1.65;  // in meters
        char umpisa = 'J';
        boolean status = true;
 
        // Reference-type variable
        String pangalan = "Mhekyla B. Dilao";
 
        // Print corresponding value on its own labeled line
        System.out.println("   Personal Profile");
        System.out.println("Full Name : " + pangalan);
        System.out.println("Initial   : " + umpisa);
        System.out.println("Age       : " + edad);
        System.out.println("Height    : " + taas + "m");
        System.out.println("Student   : " + status);
    }
}
__________________________________________________________________________________________________

  public class Calculator {
     public static void main(String[] args) {
       int dami = 3;
        double presyo = 499.99;
        String store = "Kygus Clothing Store";
 
        /* int * double is promoted to double, so the result is stored in a double.
        total should not be an int because the price has decimal nuymbers, 
        usingt int means disregarding the decima1, as follows;
        49.97 would become 149
        giving an incomplete total.*/
        
        double total = dami * presyo;
 
        System.out.println("      Purchase Summary");
        System.out.println("Store      : " + store);
        System.out.println("Quantity   : " + dami);
        System.out.printf("Unit Price : %.2f%n", presyo);
        System.out.printf("Total Cost : %.2f%n", total); 
    }
}
__________________________________________________________________________________________________

  public class converter {
    public static void main(String[] args) {
        //Part 1: Convert cm to meters
        double cm = 369.5;
 
        //Get whole meters
        int m = (int) (cm / 100);
 
        //Get leftover cm
        double remainCm = cm - (m * 100);
 
        System.out.println("     Centimeter Conversion");
        System.out.println("Total centimeters : " + cm);
        System.out.println("Whole meters      : " + m);
        System.out.println("Remaining cm      : " + remainCm);
 
        //Part 2: Convert int to double
        int itemcount = 42;
        //Java converts it automatically
        double widenedcount = itemcount;
 
        System.out.println();
        System.out.println("     Implicit Widening");
        System.out.println("int value     : " + itemcount);
        System.out.println("widened double: " + widenedcount);
 
        //Part 3: Convert double to int
        double precisevalue = 9.99;
        // Remove the decimal part
        int narrowedvalue = (int) precisevalue;
 
        System.out.println();
        System.out.println("     Explicit Narrowing");
        System.out.println("double value  : " + precisevalue);
        System.out.println("narrowed int  : " + narrowedvalue);
        System.out.println("Data lost     : " + (precisevalue - narrowedvalue));
    }
}
__________________________________________________________________________________________________

  public class investigator {
    public static void main(String[] args) {
         // Part 1: byte overflow
        byte counter = 127;   // Byte.MAX_VALUE
        counter++;            // goes past the max and wraps around to the minimum
        System.out.println("    Byte Overflow");
        System.out.println("127 + 1 as a byte = " + counter);   // -128
 
        // Part 2: String comparison
        String s1 = new String("Java");  // new object on the heap
        String s2 = new String("Java");  // another, separate object on the heap
        String s3 = "Java";              // literal, stored in the String pool
 
        System.out.println();
        System.out.println("    String Comparison");
 
        // == compares references (memory addresses), not text.
        // s1 and s2 were each created with 'new', so they are two different objects.
        System.out.println("s1 == s2      : " + (s1 == s2));        // false
 
        // s1 is a heap object, s3 points to the pooled literal: different objects.
        System.out.println("s1 == s3      : " + (s1 == s3));        // false
 
        // s2 is also a heap object, so it is not the pooled literal either.
        System.out.println("s2 == s3      : " + (s2 == s3));        // false
 
        // .equals() compares the actual characters, which are identical in all
        // three Strings, so every .equals() comparison is true.
        System.out.println("s1.equals(s2): " + s1.equals(s2));      // true
        System.out.println("s1.equals(s3): " + s1.equals(s3));      // true
        System.out.println("s2.equals(s3): " + s2.equals(s3));      // true
 
        //Part 3: shared array reference
        int[] original = {1, 2, 3};
        int[] alias = original;   // copies the reference, not the array itself
 
        System.out.println();
        System.out.println("    Shared Array Reference");
        System.out.println("Before: original = " + Arrays.toString(original));
 
        alias[0] = 99;            // modify through 'alias'
 
        // Both variables point to the same array object in memory,
        // so the change is visible through 'original' too.
        System.out.println("After alias[0] = 99:");
        System.out.println("original = " + Arrays.toString(original));
        System.out.println("alias    = " + Arrays.toString(alias));
    }
}
