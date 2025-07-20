import java.util.ArrayList;

class Bacteria extends Character {

    public static int bacteriaCount=0;
    public static int deadBacteria=0;

    public void  killedCount(){
        deadBacteria+=1;
    }

    public Bacteria(int age, int hp ) {

        super(age, hp, "Bacteria",2);
        bacteriaCount+=1;

    }

    public void update() {
        super.update();
        if (age > 5 && hp > 100) {
            reproduce();
        }

    }

    void reproduce() {
        ArrayList<Character> temporarylist = new ArrayList<>();
        temporarylist.add(new Bacteria(0, 100));
        temporarylist.add(new Bacteria(0, 100));

        Game.addGroup(temporarylist);
        Game.kill(this);

    }
}