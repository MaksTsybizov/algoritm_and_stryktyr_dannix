public class Matrix {

public static int[][] add(int[][] a, int[][] b) {
int rows = a.length;
int cols = a[0].length;
int[][] result = new int[rows][cols];
for(int i = 0; i < rows; i++) {
for(int j = 0; j < cols; j++) {
result[i][j] = a[i][j] + b[i][j];
}
}
return result;
}

public static int[][] subtract(int[][] a, int[][] b) {
int rows = a.length;
int cols = a[0].length;
int[][] result = new int[rows][cols];
for(int i = 0; i < rows; i++) {
for(int j = 0; j < cols; j++) {
result[i][j] = a[i][j] - b[i][j];
}
}
return result;
}

public static int[][] multiply(int[][] a, int[][] b) {
int rowsA = a.length;
int colsA = a[0].length;
int rowsB = b.length;
int colsB = b[0].length;
if(colsA != rowsB) {
return null;
}
int[][] result = new int[rowsA][colsB];
for(int i = 0; i < rowsA; i++) {
for(int j = 0; j < colsB; j++) {
int sum = 0;
for(int k = 0; k < colsA; k++) {
sum += a[i][k] * b[k][j];
}
result[i][j] = sum;
}
}
return result;
}

public static int[][] transpose(int[][] a) {
int rows = a.length;
int cols = a[0].length;
int[][] result = new int[cols][rows];
for(int i = 0; i < rows; i++) {
for(int j = 0; j < cols; j++) {
result[j][i] = a[i][j];
}
}
return result;
}

public static int sum(int[][] a) {
int rows = a.length;
int cols = a[0].length;
int sum = 0;
for(int i = 0; i < rows; i++) {
for(int j = 0; j < cols; j++) {
sum += a[i][j];
}
}
return sum;
}

public static void print(int[][] a) {
int rows = a.length;
int cols = a[0].length;
for(int i = 0; i < rows; i++) {
for(int j = 0; j < cols; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}

public static void main(String[] args) {
int[][] a = {{1, 2, 3}, {4, 5, 6}};
int[][] b = {{7, 8, 9}, {10, 11, 12}};
int[][] c = add(a, b);
print(c);
}


}
