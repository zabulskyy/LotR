public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            GameManager.fight(HeroFactory.createHero(), HeroFactory.createHero());
        }
    }
}
