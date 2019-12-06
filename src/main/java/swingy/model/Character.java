package swingy.model;

import javax.validation.constraints.NotNull;

public class Character {
    @NotNull
    private String name;
    @NotNull
    private int health;
    @NotNull
    private int level;
    @NotNull
    private int XP;
    @NotNull
    private int attack;
    @NotNull
    private int block;

    public Character () {
    }

    public Character (String name, int health, int level, int XP, int attack, int block) {
        this.name = name;
        this.health = health;
        this.level = level;
        this.XP = XP;
        this.attack = attack;
        this.block = block;
    }

    public String setName(String name) {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}