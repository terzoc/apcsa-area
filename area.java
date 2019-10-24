import java.util.Scanner;

public class area {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    boolean validInput = false;
    double area = 0;
    System.out.print("\nEnter a shape: ");
    String shape = in.nextLine();
    shape = shape.toLowerCase();
    while (!validInput) {
      switch (shape) {
        case "circle":
        case "rectangle":
        case "square":
        case "triangle":
        validInput = true;
        break;
        default:
          validInput = false;
          System.out.print("Enter a shape: ");
          shape = in.nextLine();
      }
    }
    switch (shape) {
      case "circle":
        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();
        area = Math.PI * Math.pow((radius), 2);
        break;
      case "rectangle":
        System.out.print("Enter a length: ");
        double length = in.nextDouble();
        System.out.print("Enter a width: ");
        double width = in.nextDouble();
        area = length * width;
        break;
      case "square":
        System.out.print("Enter a side: ");
        double side = in.nextDouble();
        area = side * side;
        break;
      case "triangle":
        System.out.print("Enter a base: ");
        double base = in.nextDouble();
        System.out.print("Enter a height: ");
        double height = in.nextDouble();
        area = base * height * 0.5;
    }


    System.out.printf("\nArea: %.2f\n", area);

    in.close();
  }
}
