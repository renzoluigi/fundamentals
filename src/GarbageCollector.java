import Coleções.Maps.Consumidor;

public class GarbageCollector {
    public static void obterMemoriaUtilizada(){
        final int MB = 1024*1024; // constante para transformar bytes em mb, pois o valor informado por runtime é em bytes
        Runtime runtime = Runtime.getRuntime(); // Padrão singleton
        System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
    }
    public static void main(String[] args) {
        Consumidor[] consumidores = new Consumidor[35000000];
        for (int i=0;i<consumidores.length;i++){
            Consumidor consumidor = new Consumidor("Consumidor"+1);
            consumidores[i] = consumidor;
        }
        System.out.println("Contatos criados");

        obterMemoriaUtilizada();

        consumidores = null;
        Runtime.getRuntime().gc();

        System.out.println(consumidores);

        obterMemoriaUtilizada();
    }
}
