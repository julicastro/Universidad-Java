package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        for (Object elemento : miLista) {
            System.out.println("elemento = " + elemento);
        }

        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }
}
