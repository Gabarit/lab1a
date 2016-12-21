import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Silver on 21.12.2016.
 */
public class MatrixTransformerTest {

    @Test
    public void reverseSortTest() {
        int[] array = {1,2,3,4};
        int[] answer = {4,3,2,1};
        MatrixTransformer transformer = new MatrixTransformer();

        array = transformer.reverseSort(array);

        assertArrayEquals(answer,array);
    }

    @Test
    public void findAverageTest() {
        int[] array = {1,2,3};
        MatrixTransformer transformer = new MatrixTransformer();

        assertEquals(3.0, transformer.findAverage(array), 1);
    }

    @Test
    public void transformMatrixTest() {
        int[] sequence = new int[]{1,2,3,4,5,6,7,8,9};
        int rows = 3;
        int cols = 3;
        int[] answer = new int[]{1,2,3,6,5,4,7,8,9};
        Matrix matrix = new Matrix(rows,cols,sequence);
        MatrixTransformer transformer = new MatrixTransformer();

        transformer.transformMatrix(2,matrix);

        assertArrayEquals(answer,matrix.getMatrix());
    }

    @Test(expected = IllegalArgumentException.class)
    public void transformMatrixTestZeroInput() {
        int[] sequence = new int[]{1,2,3,4,5,6,7,8,9};
        int rows = 3;
        int cols = 3;
        int[] answer = new int[]{3,2,1,6,5,4,9,8,7};
        Matrix matrix = new Matrix(rows,cols,sequence);
        MatrixTransformer transformer = new MatrixTransformer();

        transformer.transformMatrix(0,matrix);

        assertArrayEquals(answer,matrix.getMatrix());
    }

    @Test
    public void transformMatrixTestNoRowNumber() {
        int[] sequence = new int[]{1,2,3,4,5,6,7,8,9};
        int rows = 3;
        int cols = 3;
        String answer = "[2.0, 5.0, 8.0]";
        Matrix matrix = new Matrix(rows,cols,sequence);
        MatrixTransformer transformer = new MatrixTransformer();

        String result = transformer.transformMatrix(4,matrix).toString();

        assertEquals(result,answer);
    }
}
