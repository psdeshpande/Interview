/*
Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.
*/

public void setZeros(int[][] matrix) {
  boolean[] row = new booleanfmatrix.length];
  boolean[] column = new boolean[matrix[0].length];

 // Store the row and column index with value 0
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length;j++) {
      if (matrix[i][j] == 0) {
        row[i] = true;
        column[j] = true;
      }
    }
 }

 // Set arr[i][j] to 0 if either row i or column j has a 0
  for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
      if (row[i] || column[j]) {
      matrix[i][j] = 0;
    }
  }
}
