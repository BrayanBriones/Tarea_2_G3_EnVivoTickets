package AbstractFactory;

public class PagoHandler {

    private ServicioDePago servicio;
    public void procesar_Pago(UserPurchase up){
        System.out.println("Procesando pago...");
        servicio.realizar_pago(up);
    }
    public void mostrar_confirmacion(UserPurchase up, boolean b){
        System.out.println("Mostrando confirmacion...");
        up.mostrar_resultadoPago(b);
    }
}
