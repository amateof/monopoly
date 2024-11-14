import java.util.Scanner;

public class paco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double resultado = 0;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el lado del cuadrado:");
                    double lado = scanner.nextDouble();
                    resultado = calcularAreaCuadrado(lado);
                    break;
                case 2:
                    System.out.println("Introduce el radio del círculo:");
                    double radio = scanner.nextDouble();
                    resultado = calcularAreaCirculo(radio);
                    break;
                case 3:
                    System.out.println("Introduce el ancho del rectángulo:");
                    double ancho = scanner.nextDouble();
                    System.out.println("Introduce el alto del rectángulo:");
                    double alto = scanner.nextDouble();
                    resultado = calcularAreaRectangulo(ancho, alto);
                    break;
                case 4:
                    System.out.println("Introduce la base del triángulo:");
                    double base = scanner.nextDouble();
                    System.out.println("Introduce la altura del triángulo:");
                    double altura = scanner.nextDouble();
                    resultado = calcularAreaTriangulo(base, altura);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

            if (opcion != 5) {
                mostrarResultado(resultado);
            }

        } while (opcion != 5);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Calcular Área de Figuras ---");
        System.out.println("1. Cuadrado");
        System.out.println("2. Círculo");
        System.out.println("3. Rectángulo");
        System.out.println("4. Triángulo");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
    }

    private static double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }

    private static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    private static double calcularAreaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }

    private static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    private static void mostrarResultado(double resultado) {
        System.out.printf("El área es: %.2f\n", resultado);
    }
}


