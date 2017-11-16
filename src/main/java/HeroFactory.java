import java.util.Random;

class HeroFactory {


    static Hero createHero() {
        Hero[] heroes = {new Elf(), new King(), new Knight(), new Hobbit()};
        int index = new Random().nextInt(4);
        return heroes[index];
    }

}