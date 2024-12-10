package AbstractFactory;

public class Paypal extends PagoHandler implements IAbstractFactoryPago{

    @Override
    public void procesar_Pago(UserPurchase u){
        System.out.println("Procesando pago paypal...");
    }

    public PagoHandler crearServicioPago(){
        return new PagoHandler();
    }
    
}
