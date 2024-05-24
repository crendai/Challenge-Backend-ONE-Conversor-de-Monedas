import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyMenu {
    private static Map<String, String> countryCurrencyMap = new HashMap<>();

    static {
        countryCurrencyMap.put("Estados Unidos", "USD"); 
        countryCurrencyMap.put("México", "MXN"); 
        countryCurrencyMap.put("Eurozona", "EUR"); 
        countryCurrencyMap.put("Colombia", "COP"); 
        countryCurrencyMap.put("Brasil", "BRL"); 
        countryCurrencyMap.put("Perú", "PEN"); 
        countryCurrencyMap.put("Reino Unido", "GBP"); 
        countryCurrencyMap.put("Venezuela", "VES"); 
        countryCurrencyMap.put("Argentina", "ARS"); 
    }

    public static String selectCurrency(Scanner scanner) {
        int i = 1;
        for (Map.Entry<String, String> entry : countryCurrencyMap.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " (" + entry.getValue() + ")");
            i++;
        }
        int choice = scanner.nextInt();
        int index = 1;
        for (Map.Entry<String, String> entry : countryCurrencyMap.entrySet()) {
            if (index == choice) {
                return entry.getValue();
            }
            index++;
        }
        return null;
    }
}
