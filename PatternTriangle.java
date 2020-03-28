import java.util.Scanner;
/*
   *
  ***
 *****
*******
*/
class PatternTriangle{
  public static void triangle(int size){
    int c = size - 1;
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= c; j++){
        System.out.print("  ");
      }
      c--;
      for(int k = 1; k <= 2 * i - 1; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    triangle(size);
  }
}
