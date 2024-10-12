import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

  System.out.println("What is your first name?");
    String fname = keyboard.nextLine(); //gather first name from user
  
  System.out.println("What is your last name?");
    String lname = keyboard.nextLine(); //gather last name from user

  System.out.println("What is your favorite animal?");
      String favoriteAnimal = keyboard.nextLine(); //gather favorite animal from user

  System.out.println("What is your favorite food?");
      String favoriteFood = keyboard.nextLine(); //gather favorite food from user

  System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();//gather favorite song from user

System.out.println("My name is " + fname + " " + lname + ".");
System.out.println("My favorite animal is " + favoriteAnimal + ".");
System.out.println("My favorite food is " + favoriteFood + ".");
System.out.println("My favorite song is " + favoriteSong + ".");


  }
}