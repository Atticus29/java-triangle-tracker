import java.io.Console;

public class App{
  public static void main(String[] args){
    Console myConsole = System.console();
    System.out.println("Please enter length of side 1");
    int side1 = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter length of side 2");
    int side2 = Integer.parseInt(myConsole.readLine());
    System.out.println("Please enter length of side 3");
    int side3 = Integer.parseInt(myConsole.readLine());

    if(isValidTriangle(side1, side2, side3)){
      Triangle newTriangle = new Triangle(side1, side2, side3);
      System.out.println(newTriangle.getTriangleType());
    }
  }

  public static Boolean isValidTriangle(int side1, int side2, int side3){
    if(side1 < side2+side3 && side2 < side1+side3 && side3< side1+side2){
      return true;
    } else{
      System.out.println("Not a valid triangle!");
      return false;
    }
  }
}
