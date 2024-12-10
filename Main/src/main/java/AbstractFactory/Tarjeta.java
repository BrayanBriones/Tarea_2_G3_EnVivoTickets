package AbstractFactory;

public class Tarjeta extends PagoHandler implements IAbstractFactoryPago{
    @Override
    public void procesar_Pago(UserPurchase u){
        System.out.println("Procesando pago tarjeta...");
    }

    public PagoHandler crearServicioPago(){
        return new PagoHandler();
    }
}
