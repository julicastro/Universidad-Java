package clases;

public class Pregunta {

    public static void main(String[] args) {

        Boolean decision = new Boolean(false);

        imprimirResultado(decision);

        cambiarResultado(decision);

        imprimirResultado(decision);

    }

    public static void cambiarResultado(Boolean decision) {
        //decision = true;
        decision = new Boolean(true);
    }

       

    public static void imprimirResultado(Boolean decision) {
        System.out.println(decision);
    }
}