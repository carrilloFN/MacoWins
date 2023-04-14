public class Promocion implements Estado{

  float descuento;

  public Promocion(float descuento){
    this.descuento = descuento;
  }

  @Override
  public float precioFinal(float precioPrenda){
    return precioPrenda * descuento;
  }

}
