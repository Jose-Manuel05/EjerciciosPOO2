package org.example.Festival;

public class AppConcierto {

    public static void main(String[] args) {

        Asistente a1 = null;
        Artista art1 = null;
        Organizador org1 = null;

        try {
            a1 = new Asistente("Carlos", 15, TipoEntrada.VIP);
            art1 = new Artista("Dua Lipa", 28, "Pop");
            org1 = new Organizador("Juan", 30, "Director");        } catch (edadMinimaException e) {
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }



        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println("Información del organizador:");
        org1.mostrarInfo();

        Persona[] personas = {
                new Asistente("Carlos", 15, TipoEntrada.GENERAL),
                new Artista("Dua Lipa", 28, "Pop"),
                new Organizador("Juan", 30, "Director")
        };

        for (Persona p : personas) {
            org1.mostrarInfo();
            if (p instanceof Organizable) {
                ((Organizable) p).organizarEvento();
            }
        }

        for (TipoEntrada entrada : TipoEntrada.values()) {
            System.out.println("Entrada de tipo: " + entrada + " con precio " + entrada.getPrecio() + "€");
        }

    }

    public static void mostrarAcceso(Persona persona) {

    }

}
