import java.util.Scanner;
 // Determines which integer is biggest
 //Cesar Gil
public class Main {

  public static void main(String[] args) {
    // asking for the two integers
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer");
    int num = input.nextInt();
    System.out.println("Please enter another integer");
    int num2 = input.nextInt();
    // if statement that says which one is bigger
    if (num > num2){
      System.out.println("The biggest number is " + num);
    } else {
      System.out.println("The biggest number is " + num2);
    } if (num == num2){
      System.out.println("There is no biggest integer");
    }

  }
}