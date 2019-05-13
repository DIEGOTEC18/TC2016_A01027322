import java.util.Arrays;

public class Matrix {

    public Flotantes[][] matrix = null;

    private int lenght;

    private Matrix(){

    }

    public Matrix(int n){

        matrix = new Flotantes[n][n];
        lenght = n;

        /*for(int i = 0; i < n; i++){

            for(int ix; ix ){



            }

        }*/

    }

    public void setValue(int row, int column, Flotantes value){

        matrix[column][row] = value;

    }

    public Flotantes getValue(int column, int row){

        return matrix[column][row];

    }

    public void print(){

        for(int i = 0; i < lenght; i++){

            //System.out.println(i);

            //matrix[i][0].printValue();
           //matrix[i][1].printValue();
            //matrix[i][2].printValue();


            for(int ix = 0; ix < lenght; ix++){

                if(matrix[i][ix] != null) {

                    System.out.print(matrix[i][ix].getValue() + " ");

                } else {

                    System.out.print("null" + " ");

                }

                if(ix == lenght -1){

                    System.out.println();

                }

            }

        }

    }

}
