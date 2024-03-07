public class Bat extends Mammal {
    public void fly() {
        System.out.println("The bat is flying!");
        energy -= 50;
    }
    public void eatHumans() {
        System.out.println("The bat is satisfied!");
        energy += 25;
    }
    public void attackTown() {
        System.out.println("The bat has attacked a town!");
        energy -= 100;
    }
}
