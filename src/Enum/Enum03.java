package Enum;

public class Enum03 {
    public enum Rating{
        GREAT(5),
        GOOD(4),
        OK(3),
        BAD(2),
        TERRIBLE(1);

        private final int stars;

        Rating(int stars){
            this.stars = stars;
        }

        public int getStars() {
            return stars;
        }
    }
    public static void main(String[] args) {
        System.out.println(Rating.GOOD.getStars());;
    }
}
