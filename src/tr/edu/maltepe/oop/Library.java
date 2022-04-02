package tr.edu.maltepe.oop;

import java.util.Vector;

public class Library{

    private String name;

    private int flag;

    Library(String name)
    {
        this.name=name;
    }

    private Vector books = new Vector();

    public void addBook(Book new_book) {books.add(new_book);}

    public void lend_book(Book book_to_lend,Person person)
    {
        flag = books.indexOf(book_to_lend);

        if(flag!=-1) {
            person.addBook(book_to_lend);
            books.remove(book_to_lend);
            System.out.println(book_to_lend.getName()+" is lent to "+person.getName());
        }
        else{
            System.out.println(book_to_lend.getName()+" is not available.");
        }
    }
    public String getName() {return this.name;}
}
