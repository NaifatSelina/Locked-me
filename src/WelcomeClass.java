import java.util.Scanner;
public class WelcomeClass {
    public static void main(String[] args) {
        int change=0, choice=0;
        Scanner sc =new Scanner(System.in);

        //welcome screen display
        System.out.println("\t**********************\n");
        System.out.println("Welcome to The Lockers Ltd Application");
        System.out.println("\nDeveloper: Naifat Selina\n");
        System.out.println("Please see the below options");

        //main menu options
        while(true) {
            System.out.println("Please choose one of the following options :");
            System.out.println("1. List All Current Files");
            System.out.println("2. Display Menu Options");
            System.out.println("3. Close The Application");
            try {
                change = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Null Exception occurred");
            }

            switch(change)
            {
                case 1: //List function feature to list all files in ascending order.
                    MenuOptions.listFiles();
                    break;
                case 2:

                    //detailed menu options
                    System.out.println("Select one of the following options :");
                    System.out.println("1. Add a File");
                    System.out.println("2. Delete a File");
                    System.out.println("3. Search for a File");
                    try{
                        choice = sc.nextInt();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Null Exception occurred");
                    }

                    switch(choice)
                    {
                        case 1:
                            //Creates file
                            System.out.println("Name the file to be created: ");
                            String fileCreate = sc.next();

                            // Call function to create the file
                            MenuOptions.createFile(fileCreate);
                            break;
                        case 2:
                            //deletes file
                            System.out.print("Name the file to be deleted: ");
                            String fileDelete = sc.next();

                            // Call function to delete the file
                            MenuOptions.deleteFile(fileDelete);
                            break;
                        case 3:
                            //Search file
                            System.out.println("Input the name of the file to be searched: ");
                            String fileSearch = sc.next();

                            // Call function to search the file
                            MenuOptions.searchFile(fileSearch);
                            break;

                        default:
                            //In the case of void user input execute this
                            System.out.println("\n Invalid Input, Try again\n");
                            break;
                    }

                    break;
                case 3:

                    //Closing the application
                    sc.close();
                    System.out.println("\n Closing the Application, Good-Bye");
                    System.exit(1);
                    break;

                default:
                    //In the case of unprecedented input execute this
                    System.out.println("\n\n Oops! That input was invalid, Please Pick Options  1-3\n");
                    break;

            }}}}