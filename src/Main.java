import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;


        do {


            System.out.println("1. Add a book to the library.");
            System.out.println("2. Search for a book by name.");
            System.out.println("3. List all available books.");
            System.out.println("4. Return book.");
            System.out.println("5. Quit");

            System.out.println("Skriv ditt val: ");

            String val = input.nextLine();


            if (val.equals("1")) {
                System.out.println("What book would you like to add?");


            } else if (val.equals("2")) {
                System.out.println("What book are you looking for?");


            } else if (val.equals("3")) {
                Bibliotek Bibblan = new Bibliotek("Bibblan", 0);

                Book Alfons = new Book("Alfons ", "Anna ", 44, 55, true);
                Book Goldface = new Book("Goldface ", "Per ", 86, 120, false);


                ArrayList<Book> Books = new ArrayList<>();

                Books.add(Alfons);
                Books.add(Goldface);
                //Books.add(p3);
                //Books.add(p4);

                for (Book Book : Books) {
                    System.out.println(Book);
                    //Book.greet();
                }

            } else if (val.equals("4")) {

            } else if (val.equals("5")) {

            }
        System.out.println("Press j to go back.");
            again = input.nextLine();


        }while (again.equals("j")) ;

        //Bibliotek Bibblan = new Bibliotek("Bibblan", 0 );

        Book Alfons = new Book("Alfons ", "Anna ", 44, 55, true);
        Book Goldface = new Book("Goldface ", "Per ", 86, 120, false);

        //Book p3 = p1;

        //System.out.println(Alfons.name);
        //p1.name = "Susan";

        //System.out.println(p1.name);
        //System.out.println(p3.name);


        //Book p4 = new Book();
        //System.out.println(p4.name);


       // p1.greet();
       // p4.greet();



            ArrayList<Book> Books = new ArrayList<>();

            //Books.add(Alfons);
            //Books.add(Goldface);
            //Books.add(p3);
            //Books.add(p4);

           // for (Book Book : Books) {
            //    System.out.println(Book);
                //Book.greet();

           // }




    }
}