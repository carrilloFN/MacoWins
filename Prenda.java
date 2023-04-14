public class Prenda{

  private float precioVenta;
  private Estado estado;
  private String tipo;

  public Prenda(){}

  public Prenda(float precioVenta, Estado estado ,String tipo){
    this.precioVenta = precioVenta;
    this.estado = estado;
    this.tipo = tipo;
  }

  public precio(){
    return estado.precioFinal(this.precioVenta);
  }

}
