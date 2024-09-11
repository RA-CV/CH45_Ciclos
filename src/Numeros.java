
public class Numeros {

	public static void main(String[] args) {
		int max = 3;
        int repetirNum = 1;
        do {
            int serie = 1;
            do {
                System.out.println(repetirNum + " " + serie);
                serie++;
            } while (serie <= max);
            repetirNum++;
        } while (repetirNum <= max);
	}//main

}//classNumeros
