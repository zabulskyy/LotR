class Knight extends Hero {
    private KickInterface kickInterface = new Sword();

    Knight() {
        this.setHp(15);
        this.setPower(10);
        this.setName("King");
    }

    @Override
    void kick(Hero c) {
        if (c.getHp() < 10)
            kickInterface = (c1, c2) -> c2.setHp(0);
        kickInterface.kick(this, c);
    }
}
