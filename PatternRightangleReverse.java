import java.util.Scanner;
/*
* * * * *
* * * *
* * *
* *
*
*/
class PatternRightangleReverse{
  public static void rightangleReverse(int size){
    for(int i = size; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    rightangleReverse(size);
  }
}
