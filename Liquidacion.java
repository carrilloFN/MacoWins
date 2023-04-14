public class Liquidacion implements Estado{
  @Override
  public float precioFinal(float precioPrenda){
    return precioPrenda * 0.5;
  }
}
