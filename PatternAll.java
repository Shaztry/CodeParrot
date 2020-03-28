import java.util.Scanner;

class PatternAll{

/*
Pattern : 1
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

  public static void square(int size){
    for(int i = 1; i <= size; i++){
      for(int j = 1; j <= size; j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

/*
Pattern : 2
*
* *
* * *
* * * *
* * * * *
*/


  public static void rightangleLeft(int size){

  }
  public static void rightangleReverseLeft(int size){

  }
  public static void triangle(int size){

  }
  public static void rightangleRight(int size){

  }
  public static void rightangleReverseRight(int size){

  }
  public static void rightangleUpRight(int size){

  }
  public static void triangleReverse(int size){

  }
  public static void rhombus(int size){

  }
  public static void rhombusLeftAlign(int size){

  }
  public static void rightangleSpaceInBetween(int size){

  }
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
  }
}
