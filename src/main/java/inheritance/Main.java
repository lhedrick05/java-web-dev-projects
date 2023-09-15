public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat plainCat = new Cat(8.6) {
            @Override
            public String noise() {
                return "Meeeoooowwww";
            }
        };
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        System.out.println(plainCat.noise());
        System.out.println(cheshireCat.noise());

        Cat salem = new Cat(8) {
            @Override
            public String noise() {
                return "Meeeoooowwww";
            }
        };

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());

        System.out.println(((HouseCat) suki).isSatisfied());
    }
}
