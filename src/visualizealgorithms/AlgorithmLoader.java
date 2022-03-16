package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.Searching.LiniearSearch;
import visualizealgorithms.bll.algorithm.sorting.Bubblesort;
import visualizealgorithms.bll.algorithm.sorting.InsertionSort;
import visualizealgorithms.bll.algorithm.sorting.MergeSort;
import visualizealgorithms.bll.algorithm.sorting.SelectionSort;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;128000;";

        //Add implemented/selected algorithms here..
        algorithms.add(new Bubblesort());
        algorithms.add(new SelectionSort());
        algorithms.add(new InsertionSort());
        algorithms.add(new LiniearSearch());
        algorithms.add(new MergeSort());

        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
