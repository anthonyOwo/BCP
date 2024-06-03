import java .util.Scanner;
public class debito {
    public String fTarjeta(){
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



    public static void main(String[]args){
        System.out.println("Hola, ¿qué necesitas hacer hoy? ");
        debito real= new debito();
        real.fTarjeta();

    }
}