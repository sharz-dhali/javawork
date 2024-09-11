import java.util.Scanner;



public class exampleTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //Ask user name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        //Asking for the user's age
        System.out.print("How old are you?: ");
        int age = scanner.nextInt();

        //Enter user color
        System.out.print("Enter your best campus: ");
        String campus = scanner.nextLine();
        scanner.nextLine();

        //Enter user best food
        System.out.print("Enter your best food: ");
        String food = scanner.nextLine();
        scanner.nextLine();

        //out puts
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("campus"+ campus);
        System.out.println("Food:" + food);

        scanner.close();

    }
}
