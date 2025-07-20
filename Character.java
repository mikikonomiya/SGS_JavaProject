import java.util.ArrayList;

abstract class Character {
    public int age;
    public int hp;
    public String type;
    public final int index;

    public Character(int age, int hp, String type,int index ) { //constrvctor
        this.age = age;
        this.hp = hp;
        this.type = type;
        this.index=index;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void update() {
        this.age++;
        fightOrFlight(this);
        if (this.hp<=0 || age>=10){
            Game.kill(this);}
    }

    public void fightOrFlight( Character character) {
        for (Character friends : Game.characters) {
            if (friends != character) {
                int hpchange = Relationships.powerCalculator(character, friends);
                character.setHp(character.hp + hpchange);
            }
        }
    }

    public abstract void killedCount();
}