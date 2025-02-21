package org.example.EjerciciosTeoria.Enum.Execpciones;

public class Nivel_Valido_Exception extends Exception{

    public Nivel_Valido_Exception() {
        super("El nivel no puede ser mayor a 100");
    }

}
