import java.time.Year;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String color;
    private int numPasajeros;
    private double precioDeCompra;
    private int kilometraje;
    private Motor motorDelVehiculo;
    private Transmision transmisionDelVehiculo;
    private Puertas puertasDelVehiculo;
    private Ventanas[] ventanasDelVehiculo;
    private Llantas llantasDelVehiculo;
    private Conductor conductorDelVehiculo;
    private Pasajero[]listaDePasajeros;

    private int contVentanas = 0;
    private int contPasajero = 0;


    public Vehiculo(){

        this.marca = "Marca no especificada";
        this.modelo = "Modelo no especificado";
        this.ano = 0;
        this.color = "Color no especificado";
        this.numPasajeros = 0;
        this.precioDeCompra = 0.0;
        this.kilometraje = -1;
        motorDelVehiculo = new Motor();
        transmisionDelVehiculo = new Transmision();
        puertasDelVehiculo = new Puertas();
        llantasDelVehiculo = new Llantas();
        conductorDelVehiculo = new Conductor();

    }

    public Vehiculo(String marca, String modelo, int ano, String color, int numPasajeros, double precioDeCompra, int kilometraje, int numVentanas){

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.numPasajeros = numPasajeros;
        this.precioDeCompra = precioDeCompra;
        this.kilometraje = kilometraje;
        motorDelVehiculo = new Motor();
        transmisionDelVehiculo = new Transmision();
        puertasDelVehiculo = new Puertas();
        ventanasDelVehiculo = new Ventanas[numVentanas];
        llantasDelVehiculo = new Llantas();
        conductorDelVehiculo = new Conductor();
        listaDePasajeros = new Pasajero[numPasajeros];

    }

    public void setMarca(String marca){

        this.marca = marca;

    }

    public void setModelo(String modelo){

        this.modelo = modelo;

    }

    public void setAno(int ano){

        this.ano = ano;

    }

    public void setColor(String color){

        this.color = color;

    }

    public void setNumPasajeros(int numPasajeros){

        this.numPasajeros = numPasajeros;

    }

    public void setPrecioDeCompra(double precioDeCompra){

        this.precioDeCompra = precioDeCompra;

    }

    public void setKilometraje(int kilometraje){

        this.kilometraje = kilometraje;

    }

    public void setMotor(Motor motor){

        this.motorDelVehiculo = motor;

    }

    public void setTransmision(Transmision transmision){

        this.transmisionDelVehiculo = transmision;

    }

    public void setPuertas(Puertas puertas){

        this.puertasDelVehiculo = puertas;

    }

    public void addVentana(Ventanas ventana){

        ventanasDelVehiculo[contVentanas] = ventana;

        contVentanas++;

    }

    public void setConductor(Conductor conductor){

        this.conductorDelVehiculo = conductor;

    }

    public void addPasajero(Pasajero pasajero){

        listaDePasajeros[contPasajero] = pasajero;

        contPasajero++;
    }

    public void setLlantasDelVehiculo(Llantas llantas){

        llantasDelVehiculo = llantas;

    }

    //---

    public String getMarca(){

        return marca;

    }

    public String getModelo(){

        return modelo;

    }

    public int gettAno(){

        return ano;

    }

    public String getColor(){

        return color;

    }

    public int getNumpasajeros(){

        return numPasajeros;

    }

    public double getPrecioDeCompra(){

        return precioDeCompra;

    }

    public int getKilometraje(){

        return kilometraje;

    }

    public Motor getMotor(){

        return motorDelVehiculo;

    }

    public Transmision getTransmision(){

        return transmisionDelVehiculo;

    }

    public Puertas getPuertas(){

        return puertasDelVehiculo;

    }

    public Ventanas[] getVentanas(){

        return ventanasDelVehiculo;

    }

    public Conductor getConductor(){

        return conductorDelVehiculo;

    }

    public Pasajero[] getPasajeros(){

        return listaDePasajeros;

    }

    public Llantas getLlantas(){

        return llantasDelVehiculo;

    }

    public void descripcionDelVehiculo(){

        System.out.print(marca + " " + modelo + " " + ano);

    }

    public int edadDelVehiculo(){

        return Year.now().getValue() - ano;

    }

    public void precioDeVenta(){

        double precioActual = precioDeCompra;

        for(int i = 0; i < edadDelVehiculo(); i++){

            precioActual = precioActual - (precioActual * 0.20);

        }

        System.out.println("Precio actual del vehículo: " + precioActual);

    }

    public void siguienteServicio(){

        if(kilometraje == 10000 || kilometraje == 30000 || kilometraje == 50000 || kilometraje == 70000 || kilometraje == 90000){

            System.out.println("Servicio Basico ahora.");

        } else {
            if (kilometraje == 20000 || kilometraje == 60000) {

                System.out.println("Servicio Medio ahora.");

            } else if (kilometraje == 40000 || kilometraje == 80000) {

                System.out.println("Servicio Completo ahora.");

            } else if (kilometraje == 100000) {

                System.out.println("Servicio Completo Plus ahora.");

            } else {

                if(kilometraje < 10000){

                    System.out.println("Faltan " + (10000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Basico.");

                } else if(kilometraje > 20000 && kilometraje < 30000){

                    System.out.println("Faltan " + (30000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Basico.");

                } else if(kilometraje > 40000 && kilometraje < 50000){

                    System.out.println("Faltan " + (50000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Basico.");

                } else if(kilometraje > 60000 && kilometraje < 70000){

                    System.out.println("Faltan " + (70000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Basico.");

                } else if(kilometraje > 80000 && kilometraje < 90000){

                    System.out.println("Faltan " + (90000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Basico.");

                } else if(kilometraje > 10000 && kilometraje < 20000){

                    System.out.println("Faltan " + (20000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Medio.");

                } else if(kilometraje > 50000 && kilometraje < 60000){

                    System.out.println("Faltan " + (60000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Medio.");

                } else if(kilometraje > 30000 && kilometraje < 40000){

                    System.out.println("Faltan " + (40000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Completo.");

                } else if(kilometraje > 70000 && kilometraje < 80000){

                    System.out.println("Faltan " + (80000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Completo.");

                } else if(kilometraje > 90000 && kilometraje < 100000){

                    System.out.println("Faltan " + (100000 - kilometraje) + "km para el siguiente servicio. Le corresponde el servicio Completo Plus.");

                } else{

                    System.out.println("Kilometraje mayor a los 100000km. Por favor consulte a su consecionaria para recibir el servicio adecuado para el ñilometraje de su vehículo.");

                }

            }

        }

    }
}
