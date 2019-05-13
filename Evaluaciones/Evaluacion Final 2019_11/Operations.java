public class Operations {
    private static Operations ourInstance = new Operations();

    public static Operations getInstance() {
        return ourInstance;
    }

    private Operations() {
    }

    public void transpuesta(Matrix matrix){

        //matrix.matrix[0][0] = matrix.matrix[0][0];

        //matrix.matrix[0][1] = matrix.matrix[1][0];

        //matrix.matrix[0][2] = matrix.matrix[2][0];

        Matrix newMatrix = new Matrix(matrix.matrix.length);


        for(int i = 0; i < matrix.matrix.length; i++){

            for(int ix = 0; ix < matrix.matrix.length; ix++){

                newMatrix.matrix[ix][i] = matrix.matrix[i][ix];

            }

        }

        matrix.matrix = newMatrix.matrix;

    }

    public void  superior(Matrix matrix){



    }

    public void inferior(Matrix matrix){



    }

}
