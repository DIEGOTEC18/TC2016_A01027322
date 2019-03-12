import javax.naming.InsufficientResourcesException;

public class Banco {

    protected double balance;

    private Banco(){}

    public Banco(double initialBalance){

        balance = initialBalance;

    }

    public void depositar(double amount){

        balance += amount;

    }

    public double reirar(double amount) throws InsufficientFundsException {

        if(amount > balance){

            throw new InsufficientFundsException(amount - balance);

        } else{

            balance -= amount;
            return amount;

        }

    }

}
