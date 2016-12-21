import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Silver on 20.12.2016.
 */
public class MatrixTest {

    @Test
    public void testGetLineMethod() {

        int[] sequence = new int[]{1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;
        int[] answer = new int[]{4,5,6};
        Matrix matrix = new Matrix(rows,cols,sequence);

        assertArrayEquals(answer,matrix.getRow(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetLineMethodWrongIndex() {

        int[] sequence = new int[]{1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;

        Matrix matrix = new Matrix(rows,cols,sequence);

        matrix.getRow(3);
    }

    @Test
    public void testSetLineMethod() {

        int[] sequence = new int[]{1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;
        int[] row = new int[]{7,8,9};

        Matrix matrix = new Matrix(rows,cols,sequence);
        matrix.setRow(row,1);

        assertArrayEquals(row,matrix.getRow(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSetLineMethodWrongIndex() {

        int[] sequence = new int[]{1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;
        int[] row = new int[]{7,8,9};

        Matrix matrix = new Matrix(rows,cols,sequence);
        matrix.setRow(row,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetLineMethodWrongRowSize() {

        int[] sequence = new int[]{1,2,3,4,5,6};
        int rows = 2;
        int cols = 3;
        int[] row = new int[]{7,8,9,10};

        Matrix matrix = new Matrix(rows,cols,sequence);
        matrix.setRow(row,1);
    }

}
