package visualizealgorithms.bll.algorithm.Searching;

import visualizealgorithms.bll.DataType;
import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class LiniearSearch extends GenericAlgorithm {

    public LiniearSearch() {
        super("LiniearSearch", "O(n)", AlgorithmType.SEARCHING);
    }

    @Override
    public void doWork() {

        int[] n = (int[]) super.getData();//random input numbers

        int input = n[n.length-1];

        for(int i:n){
            if (i == input){
                break;
            }
        }
    }
}
