 public class Main {
    public static void main(String[] args) {
        System.out.println();
        Ironman h1 = new Ironman();
        h1.setName("Ironman");
        h1.setAge("40");
        h1.displayHero();
        h1.skill("Shooting");
        h1.weapon("Armor");
        h1.moving("Fly");
        h1.jumping("4 meter");
        h1.setNation("America");

        System.out.println();
        Thor h2 = new Thor();
        h2.setName("Thor");
        h2.setAge("100");
        h2.displayHero();
        h2.skill("Thunderbolt");
        h2.weapon("Hummer");
        h2.moving("Fly and Run");
        h2.jumping("5 meter");
        h2.setNation("Asakan");

        System.out.println();
        SpiderMan h3 = new SpiderMan();
        h3.setName("SpiderMan");
        h3.setAge("21");
        h3.displayHero();
        h3.skill("Power spider");
        h3.weapon("Spider web");
        h3.moving("Hung and Run");
        h3.jumping("4 meter");
        h3.setNation("America");

    }
}