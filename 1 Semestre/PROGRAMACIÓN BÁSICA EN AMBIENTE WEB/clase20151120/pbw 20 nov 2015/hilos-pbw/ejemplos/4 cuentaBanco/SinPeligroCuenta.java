class CuentaBanco {

    private float balance = 300;

    public float getBalance() {
        return balance;
    }

    public void retiroBancario(int retiro) {
        balance = balance - retiro;
    }
}

public class SinPeligroCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();

    public void run() {
        for (int x = 0; x < 3; x++) {
			 // System.out.println(Thread.currentThread().getName() + " intenta retiro");
            hacerRetiro(20);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                System.out.println("Error");
                System.out.println(ex);
            }
            if (cb.getBalance() < 0) {
                System.out.println("La cuenta esta sobregirada.");
            }
        }
    }

private synchronized void hacerRetiro(int cantidad) {
        if (cb.getBalance() >= cantidad) {
            System.out.println(Thread.currentThread().getName() + " va a hacer un retiro.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            cb.retiroBancario(cantidad);
            System.out.println(Thread.currentThread().getName() + " realizo el retiro con exito.");
            System.out.println("El saldo actual es de " + cb.getBalance());
        } else {
            System.out.println("No hay suficiente dinero para el retiro de " + Thread.currentThread().getName());
            // System.out.println("su saldo actual es de " + cb.getBalance());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SinPeligroCuenta pl = new SinPeligroCuenta();
        Thread uno = new Thread(pl);
        Thread dos = new Thread(pl);
        Thread tres = new Thread(pl);
        Thread cuatro = new Thread(pl);
        Thread cinco = new Thread(pl);
        Thread seis = new Thread(pl);
        uno.setName("Luis");
        dos.setName("Manuel");
        tres.setName("Alberto");
        cuatro.setName("Juan");
        cinco.setName("Maria");
        seis.setName("Teresa");


        uno.start();
        dos.start();
        tres.start();
        cuatro.start();
        cinco.start();
        seis.start();

    }
}