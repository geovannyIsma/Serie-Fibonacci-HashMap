import java.util.*;

public class Fibonacci {
    private Map<Integer, Long> valorList;
    public Fibonacci() {
        this.valorList = new HashMap<Integer, Long>();
    }
    public long getFibonacci(int posicion) {
        if (posicion <= 1) {
            return posicion;
        }

        if (valorList.containsKey(posicion)) {
            return valorList.get(posicion);
        }

        long valor = getFibonacci(posicion - 1) + getFibonacci(posicion - 2);
        valorList.put(posicion, valor);
        return valor;
    }
    public Map<Integer, Long> getValorList() {
        return this.valorList;
    }
    public void setValorList(Map<Integer, Long> valorList) {
        this.valorList = valorList;
    }
}

