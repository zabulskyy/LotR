abstract public class Hero {
    private int hp;
    private int power;
    private String name;

    public Hero() {
        this.hp = 1;
        this.power = 0;
        this.name = "Unknown Hero";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hero)) return false;
        Hero hero = (Hero) o;
        return hero.getHp() == this.getHp()
                && hero.getPower() == this.getPower()
                && hero.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return this.getName() + "; power: " + this.getPower() + "; hp: " + (this.isAlive() ? this.getHp() : 0) + ";";
    }

    abstract void kick(Hero c);

    boolean isAlive() {
        return this.hp > 0;
    }

    int getHp() {
        return hp;
    }

    Hero setHp(int hp) {
        this.hp = hp;
        return this;
    }

    int getPower() {
        return power;
    }

    Hero setPower(int power) {
        this.power = power;
        return this;
    }

    String getName() {
        return name;
    }

    Hero setName(String name) {
        this.name = name;
        return this;
    }
}