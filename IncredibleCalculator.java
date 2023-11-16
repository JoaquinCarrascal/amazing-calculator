import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        int userInputini,userInputsecond,result;
        String aux;
        double resultDou;

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                System.out.println("Introduzca el primer número para sumar:");
                aux = sc.nextLine();
                userInputini = IntegerparseInt(aux);
                System.out.println("Introduzca el segundo sumando:");
                aux = sc.nextLine();
                userInputsecond = IntegerparseInt(aux);

                result= userInputini + userInputsecond;
                System.out.println("El resultado es: " + result);
                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
            System.out.println("Introduzca el primer número para restar:");
                aux = sc.nextLine();
                userInputini = IntegerparseInt(aux);
                System.out.println("Introduzca el segundo número de la resta:");
                aux = sc.nextLine();
                userInputsecond = IntegerparseInt(aux);

                result= userInputini - userInputsecond;
                System.out.println("El resultado es: " + result);
                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
            System.out.println("Introduzca el primer factor:");
                aux = sc.nextLine();
                userInputini = IntegerparseInt(aux);
                System.out.println("Introduzca el segundo factor:");
                aux = sc.nextLine();
                userInputsecond = IntegerparseInt(aux);

                result= userInputini * userInputsecond;
                System.out.println("El resultado es: " + result);
                    break;
            case 4: // Division. Debes leer dos números enteros de entrada e imprimir su división entera.
                System.out.println("Introduzca el dividendo:");
                aux = sc.nextLine();
                userInputini = IntegerparseInt(aux);
                System.out.println("Introduzca el divisor:");
                aux = sc.nextLine();
                userInputsecond = IntegerparseInt(aux);

                result= (int) userInputini / userInputsecond;
                System.out.println("El resultado es: " + result);
                    break;
            case 5: // Division decimal. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                System.out.println("Introduzca el primer número para sumar:");
                aux = sc.nextLine();
                userInputini = IntegerparseInt(aux);
                System.out.println("Introduzca el segundo sumando:");
                aux = sc.nextLine();
                userInputsecond = IntegerparseInt(aux);

                resultDou= (double)userInputini + userInputsecond;
                System.out.printf("El resultado es: %.2f", resultDou);
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}