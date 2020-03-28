import java.util.Scanner;
/*
*
* *
* * *
* * * *
* * * * *
*/
class PatternRightangle{
  public static void rightangle(int size){
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    rightangle(size);
  }
}
