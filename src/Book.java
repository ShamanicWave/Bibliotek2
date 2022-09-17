public class Book {               // Klass är en mall av ett objekt

    String name;                    // Instansvariabler
    String forfattare;
    int ar;
    int upplaga;
    boolean status;


    public Book()  {
        this.name = "--";
        this.forfattare = "--";
        this.ar = 0;
        this.upplaga = 0;
        this.status = true;
    }

    public Book(String name, String forfattare, int ar, int upplaga, boolean status ) {   // Konstruktör
        this.name = name;
        this.forfattare = forfattare;
        this.ar = ar;
        this.upplaga = upplaga;
        this.status = status;

    }

    public void greet() {   //Metoder
        System.out.println("Hej jag heter " + this.name);
    }

    public String toString() {
        return "Name: " + this.name +
                " Författare: " + this.forfattare +
                " År " + this.ar + "Upplaga " + this.upplaga + "Status " + this.status;
    }



}
