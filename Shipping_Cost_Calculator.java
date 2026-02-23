import java.util.Scanner;
//Shipping Cost Calculator
// Input package weight and shipping rate
public class Shipping_Cost_Calculator {
public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Ingresa el peso del paquete en kilogramos: ");
double pesoKg = entrada.nextDouble();

System.out.println("Ingresa la tarifa de envio en kilogramos: ");
double tarifaKg = entrada.nextDouble();

System.out.println("El costo total seria de: "+(pesoKg * tarifaKg)+" USD");
entrada.close();
}
}
