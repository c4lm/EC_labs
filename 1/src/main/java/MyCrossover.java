import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        int len = p1.length;
        double[] c1 = new double[len];
        double[] c2 = new double[len];
        for (i = 0; i < len; i++)
        {
            if (random.nextDouble() < 0.2)
            {
                c1[i] = p2[i];
                c2[i] = p1[i];
            }
            else
                {
                c1[i] = p1[i];
                c2[i] = p2[i];
            }
        }

        children.add(c1);
        children.add(c2);
        return children;
    }
}
