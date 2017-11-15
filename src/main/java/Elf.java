public class Elf extends Character {

    public Elf() {
        this.setHp(10);
        this.setPower(10);
        this.setName("Elf");
    }

    void kick(Character character) {
        if (character.getPower() < this.getPower()) {
            System.out.println(this.getName() + ": kills " + character.getName());
            character.setHp(0);
        } else {
            System.out.println(this.getName()+ ": reduce " + character.getName() + "'s power by 1");
            character.setPower(character.getPower() - 1);
        }
    }
}
