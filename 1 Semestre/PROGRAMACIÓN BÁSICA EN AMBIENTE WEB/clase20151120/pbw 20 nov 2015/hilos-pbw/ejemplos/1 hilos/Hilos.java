public class Hilos {

    public static void main(String[] args) {
        System.out.println("Dentro de main...");
        HiloNuevo hn = new HiloNuevo();
        Thread nuevoHilo = new Thread(hn);
        nuevoHilo.start();
    }
}

class HiloNuevo implements Runnable {

    public HiloNuevo() {
        System.out.println("Comenzando un HiloNuevo...");

    }

    public void run() {
        System.out.println("Llamando al metodo run de HiloNuevo...");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("Terminando el trabajo...");
    }
}
