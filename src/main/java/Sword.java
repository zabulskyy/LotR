import java.util.Random;

public class Sword implements KickInterface {
    public void kick(Character c1, Character c2) {
        c2.setHp(c2.getHp() - c1.getPower() + new Random().nextInt(5));
    }
}
