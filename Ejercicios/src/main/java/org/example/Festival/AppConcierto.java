package org.example.Festival;

public class AppConcierto {

    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador org1 = new Organizador("Juan", 30, "Director");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println("Información del organizador:");
        org1.mostrarInfo();

        Persona[] personas = {
                new Asistente("Carlos", 25, "VIP"),
                new Artista("Dua Lipa", 28, "Pop"),
                new Organizador("Juan", 30, "Director")
        };

        for (Persona p : personas) {
            org1.mostrarInfo();
            if (p instanceof Organizable) {
                ((Organizable) p).organizarEvento();
            }
        }

    }

    public static void mostrarAcceso(Persona persona) {

    }

}
