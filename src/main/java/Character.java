abstract public class Character {
    private int hp;
    private int power;
    private String name;

    public Character() {
        this.hp = 1;
        this.power = 0;
        this.name = "Unknown Character";
    }


    @Override
    public String toString() {
        return this.getName() + "; power: " + this.getPower() + "; hp: " + (this.isAlive() ? this.getHp() : 0) + ";";
    }

    abstract void kick(Character c);

    public boolean isAlive() {
        return this.hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public Character setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getPower() {
        return power;
    }

    public Character setPower(int power) {
        this.power = power;
        return this;
    }

    public String getName() {
        return name;
    }

    public Character setName(String name) {
        this.name = name;
        return this;
    }
}