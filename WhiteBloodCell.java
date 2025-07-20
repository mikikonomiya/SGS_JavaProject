import java.util.ArrayList;

class WhiteBloodCell extends Character {

    public static int whiteBloodCellCount=0;
    public static int deadWbs=0;

    public void killedCount(){
        deadWbs+=1;
    }

    public WhiteBloodCell(int age, int hp) {
        super(age, hp, "White Blood Cell",0);
        whiteBloodCellCount +=1;

    }

    public void update() {
        super.update();
        if (age > 5 && hp > 100) {
            reproduce();
        }
    }

    void reproduce() {
        ArrayList<Character> temporarylist = new ArrayList<>();
        temporarylist.add(new WhiteBloodCell(0, 100));
        temporarylist.add(new WhiteBloodCell(0, 100));

        Game.addGroup(temporarylist);
        Game.kill(this);

    }
}