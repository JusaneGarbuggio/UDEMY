import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    int y = 32;
    double x = 10.35784;
    
    System.out.println("Olá Mundo!");
    System.out.println("Bom dia!");
    System.out.println(y);
    System.out.println(x);
    System.out.printf("%.2f%n", x);
    System.out.printf("%.4f%n", x);
    Locale.setDefault(Locale.US);
    System.out.printf("%.4f%n", x);
    System.out.println("RESULTADO = " + x + "METROS");
    System.out.printf("RESULTADO = %.2f metros%n", x);
  }
}