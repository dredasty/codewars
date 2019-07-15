package org.fresh.codewars.kata.kyu6.matricesiaformofdatastorage;

import java.util.*;

public class Matrix<E> {

    private final int rows;
    private final int cols;
    private final Object[][] matrix;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new Object[rows][cols];
    }

    public E get(int i, int j) {
        return (E) matrix[i - 1][j - 1];
    }

    public void set(int i, int j, E value) {
        matrix[i - 1][j - 1] = value;
    }

    public void setRow(int i, E... values) {
        matrix[i - 1] = Arrays.copyOf(values, values.length);
    }

    public void swap(int i1, int j1, int i2, int j2) {
        Object temp = matrix[i1 - 1][j1 - 1];
        matrix[i1 - 1][j1 - 1] = matrix[i2 - 1][j2 - 1];
        matrix[i2 - 1][j2 - 1] = temp;
    }

    public String[][] toArray() {
        String[][] arr = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            arr[i] = new String[cols];
            for (int j = 0; j < cols; j++) {
                arr[i][j] = String.valueOf(matrix[i][j]);
            }
        }
        return arr;
    }
}