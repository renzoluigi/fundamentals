public class NullEmpty {
    public static void main(String[] args) {
        String vazia = "";
        String nula = null;

        System.out.println(vazia.isEmpty());//true
        //System.out.println(nula.isEmpty());

        System.out.println(vazia == null);//false
        System.out.println(nula == null);//true
    }
}
