package gradleupt;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class App {

	public static void main(String[] args) {
		double[] values = new double[]{65, 51, 16, 11, 6519, 191, 0, 98, 19854, 1, 32};
        DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
        double mean = 0;
        for (double v : values) {
            descriptiveStatistics.addValue(v);
            mean = descriptiveStatistics.getMean();
            double median = descriptiveStatistics.getPercentile(50);
            double standardDeviation = descriptiveStatistics.getStandardDeviation();

        }
        System.out.println(mean);	 

	}

}
