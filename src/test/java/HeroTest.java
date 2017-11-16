import org.junit.Before;
import org.junit.Test;

import java.lang.Character;

import static org.junit.Assert.*;

public class HeroTest {

    class Recruit extends Hero{

        @Override
        void kick(Hero c) {

        }
    }

    private Hero h1 = new Recruit();
    private Hero h2 = new Recruit();

    @Before
    public void setUp() throws Exception {
        assertEquals(h1, h2);
        assertEquals(h1.setHp(100), h2.setHp(100));
        assertEquals(h1.setPower(100), h2.setPower(100));
        assertEquals(h1.setName("Juggernaut"), h2.setName("Juggernaut"));
    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Juggernaut; power: 100; hp: 100;", h1.toString());
    }

    @Test
    public void isAlive() throws Exception {
        assertEquals(true, h1.isAlive());
        h1.setHp(0);
        assertEquals(false, h1.isAlive());
    }


}