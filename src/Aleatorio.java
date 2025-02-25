import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10)); //0 a 9
        System.out.println(10 + random.nextInt(10)); //10 a 19

        System.out.println(random.nextDouble());//0 a 1
        System.out.println(100 + 100*random.nextDouble()); //100 a 200
    }
}
