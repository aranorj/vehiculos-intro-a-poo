public class Moto extends Vehiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }
     public int getCilindradas() {
         return cilindradas;
     }
     public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
     }
}
