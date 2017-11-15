public class Hobbit extends Character {
    void kick(Character c) {
        System.out.println(this.getName() + ": Qua qua qua");
    }

    Hobbit(){
        this.setHp(3);
        this.setPower(0);
        this.setName("Hobbit");
    }
}
