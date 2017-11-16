class King extends Hero {
    private KickInterface kickInterface = new Sword();

    King(){
        this.setHp(25);
        this.setPower(20);
        this.setName("King");
    }

    @Override
    void kick(Hero c) {
        if (c.getHp() < 10)
            kickInterface = (c1, c2) -> c2.setHp(0);
        kickInterface.kick(this, c);
    }
}
