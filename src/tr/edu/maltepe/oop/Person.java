package tr.edu.maltepe.oop;

import java.util.Vector;

public class Person implements do_sports{

    private String name;

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

    @Override
    public void swim(Sports_Center gym) {
        if(gym.isHere(this)) {
            System.out.println(this.name+" swims at the Sports Center");
            return;
        }
        System.out.println(this.name+" cannot swim because he/she is not at the Sports Center.");
    }

    @Override
    public void run() {

    }

    @Override
    public void play_football(Sports_Center gym) {
        if(gym.isHere(this)) {
            System.out.println(this.name+" plays football at the Sports Center");
            return;
        }
        System.out.println(this.name+" cannot play football because he/she is not at the Sports Center.");

    }
}
