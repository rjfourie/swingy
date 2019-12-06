package swingy.model;

public class Wolverine extends Character{

    public Wolverine(String name) {

    }

    @Override
    public String setName(String name) {
        super.setName(name);
        return name;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(100);
    }

    @Override
    public void setAttack(int attack) {
        super.setAttack(175);
    }

    @Override
    public void setBlock(int block) {
        super.setBlock(50);
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(1);
    }

    @Override
    public void setXP(int XP) {
        super.setXP(500);
    }
}
