import java.util.Scanner;

class TshirtSize{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    if(size>0 && size<=30)
      System.out.println("SMALL");
    else if(size>30 && size<=60)
      System.out.println("MEDIUM");
    else if(size>60 && size<=100)
      System.out.println("LARGE");
    else
      System.out.println("DAMN BOY");
  }
}
