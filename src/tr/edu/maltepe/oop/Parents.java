package tr.edu.maltepe.oop;

public class Parents extends Person{
    private Person child;
    Parents(String name,Person child)
    {
        this.setName(name);
        this.child = child;
    }

    @Override
    public void swim(Sports_Center gym){
        System.out.println(this.getName()+" cannot swim because parents are not allowed to swim here!");
    }
    @Override
    public void run(){
        System.out.println(this.getName()+" goes for a run");
    }
    @Override
    public void play_football(Sports_Center gym){
        if(gym.isHere(this)) {
            System.out.println(this.getName() + " plays football with his/hers child " + this.child.getName() + ".");
            return;
        }
        System.out.println(this.getName()+" is not at the gym!");
    }
}
