public class TestBG {
    public static void main(String[] args){
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();

        for (int i = 0; i < 3; i++) {
            gorilla.throwSomething();
            bat.attackTown();
        }
        for (int i = 0; i < 2; i++) {
            gorilla.eatBananas();
            bat.eatHumans();
            bat.fly();
        }
        gorilla.climb();
        gorilla.displayEnergy();
        bat.displayEnergy();
    };
}
