import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        boolean firsFighter = random.nextBoolean();

        if (firsFighter) {
            System.out.println("Muhammet Ali başlıyor!");
        } else {
            System.out.println("Mike Tyson başlıyor");
        }

        Fighter muhammetAli = new Fighter("Muhammet Ali", 15, 100, 90, 50);
        Fighter mikeTyson = new Fighter("Mike Tyson", 10, 95, 100, 50);

        Ring ring = new Ring(muhammetAli, mikeTyson, 90, 100);
        ring.run();
    }
}