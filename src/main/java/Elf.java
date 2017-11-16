class Elf extends Hero {

    Elf() {
        this.setHp(10);
        this.setPower(10);
        this.setName("Elf");
    }

    void kick(Hero hero) {
        if (hero.getPower() < this.getPower()) {
            System.out.println(this.getName() + ": kills " + hero.getName());
            hero.setHp(0);
        } else {
            System.out.println(this.getName()+ ": reduce " + hero.getName() + "'s power by 1");
            hero.setPower(hero.getPower() - 1);
        }
    }
}
