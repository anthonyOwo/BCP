import java.util.Scanner;
public class bcp {
    public static void main(String[]args){
        Scanner BcP = new Scanner(System.in);
        String opcion;
        System.out.printf("Bienvenido a BCP");
        System.out.printf("En que te puedo ayudar hoy");
        System.out.printf("1: Abrir una cuenta");
        System.out.printf("2: Obtener tarjeta de credito");
        System.out.printf("3: Solicitar un prestamo");
        System.out.printf("4: Adelantar sueldo");
        System.out.printf("5: Protejer mis tarjetas");
        opcion=BcP.nextLine();
        switch (opcion){
            case "1":
                String nombres,ape_pat,ape_mat,email_in,email, contraseña,est_civ,
                        celular,sexo,contraseña_in,fec_nac;
                Scanner bcp=new Scanner(System.in);

                System.out.println("---BIENVENIDO A BCP---");
                System.out.println("---Crear cuenta----");
                System.out.println("Ingrese sus nombres");
                nombres=bcp.nextLine();
                System.out.println("Ingrese apellido paterno");
                ape_pat=bcp.nextLine();
                System.out.println("Ingrese apellido materno");
                ape_mat=bcp.nextLine();
                System.out.println("Ingrese su email");
                email_in=bcp.nextLine();
                System.out.println("Ingrese su estado civil");
                est_civ=bcp.nextLine();
                System.out.println("Ingrese su número de celular");
                celular=bcp.nextLine();
                System.out.println("Ingrese su sexo");
                sexo=bcp.nextLine();
                System.out.println("Ingrese su fecha de nacimiento");
                fec_nac=bcp.nextLine();
                System.out.println("Ingrese una contraseña");
                contraseña_in=bcp.nextLine();
                System.out.println("---DATOS REGISTRADOS SATISFACTORIAMENTE---");
                System.out.println("Ud es:"+nombres+""+ape_pat+""+ape_mat);
                System.out.println("Sus datos guardados son: "+est_civ+" "+celular+" "+sexo+" "+fec_nac);
                System.out.println("---- INICIAR SESION---");
                System.out.println("Ingrese su email");
                email=bcp.nextLine();
                System.out.println("Ingrese su contraseña");
                contraseña=bcp.nextLine();
                if (email.equals(email_in)&& contraseña.equals(contraseña_in)){
                    System.out.println("Bienvenido a BCP");
                }
                else {
                    System.out.println("Contraseña o email no válidos");
                }
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                System.out.printf("---Te cubre de:---");
                System.out.printf("Fraude por internet y otros");
                System.out.printf("Transferencias no reconocidas");
                System.out.printf("Robo de tus retiros en cajero o agente");
                System.out.printf("¿Qué hacer en caso de pérdida o robo?");
                System.out.printf("* Bloquea tus tarjetas");
                System.out.printf("   Llama a nuestra Banca por teléfono al (01)3119898, reporta lo sucedido y realiza el " +
                        "bloqueo de tus cuentas y tarjetas.");
                System.out.printf("* Cambia tus claves");
                System.out.printf("  Cambia las claves de todos tus aplicativos, incluyendo redes sociales, algunos " +
                        "dispositivos almacenan contraseñas.");
                System.out.printf("* Plus de Seguridad");
                System.out.printf("   Ante estos eventos, lo mejor es contar con nuestro Seguro Protección de Tarjetas Plus.");
                break;
            default:
                System.out.printf("Esa opcion es invalida, intente de nuevo");
        }
        System.out.printf("Graias por usar BCP");
    }
}