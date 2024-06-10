import java.util.Scanner;
public class ay {
    public static void main(String[] args) {
        Scanner lm = new Scanner(System.in);
        double saldo = 0;
        int opcion;
        Boolean fin=false;
        while(!fin) {
            System.out.println(" Datos de la cuenta");
            System.out.println("1.- Ver saldo");
            System.out.println("2.- Depositar a mi cuenta");
            System.out.println("3.- Retirar dinero");
            System.out.println("4.- Depositar a otra cuenta");
            System.out.println("5.- Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = lm.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("Su saldo actual es: $" + saldo);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = lm.nextDouble();
                    saldo += deposito;
                    System.out.println("Se han depositado $" + deposito + " en su cuenta.");
                    System.out.println("\n ----------RECIVO DE DEPOSITO----------");
                    System.out.println("Numero de Operacion: 5040-00180");
                    System.out.println("Cantidad de dinero depositado: " +deposito);
                    System.out.println("-----Gracias por confiar en BCP-----");
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = lm.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("\n");
                        System.out.println("BCP le informa que no tiene dinero en su cuenta");
                        System.out.println("se le recomienda chambear para tener dinero");
                        System.out.println("\n");
                    } else {
                        saldo -= retiro;
                        System.out.println("Se han retirado $" + retiro + " de su cuenta.");
                        System.out.println("\n ----------RECIVO DE RETIRO----------");
                        System.out.println("Numero de Operacion: 5040-00180");
                        System.out.println("Cantidad de dinero retirado: " +retiro);
                        System.out.println("-----Gracias por confiar en BCP-----");
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.out.println("ingrese la el numero de cuenta a depositar: ");
                    int cu = lm.nextInt();
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double depositos = lm.nextDouble();
                    if (depositos > saldo){
                        System.out.println("\n");
                        System.out.println("BCP le informa que no tiene suficiente dinero en su cuenta");
                        System.out.println("se le recomienda chambear para tener dinero");
                        System.out.println("\n");
                    }else {
                        saldo -= depositos;
                        System.out.println("Se han depositado $" + depositos + " en su cuenta.");
                        System.out.println("\n ----------RECIVO DE DEPOSITO----------");
                        System.out.println("Numero de Operacion: 5040-00180");
                        System.out.println("numero de cuenta depositado: "+cu);
                        System.out.println("Cantidad de dinero depositado: " +depositos);
                        System.out.println("-----Gracias por confiar en BCP-----");
                        System.out.println("\n");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar BCP");
                    fin=true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }
        }
    }
}