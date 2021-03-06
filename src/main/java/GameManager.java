class GameManager {
    static void fight(Hero c1, Hero c2) {

        System.out.println("\nFirst character " + c1);
        System.out.println("\tversus");
        System.out.println("Second character " + c2);

        int turn = 0;
        int turnsLimit = 10;

        while (true) {
            System.out.println("\n-----------------\nturn " + ++turn + ":\n");

            c1.kick(c2);
            c2.kick(c1);
            System.out.println("--");
            System.out.println(c1);
            System.out.println(c2);

            if ((!c1.isAlive() && !c2.isAlive()) || turn == turnsLimit) {
                System.out.println("\n-----------------\n");
                System.out.println("Tie! turns: " + turn);
                break;
            } else if (!c1.isAlive()) {
                System.out.println("\n-----------------\n");
                System.out.println("Second character " + c2.getName() + " won, congratulations\nturns: " + turn);
                break;
            } else if (!c2.isAlive()) {
                System.out.println("\n-----------------\n");
                System.out.println("First character " + c1.getName() + " won, congratulations\nturns: " + turn);
                break;
            }


        }

    }

}
