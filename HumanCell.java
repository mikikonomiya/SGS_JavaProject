import java.util.ArrayList;

class HumanCell extends Character {

    public static int humanCellCount=0;
    public static int deadHumanCell=0;

    public void killedCount(){
        deadHumanCell+=1;
    }

    public HumanCell(int age, int hp) {
        super(age, hp, "Human Cell",1);
        humanCellCount+=1;

    }

    public void update() {
        super.update();
        if (age > 5 && hp > 70) {
            reproduce();
        }
    }

    void reproduce() {
        ArrayList<Character> temporarylist = new ArrayList<>();
        temporarylist.add(new HumanCell(0, 100));
        temporarylist.add(new HumanCell(0, 100));

        Game.addGroup(temporarylist);
        Game.kill(this);

    }
}