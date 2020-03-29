import java.util.Scanner;
/*
****
 ***
  **
   *
*/
class PatternRightangleUpRight{
  public static void rightangleUpRight(int size){
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= i - 1; j++){
        System.out.print("  ");
      }
      for(int k = size; k >= i; k--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    rightangleUpRight(size);
  }
}
