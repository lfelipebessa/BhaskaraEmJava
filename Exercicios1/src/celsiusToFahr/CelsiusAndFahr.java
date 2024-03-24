package celsiusToFahr;

public class CelsiusAndFahr {
	public static void main(String[] args) {
		
		// C = (F*32)/(5/9)
		double celsius;
		int fahr;
		
		for(fahr=50; fahr<=65; fahr++) {
			celsius = (fahr-32)*5.0 / 9.0;
			
			System.out.printf("%d°F = %.2f°C%n", fahr, celsius);
		}
				
	}
}
