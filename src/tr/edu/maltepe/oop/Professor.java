package tr.edu.maltepe.oop;

public class Professor extends Person implements do_sports{

    Professor(String name)
    {
        setName(name);
    }

    public void eat()
    {
        System.out.println(this.getName()+" eats his lunch at his office.");
    }

    @Override
    public void work() {System.out.println(this.getName()+" works at university.");}

    @Override
    public void swim(Sports_Center gym) {
        if(gym.isHere(this)) {
            System.out.println(this.getName()+" swims at the Sports Center");
            return;
        }
        System.out.println(this.getName()+" cannot swim because he/she is not at the Sports Center.");
    }

    @Override
    public void play_tennis(Sports_Center gym) {
        if(gym.isHere(this))
        {
            System.out.println(this.getName()+" plays tennis.");
            return;
        }
        System.out.println(this.getName()+" is not at the Sports Center!");
    }

    @Override
    public void play_football(Sports_Center gym) {
        if(gym.isHere(this)) {
            System.out.println(this.getName()+" plays football at the Sports Center");
            return;
        }
        System.out.println(this.getName()+" cannot play football because he/she is not at the Sports Center.");

    }
}
