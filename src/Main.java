import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione la moneda de origen:");
        String fromCurrency = CurrencyMenu.selectCurrency(scanner);
        
        System.out.println("Seleccione la moneda de destino:");
        String toCurrency = CurrencyMenu.selectCurrency(scanner);
        
        System.out.print("Introduzca el monto a convertir: ");
        double amount = scanner.nextDouble();
        
        double convertedAmount = CurrencyConverter.convert(fromCurrency, toCurrency, amount);
        
        System.out.printf("El monto convertido es: %.2f %s%n", convertedAmount, toCurrency);
    }
}
