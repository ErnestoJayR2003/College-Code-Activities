import java.util.Scanner;

public class Main {
    
    String author1, author2, author3, author4;
    String title1, title2, title3, title4;
    int price1, price2, price3, price4;
    int bookId1, bookId2, bookId3, bookId4;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main book = new Main();

        System.out.println("\tLibrary Management System");
        border();
        //sequential
        System.out.println("\tEnter the details of the 4 Books:");
        System.out.println("\t\tBookID");
        System.out.println("\t\tTitle");
        System.out.println("\t\tAuthor");
        System.out.println("\t\tPrice");
        border();

        //book 1
        System.out.println("\t\tBook 1");
        System.out.print("Enter Book ID: ");
        book.bookId1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Title: ");
        book.title1 = scan.nextLine();
        System.out.print("Enter Author: ");
        book.author1 = scan.nextLine();
        System.out.print("Enter Price: ");
        book.price1 = scan.nextInt();
        border();

        //book 2
        System.out.println("\t\tBook 2");
        System.out.print("Enter Book ID: ");
        book.bookId2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Title: ");
        book.title2 = scan.nextLine();
        System.out.print("Enter Author: ");
        book.author2 = scan.nextLine();
        System.out.print("Enter Price: ");
        book.price2 = scan.nextInt();
        border();

        //book 3
        System.out.println("\t\tBook 3");
        System.out.print("Enter Book ID: ");
        book.bookId3 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Title: ");
        book.title3 = scan.nextLine();
        System.out.print("Enter Author: ");
        book.author3 = scan.nextLine();
        System.out.print("Enter Price: ");
        book.price3 = scan.nextInt();
        border();

        //book 4
        System.out.println("\t\tBook 4");
        System.out.print("Enter Book ID: ");
        book.bookId4 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Title: ");
        book.title4 = scan.nextLine();
        System.out.print("Enter Author: ");
        book.author4 = scan.nextLine();
        System.out.print("Enter Price: ");
        book.price4 = scan.nextInt();
        border();

        //menu(selection)
        while (true) {
            System.out.println("\t\tMenu: ");
            System.out.println("\tPlease select from the number 1 to 4 only");
            System.out.println("\t[1] View All Books by Author");
            System.out.println("\t[2] View All Books by Title");
            System.out.println("\t[3] View All Books Price by ID");
            System.out.println("\t[4] Exit");
            System.out.print("\tEnter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    border();
                    book.author();
                    border();
                    break;
                case 2:
                    border();
                    book.title();
                    border();
                    break;
                case 3:
                    border();
                    book.price();
                    border();
                    break;
                case 4:
                    border();
                    System.out.println("\t\tExiting the Program...");
                    border();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid number. Please choose 1 to 4 only.");
                    border();
                    break;
            }
        }
    }

    //modular
    public void author() {
        System.out.println("\t\tAuthors of the 4 Books:");
        System.out.println("\t1. " + author1);
        System.out.println("\t2. " + author2);
        System.out.println("\t3. " + author3);
        System.out.println("\t4. " + author4);
    }

    public void title() {
        System.out.println("\t\tTitles of the 4 Books:");
        System.out.println("\t1. " + title1);
        System.out.println("\t2. " + title2);
        System.out.println("\t3. " + title3);
        System.out.println("\t4. " + title4);
    }

    public void price() {
        System.out.println("\t\tPrices of the 4 Books:");
        System.out.println("\t1. Book ID: " + bookId1 + " | Price: " + price1);
        System.out.println("\t2. Book ID: " + bookId2 + " | Price: " + price2);
        System.out.println("\t3. Book ID: " + bookId3 + " | Price: " + price3);
        System.out.println("\t4. Book ID: " + bookId4 + " | Price: " + price4);
    }
    
    public static void border(){
        System.out.println("====================================================");
      }
}