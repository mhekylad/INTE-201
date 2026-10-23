public class Arrays {

    public static void main(String[] args) {
        String[] favorites = {"Books", "Sweets", "Chessl", "Drawing", "Plants"};
 
        // Numbered 1 to 5
        for (int pos = 0; pos < favorites.length; pos++) {
            System.out.println((pos + 1) + ". " + favorites[pos]);
        }
 
        System.out.println("Total items: " + favorites.length);
    }
}
__________________________________________________________________________________________________
  
  public class calculator {
    public static void main(String[] args) {
        int[] scores = {36, 69, 93, 39, 66, 99, 63, 96, 33};
 
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
 
        // One pass for sum, highest and lowest
        for (int pos = 0; pos < scores.length; pos++) {
            sum += scores[pos];
            if (scores[pos] > highest) {
                highest = scores[pos];
            }
            if (scores[pos] < lowest) {
                lowest = scores[pos];
            }
        }
 
        // Cast so the division keeps decimals
        double average = (double) sum / scores.length;
 
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Highest : " + highest);
        System.out.println("Lowest  : " + lowest);
    }
}
__________________________________________________________________________________________________

  import java.util.Arrays;
public class minitool {
    // Linear search: returns the index, or -1 if not found
    static int find(int[] data, int target) {
        for (int pos = 0; pos < data.length; pos++) {
            if (data[pos] == target) {
                return pos;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        int[] scores = {36, 69, 93, 39, 66, 99, 63, 96, 33};
 
        // Search for a score that exists
        int index = find(scores, 66);
        if (index != -1) {
            System.out.println("66 found at index " + index);
        } else {
            System.out.println("66 not found");
        }
 
        // Search for a score that does not exist
        index = find(scores, 3);
        if (index != -1) {
            System.out.println("3 found at index " + index);
        } else {
            System.out.println("3 not found");
        }
 
        /* Sort a copy, not the original.
           Sorting the original would change the order and the indexes,
           so earlier search results would no longer match the data.*/
        int[] copy = Arrays.copyOf(scores, scores.length);
        Arrays.sort(copy);
 
        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted  : " + Arrays.toString(copy));
    }
}
__________________________________________________________________________________________________

  class Student {
    String name;
    int[] quizzes;
 
    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }
 
    double average() {
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        return (double) sum / quizzes.length;
    }
}
public class ranking {
    // Own sort: selection sort, highest average first
    static void sort(Student[] list) {
        for (int pos = 0; pos < list.length - 1; pos++) {
            int best = pos;
            for (int next = pos + 1; next < list.length; next++) {
                if (list[next].average() > list[best].average()) {
                    best = next;
                }
            }
            Student temp = list[pos];
            list[pos] = list[best];
            list[best] = temp;
        }
    }
 
    /* Own linear search: finds the student by name and returns the rank
       Call this on a sorted list*/
    static int rank(Student[] list, String name) {
        for (int pos = 0; pos < list.length; pos++) {
            if (list[pos].name.equals(name)) {
                int place = pos + 1;
                // Tie: step back to the first student with the same average
                while (place > 1 && list[place - 2].average() == list[pos].average()) {
                    place--;
                }
                return place;
            }
        }
        return -1;
    }
 
    public static void main(String[] args) {
        String[] names = {"Kyla", "Bruce", "Jimuel", "Jannah", "Yvonne", "Pops"};
        int[][] raw = {
            {93, 96, 99, 66},
            {63, 66, 69, 63},
            {96, 93, 99, 96},
            {69, 66, 63, 66},
            {39, 36, 33, 36},
            {99, 93, 96, 66}    // same average as Ana (tie)
        };
 
        // Build Student objects from the raw data
        Student[] students = new Student[names.length];
        for (int pos = 0; pos < names.length; pos++) {
            students[pos] = new Student(names[pos], raw[pos]);
        }
 
        sort(students);
 
        System.out.printf("%-6s %-8s %s%n", "Rank", "Name", "Average");
        for (Student student : students) {
            System.out.printf("%-6d %-8s %.2f%n",
                    rank(students, student.name), student.name, student.average());
        }
    }
}
