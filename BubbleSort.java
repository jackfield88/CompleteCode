import java.util.Scanner;
 
class BubbleSort {
  public static void main(String []args) {
    int n, c, d, swap;
    Scanner in = new Scanner(System.in);
 
  //  System.out.println("Input number of integers to sort");
   // n = in.nextInt();
 

// Allowing the user to enter the student ID  
    System.out.println("Input student number:");
    String StudentID = in.next();
    n=StudentID.length();
    int array[] = new int[StudentID.length()];
    for (int i = 0; i < StudentID.length(); i++)
    {
        array[i] = StudentID.charAt(i) - '0';
    }
 

// Using the bubble sort to put the numbers in asending order    
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) 
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers:");
// Printing the completed list of numbers  
    for (c = 0; c < n; c++)
      System.out.print(array[c]);
  }
}
