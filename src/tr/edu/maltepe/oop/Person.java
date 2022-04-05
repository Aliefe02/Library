package tr.edu.maltepe.oop;

import java.util.Vector;

public abstract class Person{

    private String name;

    public abstract void eat();

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    private int flag;

    private Vector bag = new Vector<>();

    public void addBook(Book book) {bag.add(book);}

    public void return_book(Library library, Book book_to_return)
    {
        flag = bag.indexOf(book_to_return);

        if(flag==-1)
        {
            System.out.println(this.name+" doesn't have "+book_to_return.getName()+".");
        }

        else {
            library.addBook((Book) bag.get(flag));
            System.out.println(book_to_return.getName()+" is returned to the "+library.getName());
            bag.remove(flag);
        }
    }

    public void work(){
        System.out.println(this.name+" works.");
    }

}
