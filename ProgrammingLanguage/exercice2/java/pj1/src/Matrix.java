public class Matrix {

    public static void matrixPrint(int[][] mat) {
        int i, j;
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[] avgRows(int[][] mat) {
        int i, j;
        int a[] = new int[mat.length];
        for (i = 0; i < mat.length; i++) {
            a[i] = 0;
            for (j = 0; j < mat[i].length; j++) {
                a[i] += mat[i][j];
            }
        }
        return a;
    }
}
