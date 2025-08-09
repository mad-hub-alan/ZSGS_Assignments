package day_11.file_handling_2;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--------------- File Operations Menu --------------\n");
            System.out.println("1. Write user content to file");
            System.out.println("2. Copy content from one file to another");
            System.out.println("3. Modify content of a file");
            System.out.println("4. Search a word and count its occurrences");
            System.out.println("5. Copy products from TXT to CSV");
            System.out.println("6. Read a file");
            System.out.println("7. Exit \n\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    FileOperations.writeUserInputToFile(sc);
                    break;
                case 2:
                    FileOperations.copyFileContent(sc);
                    break;
                case 3:
                    FileOperations.modifyFileContent(sc);
                    break;
                case 4:
                    FileOperations.searchWordInFile(sc);
                    break;
                case 5:
                    ProductManager.copyTxtToCsv(sc);
                    break;
                case 6:
                    FileOperations.readFile(sc);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}

