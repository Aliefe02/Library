package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Book java = new Book("Java");
        Book c = new Book("C");
        Book python = new Book("Python");

        Library maltepelibrary = new Library("Maltepe Library");

        maltepelibrary.addBook(java);
        maltepelibrary.addBook(c);
        maltepelibrary.addBook(python);

        Professor professor= new Professor("Professor Ensar");

        Student student = new Student("Ali");


        maltepelibrary.lend_book(java,student);
        maltepelibrary.lend_book(java,student);
        maltepelibrary.lend_book(c,professor);
        maltepelibrary.lend_book(c,student);
        maltepelibrary.lend_book(python,student);
        maltepelibrary.lend_book(python,student);
        student.return_book(maltepelibrary,java);
        student.return_book(maltepelibrary,java);
        professor.return_book(maltepelibrary,java);
        professor.return_book(maltepelibrary,python);
        professor.return_book(maltepelibrary,c);
        student.return_book(maltepelibrary,c);
        student.return_book(maltepelibrary,python);
        student.return_book(maltepelibrary,python);


    }
}
