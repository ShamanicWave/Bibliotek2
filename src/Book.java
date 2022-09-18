public class Book {




    // Klass är en mall av ett objekt

    String title;                    // Instansvariabler
    String authour;
    String year;
    String edition;
    boolean status;






    public Book(String title)  {
        this.title = "--";
        this.authour = "--";
        this.year = "--";
        this.edition = "--";
        this.status = true;
    }

    public Book(String title, String authour, String year, String edition, boolean status ) {   // Konstruktör
        this.title = title;
        this.authour = authour;
        this.year = year;
        this.edition = edition;
        this.status = status;

    }
    public String getTitle() {
        return title;
    }

    public void greet() {   //Metoder
        System.out.println("Hej jag heter " + this.title);
    }

    public String toString() {
        return "Name: " + this.title +
                " Författare: " + this.authour +
                " År " + this.year + "Upplaga " + this.edition + "Status " + this.status;
    }



}
