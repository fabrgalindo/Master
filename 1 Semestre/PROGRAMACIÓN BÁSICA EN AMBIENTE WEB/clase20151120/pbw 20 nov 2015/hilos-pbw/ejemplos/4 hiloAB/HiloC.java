public class HiloC{

    public HiloC() {
    }

    public static void main(String[] args) {
        HiloB c = new HiloB();
        c.start();

        synchronized (c) {
            try {
                System.out.println("Esperando a que C se complete...");
                c.wait();
            } catch (Exception ex) {
            }

            System.out.println("Total:" + c.total);
        }
    }
}

class HiloB extends Thread {

    long total=0;

    public void run() {
        synchronized (this) {

            for (long i = 0; i < 1000000000; i++) {

                total++;
            }
            System.out.println("Terminado HiloB.....y total es "+ total);
            notify();
        }

    }
}
