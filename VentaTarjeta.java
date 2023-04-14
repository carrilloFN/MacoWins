public class VentaTarjeta extends Venta{

  private int cantidadCuotas;
  private float coeficienteTarjeta;
  private final float PORCENTAJE_PRENDA = 0.01;

  public VentaTarjeta(String nuevaFecha){
    super(nuevaFecha);
    cantidadCuotas=0;
    coeficienteTarjeta=1.0f;
  }

  public VentaTarjeta(List<PrendaVendida> nuevasPrendasVendidas, String nuevaFecha,int cantidadCuotas, float coeficienteTarjeta){
    super(nuevasPrendasVendidas,nuevaFecha);
    this.cantidadCuotas = cantidadCuotas;
    this.coeficienteTarjeta = coeficienteTarjeta;
  }

  @Override
  public float importeTotal(){
    float importe = listadoPrendasVendidas.stream().map( prendaVendida -> prendaVendida.importeParcial() ).sum();
    return this.aplicarRecargo(importe);
  }

  public float aplicarRecargo(float importe){
    return importe += importe * PORCENTAJE_PRENDA + (coeficienteTarjeta * cantidadCuotas);
  }

}
