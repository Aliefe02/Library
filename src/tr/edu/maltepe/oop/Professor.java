package tr.edu.maltepe.oop;

import java.util.Vector;

public class Professor {
    private String name;
    private int flag;

    Professor(String name)
    {
        this.name=name;
    }

    private Vector professor_bag = new Vector();

    public String getName() {return this.name;}

    public void addBook(Book book) {professor_bag.add(book);}

    public void return_book(Library library, Book book_to_return)
    {
        flag = professor_bag.indexOf(book_to_return);

        if(flag==-1)
        {
            System.out.println(this.name+" doesn't have "+book_to_return.getName()+".");
        }

        else {
            library.addBook((Book) professor_bag.get(flag));
            System.out.println(book_to_return.getName()+" is returned to the "+library.getName());
            professor_bag.remove(flag);
        }
    }
}
