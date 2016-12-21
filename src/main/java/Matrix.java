import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Silver on 20.12.2016.
 */


public class Matrix {

    private int[] matrix;
    private final int rows;
    private final int cols;

    public Matrix(int rows, int cols, final int[] sequence) {
        this.matrix = sequence;
        this.rows = rows;
        this.cols = cols;
    }

    public int[] getRow(int i) {
        int[] row = new int[this.cols];
        int n = 0;
        for (int j = i*this.cols; j < i*this.cols+this.cols; j++) {
            row[n] = matrix[j];
            n++;
        }
        return row;
    }

    public void setRow(int[] row, int i){

        if(row.length==this.cols) {
            int n = 0;
            for (int j = i * this.cols; j < i * this.cols + this.cols; j++) {
                matrix[j] = row[n];
                n++;
            }
        } else throw new IllegalArgumentException("Wrong size of row");
    }

    public int getRows() {
        return this.rows;
    }

    public int[] getMatrix() {
        return this.matrix;
    }
}
