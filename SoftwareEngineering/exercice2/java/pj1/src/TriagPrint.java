public class TriagPrint {
    static public void main (String[] args) {
        int i, j;
        // triangular two-dimensional array
        int[][] triag = new int[5][]; // define the number of rows
        for (i = 0; i < triag.length; i++) {
            triag[i] = new int[2*i+1];  // define columns: 1 column in row 0, 3 columns in row 1, etc.
            for (j = 0; j < triag[i].length; j++){
                triag[i][j] = i + j;
            }
        }
        Matrix.matrixPrint(triag);
        int avg[] = Matrix.avgRows(triag);
        for (i = 0; i < avg.length ; i++)
        {
            System.out.print(avg[i] + "\n");
        }
    }
}
