public class Motor {

    private String tipo;
    private double hp;
    private int cm2;
    private String aspiracion;

    public Motor(){

        this.tipo = "Motor no especificado";
        this.aspiracion = "Aspiración no especificada";
        this.cm2 = -1;
        this.hp = -1;

    }

    public Motor(String tipo, String aspiracion, int cm2, double hp){

        this.tipo = tipo;
        this.aspiracion = aspiracion;
        this.cm2 = cm2;
        this.hp = hp;

    }

    public void setTipo(String tipo){

        this.tipo = tipo;

    }

    public void setHp(double hp){

        this.hp = hp;

    }

    public void setCm2(int cm2){

        this.cm2 = cm2;

    }

    public void setAspiracion(String aspiracion){

        this.aspiracion = aspiracion;

    }

    public String getTipo(){

        return  tipo;

    }

    public double getHp(){

        return hp;

    }

    public int getCm2(){

        return cm2;

    }

    public String getAspiracion(){

        return aspiracion;

    }

}
