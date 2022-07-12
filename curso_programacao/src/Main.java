import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner	sc = new Scanner(System.in);
		
		System.out.print("Insira a coordenada X: ");
		int x = sc.nextInt();
		
		System.out.print("Insira a coordenada Y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro quadrante.");
			}else if (x < 0 && y > 0) {
				System.out.println("segundo quadrante.");
			}else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante.");
			}else {
				System.out.println("quarto quadrante.");
			}
				
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
