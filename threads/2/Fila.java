import java.util.*;

public class Fila {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
    }

    public synchronized void adicionar(int itemProduzido) {
        while (queue.size() == capacidade) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        queue.add(itemProduzido);
        System.out.println("Produtor produziu: " + itemProduzido);
        notifyAll();
    }

    public synchronized int retirar() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int itemConsumido = queue.poll();
        System.out.println("Consumidor consumiu: " + itemConsumido);
        notifyAll();
        return itemConsumido;
    }
}