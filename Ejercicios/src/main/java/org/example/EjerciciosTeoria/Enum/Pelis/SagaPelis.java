package org.example.EjerciciosTeoria.Enum.Pelis;

public enum SagaPelis {

    HARRY_POTTER(8),CREPUSCULO(4),SPIDERMAN(12),A_TODO_GAS(12),SHREK(6);

    private int numPelis;

    SagaPelis(int numPelis) {
        this.numPelis = numPelis;
    }

    public int getNumPelis() {
        return numPelis;
    }

    public void setNumPelis(int numPelis) {
        this.numPelis = numPelis;
    }

}
