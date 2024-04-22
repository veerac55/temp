package Assigment1;

import java.awt.Window.Type;

public class day4and5constructors {
	public class Matrix {
	    private int rows;
	    private int cols;
	    private int[][] data;

	    public Matrix(int rows, int cols) {
	        this.rows = rows;
	        this.cols = cols;
	        this.data = new int[rows][cols];
	    }

	    public void fillMatrix(int[][] values) {
	        if (values.length != rows || values[0].length != cols) {
	            System.out.println("Dimensions of input values do not match matrix dimensions.");
	            return;
	        }
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                this.data[i][j] = values[i][j];
	            }
	        }
	    }

	    public void printMatrix() {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(data[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage:
	        int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        Matrix matrix = new Matrix(3, 3);
	        matrix.fillMatrix(values);
	        System.out.println("Filled Matrix:");
	        matrix.printMatrix();
	    }
	}


}
