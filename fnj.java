import java.util.Scanner;
public class fnj {
    public String fMenu(){
        Scanner mani=new Scanner(System.in);
        Scanner BcP = new Scanner(System.in);
        String opcion;
        System.out.printf("Bienvenido a BCP \n");
        System.out.printf("En que te puedo ayudar hoy\n");
        System.out.printf("1: Abrir una cuenta\n");
        System.out.printf("2: Obtener tarjeta de credito\n");
        System.out.printf("3: Solicitar un prestamo\n");
        System.out.printf("4: Adelantar sueldo\n");
        System.out.printf("5: Protejer mis tarjetas\n");
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
                System.out.println("Ingrese su número de cel4ular");
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
                this.fTarjetas();
                break;
            case "3":
                this.fprestamo();
                break;
            case "4":
                this.fAdelanto();
                break;
            case "5":
                this.fProteccion();
                break;

        }

       return null;


    }
    public String fAdelanto(){
        int numero;
        Scanner ms = new Scanner(System.in);
        numero= ms.nextInt();
        Boolean fin=false;
        switch (numero) {
            case 4:
                while(!fin) {
                    System.out.println("si en cualquier momento desea salir de la pagina solo presione 9");
                    System.out.println("¿Cuáles son los beneficios del Adelanto de Sueldo?");
                    System.out.println("1.- Al instante" +
                            "En 3 simples pasos desde el App Banca Móvil o Banca por Internet");
                    System.out.println("2.- Adelanta lo que necesitas" +
                            "Desde S/ 50 hasta S/ 2,500, tú eliges el monto.");
                    System.out.println("3.- Comisión única" +
                            "Olvídate de los intereses y paga una comisión única por operación.");
                    System.out.println("4.- Sin complicaciones" +
                            "Se debita automáticamente de tu próxima remuneración. Olvídate de la fecha de pago.");

                    System.out.println("ADELANTO DE MI SUELDO");
                    System.out.println("100% online y en 3 simples pasos");
                    System.out.println("presione 1 para OBTENERLO AQUI");
                    int inicio = ms.nextInt();
                    if (inicio == 1){
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
                        System.out.println("Solicita tu adelanto de Sueldo");
                        System.out.println("presione 1 para OBTENERLO AQUI");
                        inicio= ms.nextInt();
                        if (inicio==1){
                            int dni,nt,clave;
                            System.out.println("Esta ventana se cerrará 300 segundos");
                            System.out.println("Banca por Internet");
                            System.out.println("ingrese los datos pedidos");
                            System.out.println("DNI:");
                            dni= ms.nextInt();
                            System.out.println("Numero de tarjeta:");
                            nt= ms.nextInt();
                            System.out.println("clave de internet de 6 digitos");
                            clave= ms.nextInt();
                            System.out.println("app no terminada :(, disculpe los inconvenientes");
                            System.out.println("si desea continuar con este proceso puede dirigirse a la siguiente pagina web de BCP");
                            System.out.println("https://www.viabcp.com/creditos/otros-creditos/adelanto-de-sueldo?pcid=viabcp:home:adelantar-mi-sueldo:masivo:que-hacemos-hoy4");
                            fin=true;
                        }
                        else if (inicio==9){
                            fin=true;
                        }
                        else{
                            System.out.println("Estas en la App BCP no presione cualquier tecla");
                        }
                    }
                    else if (inicio==9){
                        fin=true;
                    }
                    else{
                        System.out.println("Estas en la App BCP no presione cualquier tecla");
                    }
                }
        }
        return null;

    }
     private String fprestamo(Scanner cat) {
        String nombre, edad, correo,fecha_pago,nombre1,correo1,cuotas;
        int monto,N_tarjeta1,N_tarjeta,dni,dni1,clave,clave1,interes,monto_5,monto_total;
        System.out.println("-------BIENVENIDO A LA CUENTA DE PRESTAMO------");
        System.out.println("ingrese sus datos");
        System.out.println("ingrese su nombre");
        nombre = cat.nextLine();
        System.out.println("ingrese su DNI");
        dni= cat.nextInt();
        System.out.println("ingrese su numero de tarjeta");
        N_tarjeta= cat.nextInt();
        System.out.println("ingrese su clave de 6 digitos");
        clave= cat.nextInt();
        System.out.println("ingrese su edad");
        edad= cat.nextLine();
        System.out.println("ingrese su correo");
        correo= cat.nextLine();
        System.out.println("---DATOS GUARDADOS EXITOSAMENTE---");
        if(edad => 18) {
            System.out.println("ingrese el monto del prestamo");
            monto= cat.nextInt();
            System.out.println("ingrese la fecha de pago");
            System.out.println(" 1. 02 de cada mes");
            System.out.println(" 2. 15 de cada mes");
            System.out.println(" 3. 28 de cada mes");
            fecha_pago=cat.nextLine();
            System.out.println("---VERIFIQUE SU IDENTIDAD----");
            System.out.println("ingrese su nombre");
            nombre1=cat.nextLine();
            System.out.println("ingrese su dni");
            dni1=cat.nextInt();
            System.out.println("ingrese su correo");
            correo1=cat.nextLine();
             else if(equals(correo==correo1)&&equals(dni==dni1)&&equals(nombre==nombre1)) {
                 System.out.println("ingrese su numero de tarjeta");
                 N_tarjeta1=cat.nextInt();
                System.out.println("ingrese su clave de 6 digitos");
                clave1=cat.nextInt();
                if (equals(N_tarjeta==N_tarjeta1)&&equals(clave==clave1)){
                    System.out.println("en cuantas cuotas desea pagar?");
                    System.out.println("1. 5 cuotas");
                    System.out.println("2. 10 cuotas");
                    System.out.println("3. 15 cuotas");
                    cuotas=cat.nextLine();
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

             }
        }
        else{
        System.out.println("usted es menor de edad, no puede acceder a un prestamo");
        } 
    }
    
    public String fTarjetas(){
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
                                    String tarjeta;
                                    System.out.println("Campañas de Cashback\n" + "Membresía anual S/80 (GRATIS si consumes S/50 al mes)");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }

                                    break;
                                case "2":
                                    System.out.println("Sin consumo mínimo\n" + "Membresía anual GRATIS");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }
                                    break;
                                case "3":
                                    System.out.println("Membresía anual S/80 (GRATIS si consumes S/1 al mes)\n" + "1 Milla acumulada por cada 2 USD que consumas.\n" + "Campañas multiplicadoras de Millas");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }

                                    break;
                                case "4":
                                    System.out.println("Membresía anual S/170 (GRATIS si consumes S/1 al mes)\n" + "1 Milla acumulada por cada 1.5 USD que consumas\n" + "Campañas multiplicadoras de Millas");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2": String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }
                                    break;
                                case "5":
                                    System.out.println("3,000 Millas de bienvenida\n" + "Membresía anual S/370 (GRATIS si consumes S/1,200 al mes)\n" + "1 Milla acumulada por cada 1 USD que consumas");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }
                                    break;
                                case "6":
                                    System.out.println("10,000 Millas\u200B de bienvenida\n" +
                                            "Membresía anual S/450.  (Sujeto a Términos y condiciones)\n" +
                                            "TEA Máxima de compras 39.00% - 81.5%\n" +
                                            "Tasa de interés TCEA Máxima 173.7");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }
                                    break;
                                case "7":
                                    System.out.println("Tarjeta de Crédito digital y física.\n" +
                                            "Membresía cero: ni mensual, ni anual.\n" +
                                            "Acumula cashback por tus compras.\n" +
                                            "Accede a descuentos exclusivos");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            System.out.println("");
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }
                                            break;
                                    }
                                    break;
                            }

                            break;
                        case "2":
                            String amex, tarjeta ;
                            System.out.println("Resultados:\n"+ "4 Tarjetas");
                            System.out.println("1.Amex Clásica LATAM Pass\n");
                            System.out.println("2.Amex Oro LATAM Pass\n");
                            System.out.println("3.Amex Platinum LATAM Pass\n");
                            System.out.println("4.Amex Black LATAM Pass\n");
                            amex =beli.nextLine();
                            switch (amex){
                                case "1":
                                    System.out.println("Membresía anual S/80 (GRATIS si consumes S/1 al mes)\n" +
                                            "1 Milla acumulada por cada 2 USD que consumas.\n" +
                                            "Campañas multiplicadoras de Millas");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }

                                    }
                                    break;

                                case "2":
                                    System.out.println("Membresía anual S/170 (GRATIS si consumes S/1 al mes)\n" +
                                            "Membresía anual GRATIS\n" +
                                            "Campañas multiplicadoras de Millas");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }

                                    }
                                    break;
                                case "3":
                                    System.out.println("3,000 Millas de bienvenida\n" +
                                            "Membresía anual S/350 (GRATIS si consumes S/1,200 al mes)\n" +
                                            "1 Milla acumulada por cada 1 USD que consumas.\n" +
                                            "S/150 de descuento, descorche gratis y postre de cortesía en restaurantes seleccionados");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("No gracias");

                                            }

                                    }
                                    break;
                                case"4":
                                    System.out.println("6,000 Millas de bienvenida\n" +
                                            "Membresía anual S/400 (GRATIS si consumes S/3,500 al mes)\n" +
                                            "1.5 Millas acumulada por cada 1 USD que consumas.\n" +
                                            "Priority Pass + 2 invitados");
                                    System.out.println("Obtener una Tarjeta de Crédito BCP");
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
                                            break;
                                        case "2":
                                            String datos;
                                            System.out.println("Tómate una foto y sube las imágenes\n" + "de tu DNI desde tu computadora");
                                            System.out.println("Por tu seguridad, lo validaremos con RENIEC.");
                                            System.out.println("¿Aceptas y declaras conocer el tratamiento de datos personales\n" + " para identificarte?");
                                            datos = beli.nextLine();
                                            if (datos.equals("si")){
                                                System.out.println("Ubica tu rostro en el círculo\n");

                                            } else if (datos.equals("no")) {
                                                System.out.println("Ojala ");

                                            }else {
                                                System.out.println("Opcion invalida");
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
                    System.out.println("Tarjetas de Débito\n" + "¡Conoce las tarjetas que tenemos para ti!");
                    System.out.println("1.Tarjeta de Débito Visa Clásica BCP");
                    System.out.println("2.Tarjeta de Débito Visa Clásica BCP Latam Pass");
                    System.out.println("3.Tarjeta de Débito Visa BCP con Diseño");
                    debito=beli.nextLine();
                    switch (debito){
                        case "1":
                            System.out.println("Tarjeta de Débito Visa Clásica BCP\n");
                            System.out.println("Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                            System.out.println("¡Y sin pagar intereses ni comisiones!");
                            System.out.println("¿Desea solicitar?");
                            sol= beli.nextLine();
                            if (sol.equals("si")){
                                String correo,cel,region,provi;
                                System.out.println("Ingresa tus datos y elige tu cuenta");
                                System.out.println("Correo electronico");
                                correo =beli.nextLine();
                                System.out.println("Numero de celular");
                                cel=beli.nextLine();
                                System.out.println("¿Donde vives?");
                                System.out.println("Region");
                                region=beli.nextLine();
                                System.out.println("Provincia");
                                provi= beli.nextLine();
                            }
                            else if (sol.equals("no")){
                                System.out.println("Bueno sera a la proxima");
                            }

                            break;
                        case "2":
                            System.out.println("Tarjeta de Débito Visa Clásica BCP\n");
                            System.out.println("Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                            System.out.println("¡Y sin pagar intereses ni comisiones!");
                            System.out.println("¿Desea solicitar?");
                            sol= beli.nextLine();
                            if (sol.equals("si")){
                                String correo,cel,region,provi,mone;
                                System.out.println("Ingresa tus datos y elige tu cuenta");
                                System.out.println("Correo electronico");
                                correo =beli.nextLine();
                                System.out.println("Numero de celular");
                                cel=beli.nextLine();
                                System.out.println("¿Donde vives?");
                                System.out.println("Region");
                                region=beli.nextLine();
                                System.out.println("Provincia");
                                provi= beli.nextLine();
                                System.out.println("¿En qué moneda deseas abrir tu cuenta? ");
                                System.out.println("1.Soles");
                                System.out.println("2.Dolares");
                                mone=beli.nextLine();
                                switch (mone){
                                    case "1":
                                        System.out.println("Verifiquemos tu identidad");
                                        System.out.println("Numero de DNI");
                                        dni=beli.nextLine();
                                        break;
                                    case "2":
                                        break;
                                    default:
                                        System.out.println("");
                                }

                            }
                            else if (sol.equals("no")){
                                System.out.println("Bueno sera a la proxima");
                            }

                            break;
                        case "3":
                            System.out.println("Tarjeta de Débito Visa Clásica BCP\n");
                            System.out.println("Olvídate de cargar tanto efectivo en la billetera o de tener cambio exacto.");
                            System.out.println("¡Y sin pagar intereses ni comisiones!");
                            System.out.println("¿Desea solicitar?");
                            sol= beli.nextLine();
                            if (sol.equals("si")){
                                String correo,cel,region,provi;
                                System.out.println("Ingresa tus datos y elige tu cuenta");
                                System.out.println("Correo electronico");
                                correo =beli.nextLine();
                                System.out.println("Numero de celular");
                                cel=beli.nextLine();
                                System.out.println("¿Donde vives?");
                                System.out.println("Region");
                                region=beli.nextLine();
                                System.out.println("Provincia");
                                provi= beli.nextLine();
                            }
                            else if (sol.equals("no")){
                                System.out.println("Bueno sera a la proxima");
                            }

                            break;
                    }
                    break;


            }

            System.out.println("Cómo obtener una Tarjeta de Crédito BCP");

            System.out.println("Escriba su Num de DNI");
            dni = beli.nextLine();

            return null;
        }

    public String fProteccion(){
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

        return null;

    }

    public static void main(String[]args){
        fnj mani =  new fnj();
        mani.fMenu();
        mani.fAdelanto();
        mani.fTarjetas();
        mani.fProteccion();
    }
}
