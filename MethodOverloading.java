//method Overloading
class MethodOverloading{
  //method1
  public static void add(int a){
    System.out.println(a + 1);
  }
  //method2
  public static void add(double a, double b){
    System.out.println(a + b);
  }
  //method3
  public static int add(int a, int b){
    return a +b;
  }
  //main method1
  public static void main(String args[]){
    int numIa = 10;
    int numIb = 12;
    double numDa = 3.1412;
    double numDb = 5.343;
    add(numIa);
    add(numDa,numDb);
    System.out.println(add(numIa,numIb));
  }
}
