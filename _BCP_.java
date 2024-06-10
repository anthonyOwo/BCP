import java.util.Scanner;
public class _BCP_ {
    public String fMenu() {
        Scanner BcP = new Scanner(System.in);
        String opcion;
        System.out.printf("Bienvenido a BCP \n");
        System.out.printf("En que te puedo ayudar hoy\n");
        System.out.printf("1: Solicitar un prestamo\n");
        System.out.printf("2: Adelantar sueldo\n");
        System.out.printf("3: Chat bot\n");
        opcion = BcP.nextLine();
        switch (opcion) {
            case "1":
                this.fPrestamo();
                break;
            case "2":
                this.fAdelanto();
                break;
            case "3":
                this.fChatbot();
                break;
            default:
                System.out.printf("Esa opcion no esta disponible escriba otra opcion\n");
        }

        return null;
    }

    public String fCuenta() {
        String nombres, ape_pat, ape_mat, email_in, email, contraseña, est_civ,
                celular, sexo, contraseña_in, fec_nac, dni;
        Scanner bcp = new Scanner(System.in);
        System.out.println("---BIENVENIDO A BCP---\n");
        System.out.println("---Crear cuenta----\n");
        System.out.println("Ingrese sus nombres\n");
        nombres = bcp.nextLine();
        System.out.println("Ingrese apellido paterno\n");
        ape_pat = bcp.nextLine();
        System.out.println("Ingrese apellido materno\n");
        ape_mat = bcp.nextLine();
        System.out.printf("Ingrese su DNI\n");
        dni = bcp.nextLine();
        System.out.println("Ingrese su email\n");
        email_in = bcp.nextLine();
        System.out.println("Ingrese su estado civil\n");
        est_civ = bcp.nextLine();
        System.out.println("Ingrese su número de celular\n");
        celular = bcp.nextLine();
        System.out.println("Ingrese su sexo\n");
        sexo = bcp.nextLine();
        System.out.println("Ingrese su fecha de nacimiento\n");
        fec_nac = bcp.nextLine();
        System.out.println("Ingrese una contraseña\n");
        contraseña_in = bcp.nextLine();
        System.out.println("---DATOS REGISTRADOS SATISFACTORIAMENTE---\n");
        System.out.println("Ud es: " + nombres + "" + ape_pat + "" + ape_mat);
        System.out.println("Sus datos guardados son: " + est_civ + "" + celular + "" + sexo + "" + fec_nac);
        System.out.println("---- INICIAR SESION---\n");
        System.out.println("Ingrese su email\n");
        email = bcp.nextLine();
        System.out.println("Ingrese su contraseña\n");
        contraseña = bcp.nextLine();
        if (email.equals(email_in) && contraseña.equals(contraseña_in)) {
            System.out.println("Bienvenido a BCP\n");
        } else {
            System.out.println("Contraseña o email no válidos\n");
        }
        return null;
    }

