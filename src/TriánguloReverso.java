
public class TriánguloReverso {
    public static void main(String[] args) {
        int filas = 6; // Puedes ajustar el número de filas aquí
        int trianguloFila = filas;

        while (trianguloFila > 0) {
            int numAsteriscos = 0;
            while (numAsteriscos < trianguloFila) {
                System.out.print("*");
                numAsteriscos++;
            }
            System.out.println();
            trianguloFila--;
        }
    }//main
}//class Triangulo al revés
