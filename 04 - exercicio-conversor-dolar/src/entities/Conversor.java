package entities;

public class Conversor {

	public static double dolarConvertido (double dolar, double reais) {
		return dolar * reais;
	}
	
	public static double totalImposto(double dolar, double reais) {
		return dolarConvertido (dolar, reais)  * 1.06;
	}
	
} 