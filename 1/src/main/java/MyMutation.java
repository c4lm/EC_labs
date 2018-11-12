import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {

        int len = population.get(0).length;
        double prob_ind = 0.01;
        double prob_gen = 0.5;
        for (int i = 0; i < population.size(); i++)
        {
            if (random.nextDouble() < prob_ind)
            {
                for (int j = 0; j < len; j++)
                {
                    if(random.nextDouble() < prob_gen)
                    {
                        population.get(i)[j] += random.nextGaussian();
                    }
                }
            }
        }
        return population;
    }
}
