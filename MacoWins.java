import java.util.Collections;

public class MacoWins {
  private List<Venta> listadoVentas;

  public MacoWins(){
    listadoVentas = new ArrayList<>();
  }

  public MacoWins(List<Venta> ventas){
    this.listadoVentas = ventas;
  }

  public void agregarVenta(Venta ventaNueva){
    listadoVentas.add(ventaNueva);
  }

  public float gananciasDelDia(String fecha){
    return listadoVentas.stream().filter( item -> item.tieneMismaFecha(fecha) ).map( item -> item.importeTotal() ).sum();
  }

}
