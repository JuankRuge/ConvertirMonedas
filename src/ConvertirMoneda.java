import java.util.Scanner;

public class ConvertirMoneda {

    //metodo opciones del menu estandar
    public static void convertir (String monedaBase, String monedaDestino, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadCalculada;

        Moneda monedas = consulta.buscarMoneda(monedaBase, monedaDestino);
        System.out.println("la tasa de cambio hoy \n "+monedaBase+ " = "+monedas.conversion_rate()+" " +monedaDestino);
        System.out.println("Ingresa cantidad de "+monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadCalculada = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" Equivalen a: "+cantidadCalculada+ " "+monedaDestino); //"con esta tasa de cambio: "+ monedas.conversion_rate());
    }
    // metodo convertir otra moneda no listada en le menu
    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingresa codigo moneda origen: ");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingresa codigo moneda objetivo: ");
        String monedadestino = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedadestino, consulta, lectura);
    }
}
