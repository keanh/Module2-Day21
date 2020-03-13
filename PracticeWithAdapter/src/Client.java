import java.util.List;
import java.util.Set;

public class Client {
    private CollectionUtils collectionUtils;

    public Client(CollectionUtils collectionUtils) {
        this.collectionUtils = collectionUtils;
    }

    public void printMaxValue(List<Integer> numbers){
        int max = collectionUtils.findMax(numbers);
        System.out.println("Max value is: " + max);
    }
}
