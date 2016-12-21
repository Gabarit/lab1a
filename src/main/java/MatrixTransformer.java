import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silver on 20.12.2016.
 */
public class MatrixTransformer {

    private List<Integer> averageSequence = new ArrayList<>();

    protected void addAverage(int a) {
        this.averageSequence.add(a);
    }

    protected int[] reverseSort(int[] sequence) {
        if(sequence == null || sequence.length <= 1) throw new IllegalArgumentException("Wrong sequence");
        for (int i = 0; i < sequence.length / 2; i++) {
            int temp = sequence[i];
            sequence[i] = sequence[sequence.length - 1 - i];
            sequence[sequence.length - 1 - i] = temp;
        }
        return sequence;
    }

    protected double findAverage(int[] sequence) {
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            sum += sequence[i];
        }
        return sum/sequence.length;
    }

    public List<Double> transformMatrix(int a, Matrix matrix) {

        if(a<=0) throw new IllegalArgumentException();

        List<Double> averages = new ArrayList<>();
        int n = 1;

        for (int i = 0; i < matrix.getRows(); i++) {
            if((n%a)==0)
                matrix.setRow(reverseSort(matrix.getRow(i)),i);
            else averages.add(findAverage(matrix.getRow(i)));
            n++;
        }
        return averages;
    }
}
