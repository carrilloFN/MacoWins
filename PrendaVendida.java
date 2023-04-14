public class PrendaVendida {

  private Prenda prenda;
  private int cantidad;

  public PrendaVendida(){}

  public PrendaVendida(Prenda prenda, int cantidad){
    this.prenda = prenda;
    this.cantidad = cantidad;
  }

  public float importeParcial(){
    return cantidad * prenda.precio();
  }

}
