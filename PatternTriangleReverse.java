import java.util.Scanner;
/*
*******
 *****
  ***
   *
*/
class PatternTriangleReverse{
  public static void triangleReverse(int size){
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= i - 1; j++){
        System.out.print("  ");
      }
      for(int k = size * 2 - i; k >= i; k--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    triangleReverse(size);
  }
}
