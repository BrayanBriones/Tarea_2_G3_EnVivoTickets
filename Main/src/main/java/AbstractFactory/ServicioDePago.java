package AbstractFactory;

public class ServicioDePago {
    
    private PagoHandler pago;
    public void realizar_pago(UserPurchase up){
        System.out.println("Realizando el pago...");
        pago.mostrar_confirmacion(up,true);
    }
}
