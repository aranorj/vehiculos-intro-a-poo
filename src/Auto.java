public class Auto extends Vehiculo {
    private int cantidadDePuertas;

    public Auto(String marca, String modelo, int cantidadDePuertas) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }
    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
}
