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

    public void lend_book(Book book_to_lend,Student student)
    {
        flag = books.indexOf(book_to_lend);

        if(flag!=-1) {
            student.addBook(book_to_lend);
            books.remove(book_to_lend);
            System.out.println(book_to_lend.getName()+" is lent to "+student.getName());
        }
        else{
            System.out.println(book_to_lend.getName()+" is not available.");
        }
    }
    public void lend_book(Book book_to_lend,Professor professor)
    {
        flag = books.indexOf(book_to_lend);

        if(flag!=-1) {
            professor.addBook(book_to_lend);
            books.remove(book_to_lend);
            System.out.println(book_to_lend.getName()+" is lent to "+professor.getName());
        }
        else{
            System.out.println(book_to_lend.getName()+" is not available.");
        }
    }

    public String getName() {return this.name;}


}
