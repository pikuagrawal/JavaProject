package Lecture11;
public class PomeranianDog extends Dog{
    @Override
    public void DogRun() {
        System.out.println("Pomeranian dog can run.");
    }
    public static void main(String[] args) {
        PomeranianDog pomeranianDog = new PomeranianDog();
        pomeranianDog.DogRun();
        pomeranianDog.DogEat();
        DogBark();
    }
}
