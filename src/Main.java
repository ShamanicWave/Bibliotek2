import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again;


        Bibliotek Bibblan = new Bibliotek("Bibblan", 0);

        Book b1 = new Book("Alfons", "Anna", "44", "55", true);
        Book b2 = new Book("Goldface", "Per", "86", "500", false);
        Book b3 = new Book("Jungel", "Tore", "23", "102", false);
        Book b4 = new Book("Sand", "Skog", "200", "12", false);




        ArrayList<Book> Books = new ArrayList<>();
        Books.add(b1);
        Books.add(b2);
        Books.add(b3);
        Books.add(b4);



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
                String title = input.nextLine();
                System.out.println("authour?");
                String authour = input.nextLine();
                System.out.println("Year?");
                String year = input.nextLine();
                System.out.println("edition?");
                String edition = input.nextLine();

                Book newBook = new Book(title, authour, year, edition, true);
                Books.add(newBook);

                System.out.println("The book is in the system now: " + Books);



            } else if (val.equals("2")) {
                System.out.println("What book are you looking for?");
                String bookSearch = input.nextLine();
                for (Book book : Books)  {
                    if (book.getTitle().equals(bookSearch)) {

                        System.out.println("Den boken finns!: ");


                    }
                    else {
                        System.out.println("Den boken finns inte.");
                    }

                }


            } else if (val.equals("3")) {



                for (Book Book : Books) {
                    System.out.println(Book);
                    //Book.greet();
                }

            } else if (val.equals("4")) {
                System.out.println("What book do you want to return?");
                String bookReturn = input.nextLine();

                for (Book book : Books) {
                    if (book.getTitle().equals(bookReturn)){
                        Books.add(book);

                        System.out.println("Boken är inne: " + Books);
                    }
                    else {
                        System.out.println("Boken finns redan");
                    }



                }



            } else if (val.equals("5")) {
                System.out.println("Press n to close the program");





            }
        System.out.println("Press j to go back or n to quit.");
            again = input.nextLine();


        }while (again.equals("j")) ;

        //Bibliotek Bibblan = new Bibliotek("Bibblan", 0 );

        //Book b1 = new Book("Alfons ", "Anna ", "46", "55", true);
        //Book b2 = new Book("Goldface ", "Per ", "86", "120", false);

        //Book p3 = p1;

        //System.out.println(Alfons.name);
        //p1.name = "Susan";

        //System.out.println(p1.name);
        //System.out.println(p3.name);


        //Book p4 = new Book();
        //System.out.println(p4.name);


       // p1.greet();
       // p4.greet();



           // ArrayList<Book> Books = new ArrayList<>();

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