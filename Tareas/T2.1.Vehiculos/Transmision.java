public class Transmision {

    //Manual, automática, secuencial, sin transmision (convertidor de torque)
    private String tipo;
    //Simple, Doble, de competición.
    private String embrague;
    private int numVelocidades;

    public Transmision(){

        this.embrague = "Embrague no especificado";
        this.tipo = "Tipo de transmision no especificada";
        this.numVelocidades = -1;

    }

    public Transmision(String tipo, String embrague, int numVelocidades){

        this.embrague = embrague;
        this.tipo = tipo;
        this.numVelocidades = numVelocidades;

    }

    public void setTipo(String tipo){

        this.tipo = tipo;

    }

    public void setEmbrague(String embrague){

        this.embrague = embrague;

    }

    public void setNumVelocidades(int velocidades){

        this.numVelocidades = velocidades;

    }

    public String getTipo(){

        return tipo;

    }

    public String getEmbrague(){

        return embrague;

    }

    public int getNumVelocidades(){

        return numVelocidades;

    }

}
