
public class Triángulo {
    public static void main(String[] args) {
        int filas = 6; // Para ajustar el número de filas aquí

        for (int trianguloFila = 1; trianguloFila <= filas; trianguloFila++) {
            for (int numAsteriscos = 1; numAsteriscos <= trianguloFila; numAsteriscos++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }//main
}// class Triángulo
