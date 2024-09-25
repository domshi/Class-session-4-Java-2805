public class Main {
  public static void main(String[] args) {
    int x = 44;
    int w = 55;

    double y = 6.0;
    double z = 4.0;

    String m = "howdy";
    String n = "doody";

    ClassA myMath = new ClassA();
    ClassB myNewMath = new ClassB();

    ClassA poly1 = new ClassB();
    ClassA poly2 = new ClassC();
    
    ClassA[] polyArray = new ClassA[3];
    polyArray[0] = myMath;
    polyArray[1] = poly1;
    polyArray[2] = poly2;

    for (int i = 0; i<2; i++) {
      if (polyArray[i] instanceof ClassB) {
      System.out.println("The values are: " + m + "plus " + n + "is " + polyArray[i].add(m, n));
      }
    }

/*
    System.out.println("The values are: " + m + " plus " + n + " is " + myMath.add(m,n));
    System.out.println("The values are: " + m + " plus " + n + " is " + poly1.add(m,n));
    System.out.println("The values are: " + m + " plus " + n + " is " + poly2.add(m,n));
    
    
/*
    System.out.println("The values are: " + w + " plus " + x + " is " + myMath.add(w,x));
    System.out.println("The values are: " + y + " plus " + z + " is " + myMath.add(y,z));
    System.out.println("The values are: " + m + " plus " + n + " is " + myMath.add(m,n));
    System.out.println("The values are: " + m + " plus " + n + " is " + myNewMath.add(m,n));
*/  }
}