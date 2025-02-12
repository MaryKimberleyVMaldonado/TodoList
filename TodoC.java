import java.util.ArrayList;
import java.util.Scanner;

public class TodoC {
    private static ArrayList<String> mList = new ArrayList<String>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Welcome to Todo List App:");

        // While loop
        while(true) {
            System.out.println("1. Add Todo");
            System.out.println("2. View Todo");
            System.out.println("3. Modify Todo");
            System.out.println("4. Completed Todo");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            // Switch case
            switch(choice){
                case 1:
                    addT();
                    break;
                case 2:
                    viewT();
                    break;
                case 3:
                    modifyT();
                    break;
                case 4:
                    completedT();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            // salto de línea.
            System.out.println("\n");                               
        }
    }

    public static void addT() {
        System.out.print("Enter the Todo: ");
        String todo = sc.nextLine();
        mList.add(todo);
    }

    public static void viewT() {
        for (int i = 0; i < mList.size(); i++) {
            System.out.println((i+1) + ". " + mList.get(i));
        }
    }

    public static void modifyT() {
        System.out.print("Enter the Todo number to modify: ");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the new Todo: ");
        String todo = sc.nextLine();
        mList.set(index-1, todo);
    }

    public static void completedT() {
        System.out.print("Enter the Todo number to mark as completed: ");
        int index = sc.nextInt();
        sc.nextLine();
        mList.remove(index-1);
    }

   

}
