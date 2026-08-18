import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escoger una opcion:");
        System.out.println("1. Solucionar ecuacion 1");
        System.out.println("2. Solucionar ecuacion 2");
        System.out.println("3. Salir");

        int opcion = entrada.nextInt();

        if (opcion == 3) {
            System.out.println("Cerrando Programa.");

        } else if (opcion == 1 || opcion == 2) {

            System.out.print("Digite por favor el valor de x: ");
            double x = entrada.nextDouble();

            System.out.print("Digite por favor el valor de z: ");
            double z = entrada.nextDouble();

            double y;

            if (opcion == 1) {

                y = ((3 * x) / (1 + (3 * x)))
                        * ((1.0 / (1 + z)) + (3 * x * x) + (2 * z) + 3)
                        / ((3 * z * z) + 2);

                System.out.println("El resultado de y es: " + y);

            } else if (opcion == 2) {

                y = ((x * x) + (3 * z) + 2)
                        / (2 + (1.0 / (1 + (2 * z))))
                        + 2.0 / (
                            (1 + (3 * x * x * x) + (3 * z) + 2)
                            / (
                                (1.0 / (1 + (3 * x)))
                                + ((3 * x + 1)
                                / ((2 * z) + (3.0 / (1 + (5.0 / z)))))
                            )
                        );

                System.out.println("El resultado final de y es: " + y);
            }

        } else {
            System.out.println("Opcion no valida.");
        }

        entrada.close();
    }
}
