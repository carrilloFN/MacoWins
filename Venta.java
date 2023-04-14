import java.util.Collections;

public class Venta {
  private List<PrendaVendida> listadoPrendasVendidas;
  private String fecha;

  public Venta(String nuevaFecha){
    listadoPrendasVendidas = new ArrayList<>();
    fecha = nuevaFecha;
  }

  public Venta(List<PrendaVendida> nuevasPrendasVendidas, String nuevaFecha){
    listadoPrendasVendidas = nuevasPrendasVendidas;
    fecha = nuevaFecha;
  }

  public importeTotal(){
    return listadoPrendasVendidas.stream().map( prendaVendida -> prendaVendida.importeParcial() ).sum();
  }

  public boolean tieneMismaFecha(String fecha){
    return this.fecha.equals(fecha);
  }

}
