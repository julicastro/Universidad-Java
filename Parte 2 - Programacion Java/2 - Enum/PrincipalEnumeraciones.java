package test;

import enumeraciones.PaisesContinentes;

//clase PrincipalEnumeraciones.
public class PrincipalEnumeraciones {

    public static void main(String[] args) {
        imprimirEjemplo();
    }

    public static void imprimirEjemplo() {
        for (PaisesContinentes c : PaisesContinentes.values()) {
            System.out.println("el continente es: " + c.name() + " contiene a " + c );
        }
    }
}