    public String fSaldo() {
        Scanner bobi = new Scanner(System.in);
        double saldo = 0;
        String opcion;
        do {
            System.out.println("\nBienvenido ¿que desea consultar?");
            System.out.println("1. Consultar saldo\n");
            System.out.println("2. Depositar dinero\n");
            System.out.println("3. Retirar dinero\n");
            System.out.println("4. Salir\n");
            System.out.print("Ingrese la opción deseada: \n");
            opcion = bobi.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("\nSu saldo actual es: $" + saldo);
                    break;
                case "2":
                    System.out.print("Ingrese la cantidad a depositar: $\n");
                    double deposito = bobi.nextDouble();
                    saldo += deposito;
                    System.out.println("Se han depositado $" + deposito + " en su cuenta.\n");
                    break;
                case "3":
                    System.out.print("Ingrese la cantidad a retirar: $\n");
                    double retiro = bobi.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes. No se puede realizar el retiro.\n");
                    } else {
                        saldo -= retiro;
                        System.out.println("Se han retirado $" + retiro + " de su cuenta.\n");
                    }
                    break;
                case "4":
                    System.out.println("Gracias por utilizar nuestro servicio. ¡Hasta luego!\n");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.\n");
            }
            bobi.nextLine();
        } while (!opcion.equals("4"));
        return null;
    }

    public String fTarjetas() {
        String dni, gh, iden;
        Scanner beli = new Scanner(System.in);
        System.out.println("Obtener tarjeta de Credito");
        System.out.println("Elija un opcion");
        System.out.println("1.Tarjetas de credito");
        System.out.println("2. Tarjetad de Debito");
        gh = beli.nextLine();
        switch (gh){
            case "1":
                String marca;
                System.out.println("Elige la Tarjeta que va contigo");
                System.out.println("Filtrar por marca:");
                System.out.println("1.VISA");
                System.out.println("2.AMEX");
                marca= beli.nextLine();
                switch (marca){
                    case "1":
                        String visa;
                        System.out.println("Resultados: 9 Tarjetas");
                        System.out.println("1.Visa Clásica");
                        System.out.println("2.Visa Light");
                        System.out.println("3.Visa Clásica LATAM Pass");
                        System.out.println("4.Visa Oro LATAM Pass");
                        System.out.println("5.Visa Platinum LATAM Pass");
                        System.out.println("6.Visa Infinite Sapphire LATAM Pass");
                        System.out.println("7.Visa iO");
                        visa=beli.nextLine();
                        switch (visa){
                            case "1":
                                String tarjeta,nombre,ape;
                                System.out.println("DETALLES:\n");
                                System.out.println("Campañas de Cashback");
                                System.out.println("Membresía anual S/80 (GRATIS si consumes S/50 al mes");
                                System.out.println("-----Obtener una Tarjeta de Crédito BCP-----");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");

                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Visa Clásica\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:" +ape);
                                        System.out.println("DNI"+dni);



                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Clásica\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombres:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en una proxima ");

                                        }
                                        break;
                                }

                                break;
                            case "2":
                                System.out.println("Detalles:\n");
                                System.out.println("Sin consumo mínimo ");
                                System.out.println("Membresía anual GRATIS");
                                System.out.println("------Obtener una Tarjeta de Crédito BCP-----");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Visa Light\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos,adquirir,name;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Nombre:");
                                            name=beli.nextLine();
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Light\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+name);
                                            System.out.println("Su identidad fue confirmada:"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en una proxima");

                                        }
                                        break;
                                }
                                break;
                            case "3":
                                System.out.println("Detalles:\n");
                                System.out.println("Membresía anual S/80 (GRATIS si consumes S/1 al mes)");
                                System.out.println("1 Milla acumulada por cada 2 USD que consumas.");
                                System.out.println("Campañas multiplicadoras de Millas");
                                System.out.println("-----Obtener una Tarjeta de Crédito BCP----");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Visa Clásica LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Clásica LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombres"+nombre);
                                            System.out.println("Identidad confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en una proxima");

                                        }
                                        break;
                                }

                                break;
                            case "4":
                                System.out.println("Detalles:\n");
                                System.out.println("1 Milla acumulada por cada 1.5 USD que consumas");
                                System.out.println("Campañas multiplicadoras de Millas");
                                System.out.println("Membresía anual S/170 (GRATIS si consumes S/1 al mes)");
                                System.out.println("------Obtener una Tarjeta de Crédito BCP-------");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre:");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta \n Visa Oro LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2": String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Oro LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }
                                        break;
                                }
                                break;
                            case "5":
                                System.out.println("Detalles:\n");
                                System.out.println("Membresía anual S/370 (GRATIS si consumes S/1,200 al mes)");
                                System.out.println("3,000 Millas de bienvenida");
                                System.out.println("1 Milla acumulada por cada 1 USD que consumas.");

                                System.out.println("-------Obtener una Tarjeta de Crédito BCP------");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Visa Platinum LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Platinum LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombres:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);

                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }
                                        break;
                                }
                                break;
                            case "6":
                                System.out.println("Detalles:\n");
                                System.out.println("Tasa de interés TCEA Máxima 173.7");
                                System.out.println("TEA Máxima de compras 39.00% - 81.5%");
                                System.out.println("Membresía anual S/450.  (Sujeto a Términos y condiciones)");
                                System.out.println("Obtener una Tarjeta de Crédito BCP");
                                System.out.println("Ingrese su numero  de DNI");
                                dni=beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta Visa Infinite Sapphire LATAM Pass");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombre:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa Infinite Sapphire LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);

                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en una proxima");

                                        }
                                        break;
                                }
                                break;
                            case "7":
                                System.out.println("Detalles:\n");
                                System.out.println("Tarjeta de Crédito digital y física.");
                                System.out.println("Accede a descuentos exclusivos");
                                System.out.println("Acumula cashback por tus compras.");
                                System.out.println("Membresía cero: ni mensual, ni anual");
                                System.out.println("------Obtener una Tarjeta de Crédito BCP------");
                                System.out.println("Escriba su Num de DNI");
                                dni = beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){
                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Visa iO\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Visa iO\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }
                                        break;
                                    default:
                                        System.out.println("Opcion incorrecta");
                                }
                                break;
                        }

                        break;
                    case "2":
                        String amex, tarjeta,nombre,ape ;
                        System.out.println("Resultados:4 Tarjetas");
                        System.out.println("1.Amex Clásica LATAM Pass\n");
                        System.out.println("2.Amex Oro LATAM Pass\n");
                        System.out.println("3.Amex Platinum LATAM Pass\n");
                        System.out.println("4.Amex Black LATAM Pass\n");
                        amex =beli.nextLine();
                        switch (amex){
                            case "1":
                                System.out.println("Detalles:\n");
                                System.out.println("Campañas multiplicadoras de Millas");
                                System.out.println("1 Milla acumulada por cada 2 USD que consumas.");
                                System.out.println("Membresía anual S/80 (GRATIS si consumes S/1 al mes)\n");
                                System.out.println("-------Obtener una Tarjeta de Crédito BCP------");
                                System.out.println("Escriba su Num de DNI");
                                dni = beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){

                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Amex Clásica LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Amex Clásica LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }

                                }
                                break;

                            case "2":
                                System.out.println("Detalles:\n");
                                System.out.println("Membresía anual GRATIS");
                                System.out.println("Campañas multiplicadoras de Millas");
                                System.out.println("Membresía anual S/170 (GRATIS si consumes S/1 al mes)\n");
                                System.out.println("-------Obtener una Tarjeta de Crédito BCP------");
                                System.out.println("Escriba su Num de DNI");
                                dni = beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){

                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Amex Oro LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Amex Oro LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }


                                }
                                break;
                            case "3":
                                System.out.println("Detalles:\n");
                                System.out.println("Membresía anual S/350 (GRATIS si consumes S/1,200 al mes)");
                                System.out.println("1 Milla acumulada por cada 1 USD que consumas");
                                System.out.println("S/150 de descuento, descorche gratis y postre de cortesía en restaurantes seleccionados");
                                System.out.println("3,000 Millas de bienvenida\n");
                                System.out.println("------Obtener una Tarjeta de Crédito BCP-----");
                                System.out.println("Escriba su Num de DNI");
                                dni = beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){

                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Amex Platinum LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Amex Platinum LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }

                                }
                                break;
                            case"4":
                                System.out.println("Detalles:\n");
                                System.out.println("1.5 Millas acumulada por cada 1 USD que consumas.");
                                System.out.println("Priority Pass + 2 invitados");
                                System.out.println("Membresía anual S/400 (GRATIS si consumes S/3,500 al mes)");
                                System.out.println("6,000 Millas de bienvenida");
                                System.out.println("-----Obtener una Tarjeta de Crédito BCP-----");
                                System.out.println("Escriba su Num de DNI");
                                dni = beli.nextLine();
                                System.out.println("¿Cómo deseas validar tu identidad?");
                                System.out.println("1.Tarjeta");
                                System.out.println("2.Reconocimiento Facial");
                                iden =beli.nextLine();
                                switch (iden){

                                    case "1":
                                        System.out.println("Ingrese el numero de tarjeta");
                                        tarjeta = beli.nextLine();
                                        System.out.println("Ingrese sus datos :");
                                        System.out.println("Nombre");
                                        nombre=beli.nextLine();
                                        System.out.println("Apellidos");
                                        ape=beli.nextLine();
                                        System.out.println("Usted adquirio la tarjeta\n Amex Black LATAM Pass\n");
                                        System.out.println("Num. de Tarjeta:" +tarjeta);
                                        System.out.println("Nombres:" +nombre);
                                        System.out.println("Apellidos:\n" +ape);
                                        System.out.println("DNI"+dni);
                                        break;
                                    case "2":
                                        String datos;
                                        System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales para identificarte?");
                                        datos = beli.nextLine();
                                        if (datos.equals("si")){
                                            System.out.println("Ubica tu rostro en el círculo\n");
                                            System.out.println("\n CHICK \n");
                                            System.out.println("Ingrese el numero de tarjeta");
                                            tarjeta = beli.nextLine();
                                            System.out.println("Nombres:");
                                            nombre=beli.nextLine();
                                            System.out.println("Usted adquirio la tarjeta\n Amex Black LATAM Pass\n");
                                            System.out.println("Num. de Tarjeta:" +tarjeta);
                                            System.out.println("Nombre:"+nombre);
                                            System.out.println("Su identidad fue confirmada"+dni);


                                        } else if (datos.equals("no")) {
                                            System.out.println("Sera en un proxima");

                                        }

                                }
                                break;
                        }
                        break;
                    default:


                }

                break;
            case "2":
                String debito,sol;
                System.out.println("-----Tarjetas de Débito-----" );
                System.out.println("¡Conoce las tarjetas que tenemos para ti!");
                System.out.println("1.Tarjeta de Débito Visa Clásica BCP");
                System.out.println("2.Tarjeta de Débito Visa Clásica BCP Latam Pass");
                System.out.println("3.Tarjeta de Débito Visa BCP con Diseño");
                debito=beli.nextLine();
                switch (debito){
                    case "1":
                        System.out.println("Detalles:\n");
                        System.out.println("-Tarjeta de Débito Visa Clásica BCP");
                        System.out.println("-Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                        System.out.println("¡Y sin pagar intereses ni comisiones!\n");
                        System.out.println("----¿Desea solicitar?----");
                        sol= beli.nextLine();
                        if (sol.equals("si")){
                            String correo,cel,region,provi,name,ape, clave,internet;
                            System.out.println("Debe saber que se le agregara una deuda de 20 soles a su cuenta de DNI");
                            System.out.println("Por adquirir la tarjeta");
                            System.out.println(" ----Ingresa tus datos y elige tu cuenta----- ");
                            System.out.println(" Ingrese su Num DNI ");
                            dni=beli.nextLine();
                            System.out.println(" Ingrese nombre ");
                            name=beli.nextLine();
                            System.out.println(" Ingrese apellidos ");
                            ape=beli.nextLine();
                            System.out.println(" Correo electronico ");
                            correo =beli.nextLine();
                            System.out.println(" Numero de celular ");
                            cel=beli.nextLine();
                            System.out.println("¿ Donde vives ?");
                            System.out.println("Region");
                            region=beli.nextLine();
                            System.out.println(" Provincia ");
                            provi= beli.nextLine();
                            System.out.println("Crear clave de 4 digitos");
                            clave=beli.nextLine();
                            System.out.println("Crear clave de Internet");
                            internet=beli.nextLine();
                            System.out.println(" Adquirio la Tarjeta de Débito Visa Clásica BCP");
                            System.out.println("Registrado ");
                            System.out.println("DNI:"+dni);
                            System.out.println("Nombres:"+name);
                            System.out.println("Apellidos:"+ape);
                            System.out.println("Correo:"+correo);
                            System.out.println("Ubicacion:\n"+"Departamento:"+region+"\nProvincia:" +provi);
                            System.out.println("Clave:"+clave);
                            System.out.println("Clave de internet:"+internet);
                            System.out.println("Recoja su tarjeta");
                            System.out.println("Gracias por confiar en nosotros");
                            System.out.println("Mientras más grandes seamos como personas, más grande será el BCP. ");


                            beli.nextLine();

                        }
                        else if (sol.equals("no")){
                            System.out.println("Bueno sera a la proxima");
                            beli.nextLine();
                        }
                        break;
                    case "2":
                        System.out.println("Tarjeta de Débito Visa Clásica BCP\n");
                        System.out.println("Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                        System.out.println("¡Y sin pagar intereses ni comisiones!");
                        System.out.println("¿Desea solicitar?");
                        sol= beli.nextLine();
                        if (sol.equals("si")){
                            String correo,cel,region,provi,name,ape, clave,internet;
                            System.out.println("Debe saber que se le agregara una deuda de 20 soles a su cuenta de DNI");
                            System.out.println("Por adquirir la tarjeta");
                            System.out.println(" ----Ingresa tus datos y elige tu cuenta----- ");
                            System.out.println(" Ingrese su Num DNI ");
                            dni=beli.nextLine();
                            System.out.println(" Ingrese nombre ");
                            name=beli.nextLine();
                            System.out.println(" Ingrese apellidos ");
                            ape=beli.nextLine();
                            System.out.println(" Correo electronico ");
                            correo =beli.nextLine();
                            System.out.println(" Numero de celular ");
                            cel=beli.nextLine();
                            System.out.println("¿ Donde vives ?");
                            System.out.println("Region");
                            region=beli.nextLine();
                            System.out.println(" Provincia ");
                            provi= beli.nextLine();
                            System.out.println("Crear clave de 4 digitos");
                            clave=beli.nextLine();
                            System.out.println("Crear clave de Internet");
                            internet=beli.nextLine();
                            System.out.println(" Adquirio la Tarjeta de Débito Visa Clásica BCP Latam Pass");
                            System.out.println("Registrado ");
                            System.out.println("DNI:"+dni);
                            System.out.println("Nombres:"+name);
                            System.out.println("Apellidos:"+ape);
                            System.out.println("Correo:"+correo);
                            System.out.println("Ubicacion:\n"+"Departamento:"+region+"\nProvincia:" +provi);
                            System.out.println("Clave:"+clave);
                            System.out.println("Clave de internet:"+internet);
                            System.out.println("Recoja su tarjeta");
                            System.out.println("Gracias por confiar en nosotros");
                            System.out.println("Mientras más grandes seamos como personas, más grande será el BCP. ");



                        }
                        else if (sol.equals("no")){
                            System.out.println("Bueno sera a la proxima");
                            beli.nextLine();
                        }

                        break;
                    case "3":
                        System.out.println("Tarjeta de Débito Visa Clásica BCP\n");
                        System.out.println("Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                        System.out.println("¡Y sin pagar intereses ni comisiones!");
                        System.out.println("¿Desea solicitar?");
                        sol= beli.nextLine();
                        if (sol.equals("si")){
                            String correo,cel,region,provi,name,ape, clave,internet;
                            System.out.println("Debe saber que se le agregara una deuda de 20 soles a su cuenta de DNI");
                            System.out.println("Por adquirir la tarjeta");
                            System.out.println(" ----Ingresa tus datos y elige tu cuenta----- ");
                            System.out.println(" Ingrese su Num DNI ");
                            dni=beli.nextLine();
                            System.out.println(" Ingrese nombre ");
                            name=beli.nextLine();
                            System.out.println(" Ingrese apellidos ");
                            ape=beli.nextLine();
                            System.out.println(" Correo electronico ");
                            correo =beli.nextLine();
                            System.out.println(" Numero de celular ");
                            cel=beli.nextLine();
                            System.out.println("¿ Donde vives ?");
                            System.out.println("Region");
                            region=beli.nextLine();
                            System.out.println(" Provincia ");
                            provi= beli.nextLine();
                            System.out.println("Crear clave de 4 digitos");
                            clave=beli.nextLine();
                            System.out.println("Crear clave de Internet");
                            internet=beli.nextLine();
                            System.out.println(" Adquirio la Tarjeta de Débito Visa BCP con Diseño");
                            System.out.println("Registrado ");
                            System.out.println("DNI:"+dni);
                            System.out.println("Nombres:"+name);
                            System.out.println("Apellidos:"+ape);
                            System.out.println("Correo:"+correo);
                            System.out.println("Ubicacion:\n"+"Departamento:"+region+"\nProvincia:" +provi);
                            System.out.println("Clave:"+clave);
                            System.out.println("Clave de internet:"+internet);
                            System.out.println("Recoja su tarjeta");
                            System.out.println("Gracias por confiar en nosotros");
                            System.out.println("Mientras más grandes seamos como personas, más grande será el BCP. ");



                        }
                        else if (sol.equals("no")){
                            System.out.println("Bueno sera a la proxima");

                        }

                        break;
                }

                break;

        }
        System.out.println("Gracias por confiar en nosotros");
        System.out.println("Mientras más grandes seamos como personas, más grande será el BCP. ");
        return null;
    }

    public String fPrestamo() {
        Scanner cat = new Scanner(System.in);
        String nombre, correo, fecha_pago, nombre1, correo1, cuotas;
        int monto, dni, dni1, clave, clave1, interes, monto_5, monto_total;
        long N_tarjeta, N_tarjeta1;
        System.out.println("-------BIENVENIDO A LA CUENTA DE PRESTAMO------");
        System.out.println("ingrese sus datos");
        System.out.println("ingrese su nombre");
        nombre = cat.nextLine();
        System.out.println("ingrese su DNI");
        dni = cat.nextInt();
        System.out.println("ingrese su correo");
        correo = cat.nextLine();
        correo = cat.nextLine();
        System.out.println("ingrese su numero de tarjeta");
        N_tarjeta = cat.nextLong();
        System.out.println("ingrese su clave de 6 digitos");
        clave = cat.nextInt();


        System.out.println("DATOS GUARDADOS EXITOSAMENTE");
        System.out.println("su nombre:" + nombre + "con DNI:" + dni);
        System.out.println("con correo:" + correo);
        System.out.println("Nro de tarjeta:" + N_tarjeta + "con clave:" + clave);
        System.out.println("ingrese el monto del prestamo");
        monto = cat.nextInt();
        System.out.println("ingrese la fecha de pago");
        System.out.println(" 1. 02 de cada mes");
        System.out.println(" 2. 15 de cada mes");
        System.out.println(" 3. 28 de cada mes");
        fecha_pago = cat.nextLine();
        fecha_pago = cat.nextLine();
        System.out.println("---VERIFIQUE SU IDENTIDAD----");
        System.out.println("ingrese su nombre");
        nombre1 = cat.nextLine();
        System.out.println("ingrese su dni");
        dni1 = cat.nextInt();
        System.out.println("ingrese su correo");
        correo1 = cat.nextLine();
        correo1 = cat.nextLine();
        if (correo.equals(correo1) ) {// aca no se como compararlo, me olvide ;(
            System.out.println("ingrese su numero de tarjeta");
            N_tarjeta1 = cat.nextInt();
            System.out.println("ingrese su clave de 6 digitos");
            clave1 = cat.nextInt();
            if (N_tarjeta == N_tarjeta1 && clave == clave1) {
                System.out.println("en cuantas cuotas desea pagar?");
                System.out.println("1. 5 cuotas");
                System.out.println("2. 10 cuotas");
                System.out.println("3. 15 cuotas");
                cuotas = cat.nextLine();
                switch (cuotas) {
                    case "1. 5 cuotas":
                        monto_5 = monto / 5;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                    case "2. 10 cuotas":
                        monto_5 = monto / 10;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                    case "3. 15 cuotas":
                        monto_5 = monto / 15;
                        interes = monto / 10;
                        monto_total = monto_5 + interes;
                        System.out.println("usted va a pagar" + monto_total + "todos los " + fecha_pago);
                        System.out.println("su prestamo a sido exitoso");
                        System.out.println("-----Gracias por confiar en BCP para tus prestamos");
                        break;
                }


            }

        } else {
            System.out.println("contraseña o correo incorrectos");
        }
        return null;
    }

    public String fAdelanto() {
        Scanner ms = new Scanner(System.in);
        Boolean fin = false;
        while (!fin) {
            System.out.println("\n");
            System.out.println("**********ADELANTO DE SUELDO**********");
            System.out.println("¿Cuáles son los beneficios del Adelanto de Sueldo?");
            System.out.println("----------RECOMENDACIONES----------");
            System.out.println("1.- Al instante" +
                    "En 3 simples pasos desde el App Banca Móvil o Banca por Internet");
            System.out.println("2.- Adelanta lo que necesitas" +
                    "Desde S/ 50 hasta S/ 2,500, tú eliges el monto.");
            System.out.println("3.- Comisión única" +
                    "Olvídate de los intereses y paga una comisión única por operación.");
            System.out.println("4.- Sin complicaciones" +
                    "Se debita automáticamente de tu próxima remuneración. Olvídate de la fecha de pago.");
            System.out.println("Presione 9 para finalizar");
            System.out.println("--------------------------------------------------");

            System.out.println("ADELANTO DE MI SUELDO");
            System.out.println("100% online y en 3 simples pasos");
            System.out.println("presione 1 para OBTENERLO AQUI");
            int inicio = ms.nextInt();
            if (inicio == 1) {
                System.out.println("----------RECOMENDACIONES----------");
                System.out.println("Solicítalo al instante desde tu App Banca Móvil");
                System.out.println("Paso 1: Ingreso");
                System.out.println("Selecione el icono de `Explora` (en la parte inferior derecha).");
                System.out.println("Paso 2: Presiona el recuadro");
                System.out.println("e ingresa a `Adelanto de sueldo`");
                System.out.println("Paso 3: Revisa los beneficios");
                System.out.println("y da clic en  `lo quiero`");
                System.out.println("Paso 4: Verifica el monto");
                System.out.println("y da clic a `Continuar`");
                System.out.println("Paso 5: Confirma la operacion y listo");
                System.out.println("Aprovecha tu adelanto de sueldo");
                System.out.println("--------------------------------------------------");
                System.out.println("Solicita tu adelanto de Sueldo");
                System.out.println("presione 1 para OBTENERLO AQUI");
                inicio = ms.nextInt();
                if (inicio == 1) {
                    int dni, nt, clave, monto;
                    System.out.println("Esta ventana se cerrará 300 segundos");
                    System.out.println("Banca por Internet");
                    System.out.println("ingrese los datos pedidos");
                    System.out.println("DNI:");
                    dni = ms.nextInt();
                    System.out.println("Numero de tarjeta:");
                    nt = ms.nextInt();
                    System.out.println("clave de internet de 6 digitos");
                    clave = ms.nextInt();
                    System.out.println("Ingrese el monto que desea adelantar");
                    monto = ms.nextInt();
                    System.out.println("presione 1 para confirmar");
                    System.out.println("\n ----------RECIVO DE ADELANTO----------");
                    System.out.println("DNI: " + dni);
                    System.out.println("Numero de tarjeta: " + nt);
                    System.out.println("Monto adelantado:***" + monto + "***");

                    System.out.println("Proceso finalizado");
                    fin = true;
                } else if (inicio == 9) {
                    fin = true;
                } else {
                    System.out.println("Estas en la App BCP no presione cualquier tecla");
                }
            } else if (inicio == 9) {
                fin = true;
            } else {
                System.out.println("Estas en la App BCP no presione cualquier tecla");
            }
        }
        return null;
    }

    public String fChatbot() {
        Scanner pepa = new Scanner(System.in);
        String opcion;
        System.out.printf("\nBienvenido a chat bot de BCP");
        System.out.printf("\nEsoja una de las opciones");
        System.out.printf("1: Cuentas\n");
        System.out.printf("2: Credito personal\n");
        System.out.printf("3: Seguro BCP\n");
        System.out.printf("4: Pregunatas frecuentes\n");
        opcion = pepa.nextLine();
        switch (opcion) {
            case "1":
                System.out.printf("1: Saldo de mi cuenta\n");
                System.out.printf("2: Abrir una cuenta\n");
                System.out.printf("3: Conocer los tipos de cuentas\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        this.fSaldo();
                        break;
                    case "2":
                        this.fCuenta();
                        break;
                    case "3":
                        System.out.printf("1. Cuenta Digital\n");
                        System.out.printf("2. Cuenta Sueldo\n");
                        System.out.printf("3. Cuenta CTS\n");
                        System.out.printf("4. Cuenta Premio\n");
                        System.out.printf("5. Cuenta Ilimitada\n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Si haces múltiples operaciones digitales, la Cuenta Digital es para ti. " +
                                        " Estos son sus beneficios:\n");
                                System.out.printf("▪ No cobra mantenimiento.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, " +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ 1 depósito sin costo al mes por Ventanillas.\n");
                                break;
                            case "2":
                                System.out.printf("¿Qué te gustaría saber sobre la Cuenta Sueldo BCP?\n");
                                System.out.printf("1. Beneficios Cuenta Sueldo\n");
                                System.out.printf("2. Adelanto de sueldo\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("¡Disfruta de descuentos exclusivos de hasta el 70%! \n" +
                                                "Conoce los centros afiliados a la Cuenta Sueldo BCP ingresando a: \n" +
                                                "https://www.viabcp.com/beneficios/cuenta-sueldo\n");
                                        System.out.printf("Para abrir tu Cuenta Sueldo BCP forma sencilla y segura, \n" +
                                                "ingresa a nuestra web: \n" +
                                                "https://www.abretucuenta.viabcp.com/#/preferencias?codProd=CTASLD\n");
                                        break;
                                    case "2":
                                        this.fAdelanto();
                                        break;
                                    default:
                                        System.out.printf("Esa opcion es invalida\n");
                                }
                            case "3":
                                System.out.printf("Traslada tu CTS al BCP y recibe una súper tasa. \n");
                                System.out.printf("Entérate de todos los detalles en nuestra web:\n" +
                                        "https://www.viabcp.com/campana-traslado-cts-sorteo\n");
                                break;
                            case "4":
                                System.out.printf("¡Participa por 1 MILLÓN de soles abriendo tu Cuenta Premio!\n");
                                System.out.printf("Solo realiza un depósito de S/ 1,000 o $ 300 y obtén estos beneficios:\n");
                                System.out.printf("▪ Operaciones ilimitadas por Ventanillas.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, \n" +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional.\n");
                                break;
                            case "5":
                                System.out.printf("Haz tus operaciones sin límites por solo S/ 12.00 o $ 4.80 al mes. \n" +
                                        "La Cuenta Ilimitada tiene estos beneficios:\n");
                                System.out.printf("▪ Operaciones ilimitadas por Ventanillas.\n");
                                System.out.printf("▪ Operaciones sin costo a través de Banca por Internet, Banca Móvil y Yape.\n");
                                System.out.printf("▪ Depósitos y retiros sin costo a nivel nacional en Cajeros y Agentes BCP.\n");
                                System.out.printf("▪ Descarga gratuita de tu Estado de Cuenta por Banca por Internet, \n" +
                                        "Banca Móvil o Plataforma Digital.\n");
                                System.out.printf("▪ Retiros ilimitados en cajeros de otras instituciones sin costo a nivel nacional.\n");
                                break;
                        }
                        break;

                    default:
                        System.out.printf("Esa opcion no esta disponible\n");
                }
            case "2":
                System.out.printf("Esta es la información sobre Crédito Efectivo.\n");
                System.out.printf("1. Quiero información general sobre Crédito Efectivo\n");
                System.out.printf("2. Quiero ver mis Créditos Personales\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("Para conocer más sobre Crédito Efectivo, ingresa a nuestra web:\n" +
                                "https://www.viabcp.com/creditos/credito-efectivo\n");
                        break;
                    case "2":
                        System.out.printf("Ingresa a nuestra web y conoce los requisitos para adquirir un Préstamo Personal:\n" +
                                "https://www.viabcp.com/creditos/credito-efectivo/prestamo-personal-bcp\n");
                        break;
                    default:
                        System.out.printf("Esa opicion es invalida\n");
                }
                break;
            case "3":
                System.out.printf("Aquí puedes revisar información sobre Seguros.\n");
                System.out.printf("1. ¿Cuál es la cobertura de los Seguros BCP?\n");
                System.out.printf("3. ¿Qué pasa si no pago mi Seguro BCP?\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("Elige un seguro para ver su cobertura:\n");
                        System.out.printf("1. Seguro Protección de Tarjetas \n");
                        System.out.printf("2. Seguro Protección de Tarjetas Plus \n");
                        System.out.printf("3. Seguro Múltiple \n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Toma en cuenta que tienes el Seguro de Protección de Tarjetas \n" +
                                        "solo si lo has adquirido antes de enero 2020. Si quieres ver el detalle \n" +
                                        "de tus seguros, escribe mis seguros.\n");
                                break;
                            case "2":
                                System.out.printf("El Seguro de Protección de Tarjetas protege hasta por S/ 25,000 \n" +
                                        "todas tus tarjetas del BCP y tarjetas de crédito de otros bancos en los siguientes casos: \n" +
                                        "robo, pérdida, engaños en internet o cambiazo.\n");
                                break;
                            case "3":
                                System.out.printf("El Seguro Múltiple te brinda respaldo económico en caso de accidentes, \n" +
                                        "hospitalización por enfermedades o fallecimiento. El beneficio lo recibirás tú y tu familia, \n" +
                                        "dependiendo del saldo promedio de tu cuenta afiliada.\n");
                                break;
                            default:
                                System.out.printf("Esa opcion no esta disponible\n");
                        }
                        break;
                    case "2":
                        System.out.printf("Si no pagas tu seguro por más de tres meses consecutivos, \n" +
                                "será anulado y perderás la cobertura.\n");
                        break;
                    default:
                        System.out.printf("Esa opion es invalida\n");
                }
                break;
            case "4":
                System.out.printf("Para ofrecerte opciones según tus necesidades, escribe el número de tu elección:\n");
                System.out.printf("1. Soy cliente BCP\n");
                System.out.printf("2. No soy cliente BCP\n");
                opcion = pepa.nextLine();
                switch (opcion) {
                    case "1":
                        System.out.printf("1. Bloqueos\n");
                        System.out.printf("2. Problemas con productos y canales\n");
                        System.out.printf("3. Conoce nuestros canales de atención\n");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("Para bloquear tu tarjeta te vamos a comunicar con un asesor \n" +
                                        "especializado por este chat.\n");
                                break;
                            case "2":
                                System.out.printf("1. Problemas con un producto\n");
                                System.out.printf("2. Problemas con mis saldos\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Cual fue el problema\n");
                                        System.out.printf("1. Mi tarjeta está bloqueada\n");
                                        System.out.printf("2. Rechazaron mi compra por internet\n");
                                        opcion = pepa.nextLine();
                                        switch (opcion) {
                                            case "1":
                                                System.out.printf("Recuerda que el banco puede bloquear tu tarjeta por \n" +
                                                        "vencimiento del plástico o porque detectó algún movimiento sospechoso. \n" +
                                                        "Seguridad primero\n");
                                                break;
                                            case "2":
                                                System.out.printf("Para poder realizar compras por Internet es necesario \n" +
                                                        "que actives esta opción por Banca Móvil. Para ello, sigue estos pasos:\n");
                                                System.out.printf("1) Inicia sesión en Banca Móvil y selecciona Configuración.\n");
                                                System.out.printf("2) Elige Configuración de Tarjeta.\n");
                                                System.out.printf("3) Activa la opción de Compras por internet.\n");
                                                System.out.printf("4) Confirma la operación con tu Token Digital y ¡listo!\n");
                                                System.out.printf("Por tu seguridad, activa esta opción solo para realizar \n" +
                                                        "la compra y luego desactívala. Así evitarás ser víctima de fraudes.\n");
                                                break;
                                            default:
                                                System.out.printf("Opcion invalida\n");
                                        }
                                        break;
                                    case "2":
                                        System.out.printf("¿Qué ocurrió con tus saldos?\n");
                                        System.out.printf("1. Hay una compra que no hice\n");
                                        System.out.printf("2. Me descontaron dinero\n");
                                        opcion = pepa.nextLine();
                                        switch (opcion) {
                                            case "1":
                                                System.out.printf("Si crees que has sido víctima de un fraude, \n" +
                                                        "un asesor humano debe bloquear tu tarjeta. Recuerda que \n" +
                                                        "esta acción es irreversible.\n");
                                                break;
                                            case "2":
                                                System.out.printf("Los descuentos de dinero que ves en tu cuenta pueden ocurrir por estos motivos:\n");
                                                System.out.printf("▪ Una deuda de algún crédito que fue afiliado a tu tarjeta de débito.\n");
                                                System.out.printf("▪ Algún cobro afiliado a débito automático.\n");
                                                System.out.printf("▪ Cobros de comisiones.\n");
                                                System.out.printf("▪ Cobro recurrente afiliado a la tarjeta de débito.\n");
                                                break;
                                            default:
                                                System.out.printf("Opcion invalida\n");
                                        }
                                        break;
                                    default:
                                        System.out.printf("Opcion no disponible\n");
                                }
                                break;
                            case "3":
                                System.out.printf("¿Qué tipo de atención necesitas?\n");
                                System.out.printf("1. Atención presencial\n");
                                System.out.printf("2. Atención digital\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Esta es la información sobre nuestros Canales Físicos. \n");
                                        System.out.printf("1. Agencias BCP\n");
                                        System.out.printf("2. Cajeros automáticos\n");
                                        System.out.printf("3. Agendar una cita en Agencia BCP\n");
                                        break;
                                    case "2":
                                        System.out.printf("Esta es la información sobre Canales Digitales.\n");
                                        System.out.printf("1. Banca Móvil\n");
                                        System.out.printf("2. Yape\n");
                                        System.out.printf("3. Aprende a usar el WhatsApp BCP\n");
                                        System.out.printf("4. Banca por Internet\n");
                                        break;
                                    default:
                                        System.out.printf("Opcion invalida\n");
                                }
                                break;
                            default:
                                System.out.printf("Opcion invalida\n");
                        }
                        break;
                    case "2":
                        System.out.printf("1. Conoce nuestro canales de atención");
                        System.out.printf("2. Tipo de cambio");
                        opcion = pepa.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.printf("¿Qué tipo de atención necesitas?\n");
                                System.out.printf("1. Atención presencial\n");
                                System.out.printf("2. Atención digital\n");
                                opcion = pepa.nextLine();
                                switch (opcion) {
                                    case "1":
                                        System.out.printf("Esta es la información sobre nuestros Canales Físicos. \n");
                                        System.out.printf("1. Agencias BCP\n");
                                        System.out.printf("2. Cajeros automáticos\n");
                                        System.out.printf("3. Agendar una cita en Agencia BCP\n");
                                        break;
                                    case "2":
                                        System.out.printf("Esta es la información sobre Canales Digitales.\n");
                                        System.out.printf("1. Banca Móvil\n");
                                        System.out.printf("2. Yape\n");
                                        System.out.printf("3. Aprende a usar el WhatsApp BCP\n");
                                        System.out.printf("4. Banca por Internet\n");
                                        break;
                                    default:
                                        System.out.printf("Opcion invalida\n");
                                        break;
                                }
                            case "2":
                                System.out.printf("Ingresa a nuestra web y aprende cómo ver el tipo de cambio por Banca Móvil:\n" +
                                        "https://www.viabcp.com/tipodecambio/dolares\n");
                                break;
                            default:
                                System.out.printf("Esa opcion no esta disponible\n");
                        }
                        break;
                    default:
                        System.out.printf("Esa opcion no esta disponible\n");
                }
        }
    return null;
    }
    public static void main(String[]args){
        _BCP_ mani = new _BCP_();
        mani.fMenu();
        mani.fCuenta();
        mani.fSaldo();
        mani.fTarjetas();
        mani.fPrestamo();
        mani.fAdelanto();
        mani.fChatbot();
    }
}