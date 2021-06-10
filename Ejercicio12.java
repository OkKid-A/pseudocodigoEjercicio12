import java.util.Scanner;

public class Ejercicio12{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double totalM = 0;
		double totalF = 0;
		double totalE = 0;
		double contM = 0;
		double contF = 0;
		double contE = 0;
		double altura = 0;
		do{
			System.out.println("\nIngresa tu edad");
			int edad = scanner.nextInt();
			System.out.println("\nIngresa tu sexo(F/M)");
			scanner.nextLine(	);
			String sexo = scanner.nextLine();
			System.out.println("\nIngresa tu altura");
			altura = scanner.nextDouble();
			if (altura > 0) {
				totalE += altura;
				contE++;
				if (sexo.equals("F")) {
					totalF += altura;
					contF++;
				} else {
					totalM += altura;
					contM++;
				}
			}
		} while (altura >= 0);
		double promedioM = totalM/contM;
		double promedioF = totalF/contF;
		double promedioE = totalE/contE;
		System.out.println("\nEl promedio de altura de mujeres es " + promedioF + ", el de hombres es " + promedioM + " y el total es " + promedioE);
 	}
}