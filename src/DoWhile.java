public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        do { //esse foi executado, pois a verificacao acontece depois do comando "do"
            System.out.println(i);
            i++;
        } while (i<1);

        while(j<1){
            System.out.println(j);
            j++;
        }

    }
}
