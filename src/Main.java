import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Hilux");

        miVehiculo.setMarca("Fiat");
        System.out.println("Marca de miVehiculo: " + miVehiculo.getMarca());
        System.out.println("Modelo de miVehiculo: " + miVehiculo.getModelo());

        Moto miMoto = new Moto("Honda", "GLH", 150);
        Moto motoVecino = new Moto("Honda", "XR", 150);

        Auto autoRenzo = new Auto("Toyota", "Etios", 4);

        autoRenzo.getCantidadDePuertas();
        motoVecino.getCilindradas();
        autoRenzo.getModelo();

        Vehiculo[] vehiculos = new Vehiculo[5];
        vehiculos[0] = miVehiculo;
        vehiculos[1] = miMoto;
        vehiculos[2] = autoRenzo;
        vehiculos[3] = motoVecino;

        Vehiculo nuevoVehiculo = new Moto("Husqvarna", "Vitpilen", 200);
        System.out.println(Arrays.toString(vehiculos));

        vehiculos[4] = nuevoVehiculo;

        repararTodos(vehiculos);


    }

    private static void repararTodos(Vehiculo[] vehiculos) {
        for(int i = 0; i < vehiculos.length; i++) {
            Taller.arrreglar(vehiculos[i]);
        }
    }
}