package tr.edu.maltepe.oop;

import java.util.Vector;

public class Student {

    private String name;
    private int flag;

    Student(String name)
    {
        this.name=name;
    }

    private Vector student_bag = new Vector();

    public String getName() {return this.name;}

    public void addBook(Book book) {student_bag.add(book);}

    public void return_book(Library library, Book book_to_return)
    {
        flag = student_bag.indexOf(book_to_return);

        if(flag==-1)
        {
            System.out.println(this.name+" doesn't have "+book_to_return.getName()+".");
        }

        else {
            library.addBook((Book) student_bag.get(flag));
            System.out.println(book_to_return.getName()+" is returned to the "+library.getName());
            student_bag.remove(flag);
        }
    }
}
