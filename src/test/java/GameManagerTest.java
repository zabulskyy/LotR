import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    @Test
    public void fight() throws Exception {
        GameManager gm = new GameManager();
        HeroFactory hf = new HeroFactory();


        Hero hobbit = new Hobbit();
        Hero elf = new Elf();
        Hero knight = new Knight();
        Hero king = new King();

        GameManager.fight(elf, hobbit);
        GameManager.fight(hobbit, hobbit);
        GameManager.fight(knight, king);

        GameManager.fight(HeroFactory.createHero(), HeroFactory.createHero());
    }

}