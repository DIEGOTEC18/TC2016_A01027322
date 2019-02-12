public class Cliente extends Person{

    private Cliente(){



    }

    public Cliente(String name){

        super(name);

    }

    public void retirar(double cantidad, Sucursal sucursal){

        sucursal.retiro(cantidad, this);

    }

}
