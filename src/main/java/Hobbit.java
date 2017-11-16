class Hobbit extends Hero {
    void kick(Hero c) {
        System.out.println(this.getName() + ": Qua qua qua");
    }

    Hobbit(){
        this.setHp(3);
        this.setPower(0);
        this.setName("Hobbit");
    }
}
