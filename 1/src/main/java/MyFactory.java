import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;
    private double min, max;

    public MyFactory(int dimension, double min, double max)
    {
        this.dimension = dimension;
        this.min = min;
        this.max = max;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        for(int i=0; i < dimension; i++){
            solution[i] = min + (max - min) * random.nextDouble();
        }

        return solution;
    }
}
