package tr.edu.maltepe.oop;

import java.util.Vector;

public class Sports_Center{

    private Vector present_people = new Vector();

    public void goToSportsCenter(Person person)
    {
        if(!present_people.contains(person)) {
            present_people.add(person);
            System.out.println(person.getName() + " is at the Sports Center.");
            return;
        }
        System.out.println(person.getName()+" is already at the Sports Center.");
    }

    public void leaveSportsCenter(Person person)
    {
        if(present_people.contains(person)) {
            present_people.remove(person);
            System.out.println(person.getName() + " has left the Sports Center.");
            return;
        }
        System.out.println(person.getName()+" cannot leave Sports Center because he/she is not here.");
    }

    public boolean isHere(Person person) {return present_people.contains(person);}
}

