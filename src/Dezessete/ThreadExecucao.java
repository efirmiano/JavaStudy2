package Dezessete;

public class ThreadExecucao extends Thread{

    public void run(){
        System.out.println("Algo Executando em TreadExecucao");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
