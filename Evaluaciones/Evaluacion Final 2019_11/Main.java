public class Main {

    public static void main(String[] args) {

        Matrix myMatrix = new Matrix(3);

        Operations operations = Operations.getInstance();

        myMatrix.setValue(0,0, new Flotantes(1));

        myMatrix.setValue(1,0, new Flotantes(2));

        myMatrix.setValue(2,0, new Flotantes(3));

        myMatrix.setValue(0,1, new Flotantes(1.1f));

        myMatrix.setValue(0,2, new Flotantes(1.2f));

        myMatrix.setValue(1,1, new Flotantes(2.1f));

        myMatrix.setValue(1,2, new Flotantes(2.2f));

        myMatrix.setValue(2,1, new Flotantes(3.1f));

        myMatrix.setValue(2,2, new Flotantes(3.2f));

        //myMatrix.getValue(0,0).printValue();

        myMatrix.print();

        operations.transpuesta(myMatrix);

        System.out.println("\n---\n");

        myMatrix.print();

    }
}
