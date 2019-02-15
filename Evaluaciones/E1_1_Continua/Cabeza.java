public class Cabeza {

    private String cabello;
    private String forma;
    private Ceja[] cejas;
    private Mejilla[] mejillas;
    private Boca boca;
    private Ojo[] ojos;
    private Oreja[] orejas;
    private Nariz nariz;

    private Cabeza(){}

    public  Cabeza(String cabello,  String forma, Ceja ceja1, Ceja ceja2, Mejilla mejilla1, Mejilla mejilla2, Boca boca, Ojo ojo1, Ojo ojo2, Oreja oreja1, Oreja oreja2, Nariz nariz){

        this.cabello = cabello;
        this.forma = forma;
        cejas = new Ceja[]{ceja1, ceja2};
        mejillas = new Mejilla[]{mejilla1, mejilla2};
        this.boca = boca;
        ojos = new Ojo[]{ojo1, ojo2};
        orejas = new Oreja[]{oreja1, oreja2};
        this.nariz = nariz;

    }

    public Ojo getOjo(int num){

        return ojos[num];

    }

    public Boca getBoca(){

        return boca;

    }

}
