import java.util.Scanner;
/*
    *
   **
  ***
 ****
*/
class PatternRightangleRight{
  public static void rightangleRight(int size){
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= size - i; j++){
        System.out.print("  ");
      }
      for(int k = size; k >= size - i + 1; k--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    rightangleRight(size);
  }
}
