import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();


        int selecion=0;
        while (selecion !=8){
            System.out.println("""
                    ************************************************
                    Bienvenido al conversor de divisas
                   \s
                    Favor ingresar la conversion que deseas realizar\s
                        1. Dollar a Peso Argentino
                        2. Peso Argentino a Dollar
                        3. Dollar a Real Brasilero
                        4. Real Brasilero a Dollar
                        5. Dollar a Peso Colombianoa
                        6. Peso Colombiano a Dollar
                        7. Otra moneda no listada
                        8. Salir""");
            selecion = lectura.nextInt();
            lectura.nextLine();

            switch (selecion){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS", consulta,lectura );
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD", consulta,lectura );
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL", consulta,lectura );
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD", consulta,lectura );
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP", consulta,lectura );
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD", consulta,lectura );
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda( consulta,lectura );
                    break;
                case 8:
                    System.out.println("Saliendo del conversor de monedas");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}
