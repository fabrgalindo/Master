
public class Hilos2 {

    public static void main(String[] args) {
        HiloNuevo hn = new HiloNuevo();
        Thread uno = new Thread(hn);
        Thread dos = new Thread(hn);
        Thread tres = new Thread(hn);
        uno.setName("Luis");
        dos.setName("Carlos");
        tres.setName("Maria");
        uno.start();
        dos.start();
        tres.start();
    }
}

class HiloNuevo implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Comenzado por " + Thread.currentThread().getName() + ", i = " + i);
        }
    }
}
