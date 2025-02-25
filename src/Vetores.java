public class Vetores { //arrays
    public static void main(String[] args) {
        int[] variavel = new int[4];
        variavel[1] = 4;
        System.out.println(variavel[1]);

        int[] variaveis = {4,3,2};
        for (int v:variaveis){
            System.out.println(v);
        }

        System.out.println("Tamanho da array variaveis: " + variaveis.length);

        int[][] arr = new int[4][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        System.out.print("Soma do valor na posicao [0][0] e [0][1] de arr: " + (arr[0][0] + arr[0][1]) + ".");
    }
}
